package typings.jstorage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JStorageOptions extends StObject {
  
  var TTL: Double
}
object JStorageOptions {
  
  inline def apply(TTL: Double): JStorageOptions = {
    val __obj = js.Dynamic.literal(TTL = TTL.asInstanceOf[js.Any])
    __obj.asInstanceOf[JStorageOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JStorageOptions] (val x: Self) extends AnyVal {
    
    inline def setTTL(value: Double): Self = StObject.set(x, "TTL", value.asInstanceOf[js.Any])
  }
}
