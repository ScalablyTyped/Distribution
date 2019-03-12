package typings
package hdkeyLib.hdkeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HDNode extends js.Object {
  var chainCode: nodeLib.Buffer
  var privateKey: nodeLib.Buffer
  var publicKey: nodeLib.Buffer
  def derive(path: java.lang.String): HDNode
}

object HDNode {
  @scala.inline
  def apply(
    chainCode: nodeLib.Buffer,
    derive: java.lang.String => HDNode,
    privateKey: nodeLib.Buffer,
    publicKey: nodeLib.Buffer
  ): HDNode = {
    val __obj = js.Dynamic.literal(chainCode = chainCode, derive = js.Any.fromFunction1(derive), privateKey = privateKey, publicKey = publicKey)
  
    __obj.asInstanceOf[HDNode]
  }
}

