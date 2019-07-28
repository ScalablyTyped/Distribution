package typings.hdkey.hdkeyMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HDNode extends js.Object {
  var chainCode: Buffer
  var privateKey: Buffer
  var publicKey: Buffer
  def derive(path: String): HDNode
}

object HDNode {
  @scala.inline
  def apply(chainCode: Buffer, derive: String => HDNode, privateKey: Buffer, publicKey: Buffer): HDNode = {
    val __obj = js.Dynamic.literal(chainCode = chainCode, derive = js.Any.fromFunction1(derive), privateKey = privateKey, publicKey = publicKey)
  
    __obj.asInstanceOf[HDNode]
  }
}

