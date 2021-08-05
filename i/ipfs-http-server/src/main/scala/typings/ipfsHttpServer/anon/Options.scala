package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var options: AllowUnknown
  
  var query: js.Any
}
object Options {
  
  inline def apply(options: AllowUnknown, query: js.Any): Options = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setOptions(value: AllowUnknown): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: js.Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
