package typings.localforage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalForageOptions
  extends StObject
     with LocalForageDbInstanceOptions {
  
  var description: js.UndefOr[String] = js.undefined
  
  var driver: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
}
object LocalForageOptions {
  
  inline def apply(): LocalForageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalForageOptions]
  }
  
  extension [Self <: LocalForageOptions](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDriver(value: String | js.Array[String]): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
    
    inline def setDriverUndefined: Self = StObject.set(x, "driver", js.undefined)
    
    inline def setDriverVarargs(value: String*): Self = StObject.set(x, "driver", js.Array(value :_*))
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
