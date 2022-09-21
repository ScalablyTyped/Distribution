package typings.jsrsasign.anon

import org.scalablytyped.runtime.StringDictionary
import typings.jsrsasign.jsrsasign.ExtParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictkey
  extends StObject
     with /* key */ StringDictionary[Any]
     with ExtParam {
  
  var code: js.UndefOr[Double] = js.undefined
  
  var critical: js.UndefOr[Boolean] = js.undefined
  
  var extn: String
  
  var extname: String
}
object Dictkey {
  
  inline def apply(extn: String, extname: String): Dictkey = {
    val __obj = js.Dynamic.literal(extn = extn.asInstanceOf[js.Any], extname = extname.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
  
  extension [Self <: Dictkey](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
    
    inline def setExtn(value: String): Self = StObject.set(x, "extn", value.asInstanceOf[js.Any])
    
    inline def setExtname(value: String): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
  }
}
