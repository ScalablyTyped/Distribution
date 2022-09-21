package typings.googleapis.drivelabelsV2Mod.drivelabelsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2LabelProperties extends StObject {
  
  /**
    * The description of the label.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Title of the label.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2LabelProperties {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2LabelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2LabelProperties]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2LabelProperties](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
