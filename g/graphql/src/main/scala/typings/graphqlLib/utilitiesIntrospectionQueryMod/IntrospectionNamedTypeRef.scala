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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[IntrospectionNamedTypeRef[T]]
  }
}

