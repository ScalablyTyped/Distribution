package typings.atIonicCore.distTypesComponentsMod.ComponentsNs

import typings.atIonicCore.distTypesComponentsRouterUtilsInterfaceMod.RouterDirection
import typings.atIonicCore.distTypesInterfaceMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonAnchor extends js.Object {
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * Contains a URL or a URL fragment that the hyperlink points to. If this property is set, an anchor tag will be rendered.
    */
  var href: js.UndefOr[String] = js.undefined
  /**
    * Specifies the relationship of the target object to the link object. The value is a space-separated list of [link types](https://developer.mozilla.org/en-US/docs/Web/HTML/Link_types).
    */
  var rel: js.UndefOr[String] = js.undefined
  /**
    * When using a router, it specifies the transition direction when navigating to another page using `href`.
    */
  var routerDirection: RouterDirection
}

object IonAnchor {
  @scala.inline
  def apply(routerDirection: RouterDirection, color: Color = null, href: String = null, rel: String = null): IonAnchor = {
    val __obj = js.Dynamic.literal(routerDirection = routerDirection)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href)
    if (rel != null) __obj.updateDynamic("rel")(rel)
    __obj.asInstanceOf[IonAnchor]
  }
}

