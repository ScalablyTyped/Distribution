package typings.httpAwsEs

import org.scalablytyped.runtime.Shortcut
import typings.awsSdk2Types.mod.Config_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("http-aws-es", JSImport.Namespace)
  @js.native
  val ^ : Any = js.native
  
  type _To = Any
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Any = ^
  
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
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
        
        inline def setAwsConfig(value: Config_): Self = StObject.set(x, "awsConfig", value.asInstanceOf[js.Any])
        
        inline def setAwsConfigUndefined: Self = StObject.set(x, "awsConfig", js.undefined)
      }
    }
  }
}
