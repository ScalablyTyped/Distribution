package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var options: AllowUnknown
  
  var query: js.Any
}
object Options {
  
  @scala.inline
  def apply(options: AllowUnknown, query: js.Any): Options = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: AllowUnknown): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: js.Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
