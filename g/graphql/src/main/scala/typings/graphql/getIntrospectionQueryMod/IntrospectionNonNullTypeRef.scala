package typings.graphql.getIntrospectionQueryMod

import typings.graphql.graphqlStrings.NON_NULL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntrospectionNonNullTypeRef[T /* <: IntrospectionTypeRef */] extends js.Object {
  val kind: NON_NULL = js.native
  val ofType: T = js.native
}

object IntrospectionNonNullTypeRef {
  @scala.inline
  def apply[/* <: typings.graphql.getIntrospectionQueryMod.IntrospectionTypeRef */ T](kind: NON_NULL, ofType: T): IntrospectionNonNullTypeRef[T] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], ofType = ofType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionNonNullTypeRef[T]]
  }
  @scala.inline
  implicit class IntrospectionNonNullTypeRefOps[Self <: IntrospectionNonNullTypeRef[_], /* <: typings.graphql.getIntrospectionQueryMod.IntrospectionTypeRef */ T] (val x: Self with IntrospectionNonNullTypeRef[T]) extends AnyVal {
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
    def setKind(value: NON_NULL): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfType(value: T): Self = this.set("ofType", value.asInstanceOf[js.Any])
  }
  
}

