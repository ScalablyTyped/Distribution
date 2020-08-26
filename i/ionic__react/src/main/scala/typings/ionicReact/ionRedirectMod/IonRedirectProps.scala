package typings.ionicReact.ionRedirectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonRedirectProps extends js.Object {
  var exact: js.UndefOr[Boolean] = js.native
  var path: js.UndefOr[String] = js.native
  var routerOptions: js.UndefOr[js.Any] = js.native
  var to: String = js.native
}

object IonRedirectProps {
  @scala.inline
  def apply(to: String): IonRedirectProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonRedirectProps]
  }
  @scala.inline
  implicit class IonRedirectPropsOps[Self <: IonRedirectProps] (val x: Self) extends AnyVal {
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
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def setExact(value: Boolean): Self = this.set("exact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExact: Self = this.set("exact", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setRouterOptions(value: js.Any): Self = this.set("routerOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouterOptions: Self = this.set("routerOptions", js.undefined)
  }
  
}

