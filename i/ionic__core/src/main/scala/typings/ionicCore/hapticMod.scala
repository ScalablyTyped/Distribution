package typings.ionicCore

import typings.ionicCore.ionicCoreStrings.error
import typings.ionicCore.ionicCoreStrings.heavy
import typings.ionicCore.ionicCoreStrings.light
import typings.ionicCore.ionicCoreStrings.medium
import typings.ionicCore.ionicCoreStrings.success
import typings.ionicCore.ionicCoreStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hapticMod {
  
  @JSImport("@ionic/core/dist/types/utils/native/haptic", "hapticAvailable")
  @js.native
  def hapticAvailable(): Boolean = js.native
  
  @JSImport("@ionic/core/dist/types/utils/native/haptic", "hapticImpact")
  @js.native
  def hapticImpact(options: HapticImpactOptions): Unit = js.native
  
  @JSImport("@ionic/core/dist/types/utils/native/haptic", "hapticNotification")
  @js.native
  def hapticNotification(options: HapticNotificationOptions): Unit = js.native
  
  @JSImport("@ionic/core/dist/types/utils/native/haptic", "hapticSelection")
  @js.native
  def hapticSelection(): Unit = js.native
  
  @JSImport("@ionic/core/dist/types/utils/native/haptic", "hapticSelectionChanged")
  @js.native
  def hapticSelectionChanged(): Unit = js.native
  
  @JSImport("@ionic/core/dist/types/utils/native/haptic", "hapticSelectionEnd")
  @js.native
  def hapticSelectionEnd(): Unit = js.native
  
  @JSImport("@ionic/core/dist/types/utils/native/haptic", "hapticSelectionStart")
  @js.native
  def hapticSelectionStart(): Unit = js.native
  
  @js.native
  trait HapticImpactOptions extends StObject {
    
    var style: light | medium | heavy = js.native
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
  
  @js.native
  trait HapticNotificationOptions extends StObject {
    
    var style: success | warning | error = js.native
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
