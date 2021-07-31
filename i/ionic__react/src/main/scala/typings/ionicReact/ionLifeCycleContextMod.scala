package typings.ionicReact

import typings.ionicReact.anon.ComponentCanBeDestroyed
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionLifeCycleContextMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@ionic/react/dist/types/contexts/IonLifeCycleContext", "DefaultIonLifeCycleContext")
  @js.native
  class DefaultIonLifeCycleContext ()
    extends StObject
       with ComponentCanBeDestroyed {
    
    /* CompleteClass */
    override def componentCanBeDestroyed(): Unit = js.native
    
    /* CompleteClass */
    override def ionViewDidEnter(): Unit = js.native
    
    /* CompleteClass */
    var ionViewDidEnterCallbacks: js.Array[LifeCycleCallback] = js.native
    
    /* CompleteClass */
    override def ionViewDidLeave(): Unit = js.native
    
    /* CompleteClass */
    var ionViewDidLeaveCallbacks: js.Array[LifeCycleCallback] = js.native
    
    /* CompleteClass */
    override def ionViewWillEnter(): Unit = js.native
    
    /* CompleteClass */
    var ionViewWillEnterCallbacks: js.Array[LifeCycleCallback] = js.native
    
    /* CompleteClass */
    override def ionViewWillLeave(): Unit = js.native
    
    /* CompleteClass */
    var ionViewWillLeaveCallbacks: js.Array[LifeCycleCallback] = js.native
    
    /* CompleteClass */
    override def onComponentCanBeDestroyed(callback: js.Function0[Unit]): Unit = js.native
    
    /* CompleteClass */
    override def onIonViewDidEnter(callback: LifeCycleCallback): Unit = js.native
    
    /* CompleteClass */
    override def onIonViewDidLeave(callback: LifeCycleCallback): Unit = js.native
    
    /* CompleteClass */
    override def onIonViewWillEnter(callback: LifeCycleCallback): Unit = js.native
    
    /* CompleteClass */
    override def onIonViewWillLeave(callback: LifeCycleCallback): Unit = js.native
  }
  
  @JSImport("@ionic/react/dist/types/contexts/IonLifeCycleContext", "IonLifeCycleContext")
  @js.native
  val IonLifeCycleContext: Context[IonLifeCycleContextInterface] = js.native
  
  trait IonLifeCycleContextInterface extends StObject {
    
    def ionViewDidEnter(): Unit
    
    def ionViewDidLeave(): Unit
    
    def ionViewWillEnter(): Unit
    
    def ionViewWillLeave(): Unit
    
    def onIonViewDidEnter(callback: js.Function0[Unit]): Unit
    
    def onIonViewDidLeave(callback: js.Function0[Unit]): Unit
    
    def onIonViewWillEnter(callback: js.Function0[Unit]): Unit
    
    def onIonViewWillLeave(callback: js.Function0[Unit]): Unit
  }
  object IonLifeCycleContextInterface {
    
    @scala.inline
    def apply(
      ionViewDidEnter: () => Unit,
      ionViewDidLeave: () => Unit,
      ionViewWillEnter: () => Unit,
      ionViewWillLeave: () => Unit,
      onIonViewDidEnter: js.Function0[Unit] => Unit,
      onIonViewDidLeave: js.Function0[Unit] => Unit,
      onIonViewWillEnter: js.Function0[Unit] => Unit,
      onIonViewWillLeave: js.Function0[Unit] => Unit
    ): IonLifeCycleContextInterface = {
      val __obj = js.Dynamic.literal(ionViewDidEnter = js.Any.fromFunction0(ionViewDidEnter), ionViewDidLeave = js.Any.fromFunction0(ionViewDidLeave), ionViewWillEnter = js.Any.fromFunction0(ionViewWillEnter), ionViewWillLeave = js.Any.fromFunction0(ionViewWillLeave), onIonViewDidEnter = js.Any.fromFunction1(onIonViewDidEnter), onIonViewDidLeave = js.Any.fromFunction1(onIonViewDidLeave), onIonViewWillEnter = js.Any.fromFunction1(onIonViewWillEnter), onIonViewWillLeave = js.Any.fromFunction1(onIonViewWillLeave))
      __obj.asInstanceOf[IonLifeCycleContextInterface]
    }
    
    @scala.inline
    implicit class IonLifeCycleContextInterfaceMutableBuilder[Self <: IonLifeCycleContextInterface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIonViewDidEnter(value: () => Unit): Self = StObject.set(x, "ionViewDidEnter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIonViewDidLeave(value: () => Unit): Self = StObject.set(x, "ionViewDidLeave", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIonViewWillEnter(value: () => Unit): Self = StObject.set(x, "ionViewWillEnter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIonViewWillLeave(value: () => Unit): Self = StObject.set(x, "ionViewWillLeave", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnIonViewDidEnter(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onIonViewDidEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnIonViewDidLeave(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onIonViewDidLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnIonViewWillEnter(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onIonViewWillEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnIonViewWillLeave(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onIonViewWillLeave", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait LifeCycleCallback extends StObject {
    
    def apply(): Unit = js.native
    
    var id: js.UndefOr[Double] = js.native
  }
}
