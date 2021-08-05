package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the parameters needed for de-identification of DICOM stores.
  */
trait SchemaDicomConfig extends StObject {
  
  /**
    * Tags to be whitelisted, for example &quot;PatientID&quot;,
    * &quot;0010,0010&quot;. Any tag that is whitelisted will copied as is. All
    * other tags will be omitted.
    */
  var whitelistTags: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaDicomConfig {
  
  inline def apply(): SchemaDicomConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDicomConfig]
  }
  
  extension [Self <: SchemaDicomConfig](x: Self) {
    
    inline def setWhitelistTags(value: js.Array[String]): Self = StObject.set(x, "whitelistTags", value.asInstanceOf[js.Any])
    
    inline def setWhitelistTagsUndefined: Self = StObject.set(x, "whitelistTags", js.undefined)
    
    inline def setWhitelistTagsVarargs(value: String*): Self = StObject.set(x, "whitelistTags", js.Array(value :_*))
  }
}
