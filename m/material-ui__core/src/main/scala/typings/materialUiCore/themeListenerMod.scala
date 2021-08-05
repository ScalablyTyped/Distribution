package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeListenerMod extends Shortcut {
  
  @JSImport("@material-ui/core/styles/themeListener", JSImport.Default)
  @js.native
  val default: ThemeListener[js.Object] = js.native
  
  trait Broadcast[S] extends StObject {
    
    def getState(): S
    
    def setState(state: S): Unit
    
    def subscribe(callback: js.Function1[/* state */ S, Unit]): Double
    
    def unsubscribe(subscriptionId: Double): Unit
  }
  object Broadcast {
    
    inline def apply[S](
      getState: () => S,
      setState: S => Unit,
      subscribe: js.Function1[/* state */ S, Unit] => Double,
      unsubscribe: Double => Unit
    ): Broadcast[S] = {
      val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), setState = js.Any.fromFunction1(setState), subscribe = js.Any.fromFunction1(subscribe), unsubscribe = js.Any.fromFunction1(unsubscribe))
      __obj.asInstanceOf[Broadcast[S]]
    }
    
    extension [Self <: Broadcast[?], S](x: Self & Broadcast[S]) {
      
      inline def setGetState(value: () => S): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      inline def setSetState(value: S => Unit): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
      
      inline def setSubscribe(value: js.Function1[/* state */ S, Unit] => Double): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
      
      inline def setUnsubscribe(value: Double => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction1(value))
    }
  }
  
  trait MuiContext[S] extends StObject {
    
    var __THEMING__ : js.UndefOr[Broadcast[S]] = js.undefined
  }
  object MuiContext {
    
    inline def apply[S](): MuiContext[S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MuiContext[S]]
    }
    
    extension [Self <: MuiContext[?], S](x: Self & MuiContext[S]) {
      
      inline def set__THEMING__(value: Broadcast[S]): Self = StObject.set(x, "__THEMING__", value.asInstanceOf[js.Any])
      
      inline def set__THEMING__Undefined: Self = StObject.set(x, "__THEMING__", js.undefined)
    }
  }
  
  trait ThemeListener[S] extends StObject {
    
    def initial(context: MuiContext[S]): S | Null
    
    def subscribe(context: MuiContext[S], callback: js.Function1[/* state */ S, Unit]): Double | Null
    
    def unsubscribe(context: MuiContext[S], subscriptionId: Double): Unit
  }
  object ThemeListener {
    
    inline def apply[S](
      initial: MuiContext[S] => S | Null,
      subscribe: (MuiContext[S], js.Function1[/* state */ S, Unit]) => Double | Null,
      unsubscribe: (MuiContext[S], Double) => Unit
    ): ThemeListener[S] = {
      val __obj = js.Dynamic.literal(initial = js.Any.fromFunction1(initial), subscribe = js.Any.fromFunction2(subscribe), unsubscribe = js.Any.fromFunction2(unsubscribe))
      __obj.asInstanceOf[ThemeListener[S]]
    }
    
    extension [Self <: ThemeListener[?], S](x: Self & ThemeListener[S]) {
      
      inline def setInitial(value: MuiContext[S] => S | Null): Self = StObject.set(x, "initial", js.Any.fromFunction1(value))
      
      inline def setSubscribe(value: (MuiContext[S], js.Function1[/* state */ S, Unit]) => Double | Null): Self = StObject.set(x, "subscribe", js.Any.fromFunction2(value))
      
      inline def setUnsubscribe(value: (MuiContext[S], Double) => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction2(value))
    }
  }
  
  type _To = ThemeListener[js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `themeListenerMod.foo` */
  override def _to: ThemeListener[js.Object] = default
}
