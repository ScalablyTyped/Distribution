package typings.htmlValidator.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicOptions extends StObject {
  
  var headers: js.UndefOr[Record[String, String]] = js.native
  
  var ignore: js.UndefOr[String | js.Array[String]] = js.native
  
  var isFragment: js.UndefOr[Boolean] = js.native
  
  var isLocal: js.UndefOr[Boolean] = js.native
  
  var validator: js.UndefOr[js.Object] = js.native
}
object BasicOptions {
  
  @scala.inline
  def apply(): BasicOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicOptions]
  }
  
  @scala.inline
  implicit class BasicOptionsMutableBuilder[Self <: BasicOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setIgnore(value: String | js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
    
    @scala.inline
    def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value :_*))
    
    @scala.inline
    def setIsFragment(value: Boolean): Self = StObject.set(x, "isFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFragmentUndefined: Self = StObject.set(x, "isFragment", js.undefined)
    
    @scala.inline
    def setIsLocal(value: Boolean): Self = StObject.set(x, "isLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLocalUndefined: Self = StObject.set(x, "isLocal", js.undefined)
    
    @scala.inline
    def setValidator(value: js.Object): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
  }
}
