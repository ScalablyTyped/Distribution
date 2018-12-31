package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchie
  extends /**
	 * Option for IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchie
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * A caption for the hierarchy.
  	 */
  var caption: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The path to be used when displaying the hierarchy in the user interface.
  	 * Nested folders are indicated by a backslash (\).
  	 * The folder hierarchy will appear under parent dimension node.
  	 */
  var displayFolder: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * An array of level metadata objects.
  	 */
  var levels: js.UndefOr[
    js.Array[IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchieLevel]
  ] = js.undefined
  /**
  	 * Optional="false" A name for the hierarchy.
  	 * The unique name of the hierarchy is formed using the following pattern:
  	 * [<parentDimension.name>].[<hierarchyMetadata.name>]
  	 */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

