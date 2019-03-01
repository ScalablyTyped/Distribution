package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTreeGridDataSourceSettings
  extends /**
	 * Option for IgTreeGridDataSourceSettings
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * The name of the property that keeps track of the level in the hierarchy.Defaults to __ig_options.dataLevel.
  	 *
  	 */
  var dataLevelKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The name of the property that keeps track of the expansion state of a data item. Defaults to __ig_options.expanded.
  	 *
  	 */
  var expandedKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * If set to TRUE it is expected that the source of data is normalized and transformed(has set dataLevel and expansion state). The source of data is used as flatDataView. Usually used when the paging is remote and paging mode is allLevels, or features are remote(and the processing of the returned result should be made on the server)
  	 *
  	 */
  var initialFlatDataView: js.UndefOr[scala.Boolean] = js.undefined
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
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    dataLevelKey: java.lang.String = null,
    expandedKey: java.lang.String = null,
    initialFlatDataView: js.UndefOr[scala.Boolean] = js.undefined,
    propertyDataLevel: js.Any = null,
    propertyExpanded: js.Any = null
  ): IgTreeGridDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (dataLevelKey != null) __obj.updateDynamic("dataLevelKey")(dataLevelKey)
    if (expandedKey != null) __obj.updateDynamic("expandedKey")(expandedKey)
    if (!js.isUndefined(initialFlatDataView)) __obj.updateDynamic("initialFlatDataView")(initialFlatDataView)
    if (propertyDataLevel != null) __obj.updateDynamic("propertyDataLevel")(propertyDataLevel)
    if (propertyExpanded != null) __obj.updateDynamic("propertyExpanded")(propertyExpanded)
    __obj.asInstanceOf[IgTreeGridDataSourceSettings]
  }
}

