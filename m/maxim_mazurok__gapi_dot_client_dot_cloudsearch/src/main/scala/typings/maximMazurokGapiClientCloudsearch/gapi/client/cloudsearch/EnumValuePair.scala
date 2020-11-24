package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuePair extends js.Object {
  
  /** The integer value of the EnumValuePair which must be non-negative. Optional. */
  var integerValue: js.UndefOr[Double] = js.native
  
  /** The string value of the EnumValuePair. The maximum length is 32 characters. */
  var stringValue: js.UndefOr[String] = js.native
}
object EnumValuePair {
  
  @scala.inline
  def apply(): EnumValuePair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnumValuePair]
  }
  
  @scala.inline
  implicit class EnumValuePairOps[Self <: EnumValuePair] (val x: Self) extends AnyVal {
    
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
    def setIntegerValue(value: Double): Self = this.set("integerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegerValue: Self = this.set("integerValue", js.undefined)
    
    @scala.inline
    def setStringValue(value: String): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringValue: Self = this.set("stringValue", js.undefined)
  }
}
