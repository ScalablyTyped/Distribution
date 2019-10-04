package typings.atIonicReact

import typings.atIonicReact.distTypesComponentsHrefpropsMod.RouterDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RouterDirection extends js.Object {
  var routerDirection: js.UndefOr[RouterDirection] = js.undefined
  var routerLink: js.UndefOr[String] = js.undefined
}

object Anon_RouterDirection {
  @scala.inline
  def apply(routerDirection: RouterDirection = null, routerLink: String = null): Anon_RouterDirection = {
    val __obj = js.Dynamic.literal()
    if (routerDirection != null) __obj.updateDynamic("routerDirection")(routerDirection)
    if (routerLink != null) __obj.updateDynamic("routerLink")(routerLink)
    __obj.asInstanceOf[Anon_RouterDirection]
  }
}

