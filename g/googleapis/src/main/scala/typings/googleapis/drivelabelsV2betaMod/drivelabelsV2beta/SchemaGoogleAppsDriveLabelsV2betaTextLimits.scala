package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaTextLimits extends StObject {
  
  /**
    * Maximum length allowed for a text Field type.
    */
  var maxLength: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Minimum length allowed for a text Field type.
    */
  var minLength: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaTextLimits {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaTextLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaTextLimits]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaTextLimits](x: Self) {
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthNull: Self = StObject.set(x, "maxLength", null)
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthNull: Self = StObject.set(x, "minLength", null)
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
  }
}
