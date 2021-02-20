package typings.luxon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToRelativeCalendarOptions extends StObject {
  
  /** The DateTime to use as the basis to which this time is compared. Defaults to now. */
  var base: js.UndefOr[DateTime] = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  /** The Intl system may choose not to honor this. */
  var numberingSystem: js.UndefOr[NumberingSystem] = js.native
  
  /** If omitted, the method will pick the unit. */
  var unit: js.UndefOr[ToRelativeUnit] = js.native
}
object ToRelativeCalendarOptions {
  
  @scala.inline
  def apply(): ToRelativeCalendarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToRelativeCalendarOptions]
  }
  
  @scala.inline
  implicit class ToRelativeCalendarOptionsMutableBuilder[Self <: ToRelativeCalendarOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase(value: DateTime): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setNumberingSystem(value: NumberingSystem): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingSystemUndefined: Self = StObject.set(x, "numberingSystem", js.undefined)
    
    @scala.inline
    def setUnit(value: ToRelativeUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
