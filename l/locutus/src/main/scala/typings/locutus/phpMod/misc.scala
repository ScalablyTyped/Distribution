package typings.locutus.phpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("locutus/php", "misc")
@js.native
object misc extends js.Object {
  @js.native
  object pack extends js.Object {
    def apply(args: js.Any*): js.Any = js.native
  }
  
  @js.native
  object uniqid extends js.Object {
    def apply(): js.Any = js.native
    def apply(prefix: js.Any): js.Any = js.native
    def apply(prefix: js.Any, moreEntropy: js.Any): js.Any = js.native
  }
  
}

