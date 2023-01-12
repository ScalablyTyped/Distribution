package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsUpdateCategory extends StObject {
  
  /** The identifier of the windows update category. */
  var id: js.UndefOr[String] = js.undefined
  
  /** The name of the windows update category. */
  var name: js.UndefOr[String] = js.undefined
}
object WindowsUpdateCategory {
  
  inline def apply(): WindowsUpdateCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsUpdateCategory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowsUpdateCategory] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
