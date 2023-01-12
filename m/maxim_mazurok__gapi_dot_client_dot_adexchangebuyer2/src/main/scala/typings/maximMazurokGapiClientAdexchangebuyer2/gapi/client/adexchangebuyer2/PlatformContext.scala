package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlatformContext extends StObject {
  
  /** The platforms this restriction applies to. */
  var platforms: js.UndefOr[js.Array[String]] = js.undefined
}
object PlatformContext {
  
  inline def apply(): PlatformContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlatformContext] (val x: Self) extends AnyVal {
    
    inline def setPlatforms(value: js.Array[String]): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
    
    inline def setPlatformsUndefined: Self = StObject.set(x, "platforms", js.undefined)
    
    inline def setPlatformsVarargs(value: String*): Self = StObject.set(x, "platforms", js.Array(value*))
  }
}
