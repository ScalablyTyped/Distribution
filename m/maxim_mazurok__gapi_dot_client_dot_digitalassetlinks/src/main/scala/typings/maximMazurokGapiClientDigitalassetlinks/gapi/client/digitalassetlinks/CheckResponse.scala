package typings.maximMazurokGapiClientDigitalassetlinks.gapi.client.digitalassetlinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckResponse extends js.Object {
  
  /**
    * Human-readable message containing information intended to help end users understand, reproduce and debug the result. The message will be in English and we are currently not planning
    * to offer any translations. Please note that no guarantees are made about the contents or format of this string. Any aspect of it may be subject to change without notice. You should
    * not attempt to programmatically parse this data. For programmatic access, use the error_code field below.
    */
  var debugString: js.UndefOr[String] = js.native
  
  /** Error codes that describe the result of the Check operation. */
  var errorCode: js.UndefOr[js.Array[String]] = js.native
  
  /** Set to true if the assets specified in the request are linked by the relation specified in the request. */
  var linked: js.UndefOr[Boolean] = js.native
  
  /** From serving time, how much longer the response should be considered valid barring further updates. REQUIRED */
  var maxAge: js.UndefOr[String] = js.native
}
object CheckResponse {
  
  @scala.inline
  def apply(): CheckResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckResponse]
  }
  
  @scala.inline
  implicit class CheckResponseOps[Self <: CheckResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDebugString(value: String): Self = this.set("debugString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugString: Self = this.set("debugString", js.undefined)
    
    @scala.inline
    def setErrorCodeVarargs(value: String*): Self = this.set("errorCode", js.Array(value :_*))
    
    @scala.inline
    def setErrorCode(value: js.Array[String]): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("errorCode", js.undefined)
    
    @scala.inline
    def setLinked(value: Boolean): Self = this.set("linked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinked: Self = this.set("linked", js.undefined)
    
    @scala.inline
    def setMaxAge(value: String): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
  }
}
