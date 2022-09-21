package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCompanyInfoSource extends StObject {
  
  /**
    * Optional. The Google's Knowledge Graph value for the employer's company.
    */
  var freebaseMid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The numeric identifier for the employer's Google+ business page.
    */
  var gplusId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The numeric identifier for the employer's headquarters on Google Maps, namely, the Google Maps CID (cell id).
    */
  var mapsCid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. A Google identifier that does not match any of the other types.
    */
  var unknownTypeId: js.UndefOr[String | Null] = js.undefined
}
object SchemaCompanyInfoSource {
  
  inline def apply(): SchemaCompanyInfoSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompanyInfoSource]
  }
  
  extension [Self <: SchemaCompanyInfoSource](x: Self) {
    
    inline def setFreebaseMid(value: String): Self = StObject.set(x, "freebaseMid", value.asInstanceOf[js.Any])
    
    inline def setFreebaseMidNull: Self = StObject.set(x, "freebaseMid", null)
    
    inline def setFreebaseMidUndefined: Self = StObject.set(x, "freebaseMid", js.undefined)
    
    inline def setGplusId(value: String): Self = StObject.set(x, "gplusId", value.asInstanceOf[js.Any])
    
    inline def setGplusIdNull: Self = StObject.set(x, "gplusId", null)
    
    inline def setGplusIdUndefined: Self = StObject.set(x, "gplusId", js.undefined)
    
    inline def setMapsCid(value: String): Self = StObject.set(x, "mapsCid", value.asInstanceOf[js.Any])
    
    inline def setMapsCidNull: Self = StObject.set(x, "mapsCid", null)
    
    inline def setMapsCidUndefined: Self = StObject.set(x, "mapsCid", js.undefined)
    
    inline def setUnknownTypeId(value: String): Self = StObject.set(x, "unknownTypeId", value.asInstanceOf[js.Any])
    
    inline def setUnknownTypeIdNull: Self = StObject.set(x, "unknownTypeId", null)
    
    inline def setUnknownTypeIdUndefined: Self = StObject.set(x, "unknownTypeId", js.undefined)
  }
}
