package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiasettingsRequestGmbAccessResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "content#liasettingsRequestGmbAccessResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaLiasettingsRequestGmbAccessResponse {
  
  inline def apply(): SchemaLiasettingsRequestGmbAccessResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiasettingsRequestGmbAccessResponse]
  }
  
  extension [Self <: SchemaLiasettingsRequestGmbAccessResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
