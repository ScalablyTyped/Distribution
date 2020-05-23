package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgSplitterPanel
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Gets whether the panel is initially collapsed
    *
    */
  var collapsed: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets whether the panel can be collapsed
    *
    */
  var collapsible: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets the maximum size that the panel can have
    *
    */
  var max: js.UndefOr[String | Double] = js.undefined
  /**
    * Gets the minimum size that the panel can have
    *
    */
  var min: js.UndefOr[String | Double] = js.undefined
  /**
    * Gets whether the panel can be resized
    *
    */
  var resizable: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets the size of the panel
    *
    */
  var size: js.UndefOr[String | Double] = js.undefined
}

object IgSplitterPanel {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    collapsible: js.UndefOr[Boolean] = js.undefined,
    max: String | Double = null,
    min: String | Double = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    size: String | Double = null
  ): IgSplitterPanel = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible.get.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgSplitterPanel]
  }
}

