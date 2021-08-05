package typings.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Browser extends StObject {
  
  var chrome: Boolean
  
  var edge: Boolean
  
  var facebook: Boolean
  
  var firefox: Boolean
  
  var ie: Boolean
  
  var msie: Boolean
  
  var safari: Boolean
  
  var version: Version
}
object Browser {
  
  inline def apply(
    chrome: Boolean,
    edge: Boolean,
    facebook: Boolean,
    firefox: Boolean,
    ie: Boolean,
    msie: Boolean,
    safari: Boolean,
    version: Version
  ): Browser = {
    val __obj = js.Dynamic.literal(chrome = chrome.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], facebook = facebook.asInstanceOf[js.Any], firefox = firefox.asInstanceOf[js.Any], ie = ie.asInstanceOf[js.Any], msie = msie.asInstanceOf[js.Any], safari = safari.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Browser]
  }
  
  extension [Self <: Browser](x: Self) {
    
    inline def setChrome(value: Boolean): Self = StObject.set(x, "chrome", value.asInstanceOf[js.Any])
    
    inline def setEdge(value: Boolean): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
    
    inline def setFacebook(value: Boolean): Self = StObject.set(x, "facebook", value.asInstanceOf[js.Any])
    
    inline def setFirefox(value: Boolean): Self = StObject.set(x, "firefox", value.asInstanceOf[js.Any])
    
    inline def setIe(value: Boolean): Self = StObject.set(x, "ie", value.asInstanceOf[js.Any])
    
    inline def setMsie(value: Boolean): Self = StObject.set(x, "msie", value.asInstanceOf[js.Any])
    
    inline def setSafari(value: Boolean): Self = StObject.set(x, "safari", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
