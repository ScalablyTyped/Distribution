package typings.materialChips

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialChips.anon.ARIAHIDDEN
import typings.materialChips.anon.PartialMDCChipTrailingAct
import typings.materialChips.trailingactionAdapterMod.MDCChipTrailingActionAdapter
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/chips/trailingaction/foundation", JSImport.Namespace)
@js.native
object trailingactionFoundationMod extends js.Object {
  @js.native
  class MDCChipTrailingActionFoundation () extends MDCFoundation[MDCChipTrailingActionAdapter] {
    def this(adapter: PartialMDCChipTrailingAct) = this()
    def focus(): Unit = js.native
    def handleClick(evt: MouseEvent): Unit = js.native
    def handleKeydown(evt: KeyboardEvent): Unit = js.native
    def isNavigable(): Boolean = js.native
    def removeFocus(): Unit = js.native
  }
  
  @js.native
  class default () extends MDCChipTrailingActionFoundation {
    def this(adapter: PartialMDCChipTrailingAct) = this()
  }
  
  /* static members */
  @js.native
  object MDCChipTrailingActionFoundation extends js.Object {
    def defaultAdapter: MDCChipTrailingActionAdapter = js.native
    def strings: ARIAHIDDEN = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def defaultAdapter: MDCChipTrailingActionAdapter = js.native
    def strings: ARIAHIDDEN = js.native
  }
  
}

