package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchie
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * A caption for the hierarchy.
    */
  var caption: js.UndefOr[String] = js.undefined
  
  /**
    * The path to be used when displaying the hierarchy in the user interface.
    *                                 Nested folders are indicated by a backslash (\).
    *                                 The folder hierarchy will appear under parent dimension node.
    */
  var displayFolder: js.UndefOr[String] = js.undefined
  
  /**
    * An array of level metadata objects.
    */
  var levels: js.UndefOr[js.Array[OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchieLevel]] = js.undefined
  
  /**
    * Optional="false" A name for the hierarchy.
    *                                 The unique name of the hierarchy is formed using the following pattern:
    *                                 [<parentDimension.name>].[<hierarchyMetadata.name>]
    */
  var name: js.UndefOr[String] = js.undefined
}
object OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchie {
  
  @scala.inline
  def apply(): OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchie = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchie]
  }
  
  @scala.inline
  implicit class OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchieMutableBuilder[Self <: OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchie] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setDisplayFolder(value: String): Self = StObject.set(x, "displayFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayFolderUndefined: Self = StObject.set(x, "displayFolder", js.undefined)
    
    @scala.inline
    def setLevels(value: js.Array[OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchieLevel]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
    
    @scala.inline
    def setLevelsVarargs(value: OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchieLevel*): Self = StObject.set(x, "levels", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
