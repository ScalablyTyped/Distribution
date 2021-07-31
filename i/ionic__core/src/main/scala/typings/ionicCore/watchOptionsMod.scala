package typings.ionicCore

import typings.std.HTMLElement
import typings.std.MutationObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object watchOptionsMod {
  
  @JSImport("@ionic/core/dist/types/utils/watch-options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def findCheckedOption(el: js.Any, tagName: String): js.UndefOr[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("findCheckedOption")(el.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[HTMLElement]]
  
  @scala.inline
  def watchForOptions[T /* <: HTMLElement */](containerEl: HTMLElement, tagName: String, onChange: js.Function1[/* el */ js.UndefOr[T], Unit]): js.UndefOr[MutationObserver] = (^.asInstanceOf[js.Dynamic].applyDynamic("watchForOptions")(containerEl.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[MutationObserver]]
}
