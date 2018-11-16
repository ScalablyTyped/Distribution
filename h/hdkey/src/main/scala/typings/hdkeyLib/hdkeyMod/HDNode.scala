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

