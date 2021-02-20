package typings.httpAwsEs

import typings.awsSdk.mod.Config_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* augmented module */
  object elasticsearchAugmentingMod {
    
    @js.native
    trait ConfigOptions extends StObject {
      
      var awsConfig: js.UndefOr[Config_] = js.native
    }
    object ConfigOptions {
      
      @scala.inline
      def apply(): ConfigOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ConfigOptions]
      }
      
      @scala.inline
      implicit class ConfigOptionsMutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAwsConfig(value: Config_): Self = StObject.set(x, "awsConfig", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAwsConfigUndefined: Self = StObject.set(x, "awsConfig", js.undefined)
      }
    }
  }
}
