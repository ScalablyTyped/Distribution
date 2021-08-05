package typings.ionicReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ios extends StObject {
  
  var ios: String
  
  var md: String
}
object Ios {
  
  inline def apply(ios: String, md: String): Ios = {
    val __obj = js.Dynamic.literal(ios = ios.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ios]
  }
  
  extension [Self <: Ios](x: Self) {
    
    inline def setIos(value: String): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    inline def setMd(value: String): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
  }
}
