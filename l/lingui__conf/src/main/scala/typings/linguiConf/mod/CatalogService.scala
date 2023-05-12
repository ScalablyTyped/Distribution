package typings.linguiConf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatalogService extends StObject {
  
  var apiKey: String
  
  var name: String
}
object CatalogService {
  
  inline def apply(apiKey: String, name: String): CatalogService = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatalogService]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CatalogService] (val x: Self) extends AnyVal {
    
    inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
