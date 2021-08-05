package typings.localforage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalForageDbInstanceOptions extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var storeName: js.UndefOr[String] = js.undefined
}
object LocalForageDbInstanceOptions {
  
  inline def apply(): LocalForageDbInstanceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalForageDbInstanceOptions]
  }
  
  extension [Self <: LocalForageDbInstanceOptions](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStoreName(value: String): Self = StObject.set(x, "storeName", value.asInstanceOf[js.Any])
    
    inline def setStoreNameUndefined: Self = StObject.set(x, "storeName", js.undefined)
  }
}
