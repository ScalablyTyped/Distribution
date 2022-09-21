package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchie
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
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
  
  inline def apply(): IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchie = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchie]
  }
  
  extension [Self <: IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchie](x: Self) {
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setDisplayFolder(value: String): Self = StObject.set(x, "displayFolder", value.asInstanceOf[js.Any])
    
    inline def setDisplayFolderUndefined: Self = StObject.set(x, "displayFolder", js.undefined)
    
    inline def setLevels(value: js.Array[IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchieLevel]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    inline def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
    
    inline def setLevelsVarargs(value: IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchieLevel*): Self = StObject.set(x, "levels", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
