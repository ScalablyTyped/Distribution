package typings.lokijs.anon

import typings.lokijs.lokijsStrings.active
import typings.lokijs.lokijsStrings.passive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<lokijs.DynamicViewOptions> */
trait PartialDynamicViewOptions extends StObject {
  
  var minRebuildInterval: js.UndefOr[Double] = js.undefined
  
  var persistent: js.UndefOr[Boolean] = js.undefined
  
  var sortPriority: js.UndefOr[active | passive] = js.undefined
}
object PartialDynamicViewOptions {
  
  inline def apply(): PartialDynamicViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDynamicViewOptions]
  }
  
  extension [Self <: PartialDynamicViewOptions](x: Self) {
    
    inline def setMinRebuildInterval(value: Double): Self = StObject.set(x, "minRebuildInterval", value.asInstanceOf[js.Any])
    
    inline def setMinRebuildIntervalUndefined: Self = StObject.set(x, "minRebuildInterval", js.undefined)
    
    inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    inline def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    
    inline def setSortPriority(value: active | passive): Self = StObject.set(x, "sortPriority", value.asInstanceOf[js.Any])
    
    inline def setSortPriorityUndefined: Self = StObject.set(x, "sortPriority", js.undefined)
  }
}
