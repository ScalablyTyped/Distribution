package typings.httpAwsEs

import typings.awsSdk.mod.Config_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* augmented module */
  object elasticsearchAugmentingMod {
    
    trait ConfigOptions extends StObject {
      
      var awsConfig: js.UndefOr[Config_] = js.undefined
    }
    object ConfigOptions {
      
      inline def apply(): ConfigOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ConfigOptions]
      }
      
      extension [Self <: ConfigOptions](x: Self) {
        
        inline def setAwsConfig(value: Config_): Self = StObject.set(x, "awsConfig", value.asInstanceOf[js.Any])
        
        inline def setAwsConfigUndefined: Self = StObject.set(x, "awsConfig", js.undefined)
      }
    }
  }
}
