package typings.googleapis.mybusinesslodgingV1Mod.mybusinesslodgingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEcoCertification extends StObject {
  
  /**
    * Whether the eco certificate was awarded or not.
    */
  var awarded: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Awarded exception.
    */
  var awardedException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The eco certificate.
    */
  var ecoCertificate: js.UndefOr[String | Null] = js.undefined
}
object SchemaEcoCertification {
  
  inline def apply(): SchemaEcoCertification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEcoCertification]
  }
  
  extension [Self <: SchemaEcoCertification](x: Self) {
    
    inline def setAwarded(value: Boolean): Self = StObject.set(x, "awarded", value.asInstanceOf[js.Any])
    
    inline def setAwardedException(value: String): Self = StObject.set(x, "awardedException", value.asInstanceOf[js.Any])
    
    inline def setAwardedExceptionNull: Self = StObject.set(x, "awardedException", null)
    
    inline def setAwardedExceptionUndefined: Self = StObject.set(x, "awardedException", js.undefined)
    
    inline def setAwardedNull: Self = StObject.set(x, "awarded", null)
    
    inline def setAwardedUndefined: Self = StObject.set(x, "awarded", js.undefined)
    
    inline def setEcoCertificate(value: String): Self = StObject.set(x, "ecoCertificate", value.asInstanceOf[js.Any])
    
    inline def setEcoCertificateNull: Self = StObject.set(x, "ecoCertificate", null)
    
    inline def setEcoCertificateUndefined: Self = StObject.set(x, "ecoCertificate", js.undefined)
  }
}
