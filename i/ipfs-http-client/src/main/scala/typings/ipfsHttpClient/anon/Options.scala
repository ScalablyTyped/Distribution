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
  
  @scala.inline
  def apply(options: Record[js.Any, js.Any], sources: js.Any): Options = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: Record[js.Any, js.Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSources(value: js.Any): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
  }
}
