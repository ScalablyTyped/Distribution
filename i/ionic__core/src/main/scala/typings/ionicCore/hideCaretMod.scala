package typings.ionicCore

import typings.ionicCore.componentsMod.global.HTMLIonContentElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hideCaretMod {
  
  @JSImport("@ionic/core/dist/types/utils/input-shims/hacks/hide-caret", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def enableHideCaretOnScroll(componentEl: HTMLElement): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableHideCaretOnScroll")(componentEl.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  inline def enableHideCaretOnScroll(componentEl: HTMLElement, inputEl: Unit, scrollEl: HTMLIonContentElement): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("enableHideCaretOnScroll")(componentEl.asInstanceOf[js.Any], inputEl.asInstanceOf[js.Any], scrollEl.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def enableHideCaretOnScroll(componentEl: HTMLElement, inputEl: HTMLInputElement): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("enableHideCaretOnScroll")(componentEl.asInstanceOf[js.Any], inputEl.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def enableHideCaretOnScroll(componentEl: HTMLElement, inputEl: HTMLInputElement, scrollEl: HTMLIonContentElement): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("enableHideCaretOnScroll")(componentEl.asInstanceOf[js.Any], inputEl.asInstanceOf[js.Any], scrollEl.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def enableHideCaretOnScroll(componentEl: HTMLElement, inputEl: HTMLTextAreaElement): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("enableHideCaretOnScroll")(componentEl.asInstanceOf[js.Any], inputEl.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def enableHideCaretOnScroll(componentEl: HTMLElement, inputEl: HTMLTextAreaElement, scrollEl: HTMLIonContentElement): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("enableHideCaretOnScroll")(componentEl.asInstanceOf[js.Any], inputEl.asInstanceOf[js.Any], scrollEl.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
}
