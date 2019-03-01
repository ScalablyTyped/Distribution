package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchie
  extends /**
	 * Option for OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchie
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * A caption for the hierarchy.
  	 */
  var caption: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The path to be used when displaying the hierarchy in the user interface.
  	 *                                 Nested folders are indicated by a backslash (\).
  	 *                                 The folder hierarchy will appear under parent dimension node.
  	 */
  var displayFolder: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * An array of level metadata objects.
  	 */
  var levels: js.UndefOr[js.Array[OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchieLevel]] = js.undefined
  /**
  	 * Optional="false" A name for the hierarchy.
  	 *                                 The unique name of the hierarchy is formed using the following pattern:
  	 *                                 [<parentDimension.name>].[<hierarchyMetadata.name>]
  	 */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchie {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchie
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    caption: java.lang.String = null,
    displayFolder: java.lang.String = null,
    levels: js.Array[OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchieLevel] = null,
    name: java.lang.String = null
  ): OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchie = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (displayFolder != null) __obj.updateDynamic("displayFolder")(displayFolder)
    if (levels != null) __obj.updateDynamic("levels")(levels)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchie]
  }
}

