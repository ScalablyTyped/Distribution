package typings.atIonicReact

import typings.atIonicReact.atIonicReactStrings.back
import typings.atIonicReact.atIonicReactStrings.forward
import typings.atIonicReact.atIonicReactStrings.none
import typings.atIonicReact.atIonicReactStrings.root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Back extends js.Object {
  var routerDirection: js.UndefOr[none | forward | back | root] = js.undefined
  var routerLink: js.UndefOr[String] = js.undefined
}

object Anon_Back {
  @scala.inline
  def apply(routerDirection: none | forward | back | root = null, routerLink: String = null): Anon_Back = {
    val __obj = js.Dynamic.literal()
    if (routerDirection != null) __obj.updateDynamic("routerDirection")(routerDirection.asInstanceOf[js.Any])
    if (routerLink != null) __obj.updateDynamic("routerLink")(routerLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Back]
  }
}

