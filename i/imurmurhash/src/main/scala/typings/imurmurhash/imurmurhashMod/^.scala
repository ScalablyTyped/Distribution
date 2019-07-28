package typings.imurmurhash.imurmurhashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imurmurhash", JSImport.Namespace)
@js.native
class ^ () extends MurmurHash3 {
  def this(text: String) = this()
  def this(text: String, seed: Double) = this()
}

@JSImport("imurmurhash", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): MurmurHash3 = js.native
  def apply(text: String): MurmurHash3 = js.native
  def apply(text: String, seed: Double): MurmurHash3 = js.native
}

