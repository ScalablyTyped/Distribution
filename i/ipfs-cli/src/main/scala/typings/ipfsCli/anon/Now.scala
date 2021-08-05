package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Now extends StObject {
  
  var id: js.Any
  
  var now: js.Any
  
  var overwrite: Boolean
  
  var was: js.Any
}
object Now {
  
  inline def apply(id: js.Any, now: js.Any, overwrite: Boolean, was: js.Any): Now = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], now = now.asInstanceOf[js.Any], overwrite = overwrite.asInstanceOf[js.Any], was = was.asInstanceOf[js.Any])
    __obj.asInstanceOf[Now]
  }
  
  extension [Self <: Now](x: Self) {
    
    inline def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNow(value: js.Any): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
    
    inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    inline def setWas(value: js.Any): Self = StObject.set(x, "was", value.asInstanceOf[js.Any])
  }
}
