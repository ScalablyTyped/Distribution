package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTreeGridDataSourceSettings
  extends /**
	 * Option for IgTreeGridDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * The name of the property that keeps track of the level in the hierarchy.Defaults to __ig_options.dataLevel.
  	 *
  	 */
  var dataLevelKey: js.UndefOr[String] = js.undefined
  /**
  	 * The name of the property that keeps track of the expansion state of a data item. Defaults to __ig_options.expanded.
  	 *
  	 */
  var expandedKey: js.UndefOr[String] = js.undefined
  /**
  	 * If set to TRUE it is expected that the source of data is normalized and transformed(has set dataLevel and expansion state). The source of data is used as flatDataView. Usually used when the paging is remote and paging mode is allLevels, or features are remote(and the processing of the returned result should be made on the server)
  	 *
  	 */
  var initialFlatDataView: js.UndefOr[Boolean] = js.undefined
  /**
  	 * *** IMPORTANT DEPRECATED *** Use the dataLevelKey option instead.
  	 * The name of the property that keeps track of the level in the hierarchy.Defaults to __ig_options.dataLevel.
  	 *
  	 */
  var propertyDataLevel: js.UndefOr[js.Any] = js.undefined
  /**
  	 * *** IMPORTANT DEPRECATED *** Use the expandedKey option instead.
  	 * The name of the property that keeps track of the expansion state of a data item. Defaults to __ig_options.expanded.
  	 *
  	 */
  var propertyExpanded: js.UndefOr[js.Any] = js.undefined
}

object IgTreeGridDataSourceSettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgTreeGridDataSourceSettings
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    dataLevelKey: String = null,
    expandedKey: String = null,
    initialFlatDataView: js.UndefOr[Boolean] = js.undefined,
    propertyDataLevel: js.Any = null,
    propertyExpanded: js.Any = null
  ): IgTreeGridDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (dataLevelKey != null) __obj.updateDynamic("dataLevelKey")(dataLevelKey.asInstanceOf[js.Any])
    if (expandedKey != null) __obj.updateDynamic("expandedKey")(expandedKey.asInstanceOf[js.Any])
    if (!js.isUndefined(initialFlatDataView)) __obj.updateDynamic("initialFlatDataView")(initialFlatDataView.asInstanceOf[js.Any])
    if (propertyDataLevel != null) __obj.updateDynamic("propertyDataLevel")(propertyDataLevel.asInstanceOf[js.Any])
    if (propertyExpanded != null) __obj.updateDynamic("propertyExpanded")(propertyExpanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgTreeGridDataSourceSettings]
  }
}

