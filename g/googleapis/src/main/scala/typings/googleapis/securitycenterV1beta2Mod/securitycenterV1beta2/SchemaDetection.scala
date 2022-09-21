package typings.googleapis.securitycenterV1beta2Mod.securitycenterV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDetection extends StObject {
  
  /**
    * The name of the binary associated with the memory hash signature detection.
    */
  var binary: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The percentage of memory page hashes in the signature that were matched.
    */
  var percentPagesMatched: js.UndefOr[Double | Null] = js.undefined
}
object SchemaDetection {
  
  inline def apply(): SchemaDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDetection]
  }
  
  extension [Self <: SchemaDetection](x: Self) {
    
    inline def setBinary(value: String): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    inline def setBinaryNull: Self = StObject.set(x, "binary", null)
    
    inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    inline def setPercentPagesMatched(value: Double): Self = StObject.set(x, "percentPagesMatched", value.asInstanceOf[js.Any])
    
    inline def setPercentPagesMatchedNull: Self = StObject.set(x, "percentPagesMatched", null)
    
    inline def setPercentPagesMatchedUndefined: Self = StObject.set(x, "percentPagesMatched", js.undefined)
  }
}
