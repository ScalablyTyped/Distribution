package typings.materialTabs

import typings.materialTabs.tabAdapterMod.MDCTabAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tabs/tab/foundation", JSImport.Namespace)
@js.native
object tabFoundationMod extends js.Object {
  @js.native
  trait MDCTabFoundation
    extends typings.materialBase.foundationMod.default[MDCTabAdapter] {
    def getComputedLeft(): Double = js.native
    def getComputedWidth(): Double = js.native
    def isActive(): Boolean = js.native
    def measureSelf(): Unit = js.native
    def preventsDefaultOnClick(): Boolean = js.native
    def setActive(isActive: Boolean): Unit = js.native
    def setPreventDefaultOnClick(preventDefaultOnClick: Boolean): Unit = js.native
  }
  
  @js.native
  class default () extends MDCTabFoundation
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typings.materialTabs.tabConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCTabAdapter = js.native
    val strings: typings.materialTabs.tabConstantsMod.strings = js.native
  }
  
}

