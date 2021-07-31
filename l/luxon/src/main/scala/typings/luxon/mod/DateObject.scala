package typings.luxon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateObject
  extends StObject
     with DateObjectUnits
     with LocaleOptions {
  
  var zone: js.UndefOr[String | Zone] = js.undefined
}
object DateObject {
  
  @scala.inline
  def apply(): DateObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateObject]
  }
  
  @scala.inline
  implicit class DateObjectMutableBuilder[Self <: DateObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setZone(value: String | Zone): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
