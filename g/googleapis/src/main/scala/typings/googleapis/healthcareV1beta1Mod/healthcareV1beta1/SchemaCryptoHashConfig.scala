package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pseudonymization method that generates surrogates via cryptographic
  * hashing. Uses SHA-256. Outputs a base64-encoded representation of the
  * hashed output (for example,
  * `L7k0BHmF1ha5U3NfGykjro4xWi1MPVQPjhMAZbSV9mM=`).
  */
@js.native
trait SchemaCryptoHashConfig extends js.Object {
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
  implicit class SchemaCryptoHashConfigOps[Self <: SchemaCryptoHashConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCryptoKey(value: String): Self = this.set("cryptoKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCryptoKey: Self = this.set("cryptoKey", js.undefined)
  }
  
}

