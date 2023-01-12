package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogConfigCounterOptionsCustomField extends StObject {
  
  /** This is deprecated and has no effect. Do not use. */
  var name: js.UndefOr[String] = js.undefined
  
  /** This is deprecated and has no effect. Do not use. */
  var value: js.UndefOr[String] = js.undefined
}
object LogConfigCounterOptionsCustomField {
  
  inline def apply(): LogConfigCounterOptionsCustomField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogConfigCounterOptionsCustomField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogConfigCounterOptionsCustomField] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
