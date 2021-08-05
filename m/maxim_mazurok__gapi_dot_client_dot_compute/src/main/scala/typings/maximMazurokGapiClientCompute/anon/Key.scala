package typings.maximMazurokGapiClientCompute.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key extends StObject {
  
  /**
    * [Output Only] A key that provides more detail on the warning being returned. For example, for warnings where there are no results in a list request for a particular zone,
    * this key might be scope and the key value might be the zone name. Other examples might be a key indicating a deprecated resource and a suggested replacement, or a warning
    * about invalid network settings (for example, if an instance attempts to perform IP forwarding but is not enabled for IP forwarding).
    */
  var key: js.UndefOr[String] = js.undefined
  
  /** [Output Only] A warning data value corresponding to the key. */
  var value: js.UndefOr[String] = js.undefined
}
object Key {
  
  inline def apply(): Key = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Key]
  }
  
  extension [Self <: Key](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
