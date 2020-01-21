package typings.ionicReact

import typings.ionicReact.ionicReactStrings.back
import typings.ionicReact.ionicReactStrings.forward
import typings.ionicReact.ionicReactStrings.none
import typings.ionicReact.ionicReactStrings.root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBack extends js.Object {
  var routerDirection: js.UndefOr[none | forward | back | root] = js.undefined
  var routerLink: js.UndefOr[String] = js.undefined
}

object AnonBack {
  @scala.inline
  def apply(routerDirection: none | forward | back | root = null, routerLink: String = null): AnonBack = {
    val __obj = js.Dynamic.literal()
    if (routerDirection != null) __obj.updateDynamic("routerDirection")(routerDirection.asInstanceOf[js.Any])
    if (routerLink != null) __obj.updateDynamic("routerLink")(routerLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBack]
  }
}

