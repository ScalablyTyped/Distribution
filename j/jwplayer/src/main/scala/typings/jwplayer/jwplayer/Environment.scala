package typings.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Environment extends StObject {
  
  var Browser: typings.jwplayer.jwplayer.Browser
  
  var Features: typings.jwplayer.jwplayer.Features
  
  var OS: typings.jwplayer.jwplayer.OS
}
object Environment {
  
  inline def apply(Browser: Browser, Features: Features, OS: OS): Environment = {
    val __obj = js.Dynamic.literal(Browser = Browser.asInstanceOf[js.Any], Features = Features.asInstanceOf[js.Any], OS = OS.asInstanceOf[js.Any])
    __obj.asInstanceOf[Environment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Environment] (val x: Self) extends AnyVal {
    
    inline def setBrowser(value: Browser): Self = StObject.set(x, "Browser", value.asInstanceOf[js.Any])
    
    inline def setFeatures(value: Features): Self = StObject.set(x, "Features", value.asInstanceOf[js.Any])
    
    inline def setOS(value: OS): Self = StObject.set(x, "OS", value.asInstanceOf[js.Any])
  }
}
