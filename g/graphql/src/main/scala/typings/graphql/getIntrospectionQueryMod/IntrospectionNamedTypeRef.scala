package typings.graphql.getIntrospectionQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntrospectionNamedTypeRef[T /* <: IntrospectionType */] extends js.Object {
  val kind: /* import warning: importer.ImportType#apply Failed type conversion: T['kind'] */ js.Any = js.native
  val name: String = js.native
}

object IntrospectionNamedTypeRef {
  @scala.inline
  def apply[/* <: typings.graphql.getIntrospectionQueryMod.IntrospectionType */ T](
    kind: /* import warning: importer.ImportType#apply Failed type conversion: T['kind'] */ js.Any,
    name: String
  ): IntrospectionNamedTypeRef[T] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionNamedTypeRef[T]]
  }
  @scala.inline
  implicit class IntrospectionNamedTypeRefOps[Self <: IntrospectionNamedTypeRef[_], /* <: typings.graphql.getIntrospectionQueryMod.IntrospectionType */ T] (val x: Self with IntrospectionNamedTypeRef[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKind(value: /* import warning: importer.ImportType#apply Failed type conversion: T['kind'] */ js.Any): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

