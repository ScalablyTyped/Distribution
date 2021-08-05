package typings.leafletGeosearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Bing Maps
  */
trait BingProviderCultureOptions extends StObject {
  
  var c: js.UndefOr[String] = js.undefined
  
  var culture: js.UndefOr[String] = js.undefined
}
object BingProviderCultureOptions {
  
  inline def apply(): BingProviderCultureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BingProviderCultureOptions]
  }
  
  extension [Self <: BingProviderCultureOptions](x: Self) {
    
    inline def setC(value: String): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCUndefined: Self = StObject.set(x, "c", js.undefined)
    
    inline def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
    
    inline def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
  }
}
