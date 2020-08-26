package typings.ionicCore.navInterfaceMod

import typings.ionicCore.mod.ComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavComponentWithProps[T] extends js.Object {
  var component: NavComponent = js.native
  var componentProps: js.UndefOr[ComponentProps[T] | Null] = js.native
}

object NavComponentWithProps {
  @scala.inline
  def apply[T](): NavComponentWithProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavComponentWithProps[T]]
  }
  @scala.inline
  implicit class NavComponentWithPropsOps[Self <: NavComponentWithProps[_], T] (val x: Self with NavComponentWithProps[T]) extends AnyVal {
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
    def setComponent(value: NavComponent): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponentNull: Self = this.set("component", null)
    @scala.inline
    def setComponentProps(value: ComponentProps[T]): Self = this.set("componentProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentProps: Self = this.set("componentProps", js.undefined)
    @scala.inline
    def setComponentPropsNull: Self = this.set("componentProps", null)
  }
  
}

