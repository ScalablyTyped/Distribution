package typings.jsrsasign.jsrsasign.KJUR.asn1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateParam extends StObject {
  
  var date: js.Date
  
  var withMillis: js.UndefOr[Boolean] = js.undefined
}
object DateParam {
  
  inline def apply(date: js.Date): DateParam = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateParam] (val x: Self) extends AnyVal {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setWithMillis(value: Boolean): Self = StObject.set(x, "withMillis", value.asInstanceOf[js.Any])
    
    inline def setWithMillisUndefined: Self = StObject.set(x, "withMillis", js.undefined)
  }
}
