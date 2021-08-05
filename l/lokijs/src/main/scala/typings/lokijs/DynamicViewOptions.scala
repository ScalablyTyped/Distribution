package typings.lokijs

import typings.lokijs.lokijsStrings.active
import typings.lokijs.lokijsStrings.passive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicViewOptions extends StObject {
  
  var minRebuildInterval: Double
  
  var persistent: Boolean
  
  var sortPriority: active | passive
}
object DynamicViewOptions {
  
  inline def apply(minRebuildInterval: Double, persistent: Boolean, sortPriority: active | passive): DynamicViewOptions = {
    val __obj = js.Dynamic.literal(minRebuildInterval = minRebuildInterval.asInstanceOf[js.Any], persistent = persistent.asInstanceOf[js.Any], sortPriority = sortPriority.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicViewOptions]
  }
  
  extension [Self <: DynamicViewOptions](x: Self) {
    
    inline def setMinRebuildInterval(value: Double): Self = StObject.set(x, "minRebuildInterval", value.asInstanceOf[js.Any])
    
    inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    inline def setSortPriority(value: active | passive): Self = StObject.set(x, "sortPriority", value.asInstanceOf[js.Any])
  }
}
