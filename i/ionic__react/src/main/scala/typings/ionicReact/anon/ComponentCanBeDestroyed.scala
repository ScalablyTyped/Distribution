package typings.ionicReact.anon

import typings.ionicReact.ionLifeCycleContextMod.LifeCycleCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentCanBeDestroyed extends StObject {
  
  def componentCanBeDestroyed(): Unit
  
  var componentCanBeDestroyedCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  def ionViewDidEnter(): Unit
  
  var ionViewDidEnterCallbacks: js.Array[LifeCycleCallback]
  
  def ionViewDidLeave(): Unit
  
  var ionViewDidLeaveCallbacks: js.Array[LifeCycleCallback]
  
  def ionViewWillEnter(): Unit
  
  var ionViewWillEnterCallbacks: js.Array[LifeCycleCallback]
  
  def ionViewWillLeave(): Unit
  
  var ionViewWillLeaveCallbacks: js.Array[LifeCycleCallback]
  
  def onComponentCanBeDestroyed(callback: js.Function0[Unit]): Unit
  
  def onIonViewDidEnter(callback: LifeCycleCallback): Unit
  
  def onIonViewDidLeave(callback: LifeCycleCallback): Unit
  
  def onIonViewWillEnter(callback: LifeCycleCallback): Unit
  
  def onIonViewWillLeave(callback: LifeCycleCallback): Unit
}
object ComponentCanBeDestroyed {
  
  inline def apply(
    componentCanBeDestroyed: () => Unit,
    ionViewDidEnter: () => Unit,
    ionViewDidEnterCallbacks: js.Array[LifeCycleCallback],
    ionViewDidLeave: () => Unit,
    ionViewDidLeaveCallbacks: js.Array[LifeCycleCallback],
    ionViewWillEnter: () => Unit,
    ionViewWillEnterCallbacks: js.Array[LifeCycleCallback],
    ionViewWillLeave: () => Unit,
    ionViewWillLeaveCallbacks: js.Array[LifeCycleCallback],
    onComponentCanBeDestroyed: js.Function0[Unit] => Unit,
    onIonViewDidEnter: LifeCycleCallback => Unit,
    onIonViewDidLeave: LifeCycleCallback => Unit,
    onIonViewWillEnter: LifeCycleCallback => Unit,
    onIonViewWillLeave: LifeCycleCallback => Unit
  ): ComponentCanBeDestroyed = {
    val __obj = js.Dynamic.literal(componentCanBeDestroyed = js.Any.fromFunction0(componentCanBeDestroyed), ionViewDidEnter = js.Any.fromFunction0(ionViewDidEnter), ionViewDidEnterCallbacks = ionViewDidEnterCallbacks.asInstanceOf[js.Any], ionViewDidLeave = js.Any.fromFunction0(ionViewDidLeave), ionViewDidLeaveCallbacks = ionViewDidLeaveCallbacks.asInstanceOf[js.Any], ionViewWillEnter = js.Any.fromFunction0(ionViewWillEnter), ionViewWillEnterCallbacks = ionViewWillEnterCallbacks.asInstanceOf[js.Any], ionViewWillLeave = js.Any.fromFunction0(ionViewWillLeave), ionViewWillLeaveCallbacks = ionViewWillLeaveCallbacks.asInstanceOf[js.Any], onComponentCanBeDestroyed = js.Any.fromFunction1(onComponentCanBeDestroyed), onIonViewDidEnter = js.Any.fromFunction1(onIonViewDidEnter), onIonViewDidLeave = js.Any.fromFunction1(onIonViewDidLeave), onIonViewWillEnter = js.Any.fromFunction1(onIonViewWillEnter), onIonViewWillLeave = js.Any.fromFunction1(onIonViewWillLeave))
    __obj.asInstanceOf[ComponentCanBeDestroyed]
  }
  
  extension [Self <: ComponentCanBeDestroyed](x: Self) {
    
    inline def setComponentCanBeDestroyed(value: () => Unit): Self = StObject.set(x, "componentCanBeDestroyed", js.Any.fromFunction0(value))
    
    inline def setComponentCanBeDestroyedCallback(value: () => Unit): Self = StObject.set(x, "componentCanBeDestroyedCallback", js.Any.fromFunction0(value))
    
    inline def setComponentCanBeDestroyedCallbackUndefined: Self = StObject.set(x, "componentCanBeDestroyedCallback", js.undefined)
    
    inline def setIonViewDidEnter(value: () => Unit): Self = StObject.set(x, "ionViewDidEnter", js.Any.fromFunction0(value))
    
    inline def setIonViewDidEnterCallbacks(value: js.Array[LifeCycleCallback]): Self = StObject.set(x, "ionViewDidEnterCallbacks", value.asInstanceOf[js.Any])
    
    inline def setIonViewDidEnterCallbacksVarargs(value: LifeCycleCallback*): Self = StObject.set(x, "ionViewDidEnterCallbacks", js.Array(value :_*))
    
    inline def setIonViewDidLeave(value: () => Unit): Self = StObject.set(x, "ionViewDidLeave", js.Any.fromFunction0(value))
    
    inline def setIonViewDidLeaveCallbacks(value: js.Array[LifeCycleCallback]): Self = StObject.set(x, "ionViewDidLeaveCallbacks", value.asInstanceOf[js.Any])
    
    inline def setIonViewDidLeaveCallbacksVarargs(value: LifeCycleCallback*): Self = StObject.set(x, "ionViewDidLeaveCallbacks", js.Array(value :_*))
    
    inline def setIonViewWillEnter(value: () => Unit): Self = StObject.set(x, "ionViewWillEnter", js.Any.fromFunction0(value))
    
    inline def setIonViewWillEnterCallbacks(value: js.Array[LifeCycleCallback]): Self = StObject.set(x, "ionViewWillEnterCallbacks", value.asInstanceOf[js.Any])
    
    inline def setIonViewWillEnterCallbacksVarargs(value: LifeCycleCallback*): Self = StObject.set(x, "ionViewWillEnterCallbacks", js.Array(value :_*))
    
    inline def setIonViewWillLeave(value: () => Unit): Self = StObject.set(x, "ionViewWillLeave", js.Any.fromFunction0(value))
    
    inline def setIonViewWillLeaveCallbacks(value: js.Array[LifeCycleCallback]): Self = StObject.set(x, "ionViewWillLeaveCallbacks", value.asInstanceOf[js.Any])
    
    inline def setIonViewWillLeaveCallbacksVarargs(value: LifeCycleCallback*): Self = StObject.set(x, "ionViewWillLeaveCallbacks", js.Array(value :_*))
    
    inline def setOnComponentCanBeDestroyed(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onComponentCanBeDestroyed", js.Any.fromFunction1(value))
    
    inline def setOnIonViewDidEnter(value: LifeCycleCallback => Unit): Self = StObject.set(x, "onIonViewDidEnter", js.Any.fromFunction1(value))
    
    inline def setOnIonViewDidLeave(value: LifeCycleCallback => Unit): Self = StObject.set(x, "onIonViewDidLeave", js.Any.fromFunction1(value))
    
    inline def setOnIonViewWillEnter(value: LifeCycleCallback => Unit): Self = StObject.set(x, "onIonViewWillEnter", js.Any.fromFunction1(value))
    
    inline def setOnIonViewWillLeave(value: LifeCycleCallback => Unit): Self = StObject.set(x, "onIonViewWillLeave", js.Any.fromFunction1(value))
  }
}
