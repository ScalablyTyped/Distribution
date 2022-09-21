package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceReportsGetidmappingfile
  extends StObject
     with StandardParameters {
  
  /**
    * Legacy SA360 advertiser ID.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Legacy SA360 agency ID.
    */
  var agencyId: js.UndefOr[String] = js.undefined
}
object ParamsResourceReportsGetidmappingfile {
  
  inline def apply(): ParamsResourceReportsGetidmappingfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceReportsGetidmappingfile]
  }
  
  extension [Self <: ParamsResourceReportsGetidmappingfile](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setAgencyId(value: String): Self = StObject.set(x, "agencyId", value.asInstanceOf[js.Any])
    
    inline def setAgencyIdUndefined: Self = StObject.set(x, "agencyId", js.undefined)
  }
}
