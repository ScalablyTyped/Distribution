package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchieLevel
  extends /**
	 * Option for IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchieLevel
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * A caption for the level.
  	 */
  var caption: js.UndefOr[String] = js.undefined
  /**
  	 * A function called for each item of the data source array when level members are created.
  	 * Based on the item parameter the function should return a value that will form the $.ig.Member's name and caption.
  	 */
  var memberProvider: js.UndefOr[js.Function] = js.undefined
  /**
  	 * Optional="false" A name for the level.
  	 * The unique name of the level is formed using the following pattern:
  	 * {<hierarchy.uniqueName>}.[<levelMetadata.name>]
  	 */
  var name: js.UndefOr[String] = js.undefined
}

object IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchieLevel {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchieLevel
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    caption: String = null,
    memberProvider: js.Function = null,
    name: String = null
  ): IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchieLevel = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (memberProvider != null) __obj.updateDynamic("memberProvider")(memberProvider)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchieLevel]
  }
}

