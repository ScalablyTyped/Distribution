package typings.ionicCore

import org.scalablytyped.runtime.StringDictionary
import typings.ionicCore.anon.Label
import typings.ionicCore.anon.X
import typings.ionicCore.componentsMod.global.HTMLIonLabelElement
import typings.ionicCore.mod.Side
import typings.ionicCore.stencilPublicRuntimeMod.EventEmitter
import typings.std.HTMLElement
import typings.std.ShadowRoot
import typings.std.UIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/core/dist/types/utils/helpers", JSImport.Namespace)
@js.native
object helpersMod extends js.Object {
  
  def addEventListener(el: js.Any, eventName: String, callback: js.Any): js.Any = js.native
  def addEventListener(el: js.Any, eventName: String, callback: js.Any, opts: js.Any): js.Any = js.native
  
  def assert(actual: js.Any, reason: String): Unit = js.native
  
  def clamp(min: Double, n: Double, max: Double): Double = js.native
  
  def debounce(func: js.Function1[/* repeated */ js.Any, Unit]): js.Function1[/* repeated */ js.Any, _] = js.native
  def debounce(func: js.Function1[/* repeated */ js.Any, Unit], wait: Double): js.Function1[/* repeated */ js.Any, _] = js.native
  
  def debounceEvent(event: EventEmitter[_], wait: Double): EventEmitter[_] = js.native
  
  def deferEvent(event: EventEmitter[_]): EventEmitter[_] = js.native
  
  def findItemLabel(componentEl: HTMLElement): HTMLIonLabelElement | Null = js.native
  
  def getAriaLabel(componentEl: HTMLElement, inputId: String): Label = js.native
  
  def getElementRoot(el: HTMLElement): HTMLElement | ShadowRoot = js.native
  def getElementRoot(el: HTMLElement, fallback: HTMLElement): HTMLElement | ShadowRoot = js.native
  
  def hasShadowDom(el: HTMLElement): Boolean = js.native
  
  def inheritAttributes(el: HTMLElement): StringDictionary[js.Any] = js.native
  def inheritAttributes(el: HTMLElement, attributes: js.Array[String]): StringDictionary[js.Any] = js.native
  
  def isEndSide(side: Side): Boolean = js.native
  
  def now(ev: UIEvent): Double = js.native
  
  def pointerCoord(ev: js.Any): X = js.native
  
  def raf(h: js.Any): js.Any = js.native
  
  def removeEventListener(el: js.Any, eventName: String, callback: js.Any): js.Any = js.native
  def removeEventListener(el: js.Any, eventName: String, callback: js.Any, opts: js.Any): js.Any = js.native
  
  def renderHiddenInput(
    always: Boolean,
    container: HTMLElement,
    name: String,
    value: js.UndefOr[scala.Nothing],
    disabled: Boolean
  ): Unit = js.native
  def renderHiddenInput(always: Boolean, container: HTMLElement, name: String, value: String, disabled: Boolean): Unit = js.native
  def renderHiddenInput(always: Boolean, container: HTMLElement, name: String, value: Null, disabled: Boolean): Unit = js.native
}
