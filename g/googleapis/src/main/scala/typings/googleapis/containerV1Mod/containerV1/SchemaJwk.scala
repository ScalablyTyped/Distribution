package typings.googleapis.containerV1Mod.containerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Jwk is a JSON Web Key as specified in RFC 7517
  */
@js.native
trait SchemaJwk extends js.Object {
  /**
    * NOLINT
    */
  var alg: js.UndefOr[String] = js.native
  /**
    * NOLINT
    */
  var crv: js.UndefOr[String] = js.native
  /**
    * NOLINT
    */
  var e: js.UndefOr[String] = js.native
  /**
    * NOLINT
    */
  var kid: js.UndefOr[String] = js.native
  /**
    * NOLINT
    */
  var kty: js.UndefOr[String] = js.native
  /**
    * Fields for RSA keys. NOLINT
    */
  var n: js.UndefOr[String] = js.native
  /**
    * NOLINT
    */
  var use: js.UndefOr[String] = js.native
  /**
    * Fields for ECDSA keys. NOLINT
    */
  var x: js.UndefOr[String] = js.native
  /**
    * NOLINT
    */
  var y: js.UndefOr[String] = js.native
}

object SchemaJwk {
  @scala.inline
  def apply(): SchemaJwk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJwk]
  }
  @scala.inline
  implicit class SchemaJwkOps[Self <: SchemaJwk] (val x: Self) extends AnyVal {
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
    def setAlg(value: String): Self = this.set("alg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlg: Self = this.set("alg", js.undefined)
    @scala.inline
    def setCrv(value: String): Self = this.set("crv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrv: Self = this.set("crv", js.undefined)
    @scala.inline
    def setE(value: String): Self = this.set("e", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteE: Self = this.set("e", js.undefined)
    @scala.inline
    def setKid(value: String): Self = this.set("kid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKid: Self = this.set("kid", js.undefined)
    @scala.inline
    def setKty(value: String): Self = this.set("kty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKty: Self = this.set("kty", js.undefined)
    @scala.inline
    def setN(value: String): Self = this.set("n", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteN: Self = this.set("n", js.undefined)
    @scala.inline
    def setUse(value: String): Self = this.set("use", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUse: Self = this.set("use", js.undefined)
    @scala.inline
    def setX(value: String): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: String): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

