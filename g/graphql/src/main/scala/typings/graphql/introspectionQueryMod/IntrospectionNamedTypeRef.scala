package typings.graphql.introspectionQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionNamedTypeRef[T /* <: IntrospectionType */] extends js.Object {
  val kind: /* import warning: importer.ImportType#apply Failed type conversion: T['kind'] */ js.Any
  val name: String
}

object IntrospectionNamedTypeRef {
  @scala.inline
  def apply[T /* <: IntrospectionType */](
    kind: /* import warning: importer.ImportType#apply Failed type conversion: T['kind'] */ js.Any,
    name: String
  ): IntrospectionNamedTypeRef[T] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionNamedTypeRef[T]]
  }
}

