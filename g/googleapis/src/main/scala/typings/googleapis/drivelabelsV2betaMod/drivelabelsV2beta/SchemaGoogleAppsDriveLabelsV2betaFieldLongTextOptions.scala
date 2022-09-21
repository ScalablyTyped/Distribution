package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaFieldLongTextOptions extends StObject {
  
  /**
    * Output only. The maximum valid length of values for the text field.
    */
  var maxLength: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. The minimum valid length of values for the text field.
    */
  var minLength: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaFieldLongTextOptions {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaFieldLongTextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaFieldLongTextOptions]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaFieldLongTextOptions](x: Self) {
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthNull: Self = StObject.set(x, "maxLength", null)
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthNull: Self = StObject.set(x, "minLength", null)
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
  }
}
