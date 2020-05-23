package typings.looksSame

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("looks-same/build/src", JSImport.Namespace)
@js.native
object srcMod extends js.Object {
  @js.native
  object default extends js.Object {
    var colors: js.Function3[/* color1 */ js.Any, /* color2 */ js.Any, /* opts */ js.UndefOr[js.Any], Boolean] = js.native
    var createDiff: js.Function2[/* opts */ js.Any, /* callback */ js.Any, Unit] = js.native
    var getDiffArea: js.Function4[
        /* image1 */ js.Any, 
        /* image2 */ js.Any, 
        /* opts */ js.Any, 
        /* callback */ js.UndefOr[js.Any], 
        Unit
      ] = js.native
    def apply(image1: js.Any, image2: js.Any, opts: js.Any): Unit = js.native
    def apply(image1: js.Any, image2: js.Any, opts: js.Any, callback: js.Any): Unit = js.native
  }
  
}

