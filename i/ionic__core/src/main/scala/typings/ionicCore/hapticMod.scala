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
  
  inline def hapticAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hapticAvailable")().asInstanceOf[Boolean]
  
  inline def hapticImpact(options: HapticImpactOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hapticImpact")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def hapticNotification(options: HapticNotificationOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hapticNotification")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def hapticSelection(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hapticSelection")().asInstanceOf[Unit]
  
  inline def hapticSelectionChanged(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hapticSelectionChanged")().asInstanceOf[Unit]
  
  inline def hapticSelectionEnd(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hapticSelectionEnd")().asInstanceOf[Unit]
  
  inline def hapticSelectionStart(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hapticSelectionStart")().asInstanceOf[Unit]
  
  trait HapticImpactOptions extends StObject {
    
    var style: light | medium | heavy
  }
  object HapticImpactOptions {
    
    inline def apply(style: light | medium | heavy): HapticImpactOptions = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[HapticImpactOptions]
    }
    
    extension [Self <: HapticImpactOptions](x: Self) {
      
      inline def setStyle(value: light | medium | heavy): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait HapticNotificationOptions extends StObject {
    
    var style: success | warning | error
  }
  object HapticNotificationOptions {
    
    inline def apply(style: success | warning | error): HapticNotificationOptions = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[HapticNotificationOptions]
    }
    
    extension [Self <: HapticNotificationOptions](x: Self) {
      
      inline def setStyle(value: success | warning | error): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
}
