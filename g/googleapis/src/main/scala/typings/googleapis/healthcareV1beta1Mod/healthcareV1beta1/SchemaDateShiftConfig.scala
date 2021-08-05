package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Shift a date forward or backward in time by a random amount which is
  * consistent for a given patient and crypto key combination.
  */
trait SchemaDateShiftConfig extends StObject {
  
  /**
    * An AES 128/192/256 bit key. Causes the shift to be computed based on this
    * key and the patient ID. A default key is generated for each
    * DeidentifyDataset operation and is used wherever crypto_key is not
    * specified.
    */
  var cryptoKey: js.UndefOr[String] = js.undefined
}
object SchemaDateShiftConfig {
  
  inline def apply(): SchemaDateShiftConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDateShiftConfig]
  }
  
  extension [Self <: SchemaDateShiftConfig](x: Self) {
    
    inline def setCryptoKey(value: String): Self = StObject.set(x, "cryptoKey", value.asInstanceOf[js.Any])
    
    inline def setCryptoKeyUndefined: Self = StObject.set(x, "cryptoKey", js.undefined)
  }
}
