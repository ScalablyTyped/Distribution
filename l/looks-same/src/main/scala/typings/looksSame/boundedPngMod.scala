package typings.looksSame

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("looks-same/build/src/lib/png/bounded-png", JSImport.Namespace)
@js.native
object boundedPngMod extends js.Object {
  @js.native
  trait BoundedPNGImage
    extends typings.looksSame.pngPngMod.default {
    var _boundingBox: js.Any = js.native
  }
  
  @js.native
  class default protected () extends BoundedPNGImage {
    def this(png: js.Any, boundingBox: js.Any) = this()
  }
  
}

