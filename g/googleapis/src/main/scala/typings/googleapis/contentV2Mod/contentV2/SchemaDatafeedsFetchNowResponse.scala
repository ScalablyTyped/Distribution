package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDatafeedsFetchNowResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#datafeedsFetchNowResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaDatafeedsFetchNowResponse {
  
  inline def apply(): SchemaDatafeedsFetchNowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatafeedsFetchNowResponse]
  }
  
  extension [Self <: SchemaDatafeedsFetchNowResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
