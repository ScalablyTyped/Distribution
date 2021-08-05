package typings.ionicCore

import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("@ionic/core/dist/types/utils/input-shims/hacks/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isFocused(input: HTMLInputElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFocused")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isFocused(input: HTMLTextAreaElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFocused")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def relocateInput(componentEl: HTMLElement, inputEl: HTMLInputElement, shouldRelocate: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("relocateInput")(componentEl.asInstanceOf[js.Any], inputEl.asInstanceOf[js.Any], shouldRelocate.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def relocateInput(
    componentEl: HTMLElement,
    inputEl: HTMLInputElement,
    shouldRelocate: Boolean,
    inputRelativeY: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("relocateInput")(componentEl.asInstanceOf[js.Any], inputEl.asInstanceOf[js.Any], shouldRelocate.asInstanceOf[js.Any], inputRelativeY.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def relocateInput(componentEl: HTMLElement, inputEl: HTMLTextAreaElement, shouldRelocate: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("relocateInput")(componentEl.asInstanceOf[js.Any], inputEl.asInstanceOf[js.Any], shouldRelocate.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def relocateInput(
    componentEl: HTMLElement,
    inputEl: HTMLTextAreaElement,
    shouldRelocate: Boolean,
    inputRelativeY: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("relocateInput")(componentEl.asInstanceOf[js.Any], inputEl.asInstanceOf[js.Any], shouldRelocate.asInstanceOf[js.Any], inputRelativeY.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
