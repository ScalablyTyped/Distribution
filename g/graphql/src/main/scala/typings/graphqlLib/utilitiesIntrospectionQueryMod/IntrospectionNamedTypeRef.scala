package typings
package graphqlLib.utilitiesIntrospectionQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionNamedTypeRef[T /* <: IntrospectionType */] extends js.Object {
  val kind: /* import warning: ImportType.apply Failed type conversion: T['kind'] */ js.Any
  val name: java.lang.String
}

object IntrospectionNamedTypeRef {
  @scala.inline
  def apply[T /* <: IntrospectionType */](
    kind: /* import warning: ImportType.apply Failed type conversion: T['kind'] */ js.Any,
    name: java.lang.String
  ): IntrospectionNamedTypeRef[T] = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
  
    __obj.asInstanceOf[IntrospectionNamedTypeRef[T]]
  }
}

