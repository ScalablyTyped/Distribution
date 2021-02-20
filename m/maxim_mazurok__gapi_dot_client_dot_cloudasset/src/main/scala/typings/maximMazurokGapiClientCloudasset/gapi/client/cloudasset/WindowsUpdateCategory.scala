package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowsUpdateCategory extends StObject {
  
  /** The identifier of the windows update category. */
  var id: js.UndefOr[String] = js.native
  
  /** The name of the windows update category. */
  var name: js.UndefOr[String] = js.native
}
object WindowsUpdateCategory {
  
  @scala.inline
  def apply(): WindowsUpdateCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsUpdateCategory]
  }
  
  @scala.inline
  implicit class WindowsUpdateCategoryMutableBuilder[Self <: WindowsUpdateCategory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
