package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiasettingsRequestGmbAccessResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#liasettingsRequestGmbAccessResponse". */
  var kind: js.UndefOr[String] = js.undefined
}
object LiasettingsRequestGmbAccessResponse {
  
  inline def apply(): LiasettingsRequestGmbAccessResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiasettingsRequestGmbAccessResponse]
  }
  
  extension [Self <: LiasettingsRequestGmbAccessResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
