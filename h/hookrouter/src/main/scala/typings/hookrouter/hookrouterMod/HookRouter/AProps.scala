package typings.hookrouter.hookrouterMod.HookRouter

import typings.react.reactMod.AnchorHTMLAttributes
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AProps extends AnchorHTMLAttributes[HTMLAnchorElement] {
  @JSName("href")
  var href_AProps: String
}

object AProps {
  @scala.inline
  def apply(href: String, AnchorHTMLAttributes: AnchorHTMLAttributes[HTMLAnchorElement] = null): AProps = {
    val __obj = js.Dynamic.literal(href = href)
    js.Dynamic.global.Object.assign(__obj, AnchorHTMLAttributes)
    __obj.asInstanceOf[AProps]
  }
}

