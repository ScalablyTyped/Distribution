package typings.hdkey.mod

import typings.hdkey.anon.Xpriv
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HDNode extends js.Object {
  var chainCode: Buffer = js.native
  var privateKey: Buffer = js.native
  var publicKey: Buffer = js.native
  def derive(path: String): HDNode = js.native
  def toJSON(): Xpriv = js.native
}

object HDNode {
  @scala.inline
  def apply(
    chainCode: Buffer,
    derive: String => HDNode,
    privateKey: Buffer,
    publicKey: Buffer,
    toJSON: () => Xpriv
  ): HDNode = {
    val __obj = js.Dynamic.literal(chainCode = chainCode.asInstanceOf[js.Any], derive = js.Any.fromFunction1(derive), privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[HDNode]
  }
  @scala.inline
  implicit class HDNodeOps[Self <: HDNode] (val x: Self) extends AnyVal {
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
    def setChainCode(value: Buffer): Self = this.set("chainCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setDerive(value: String => HDNode): Self = this.set("derive", js.Any.fromFunction1(value))
    @scala.inline
    def setPrivateKey(value: Buffer): Self = this.set("privateKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicKey(value: Buffer): Self = this.set("publicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setToJSON(value: () => Xpriv): Self = this.set("toJSON", js.Any.fromFunction0(value))
  }
  
}

