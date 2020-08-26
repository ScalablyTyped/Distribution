package typings.jws.mod

import typings.node.Buffer
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyOptions extends js.Object {
  var algorithm: js.UndefOr[Algorithm | Buffer | Readable] = js.native
  var encoding: js.UndefOr[String | Buffer | Readable] = js.native
  var key: js.UndefOr[String | Readable | Buffer] = js.native
  var publicKey: js.UndefOr[String | Readable | Buffer] = js.native
  var secret: js.UndefOr[String | Readable | Buffer] = js.native
  var signature: js.UndefOr[String | Buffer | Readable] = js.native
}

object VerifyOptions {
  @scala.inline
  def apply(): VerifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifyOptions]
  }
  @scala.inline
  implicit class VerifyOptionsOps[Self <: VerifyOptions] (val x: Self) extends AnyVal {
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
    def setAlgorithm(value: Algorithm | Buffer | Readable): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    @scala.inline
    def setEncoding(value: String | Buffer | Readable): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setKey(value: String | Readable | Buffer): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setPublicKey(value: String | Readable | Buffer): Self = this.set("publicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicKey: Self = this.set("publicKey", js.undefined)
    @scala.inline
    def setSecret(value: String | Readable | Buffer): Self = this.set("secret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecret: Self = this.set("secret", js.undefined)
    @scala.inline
    def setSignature(value: String | Buffer | Readable): Self = this.set("signature", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
  }
  
}

