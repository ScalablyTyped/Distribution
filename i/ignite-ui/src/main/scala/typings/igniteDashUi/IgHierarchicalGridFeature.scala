package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgHierarchicalGridFeature
  extends /**
	 * Option for IgHierarchicalGridFeature
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Name of the feature to be enabled.
  	 */
  var name: js.UndefOr[String] = js.undefined
}

object IgHierarchicalGridFeature {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgHierarchicalGridFeature
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    name: String = null
  ): IgHierarchicalGridFeature = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[IgHierarchicalGridFeature]
  }
}

