package typings.ionicReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterDirection extends js.Object {
  var routerDirection: js.UndefOr[typings.ionicReact.hrefpropsMod.RouterDirection] = js.undefined
  var routerLink: js.UndefOr[String] = js.undefined
}

object RouterDirection {
  @scala.inline
  def apply(routerDirection: typings.ionicReact.hrefpropsMod.RouterDirection = null, routerLink: String = null): RouterDirection = {
    val __obj = js.Dynamic.literal()
    if (routerDirection != null) __obj.updateDynamic("routerDirection")(routerDirection.asInstanceOf[js.Any])
    if (routerLink != null) __obj.updateDynamic("routerLink")(routerLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterDirection]
  }
}

