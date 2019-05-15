package typings
package hookrouterLib.hookrouterMod.HookRouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AProps
  extends reactLib.reactMod.AnchorHTMLAttributes[stdLib.HTMLAnchorElement] {
  @JSName("href")
  var href_AProps: java.lang.String
}

object AProps {
  @scala.inline
  def apply(
    href: java.lang.String,
    AnchorHTMLAttributes: reactLib.reactMod.AnchorHTMLAttributes[stdLib.HTMLAnchorElement] = null
  ): AProps = {
    val __obj = js.Dynamic.literal(href = href)
    js.Dynamic.global.Object.assign(__obj, AnchorHTMLAttributes)
    __obj.asInstanceOf[AProps]
  }
}

