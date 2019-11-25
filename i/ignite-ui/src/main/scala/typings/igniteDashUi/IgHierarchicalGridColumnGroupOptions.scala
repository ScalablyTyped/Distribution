package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgHierarchicalGridColumnGroupOptions
  extends /**
	 * Option for IgHierarchicalGridColumnGroupOptions
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Sets whether expansion indicators are visible in the group header.
  	 *
  	 */
  var allowGroupCollapsing: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Sets whether the group is expanded or collapsed. Applied only if the allowGroupCollapsing is set to true.
  	 *
  	 */
  var expanded: js.UndefOr[Boolean] = js.undefined
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
  var hidden: js.UndefOr[String] = js.undefined
}

object IgHierarchicalGridColumnGroupOptions {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgHierarchicalGridColumnGroupOptions
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    allowGroupCollapsing: js.UndefOr[Boolean] = js.undefined,
    expanded: js.UndefOr[Boolean] = js.undefined,
    hidden: String = null
  ): IgHierarchicalGridColumnGroupOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowGroupCollapsing)) __obj.updateDynamic("allowGroupCollapsing")(allowGroupCollapsing.asInstanceOf[js.Any])
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (hidden != null) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgHierarchicalGridColumnGroupOptions]
  }
}

