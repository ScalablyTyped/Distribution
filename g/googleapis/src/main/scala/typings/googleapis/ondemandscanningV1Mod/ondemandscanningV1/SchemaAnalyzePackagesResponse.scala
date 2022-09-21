package typings.googleapis.ondemandscanningV1Mod.ondemandscanningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAnalyzePackagesResponse extends StObject {
  
  /**
    * The name of the scan resource created by this successful scan.
    */
  var scan: js.UndefOr[String | Null] = js.undefined
}
object SchemaAnalyzePackagesResponse {
  
  inline def apply(): SchemaAnalyzePackagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnalyzePackagesResponse]
  }
  
  extension [Self <: SchemaAnalyzePackagesResponse](x: Self) {
    
    inline def setScan(value: String): Self = StObject.set(x, "scan", value.asInstanceOf[js.Any])
    
    inline def setScanNull: Self = StObject.set(x, "scan", null)
    
    inline def setScanUndefined: Self = StObject.set(x, "scan", js.undefined)
  }
}
