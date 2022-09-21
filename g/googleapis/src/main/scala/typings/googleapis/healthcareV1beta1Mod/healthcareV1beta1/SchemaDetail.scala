package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDetail extends StObject {
  
  var findings: js.UndefOr[js.Array[SchemaFinding]] = js.undefined
}
object SchemaDetail {
  
  inline def apply(): SchemaDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDetail]
  }
  
  extension [Self <: SchemaDetail](x: Self) {
    
    inline def setFindings(value: js.Array[SchemaFinding]): Self = StObject.set(x, "findings", value.asInstanceOf[js.Any])
    
    inline def setFindingsUndefined: Self = StObject.set(x, "findings", js.undefined)
    
    inline def setFindingsVarargs(value: SchemaFinding*): Self = StObject.set(x, "findings", js.Array(value*))
  }
}
