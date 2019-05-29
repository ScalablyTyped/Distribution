package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonFabButton extends js.Object {
  /**
    * If `true`, the fab button will be show a close icon.
    */
  var activated: scala.Boolean
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any
  ] = js.undefined
  /**
    * If `true`, the user cannot interact with the fab button.
    */
  var disabled: scala.Boolean
  /**
    * Contains a URL or a URL fragment that the hyperlink points to. If this property is set, an anchor tag will be rendered.
    */
  var href: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any
  /**
    * When using a router, it specifies the transition direction when navigating to another page using `href`.
    */
  var routerDirection: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouterDirection */ js.Any
  /**
    * If `true`, the fab button will show when in a fab-list.
    */
  var show: scala.Boolean
  /**
    * The size of the button. Set this to `small` in order to have a mini fab.
    */
  var size: js.UndefOr[atIonicCoreLib.atIonicCoreLibStrings.small] = js.undefined
  /**
    * If `true`, the fab button will be translucent.
    */
  var translucent: scala.Boolean
  /**
    * The type of the button.
    */
  var `type`: atIonicCoreLib.atIonicCoreLibStrings.submit | atIonicCoreLib.atIonicCoreLibStrings.reset | atIonicCoreLib.atIonicCoreLibStrings.button
}

object IonFabButton {
  @scala.inline
  def apply(
    activated: scala.Boolean,
    disabled: scala.Boolean,
    mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any,
    routerDirection: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouterDirection */ js.Any,
    show: scala.Boolean,
    translucent: scala.Boolean,
    `type`: atIonicCoreLib.atIonicCoreLibStrings.submit | atIonicCoreLib.atIonicCoreLibStrings.reset | atIonicCoreLib.atIonicCoreLibStrings.button,
    color: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any = null,
    href: java.lang.String = null,
    size: atIonicCoreLib.atIonicCoreLibStrings.small = null
  ): IonFabButton = {
    val __obj = js.Dynamic.literal(activated = activated, disabled = disabled, mode = mode, routerDirection = routerDirection, show = show, translucent = translucent)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (href != null) __obj.updateDynamic("href")(href)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[IonFabButton]
  }
}

