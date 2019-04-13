package typings
package hdkeyLib.hdkeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hdkey", JSImport.Namespace)
@js.native
class ^ () extends HDNode {
  /* CompleteClass */
  override var chainCode: nodeLib.Buffer = js.native
  /* CompleteClass */
  override var privateKey: nodeLib.Buffer = js.native
  /* CompleteClass */
  override var publicKey: nodeLib.Buffer = js.native
  /* CompleteClass */
  override def derive(path: java.lang.String): HDNode = js.native
}

@JSImport("hdkey", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fromMasterSeed(seed: nodeLib.Buffer): HDNode = js.native
}

