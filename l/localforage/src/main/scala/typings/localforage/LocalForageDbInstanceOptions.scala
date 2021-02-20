package typings.localforage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalForageDbInstanceOptions extends StObject {
  
  var name: js.UndefOr[String] = js.native
  
  var storeName: js.UndefOr[String] = js.native
}
object LocalForageDbInstanceOptions {
  
  @scala.inline
  def apply(): LocalForageDbInstanceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalForageDbInstanceOptions]
  }
  
  @scala.inline
  implicit class LocalForageDbInstanceOptionsMutableBuilder[Self <: LocalForageDbInstanceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStoreName(value: String): Self = StObject.set(x, "storeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreNameUndefined: Self = StObject.set(x, "storeName", js.undefined)
  }
}
