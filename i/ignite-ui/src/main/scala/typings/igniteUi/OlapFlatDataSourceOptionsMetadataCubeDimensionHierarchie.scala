package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchie
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * A caption for the hierarchy.
    */
  var caption: js.UndefOr[String] = js.native
  
  /**
    * The path to be used when displaying the hierarchy in the user interface.
    *                                 Nested folders are indicated by a backslash (\).
    *                                 The folder hierarchy will appear under parent dimension node.
    */
  var displayFolder: js.UndefOr[String] = js.native
  
  /**
    * An array of level metadata objects.
    */
  var levels: js.UndefOr[js.Array[OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchieLevel]] = js.native
  
  /**
    * Optional="false" A name for the hierarchy.
    *                                 The unique name of the hierarchy is formed using the following pattern:
    *                                 [<parentDimension.name>].[<hierarchyMetadata.name>]
    */
  var name: js.UndefOr[String] = js.native
}
object OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchie {
  
  @scala.inline
  def apply(): OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchie = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchie]
  }
  
  @scala.inline
  implicit class OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchieOps[Self <: OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchie] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    
    @scala.inline
    def setDisplayFolder(value: String): Self = this.set("displayFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayFolder: Self = this.set("displayFolder", js.undefined)
    
    @scala.inline
    def setLevelsVarargs(value: OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchieLevel*): Self = this.set("levels", js.Array(value :_*))
    
    @scala.inline
    def setLevels(value: js.Array[OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchieLevel]): Self = this.set("levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevels: Self = this.set("levels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
