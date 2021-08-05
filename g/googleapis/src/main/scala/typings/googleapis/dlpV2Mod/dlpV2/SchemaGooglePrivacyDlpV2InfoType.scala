package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Type of information detected by the API.
  */
trait SchemaGooglePrivacyDlpV2InfoType extends StObject {
  
  /**
    * Name of the information type. Either a name of your choosing when
    * creating a CustomInfoType, or one of the names listed at
    * https://cloud.google.com/dlp/docs/infotypes-reference when specifying a
    * built-in type. InfoType names should conform to the pattern
    * [a-zA-Z0-9_]{1,64}.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaGooglePrivacyDlpV2InfoType {
  
  inline def apply(): SchemaGooglePrivacyDlpV2InfoType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InfoType]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2InfoType](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
