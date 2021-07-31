package typings.ionicAngular

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionicLifecycleHooksMod {
  
  trait ViewDidEnter extends StObject {
    
    /**
      * Fired when the component routing to has finished animating.
      */
    def ionViewDidEnter(): Unit
  }
  object ViewDidEnter {
    
    @scala.inline
    def apply(ionViewDidEnter: () => Unit): ViewDidEnter = {
      val __obj = js.Dynamic.literal(ionViewDidEnter = js.Any.fromFunction0(ionViewDidEnter))
      __obj.asInstanceOf[ViewDidEnter]
    }
    
    @scala.inline
    implicit class ViewDidEnterMutableBuilder[Self <: ViewDidEnter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIonViewDidEnter(value: () => Unit): Self = StObject.set(x, "ionViewDidEnter", js.Any.fromFunction0(value))
    }
  }
  
  trait ViewDidLeave extends StObject {
    
    /**
      * Fired when the component routing to has finished animating.
      */
    def ionViewDidLeave(): Unit
  }
  object ViewDidLeave {
    
    @scala.inline
    def apply(ionViewDidLeave: () => Unit): ViewDidLeave = {
      val __obj = js.Dynamic.literal(ionViewDidLeave = js.Any.fromFunction0(ionViewDidLeave))
      __obj.asInstanceOf[ViewDidLeave]
    }
    
    @scala.inline
    implicit class ViewDidLeaveMutableBuilder[Self <: ViewDidLeave] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIonViewDidLeave(value: () => Unit): Self = StObject.set(x, "ionViewDidLeave", js.Any.fromFunction0(value))
    }
  }
  
  trait ViewWillEnter extends StObject {
    
    /**
      * Fired when the component routing to is about to animate into view.
      */
    def ionViewWillEnter(): Unit
  }
  object ViewWillEnter {
    
    @scala.inline
    def apply(ionViewWillEnter: () => Unit): ViewWillEnter = {
      val __obj = js.Dynamic.literal(ionViewWillEnter = js.Any.fromFunction0(ionViewWillEnter))
      __obj.asInstanceOf[ViewWillEnter]
    }
    
    @scala.inline
    implicit class ViewWillEnterMutableBuilder[Self <: ViewWillEnter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIonViewWillEnter(value: () => Unit): Self = StObject.set(x, "ionViewWillEnter", js.Any.fromFunction0(value))
    }
  }
  
  trait ViewWillLeave extends StObject {
    
    /**
      * Fired when the component routing from is about to animate.
      */
    def ionViewWillLeave(): Unit
  }
  object ViewWillLeave {
    
    @scala.inline
    def apply(ionViewWillLeave: () => Unit): ViewWillLeave = {
      val __obj = js.Dynamic.literal(ionViewWillLeave = js.Any.fromFunction0(ionViewWillLeave))
      __obj.asInstanceOf[ViewWillLeave]
    }
    
    @scala.inline
    implicit class ViewWillLeaveMutableBuilder[Self <: ViewWillLeave] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIonViewWillLeave(value: () => Unit): Self = StObject.set(x, "ionViewWillLeave", js.Any.fromFunction0(value))
    }
  }
}
