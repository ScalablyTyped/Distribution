package typings
package imurmurhashLib.imurmurhashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imurmurhash", JSImport.Namespace)
@js.native
class ^ () extends MurmurHash3 {
  def this(text: java.lang.String) = this()
  def this(text: java.lang.String, seed: scala.Double) = this()
}

@JSImport("imurmurhash", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): MurmurHash3 = js.native
  def apply(text: java.lang.String): MurmurHash3 = js.native
  def apply(text: java.lang.String, seed: scala.Double): MurmurHash3 = js.native
}

