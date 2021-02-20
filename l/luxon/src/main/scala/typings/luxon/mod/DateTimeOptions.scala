package typings.luxon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateTimeOptions extends LocaleOptions {
  
  var setZone: js.UndefOr[Boolean] = js.native
  
  var zone: js.UndefOr[String | Zone] = js.native
}
object DateTimeOptions {
  
  @scala.inline
  def apply(): DateTimeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeOptions]
  }
  
  @scala.inline
  implicit class DateTimeOptionsMutableBuilder[Self <: DateTimeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetZone(value: Boolean): Self = StObject.set(x, "setZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetZoneUndefined: Self = StObject.set(x, "setZone", js.undefined)
    
    @scala.inline
    def setZone(value: String | Zone): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
