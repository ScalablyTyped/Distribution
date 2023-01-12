package typings.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait STUNServer extends StObject {
  
  var urls: String
}
object STUNServer {
  
  inline def apply(urls: String): STUNServer = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[STUNServer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: STUNServer] (val x: Self) extends AnyVal {
    
    inline def setUrls(value: String): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
  }
}
