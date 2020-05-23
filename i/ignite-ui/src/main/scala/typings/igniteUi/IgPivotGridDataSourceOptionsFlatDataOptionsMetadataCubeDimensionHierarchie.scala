package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchie
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * A caption for the hierarchy.
    */
  var caption: js.UndefOr[String] = js.undefined
  /**
    * The path to be used when displaying the hierarchy in the user interface.
    * Nested folders are indicated by a backslash (\).
    * The folder hierarchy will appear under parent dimension node.
    */
  var displayFolder: js.UndefOr[String] = js.undefined
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
  var name: js.UndefOr[String] = js.undefined
}

object IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchie {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    caption: String = null,
    displayFolder: String = null,
    levels: js.Array[IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchieLevel] = null,
    name: String = null
  ): IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchie = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (displayFolder != null) __obj.updateDynamic("displayFolder")(displayFolder.asInstanceOf[js.Any])
    if (levels != null) __obj.updateDynamic("levels")(levels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchie]
  }
}

