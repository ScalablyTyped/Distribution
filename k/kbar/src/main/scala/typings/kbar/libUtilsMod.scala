package typings.kbar

import typings.kbar.anon.IgnoreWhenFocused
import typings.kbar.anon.OmitActionid
import typings.kbar.libTypesMod.Action
import typings.react.mod.DependencyList
import typings.react.mod.EffectCallback
import typings.react.mod.KeyboardEvent
import typings.react.mod.RefObject
import typings.std.Element
import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMod {
  
  @JSImport("kbar/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Priority {
    
    @JSImport("kbar/lib/utils", "Priority")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("kbar/lib/utils", "Priority.HIGH")
    @js.native
    def HIGH: Double = js.native
    inline def HIGH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HIGH")(x.asInstanceOf[js.Any])
    
    @JSImport("kbar/lib/utils", "Priority.LOW")
    @js.native
    def LOW: Double = js.native
    inline def LOW_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOW")(x.asInstanceOf[js.Any])
    
    @JSImport("kbar/lib/utils", "Priority.NORMAL")
    @js.native
    def NORMAL: Double = js.native
    inline def NORMAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NORMAL")(x.asInstanceOf[js.Any])
  }
  
  inline def createAction(params: OmitActionid): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(params.asInstanceOf[js.Any]).asInstanceOf[Action]
  
  inline def getScrollbarWidth(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollbarWidth")().asInstanceOf[Double]
  
  inline def isModKey(event: KeyboardEvent[Element]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModKey")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isModKey(event: typings.std.KeyboardEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModKey")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isModKey(event: MouseEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModKey")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  inline def randomId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomId")().asInstanceOf[String]
  
  inline def shouldRejectKeystrokes(): Boolean | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldRejectKeystrokes")().asInstanceOf[Boolean | Null]
  inline def shouldRejectKeystrokes(hasIgnoreWhenFocused: IgnoreWhenFocused): Boolean | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldRejectKeystrokes")(hasIgnoreWhenFocused.asInstanceOf[js.Any]).asInstanceOf[Boolean | Null]
  
  inline def swallowEvent(event: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("swallowEvent")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useIsomorphicLayout(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsomorphicLayout")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useIsomorphicLayout(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useIsomorphicLayout")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useOuterClick(dom: RefObject[HTMLElement], cb: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOuterClick")(dom.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def usePointerMovedSinceMount(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("usePointerMovedSinceMount")().asInstanceOf[Boolean]
  
  inline def useThrottledValue[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useThrottledValue")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useThrottledValue[T](value: T, ms: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useThrottledValue")(value.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[T]
}
