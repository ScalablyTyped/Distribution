package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVoiceOptions extends StObject {
  
  /**
    * Datatypes to search
    */
  var coveredData: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaVoiceOptions {
  
  inline def apply(): SchemaVoiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVoiceOptions]
  }
  
  extension [Self <: SchemaVoiceOptions](x: Self) {
    
    inline def setCoveredData(value: js.Array[String]): Self = StObject.set(x, "coveredData", value.asInstanceOf[js.Any])
    
    inline def setCoveredDataNull: Self = StObject.set(x, "coveredData", null)
    
    inline def setCoveredDataUndefined: Self = StObject.set(x, "coveredData", js.undefined)
    
    inline def setCoveredDataVarargs(value: String*): Self = StObject.set(x, "coveredData", js.Array(value*))
  }
}
