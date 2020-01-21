package typings.materialLinearProgress

import typings.materialLinearProgress.adapterMod.MDCLinearProgressAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/linear-progress/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  trait MDCLinearProgressFoundation
    extends typings.materialBase.foundationMod.default[MDCLinearProgressAdapter] {
    def close(): Unit = js.native
    def open(): Unit = js.native
    def setBuffer(value: Double): Unit = js.native
    def setDeterminate(isDeterminate: Boolean): Unit = js.native
    def setProgress(value: Double): Unit = js.native
    def setReverse(isReversed: Boolean): Unit = js.native
  }
  
  @js.native
  class default () extends MDCLinearProgressFoundation
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typings.materialLinearProgress.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCLinearProgressAdapter = js.native
    val strings: typings.materialLinearProgress.constantsMod.strings = js.native
  }
  
}

