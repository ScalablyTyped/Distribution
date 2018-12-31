package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchieLevel
  extends /**
	 * Option for IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchieLevel
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * A caption for the level.
  	 */
  var caption: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * A function called for each item of the data source array when level members are created.
  	 * Based on the item parameter the function should return a value that will form the $.ig.Member’s name and caption.
  	 */
  var memberProvider: js.UndefOr[js.Function] = js.undefined
  /**
  	 * Optional="false" A name for the level.
  	 * The unique name of the level is formed using the following pattern:
  	 * {<hierarchy.uniqueName>}.[<levelMetadata.name>]
  	 */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

