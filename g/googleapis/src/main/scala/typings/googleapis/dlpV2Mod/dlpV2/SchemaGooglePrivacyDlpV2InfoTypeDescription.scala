package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * InfoType description.
  */
trait SchemaGooglePrivacyDlpV2InfoTypeDescription extends StObject {
  
  /**
    * Description of the infotype. Translated when language is provided in the
    * request.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Human readable form of the infoType name.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Internal name of the infoType.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Which parts of the API supports this InfoType.
    */
  var supportedBy: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaGooglePrivacyDlpV2InfoTypeDescription {
  
  inline def apply(): SchemaGooglePrivacyDlpV2InfoTypeDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InfoTypeDescription]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2InfoTypeDescription](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSupportedBy(value: js.Array[String]): Self = StObject.set(x, "supportedBy", value.asInstanceOf[js.Any])
    
    inline def setSupportedByUndefined: Self = StObject.set(x, "supportedBy", js.undefined)
    
    inline def setSupportedByVarargs(value: String*): Self = StObject.set(x, "supportedBy", js.Array(value :_*))
  }
}
