package typings.maximMazurokGapiClientAdmin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Code extends StObject {
  
  /** Machine readable code or warning type. The warning code value is 200. */
  var code: js.UndefOr[String] = js.native
  
  /** Key-value pairs to give detailed information on the warning. */
  var data: js.UndefOr[js.Array[Key]] = js.native
  
  /**
    * The human readable messages for a warning are: - Data is not available warning - Sorry, data for date yyyy-mm-dd for application "application name" is not available. - Partial
    * data is available warning - Data for date yyyy-mm-dd for application "application name" is not available right now, please try again after a few hours.
    */
  var message: js.UndefOr[String] = js.native
}
object Code {
  
  @scala.inline
  def apply(): Code = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Code]
  }
  
  @scala.inline
  implicit class CodeMutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setData(value: js.Array[Key]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: Key*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
