package typings.googleapis.v41Mod.adsensehostV41

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdClient extends StObject {
  
  /**
    * Whether this ad client is opted in to ARC.
    */
  var arcOptIn: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Unique identifier of this ad client.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Kind of resource this is, in this case adsensehost#adClient.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * This ad client&#39;s product code, which corresponds to the PRODUCT_CODE
    * report dimension.
    */
  var productCode: js.UndefOr[String] = js.undefined
  
  /**
    * Whether this ad client supports being reported on.
    */
  var supportsReporting: js.UndefOr[Boolean] = js.undefined
}
object SchemaAdClient {
  
  inline def apply(): SchemaAdClient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdClient]
  }
  
  extension [Self <: SchemaAdClient](x: Self) {
    
    inline def setArcOptIn(value: Boolean): Self = StObject.set(x, "arcOptIn", value.asInstanceOf[js.Any])
    
    inline def setArcOptInUndefined: Self = StObject.set(x, "arcOptIn", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setProductCode(value: String): Self = StObject.set(x, "productCode", value.asInstanceOf[js.Any])
    
    inline def setProductCodeUndefined: Self = StObject.set(x, "productCode", js.undefined)
    
    inline def setSupportsReporting(value: Boolean): Self = StObject.set(x, "supportsReporting", value.asInstanceOf[js.Any])
    
    inline def setSupportsReportingUndefined: Self = StObject.set(x, "supportsReporting", js.undefined)
  }
}
