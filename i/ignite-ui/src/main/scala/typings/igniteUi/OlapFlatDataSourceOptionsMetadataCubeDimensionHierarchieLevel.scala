package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchieLevel
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * A caption for the level.
    */
  var caption: js.UndefOr[String] = js.undefined
  
  /**
    * A function called for each item of the data source array when level members are created.
    *                                     Based on the item parameter the function should return a value that will form the $.ig.Member’s name and caption.
    */
  var memberProvider: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Optional="false" A name for the level.
    *                                     The unique name of the level is formed using the following pattern:
    *                                     {<hierarchy.uniqueName>}.[<levelMetadata.name>]
    */
  var name: js.UndefOr[String] = js.undefined
}
object OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchieLevel {
  
  @scala.inline
  def apply(): OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchieLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchieLevel]
  }
  
  @scala.inline
  implicit class OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchieLevelMutableBuilder[Self <: OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchieLevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setMemberProvider(value: js.Function): Self = StObject.set(x, "memberProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberProviderUndefined: Self = StObject.set(x, "memberProvider", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
