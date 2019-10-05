package typings.imurmurhash.imurmurhashMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
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
object ^ extends TopLevel[
      Instantiable0[MurmurHash3] with (Instantiable1[/* text */ String, MurmurHash3]) with (Instantiable2[/* text */ String, /* seed */ Double, MurmurHash3])
    ] {
  def apply(): MurmurHash3 = js.native
  def apply(text: String): MurmurHash3 = js.native
  def apply(text: String, seed: Double): MurmurHash3 = js.native
}

