package typings.materialDialog

import typings.materialDom.focusTrapMod.FocusOptions
import typings.materialDom.focusTrapMod.FocusTrap
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@material/dialog/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def areTopsMisaligned(els: js.Array[HTMLElement]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("areTopsMisaligned")(els.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def createFocusTrapInstance(surfaceEl: HTMLElement, focusTrapFactory: MDCDialogFocusTrapFactory): FocusTrap = (^.asInstanceOf[js.Dynamic].applyDynamic("createFocusTrapInstance")(surfaceEl.asInstanceOf[js.Any], focusTrapFactory.asInstanceOf[js.Any])).asInstanceOf[FocusTrap]
  inline def createFocusTrapInstance(surfaceEl: HTMLElement, focusTrapFactory: MDCDialogFocusTrapFactory, initialFocusEl: HTMLElement): FocusTrap = (^.asInstanceOf[js.Dynamic].applyDynamic("createFocusTrapInstance")(surfaceEl.asInstanceOf[js.Any], focusTrapFactory.asInstanceOf[js.Any], initialFocusEl.asInstanceOf[js.Any])).asInstanceOf[FocusTrap]
  
  inline def isScrollAtBottom(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScrollAtBottom")().asInstanceOf[Boolean]
  inline def isScrollAtBottom(el: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScrollAtBottom")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isScrollAtTop(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScrollAtTop")().asInstanceOf[Boolean]
  inline def isScrollAtTop(el: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScrollAtTop")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isScrollable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScrollable")().asInstanceOf[Boolean]
  inline def isScrollable(el: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScrollable")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  type MDCDialogFocusTrapFactory = js.Function2[/* element */ HTMLElement, /* options */ FocusOptions, FocusTrap]
}
