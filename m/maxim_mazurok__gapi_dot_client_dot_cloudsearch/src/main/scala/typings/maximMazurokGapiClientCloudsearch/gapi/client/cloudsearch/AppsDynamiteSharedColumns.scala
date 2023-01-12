package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedColumns extends StObject {
  
  /** Each card supports up to 2 columns. */
  var columnItems: js.UndefOr[js.Array[AppsDynamiteSharedColumnsColumn]] = js.undefined
  
  /** Controls how the column resizes based on screen width. */
  var wrapStyle: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSharedColumns {
  
  inline def apply(): AppsDynamiteSharedColumns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedColumns]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteSharedColumns] (val x: Self) extends AnyVal {
    
    inline def setColumnItems(value: js.Array[AppsDynamiteSharedColumnsColumn]): Self = StObject.set(x, "columnItems", value.asInstanceOf[js.Any])
    
    inline def setColumnItemsUndefined: Self = StObject.set(x, "columnItems", js.undefined)
    
    inline def setColumnItemsVarargs(value: AppsDynamiteSharedColumnsColumn*): Self = StObject.set(x, "columnItems", js.Array(value*))
    
    inline def setWrapStyle(value: String): Self = StObject.set(x, "wrapStyle", value.asInstanceOf[js.Any])
    
    inline def setWrapStyleUndefined: Self = StObject.set(x, "wrapStyle", js.undefined)
  }
}
