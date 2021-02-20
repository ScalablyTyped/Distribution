package typings.ionicReact.anon

import typings.ionicReact.ionLifeCycleContextMod.LifeCycleCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentCanBeDestroyed extends StObject {
  
  def componentCanBeDestroyed(): Unit = js.native
  
  var componentCanBeDestroyedCallback: js.UndefOr[js.Function0[Unit]] = js.native
  
  def ionViewDidEnter(): Unit = js.native
  
  var ionViewDidEnterCallbacks: js.Array[LifeCycleCallback] = js.native
  
  def ionViewDidLeave(): Unit = js.native
  
  var ionViewDidLeaveCallbacks: js.Array[LifeCycleCallback] = js.native
  
  def ionViewWillEnter(): Unit = js.native
  
  var ionViewWillEnterCallbacks: js.Array[LifeCycleCallback] = js.native
  
  def ionViewWillLeave(): Unit = js.native
  
  var ionViewWillLeaveCallbacks: js.Array[LifeCycleCallback] = js.native
  
  def onComponentCanBeDestroyed(callback: js.Function0[Unit]): Unit = js.native
  
  def onIonViewDidEnter(callback: LifeCycleCallback): Unit = js.native
  
  def onIonViewDidLeave(callback: LifeCycleCallback): Unit = js.native
  
  def onIonViewWillEnter(callback: LifeCycleCallback): Unit = js.native
  
  def onIonViewWillLeave(callback: LifeCycleCallback): Unit = js.native
}
object ComponentCanBeDestroyed {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ComponentCanBeDestroyedMutableBuilder[Self <: ComponentCanBeDestroyed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentCanBeDestroyed(value: () => Unit): Self = StObject.set(x, "componentCanBeDestroyed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComponentCanBeDestroyedCallback(value: () => Unit): Self = StObject.set(x, "componentCanBeDestroyedCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComponentCanBeDestroyedCallbackUndefined: Self = StObject.set(x, "componentCanBeDestroyedCallback", js.undefined)
    
    @scala.inline
    def setIonViewDidEnter(value: () => Unit): Self = StObject.set(x, "ionViewDidEnter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIonViewDidEnterCallbacks(value: js.Array[LifeCycleCallback]): Self = StObject.set(x, "ionViewDidEnterCallbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIonViewDidEnterCallbacksVarargs(value: LifeCycleCallback*): Self = StObject.set(x, "ionViewDidEnterCallbacks", js.Array(value :_*))
    
    @scala.inline
    def setIonViewDidLeave(value: () => Unit): Self = StObject.set(x, "ionViewDidLeave", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIonViewDidLeaveCallbacks(value: js.Array[LifeCycleCallback]): Self = StObject.set(x, "ionViewDidLeaveCallbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIonViewDidLeaveCallbacksVarargs(value: LifeCycleCallback*): Self = StObject.set(x, "ionViewDidLeaveCallbacks", js.Array(value :_*))
    
    @scala.inline
    def setIonViewWillEnter(value: () => Unit): Self = StObject.set(x, "ionViewWillEnter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIonViewWillEnterCallbacks(value: js.Array[LifeCycleCallback]): Self = StObject.set(x, "ionViewWillEnterCallbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIonViewWillEnterCallbacksVarargs(value: LifeCycleCallback*): Self = StObject.set(x, "ionViewWillEnterCallbacks", js.Array(value :_*))
    
    @scala.inline
    def setIonViewWillLeave(value: () => Unit): Self = StObject.set(x, "ionViewWillLeave", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIonViewWillLeaveCallbacks(value: js.Array[LifeCycleCallback]): Self = StObject.set(x, "ionViewWillLeaveCallbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIonViewWillLeaveCallbacksVarargs(value: LifeCycleCallback*): Self = StObject.set(x, "ionViewWillLeaveCallbacks", js.Array(value :_*))
    
    @scala.inline
    def setOnComponentCanBeDestroyed(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onComponentCanBeDestroyed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonViewDidEnter(value: LifeCycleCallback => Unit): Self = StObject.set(x, "onIonViewDidEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonViewDidLeave(value: LifeCycleCallback => Unit): Self = StObject.set(x, "onIonViewDidLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonViewWillEnter(value: LifeCycleCallback => Unit): Self = StObject.set(x, "onIonViewWillEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonViewWillLeave(value: LifeCycleCallback => Unit): Self = StObject.set(x, "onIonViewWillLeave", js.Any.fromFunction1(value))
  }
}
