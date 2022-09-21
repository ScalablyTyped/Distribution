package typings.googleapis.v1Dot1Mod.doubleclickbidmanagerV11

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReport extends StObject {
  
  /**
    * Key used to identify a report.
    */
  var key: js.UndefOr[SchemaReportKey] = js.undefined
  
  /**
    * Report metadata.
    */
  var metadata: js.UndefOr[SchemaReportMetadata] = js.undefined
  
  /**
    * Report parameters.
    */
  var params: js.UndefOr[SchemaParameters] = js.undefined
}
object SchemaReport {
  
  inline def apply(): SchemaReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReport]
  }
  
  extension [Self <: SchemaReport](x: Self) {
    
    inline def setKey(value: SchemaReportKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setMetadata(value: SchemaReportMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setParams(value: SchemaParameters): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
