package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The properties of the Page.  The page will inherit properties from the
  * parent page. Depending on the page type the hierarchy is defined in either
  * SlideProperties or LayoutProperties.
  */
@js.native
trait SchemaPageProperties extends js.Object {
  /**
    * The color scheme of the page. If unset, the color scheme is inherited
    * from a parent page. If the page has no parent, the color scheme uses a
    * default Slides color scheme. This field is read-only.
    */
  var colorScheme: js.UndefOr[SchemaColorScheme] = js.native
  /**
    * The background fill of the page. If unset, the background fill is
    * inherited from a parent page if it exists. If the page has no parent,
    * then the background fill defaults to the corresponding fill in the Slides
    * editor.
    */
  var pageBackgroundFill: js.UndefOr[SchemaPageBackgroundFill] = js.native
}

object SchemaPageProperties {
  @scala.inline
  def apply(colorScheme: SchemaColorScheme = null, pageBackgroundFill: SchemaPageBackgroundFill = null): SchemaPageProperties = {
    val __obj = js.Dynamic.literal()
    if (colorScheme != null) __obj.updateDynamic("colorScheme")(colorScheme.asInstanceOf[js.Any])
    if (pageBackgroundFill != null) __obj.updateDynamic("pageBackgroundFill")(pageBackgroundFill.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPageProperties]
  }
}

