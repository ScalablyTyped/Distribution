package typings.jsrsasign.jsrsasign.KJUR.asn1

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateParam extends StObject {
  
  var date: Date
  
  var withMillis: js.UndefOr[Boolean] = js.undefined
}
object DateParam {
  
  @scala.inline
  def apply(date: Date): DateParam = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateParam]
  }
  
  @scala.inline
  implicit class DateParamMutableBuilder[Self <: DateParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithMillis(value: Boolean): Self = StObject.set(x, "withMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithMillisUndefined: Self = StObject.set(x, "withMillis", js.undefined)
  }
}
