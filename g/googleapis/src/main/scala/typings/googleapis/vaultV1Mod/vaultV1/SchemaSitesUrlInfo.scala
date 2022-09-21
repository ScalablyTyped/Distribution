package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSitesUrlInfo extends StObject {
  
  /**
    * A list of published site URLs.
    */
  var urls: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaSitesUrlInfo {
  
  inline def apply(): SchemaSitesUrlInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSitesUrlInfo]
  }
  
  extension [Self <: SchemaSitesUrlInfo](x: Self) {
    
    inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsNull: Self = StObject.set(x, "urls", null)
    
    inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    
    inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value*))
  }
}
