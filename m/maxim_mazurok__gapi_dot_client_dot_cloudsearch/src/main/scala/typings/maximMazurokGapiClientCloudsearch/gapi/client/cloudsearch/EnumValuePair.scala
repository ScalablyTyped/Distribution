package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuePair extends StObject {
  
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
  implicit class EnumValuePairMutableBuilder[Self <: EnumValuePair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntegerValue(value: Double): Self = StObject.set(x, "integerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegerValueUndefined: Self = StObject.set(x, "integerValue", js.undefined)
    
    @scala.inline
    def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
