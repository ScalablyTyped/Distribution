package typings.graphql.getIntrospectionQueryMod

import typings.graphql.graphqlStrings.LIST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntrospectionListTypeRef[T /* <: IntrospectionTypeRef */] extends js.Object {
  val kind: LIST = js.native
  val ofType: T = js.native
}

object IntrospectionListTypeRef {
  @scala.inline
  def apply[/* <: typings.graphql.getIntrospectionQueryMod.IntrospectionTypeRef */ T](kind: LIST, ofType: T): IntrospectionListTypeRef[T] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], ofType = ofType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionListTypeRef[T]]
  }
  @scala.inline
  implicit class IntrospectionListTypeRefOps[Self <: IntrospectionListTypeRef[_], /* <: typings.graphql.getIntrospectionQueryMod.IntrospectionTypeRef */ T] (val x: Self with IntrospectionListTypeRef[T]) extends AnyVal {
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
    def setKind(value: LIST): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfType(value: T): Self = this.set("ofType", value.asInstanceOf[js.Any])
  }
  
}

