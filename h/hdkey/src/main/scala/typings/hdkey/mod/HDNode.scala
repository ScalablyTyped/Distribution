package typings.hdkey.mod

import typings.hdkey.anon.Xpriv
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HDNode extends js.Object {
  var chainCode: Buffer
  var privateKey: Buffer
  var publicKey: Buffer
  def derive(path: String): HDNode
  def toJSON(): Xpriv
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
}

