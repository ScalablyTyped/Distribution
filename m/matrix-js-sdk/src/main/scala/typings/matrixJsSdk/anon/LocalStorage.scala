package typings.matrixJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalStorage extends StObject {
  
  var localStorage: js.UndefOr[Any] = js.undefined
}
object LocalStorage {
  
  inline def apply(): LocalStorage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalStorage]
  }
  
  extension [Self <: LocalStorage](x: Self) {
    
    inline def setLocalStorage(value: Any): Self = StObject.set(x, "localStorage", value.asInstanceOf[js.Any])
    
    inline def setLocalStorageUndefined: Self = StObject.set(x, "localStorage", js.undefined)
  }
}
