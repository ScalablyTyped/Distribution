package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgHierarchicalGridColumnGroupOptions
  extends /**
	 * Option for IgHierarchicalGridColumnGroupOptions
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Sets whether expansion indicators are visible in the group header.
  	 *
  	 */
  var allowGroupCollapsing: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Sets whether the group is expanded or collapsed. Applied only if the allowGroupCollapsing is set to true.
  	 *
  	 */
  var expanded: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Sets when should the group be hidden. Applied only if the allowGroupCollapsing is set to true.
  	 *
  	 *
  	 * Valid values:
  	 * "never" never hide the group
  	 * "always" always hide the group
  	 * "parentcollapsed" hide the group when its parent group is collapsed
  	 * "parentexpanded" hide the group when its parent group is expanded
  	 */
  var hidden: js.UndefOr[java.lang.String] = js.undefined
}

