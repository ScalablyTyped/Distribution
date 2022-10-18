package typings.mauron85ReactNativeBackgroundGeolocation

import typings.std.Location
import typings.std.PositionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backgroundGeolocationDotPromiseMod {
  
  // Type definitions for react-native-mauron85-background-geolocation
  // Project: https://github.com/mauron85/react-native-background-geolocation
  // Definitions by: Mauron85 (@mauron85)
  // Definitions: https://github.com/mauron85/react-native-background-geolocation/blob/master/index.d.ts
  object BackgroundGeolocation {
    
    @JSImport("@mauron85/react-native-background-geolocation/BackgroundGeolocation.Promise", "BackgroundGeolocation")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getCurrentLocationAsync(): js.Promise[Location] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentLocationAsync")().asInstanceOf[js.Promise[Location]]
    inline def getCurrentLocationAsync(options: PositionOptions): js.Promise[Location] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentLocationAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Location]]
  }
  
  // Type definitions for react-native-mauron85-background-geolocation
  // Project: https://github.com/mauron85/react-native-background-geolocation
  // Definitions by: Mauron85 (@mauron85)
  // Definitions: https://github.com/mauron85/react-native-background-geolocation/blob/master/index.d.ts
  object BackgroundGeolocationPlugin {
    
    trait LocationZ extends StObject {
      
      var speed: Double
    }
    object LocationZ {
      
      inline def apply(speed: Double): LocationZ = {
        val __obj = js.Dynamic.literal(speed = speed.asInstanceOf[js.Any])
        __obj.asInstanceOf[LocationZ]
      }
      
      extension [Self <: LocationZ](x: Self) {
        
        inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      }
    }
  }
}
