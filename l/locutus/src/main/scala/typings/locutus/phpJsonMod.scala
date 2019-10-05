package typings.locutus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("locutus/php/json", JSImport.Namespace)
@js.native
object phpJsonMod extends js.Object {
  @js.native
  object json_decode extends js.Object {
    def apply(): js.Any = js.native
    def apply(strJson: js.Any): js.Any = js.native
  }
  
  @js.native
  object json_encode extends js.Object {
    def apply(): js.Any = js.native
    def apply(mixedVal: js.Any): js.Any = js.native
  }
  
  @js.native
  object json_last_error extends js.Object {
    def apply(): js.Any = js.native
  }
  
}

