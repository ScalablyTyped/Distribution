package typings.googleapis.mybusinesslodgingV1Mod.mybusinesslodgingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSustainabilityCertifications extends StObject {
  
  /**
    * BREEAM certification.
    */
  var breeamCertification: js.UndefOr[String | Null] = js.undefined
  
  /**
    * BREEAM certification exception.
    */
  var breeamCertificationException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The eco certificates awarded to the hotel.
    */
  var ecoCertifications: js.UndefOr[js.Array[SchemaEcoCertification]] = js.undefined
  
  /**
    * LEED certification.
    */
  var leedCertification: js.UndefOr[String | Null] = js.undefined
  
  /**
    * LEED certification exception.
    */
  var leedCertificationException: js.UndefOr[String | Null] = js.undefined
}
object SchemaSustainabilityCertifications {
  
  inline def apply(): SchemaSustainabilityCertifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSustainabilityCertifications]
  }
  
  extension [Self <: SchemaSustainabilityCertifications](x: Self) {
    
    inline def setBreeamCertification(value: String): Self = StObject.set(x, "breeamCertification", value.asInstanceOf[js.Any])
    
    inline def setBreeamCertificationException(value: String): Self = StObject.set(x, "breeamCertificationException", value.asInstanceOf[js.Any])
    
    inline def setBreeamCertificationExceptionNull: Self = StObject.set(x, "breeamCertificationException", null)
    
    inline def setBreeamCertificationExceptionUndefined: Self = StObject.set(x, "breeamCertificationException", js.undefined)
    
    inline def setBreeamCertificationNull: Self = StObject.set(x, "breeamCertification", null)
    
    inline def setBreeamCertificationUndefined: Self = StObject.set(x, "breeamCertification", js.undefined)
    
    inline def setEcoCertifications(value: js.Array[SchemaEcoCertification]): Self = StObject.set(x, "ecoCertifications", value.asInstanceOf[js.Any])
    
    inline def setEcoCertificationsUndefined: Self = StObject.set(x, "ecoCertifications", js.undefined)
    
    inline def setEcoCertificationsVarargs(value: SchemaEcoCertification*): Self = StObject.set(x, "ecoCertifications", js.Array(value*))
    
    inline def setLeedCertification(value: String): Self = StObject.set(x, "leedCertification", value.asInstanceOf[js.Any])
    
    inline def setLeedCertificationException(value: String): Self = StObject.set(x, "leedCertificationException", value.asInstanceOf[js.Any])
    
    inline def setLeedCertificationExceptionNull: Self = StObject.set(x, "leedCertificationException", null)
    
    inline def setLeedCertificationExceptionUndefined: Self = StObject.set(x, "leedCertificationException", js.undefined)
    
    inline def setLeedCertificationNull: Self = StObject.set(x, "leedCertification", null)
    
    inline def setLeedCertificationUndefined: Self = StObject.set(x, "leedCertification", js.undefined)
  }
}
