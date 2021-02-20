package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Pseudonymization method that generates surrogates via cryptographic
  * hashing. Uses SHA-256. Outputs a base64-encoded representation of the
  * hashed output (for example,
  * `L7k0BHmF1ha5U3NfGykjro4xWi1MPVQPjhMAZbSV9mM=`).
  */
@js.native
trait SchemaCryptoHashConfig extends StObject {
  
  /**
    * An AES 128/192/256 bit key. Causes the hash to be computed based on this
    * key. A default key is generated for each DeidentifyDataset operation and
    * is used wherever crypto_key is not specified.
    */
  var cryptoKey: js.UndefOr[String] = js.native
}
object SchemaCryptoHashConfig {
  
  @scala.inline
  def apply(): SchemaCryptoHashConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCryptoHashConfig]
  }
  
  @scala.inline
  implicit class SchemaCryptoHashConfigMutableBuilder[Self <: SchemaCryptoHashConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCryptoKey(value: String): Self = StObject.set(x, "cryptoKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCryptoKeyUndefined: Self = StObject.set(x, "cryptoKey", js.undefined)
  }
}
