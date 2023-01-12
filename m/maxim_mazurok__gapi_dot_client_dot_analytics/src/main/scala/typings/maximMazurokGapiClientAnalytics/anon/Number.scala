package typings.maximMazurokGapiClientAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Number extends StObject {
  
  /** Step name. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Step number. */
  var number: js.UndefOr[Double] = js.undefined
  
  /** URL for this step. */
  var url: js.UndefOr[String] = js.undefined
}
object Number {
  
  inline def apply(): Number = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Number]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Number] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
