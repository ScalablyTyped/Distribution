package typings.googleapis.ondemandscanningV1beta1Mod.ondemandscanningV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAnalyzePackagesResponseV1 extends StObject {
  
  /**
    * The name of the scan resource created by this successful scan.
    */
  var scan: js.UndefOr[String | Null] = js.undefined
}
object SchemaAnalyzePackagesResponseV1 {
  
  inline def apply(): SchemaAnalyzePackagesResponseV1 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnalyzePackagesResponseV1]
  }
  
  extension [Self <: SchemaAnalyzePackagesResponseV1](x: Self) {
    
    inline def setScan(value: String): Self = StObject.set(x, "scan", value.asInstanceOf[js.Any])
    
    inline def setScanNull: Self = StObject.set(x, "scan", null)
    
    inline def setScanUndefined: Self = StObject.set(x, "scan", js.undefined)
  }
}
