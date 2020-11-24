package typings.ionicReact.anon

import typings.ionicReact.ionLifeCycleContextMod.LifeCycleCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentCanBeDestroyed extends js.Object {
  
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
  implicit class ComponentCanBeDestroyedOps[Self <: ComponentCanBeDestroyed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComponentCanBeDestroyed(value: () => Unit): Self = this.set("componentCanBeDestroyed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIonViewDidEnter(value: () => Unit): Self = this.set("ionViewDidEnter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIonViewDidEnterCallbacksVarargs(value: LifeCycleCallback*): Self = this.set("ionViewDidEnterCallbacks", js.Array(value :_*))
    
    @scala.inline
    def setIonViewDidEnterCallbacks(value: js.Array[LifeCycleCallback]): Self = this.set("ionViewDidEnterCallbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIonViewDidLeave(value: () => Unit): Self = this.set("ionViewDidLeave", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIonViewDidLeaveCallbacksVarargs(value: LifeCycleCallback*): Self = this.set("ionViewDidLeaveCallbacks", js.Array(value :_*))
    
    @scala.inline
    def setIonViewDidLeaveCallbacks(value: js.Array[LifeCycleCallback]): Self = this.set("ionViewDidLeaveCallbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIonViewWillEnter(value: () => Unit): Self = this.set("ionViewWillEnter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIonViewWillEnterCallbacksVarargs(value: LifeCycleCallback*): Self = this.set("ionViewWillEnterCallbacks", js.Array(value :_*))
    
    @scala.inline
    def setIonViewWillEnterCallbacks(value: js.Array[LifeCycleCallback]): Self = this.set("ionViewWillEnterCallbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIonViewWillLeave(value: () => Unit): Self = this.set("ionViewWillLeave", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIonViewWillLeaveCallbacksVarargs(value: LifeCycleCallback*): Self = this.set("ionViewWillLeaveCallbacks", js.Array(value :_*))
    
    @scala.inline
    def setIonViewWillLeaveCallbacks(value: js.Array[LifeCycleCallback]): Self = this.set("ionViewWillLeaveCallbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnComponentCanBeDestroyed(value: js.Function0[Unit] => Unit): Self = this.set("onComponentCanBeDestroyed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonViewDidEnter(value: LifeCycleCallback => Unit): Self = this.set("onIonViewDidEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonViewDidLeave(value: LifeCycleCallback => Unit): Self = this.set("onIonViewDidLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonViewWillEnter(value: LifeCycleCallback => Unit): Self = this.set("onIonViewWillEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonViewWillLeave(value: LifeCycleCallback => Unit): Self = this.set("onIonViewWillLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentCanBeDestroyedCallback(value: () => Unit): Self = this.set("componentCanBeDestroyedCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteComponentCanBeDestroyedCallback: Self = this.set("componentCanBeDestroyedCallback", js.undefined)
  }
}
