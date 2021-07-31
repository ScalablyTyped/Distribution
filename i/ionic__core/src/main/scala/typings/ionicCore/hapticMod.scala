package typings.ionicCore

import typings.ionicCore.ionicCoreStrings.error
import typings.ionicCore.ionicCoreStrings.heavy
import typings.ionicCore.ionicCoreStrings.light
import typings.ionicCore.ionicCoreStrings.medium
import typings.ionicCore.ionicCoreStrings.success
import typings.ionicCore.ionicCoreStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hapticMod {
  
  @JSImport("@ionic/core/dist/types/utils/native/haptic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def hapticAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hapticAvailable")().asInstanceOf[Boolean]
  
  @scala.inline
  def hapticImpact(options: HapticImpactOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hapticImpact")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def hapticNotification(options: HapticNotificationOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hapticNotification")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def hapticSelection(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hapticSelection")().asInstanceOf[Unit]
  
  @scala.inline
  def hapticSelectionChanged(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hapticSelectionChanged")().asInstanceOf[Unit]
  
  @scala.inline
  def hapticSelectionEnd(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hapticSelectionEnd")().asInstanceOf[Unit]
  
  @scala.inline
  def hapticSelectionStart(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hapticSelectionStart")().asInstanceOf[Unit]
  
  trait HapticImpactOptions extends StObject {
    
    var style: light | medium | heavy
  }
  object HapticImpactOptions {
    
    @scala.inline
    def apply(style: light | medium | heavy): HapticImpactOptions = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[HapticImpactOptions]
    }
    
    @scala.inline
    implicit class HapticImpactOptionsMutableBuilder[Self <: HapticImpactOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: light | medium | heavy): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait HapticNotificationOptions extends StObject {
    
    var style: success | warning | error
  }
  object HapticNotificationOptions {
    
    @scala.inline
    def apply(style: success | warning | error): HapticNotificationOptions = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[HapticNotificationOptions]
    }
    
    @scala.inline
    implicit class HapticNotificationOptionsMutableBuilder[Self <: HapticNotificationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: success | warning | error): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
}
