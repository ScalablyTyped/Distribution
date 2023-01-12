package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntRange extends StObject {
  
  /** Max value of the int parameter. */
  var max: js.UndefOr[String] = js.undefined
  
  /** Min value of the int parameter. */
  var min: js.UndefOr[String] = js.undefined
}
object IntRange {
  
  inline def apply(): IntRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntRange] (val x: Self) extends AnyVal {
    
    inline def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
