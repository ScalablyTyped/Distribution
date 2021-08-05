package typings.lokijs

import typings.lokijs.anon.Created
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LokiObj extends StObject {
  
  @JSName("$loki")
  var $loki: Double
  
  var meta: Created
}
object LokiObj {
  
  inline def apply($loki: Double, meta: Created): LokiObj = {
    val __obj = js.Dynamic.literal($loki = $loki.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[LokiObj]
  }
  
  extension [Self <: LokiObj](x: Self) {
    
    inline def set$loki(value: Double): Self = StObject.set(x, "$loki", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: Created): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
