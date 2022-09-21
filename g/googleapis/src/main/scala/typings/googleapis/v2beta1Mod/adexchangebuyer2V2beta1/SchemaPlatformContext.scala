package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPlatformContext extends StObject {
  
  /**
    * The platforms this restriction applies to.
    */
  var platforms: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaPlatformContext {
  
  inline def apply(): SchemaPlatformContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlatformContext]
  }
  
  extension [Self <: SchemaPlatformContext](x: Self) {
    
    inline def setPlatforms(value: js.Array[String]): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
    
    inline def setPlatformsNull: Self = StObject.set(x, "platforms", null)
    
    inline def setPlatformsUndefined: Self = StObject.set(x, "platforms", js.undefined)
    
    inline def setPlatformsVarargs(value: String*): Self = StObject.set(x, "platforms", js.Array(value*))
  }
}
