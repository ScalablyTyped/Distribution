package typings.luxon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateTimeJSOptions extends LocaleOptions {
  
  var zone: js.UndefOr[String | Zone] = js.native
}
object DateTimeJSOptions {
  
  @scala.inline
  def apply(): DateTimeJSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeJSOptions]
  }
  
  @scala.inline
  implicit class DateTimeJSOptionsMutableBuilder[Self <: DateTimeJSOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setZone(value: String | Zone): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
