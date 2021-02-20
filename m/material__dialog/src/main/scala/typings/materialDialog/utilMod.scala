package typings.materialDialog

import typings.materialDom.focusTrapMod.FocusOptions
import typings.materialDom.focusTrapMod.FocusTrap
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@material/dialog/util", "areTopsMisaligned")
  @js.native
  def areTopsMisaligned(els: js.Array[HTMLElement]): Boolean = js.native
  
  @JSImport("@material/dialog/util", "createFocusTrapInstance")
  @js.native
  def createFocusTrapInstance(surfaceEl: HTMLElement, focusTrapFactory: MDCDialogFocusTrapFactory): FocusTrap = js.native
  @JSImport("@material/dialog/util", "createFocusTrapInstance")
  @js.native
  def createFocusTrapInstance(surfaceEl: HTMLElement, focusTrapFactory: MDCDialogFocusTrapFactory, initialFocusEl: HTMLElement): FocusTrap = js.native
  
  @JSImport("@material/dialog/util", "isScrollable")
  @js.native
  def isScrollable(): Boolean = js.native
  @JSImport("@material/dialog/util", "isScrollable")
  @js.native
  def isScrollable(el: HTMLElement): Boolean = js.native
  
  type MDCDialogFocusTrapFactory = js.Function2[/* element */ HTMLElement, /* options */ FocusOptions, FocusTrap]
}
