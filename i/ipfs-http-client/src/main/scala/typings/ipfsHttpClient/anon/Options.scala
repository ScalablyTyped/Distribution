package typings.ipfsHttpClient.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var options: Record[js.Any, js.Any]
  
  var sources: js.Any
}
object Options {
  
  inline def apply(options: Record[js.Any, js.Any], sources: js.Any): Options = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setOptions(value: Record[js.Any, js.Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSources(value: js.Any): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
  }
}
