package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonItemOption extends js.Object {
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any
  ] = js.undefined
  /**
    * If `true`, the user cannot interact with the item option.
    */
  var disabled: scala.Boolean
  /**
    * If `true`, the option will expand to take up the available width and cover any other options.
    */
  var expandable: scala.Boolean
  /**
    * Contains a URL or a URL fragment that the hyperlink points to. If this property is set, an anchor tag will be rendered.
    */
  var href: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any
}

object IonItemOption {
  @scala.inline
  def apply(
    disabled: scala.Boolean,
    expandable: scala.Boolean,
    mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any,
    color: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any = null,
    href: java.lang.String = null
  ): IonItemOption = {
    val __obj = js.Dynamic.literal(disabled = disabled, expandable = expandable, mode = mode)
    if (color != null) __obj.updateDynamic("color")(color)
    if (href != null) __obj.updateDynamic("href")(href)
    __obj.asInstanceOf[IonItemOption]
  }
}

