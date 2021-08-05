package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Nonprofit information.
  */
trait SchemaNonprofit extends StObject {
  
  /**
    * Id of the nonprofit.
    */
  var nonprofitId: js.UndefOr[SchemaNonprofitId] = js.undefined
  
  /**
    * Legal name of the nonprofit.
    */
  var nonprofitLegalName: js.UndefOr[String] = js.undefined
}
object SchemaNonprofit {
  
  inline def apply(): SchemaNonprofit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNonprofit]
  }
  
  extension [Self <: SchemaNonprofit](x: Self) {
    
    inline def setNonprofitId(value: SchemaNonprofitId): Self = StObject.set(x, "nonprofitId", value.asInstanceOf[js.Any])
    
    inline def setNonprofitIdUndefined: Self = StObject.set(x, "nonprofitId", js.undefined)
    
    inline def setNonprofitLegalName(value: String): Self = StObject.set(x, "nonprofitLegalName", value.asInstanceOf[js.Any])
    
    inline def setNonprofitLegalNameUndefined: Self = StObject.set(x, "nonprofitLegalName", js.undefined)
  }
}
