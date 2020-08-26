package typings.looksSame

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("looks-same/build/src/lib/ignore-caret-comparator/states/state", JSImport.Namespace)
@js.native
object stateMod extends js.Object {
  @js.native
  trait State extends js.Object {
    var _ctx: js.Any = js.native
    def caretBottomRight: js.Any = js.native
    def caretBottomRight_=(point: js.Any): Unit = js.native
    def caretTopLeft: js.Any = js.native
    def caretTopLeft_=(point: js.Any): Unit = js.native
    def pixelRatio: js.Any = js.native
    def switchState(state: js.Any): Unit = js.native
    def validate(point: js.Any): Boolean = js.native
    def validate(point: js.Any, imgs: js.Any): Boolean = js.native
  }
  
  @js.native
  abstract class default protected () extends State {
    def this(_ctx: js.Any) = this()
  }
  
}

