package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppContext extends StObject {
  
  /** The app types this restriction applies to. */
  var appTypes: js.UndefOr[js.Array[String]] = js.native
}
object AppContext {
  
  @scala.inline
  def apply(): AppContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppContext]
  }
  
  @scala.inline
  implicit class AppContextMutableBuilder[Self <: AppContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppTypes(value: js.Array[String]): Self = StObject.set(x, "appTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppTypesUndefined: Self = StObject.set(x, "appTypes", js.undefined)
    
    @scala.inline
    def setAppTypesVarargs(value: String*): Self = StObject.set(x, "appTypes", js.Array(value :_*))
  }
}
