package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchieLevel
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
    * Based on the item parameter the function should return a value that will form the $.ig.Member’s name and caption.
    */
  var memberProvider: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Optional="false" A name for the level.
    * The unique name of the level is formed using the following pattern:
    * {<hierarchy.uniqueName>}.[<levelMetadata.name>]
    */
  var name: js.UndefOr[String] = js.undefined
}
object IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchieLevel {
  
  inline def apply(): IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchieLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchieLevel]
  }
  
  extension [Self <: IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchieLevel](x: Self) {
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setMemberProvider(value: js.Function): Self = StObject.set(x, "memberProvider", value.asInstanceOf[js.Any])
    
    inline def setMemberProviderUndefined: Self = StObject.set(x, "memberProvider", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
