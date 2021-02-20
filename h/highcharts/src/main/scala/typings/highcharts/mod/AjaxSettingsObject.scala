package typings.highcharts.mod

import typings.highcharts.highchartsStrings.json
import typings.highcharts.highchartsStrings.octet
import typings.highcharts.highchartsStrings.text
import typings.highcharts.highchartsStrings.xml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AjaxSettingsObject extends StObject {
  
  /**
    * The payload to send.
    */
  var data: String | Dictionary[_] = js.native
  
  /**
    * The data type expected.
    */
  var dataType: json | octet | text | xml = js.native
  
  /**
    * Function to call on error.
    */
  var error: js.Function = js.native
  
  /**
    * The headers; keyed on header name.
    */
  var headers: Dictionary[String] = js.native
  
  /**
    * Function to call on success.
    */
  var success: js.Function = js.native
  
  /**
    * The HTTP method to use. For example GET or POST.
    */
  var `type`: String = js.native
  
  /**
    * The URL to call.
    */
  var url: String = js.native
}
object AjaxSettingsObject {
  
  @scala.inline
  def apply(
    data: String | Dictionary[_],
    dataType: json | octet | text | xml,
    error: js.Function,
    headers: Dictionary[String],
    success: js.Function,
    `type`: String,
    url: String
  ): AjaxSettingsObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxSettingsObject]
  }
  
  @scala.inline
  implicit class AjaxSettingsObjectMutableBuilder[Self <: AjaxSettingsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String | Dictionary[_]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataType(value: json | octet | text | xml): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: js.Function): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: Dictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: js.Function): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
