package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDatafeedsFetchNowResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "`content#datafeedsFetchNowResponse`".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaDatafeedsFetchNowResponse {
  
  inline def apply(): SchemaDatafeedsFetchNowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatafeedsFetchNowResponse]
  }
  
  extension [Self <: SchemaDatafeedsFetchNowResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
