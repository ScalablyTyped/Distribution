package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHeldVoiceQuery extends StObject {
  
  /**
    * A list of data types covered by the hold. Should be non-empty. Order does not matter and duplicates are ignored.
    */
  var coveredData: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaHeldVoiceQuery {
  
  inline def apply(): SchemaHeldVoiceQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHeldVoiceQuery]
  }
  
  extension [Self <: SchemaHeldVoiceQuery](x: Self) {
    
    inline def setCoveredData(value: js.Array[String]): Self = StObject.set(x, "coveredData", value.asInstanceOf[js.Any])
    
    inline def setCoveredDataNull: Self = StObject.set(x, "coveredData", null)
    
    inline def setCoveredDataUndefined: Self = StObject.set(x, "coveredData", js.undefined)
    
    inline def setCoveredDataVarargs(value: String*): Self = StObject.set(x, "coveredData", js.Array(value*))
  }
}
