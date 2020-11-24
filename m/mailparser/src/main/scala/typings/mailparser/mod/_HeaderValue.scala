package typings.mailparser.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _HeaderValue extends js.Object
object _HeaderValue {
  
  @scala.inline
  def AddressObject(html: String, text: String, value: js.Array[EmailAddress]): _HeaderValue = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[_HeaderValue]
  }
  
  @scala.inline
  def StructuredHeader(params: StringDictionary[String], value: String): _HeaderValue = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[_HeaderValue]
  }
}
