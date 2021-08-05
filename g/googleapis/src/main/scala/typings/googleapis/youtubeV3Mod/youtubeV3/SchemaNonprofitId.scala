package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNonprofitId extends StObject {
  
  var value: js.UndefOr[String] = js.undefined
}
object SchemaNonprofitId {
  
  inline def apply(): SchemaNonprofitId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNonprofitId]
  }
  
  extension [Self <: SchemaNonprofitId](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
