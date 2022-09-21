package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Adloox extends StObject {
  
  /** Adloox's brand safety settings. */
  var excludedAdlooxCategories: js.UndefOr[js.Array[String]] = js.undefined
}
object Adloox {
  
  inline def apply(): Adloox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Adloox]
  }
  
  extension [Self <: Adloox](x: Self) {
    
    inline def setExcludedAdlooxCategories(value: js.Array[String]): Self = StObject.set(x, "excludedAdlooxCategories", value.asInstanceOf[js.Any])
    
    inline def setExcludedAdlooxCategoriesUndefined: Self = StObject.set(x, "excludedAdlooxCategories", js.undefined)
    
    inline def setExcludedAdlooxCategoriesVarargs(value: String*): Self = StObject.set(x, "excludedAdlooxCategories", js.Array(value*))
  }
}
