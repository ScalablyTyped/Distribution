package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OlapTableViewOptionsViewSettings
  extends /**
	 * Option for OlapTableViewOptionsViewSettings
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Optional="false" value indicating wheter the column headers should be arranged for compact header layout - each hieararchy is in a single row.
  	 */
  var compactColumnHeaders: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Optional="false" value indicating wheter the row headers should be arranged for compact header layout - each hieararchy is in a single row.
  	 */
  var compactRowHeaders: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Optional="false" a value indicating whether parent for columns is in front of its children.
  	 *                 If set to true the query set sorts members in a level in their natural order. Their natural order is the default ordering of the members along the hierarchy when no other sort conditions are specified.
  	 *                 Child members immediately follow their parent members.
  	 *                 If set to false the query set sorts the members in a level using a post-natural order. In other words, child members precede their parents.
  	 */
  var isParentInFrontForColumns: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Optional="false" a value indicating whether parent for rows is in front of its children.
  	 *                 If set to true the query set sorts members in a level in their natural order. Their natural order is the default ordering of the members along the hierarchy when no other sort conditions are specified.
  	 *                 Child members immediately follow their parent members.
  	 *                 If set to false the query set sorts the members in a level using a post-natural order. In other words, child members precede their parents.
  	 */
  var isParentInFrontForRows: js.UndefOr[scala.Boolean] = js.undefined
}

object OlapTableViewOptionsViewSettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for OlapTableViewOptionsViewSettings
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    compactColumnHeaders: js.UndefOr[scala.Boolean] = js.undefined,
    compactRowHeaders: js.UndefOr[scala.Boolean] = js.undefined,
    isParentInFrontForColumns: js.UndefOr[scala.Boolean] = js.undefined,
    isParentInFrontForRows: js.UndefOr[scala.Boolean] = js.undefined
  ): OlapTableViewOptionsViewSettings = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(compactColumnHeaders)) __obj.updateDynamic("compactColumnHeaders")(compactColumnHeaders)
    if (!js.isUndefined(compactRowHeaders)) __obj.updateDynamic("compactRowHeaders")(compactRowHeaders)
    if (!js.isUndefined(isParentInFrontForColumns)) __obj.updateDynamic("isParentInFrontForColumns")(isParentInFrontForColumns)
    if (!js.isUndefined(isParentInFrontForRows)) __obj.updateDynamic("isParentInFrontForRows")(isParentInFrontForRows)
    __obj.asInstanceOf[OlapTableViewOptionsViewSettings]
  }
}

