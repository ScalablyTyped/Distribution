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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("@ionic/core/dist/types/utils/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addEventListener(el: js.Any, eventName: String, callback: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def addEventListener(el: js.Any, eventName: String, callback: js.Any, opts: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def assert(actual: js.Any, reason: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(actual.asInstanceOf[js.Any], reason.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def clamp(min: Double, n: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(min.asInstanceOf[js.Any], n.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def debounce(func: js.Function1[/* repeated */ js.Any, Unit]): js.Function1[/* repeated */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, js.Any]]
  @scala.inline
  def debounce(func: js.Function1[/* repeated */ js.Any, Unit], wait: Double): js.Function1[/* repeated */ js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, js.Any]]
  
  @scala.inline
  def debounceEvent(event: EventEmitter[js.Any], wait: Double): EventEmitter[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounceEvent")(event.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[EventEmitter[js.Any]]
  
  @scala.inline
  def deferEvent(event: EventEmitter[js.Any]): EventEmitter[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("deferEvent")(event.asInstanceOf[js.Any]).asInstanceOf[EventEmitter[js.Any]]
  
  @scala.inline
  def findItemLabel(componentEl: HTMLElement): HTMLIonLabelElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findItemLabel")(componentEl.asInstanceOf[js.Any]).asInstanceOf[HTMLIonLabelElement | Null]
  
  @scala.inline
  def getAriaLabel(componentEl: HTMLElement, inputId: String): Label = (^.asInstanceOf[js.Dynamic].applyDynamic("getAriaLabel")(componentEl.asInstanceOf[js.Any], inputId.asInstanceOf[js.Any])).asInstanceOf[Label]
  
  @scala.inline
  def getElementRoot(el: HTMLElement): HTMLElement | ShadowRoot = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementRoot")(el.asInstanceOf[js.Any]).asInstanceOf[HTMLElement | ShadowRoot]
  @scala.inline
  def getElementRoot(el: HTMLElement, fallback: HTMLElement): HTMLElement | ShadowRoot = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementRoot")(el.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | ShadowRoot]
  
  @scala.inline
  def hasShadowDom(el: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasShadowDom")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def inheritAttributes(el: HTMLElement): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("inheritAttributes")(el.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def inheritAttributes(el: HTMLElement, attributes: js.Array[String]): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("inheritAttributes")(el.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  @scala.inline
  def isEndSide(side: Side): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEndSide")(side.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def now(ev: UIEvent): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(ev.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def pointerCoord(ev: js.Any): X = ^.asInstanceOf[js.Dynamic].applyDynamic("pointerCoord")(ev.asInstanceOf[js.Any]).asInstanceOf[X]
  
  @scala.inline
  def raf(h: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("raf")(h.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def removeEventListener(el: js.Any, eventName: String, callback: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def removeEventListener(el: js.Any, eventName: String, callback: js.Any, opts: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def renderHiddenInput(always: Boolean, container: HTMLElement, name: String, value: String, disabled: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderHiddenInput")(always.asInstanceOf[js.Any], container.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def renderHiddenInput(always: Boolean, container: HTMLElement, name: String, value: Null, disabled: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderHiddenInput")(always.asInstanceOf[js.Any], container.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def renderHiddenInput(always: Boolean, container: HTMLElement, name: String, value: Unit, disabled: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderHiddenInput")(always.asInstanceOf[js.Any], container.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
