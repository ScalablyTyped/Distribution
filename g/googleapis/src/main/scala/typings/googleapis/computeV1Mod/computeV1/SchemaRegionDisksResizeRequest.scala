package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegionDisksResizeRequest extends StObject {
  
  /**
    * The new size of the regional persistent disk, which is specified in GB.
    */
  var sizeGb: js.UndefOr[String] = js.undefined
}
object SchemaRegionDisksResizeRequest {
  
  inline def apply(): SchemaRegionDisksResizeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionDisksResizeRequest]
  }
  
  extension [Self <: SchemaRegionDisksResizeRequest](x: Self) {
    
    inline def setSizeGb(value: String): Self = StObject.set(x, "sizeGb", value.asInstanceOf[js.Any])
    
    inline def setSizeGbUndefined: Self = StObject.set(x, "sizeGb", js.undefined)
  }
}
