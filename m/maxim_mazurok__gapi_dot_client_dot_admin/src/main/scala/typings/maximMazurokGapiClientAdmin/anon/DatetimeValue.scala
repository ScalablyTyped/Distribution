package typings.maximMazurokGapiClientAdmin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatetimeValue extends StObject {
  
  /** Output only. Boolean value of the parameter. */
  var boolValue: js.UndefOr[Boolean] = js.undefined
  
  /** The RFC 3339 formatted value of the parameter, for example 2010-10-28T10:26:35.000Z. */
  var datetimeValue: js.UndefOr[String] = js.undefined
  
  /** Output only. Integer value of the parameter. */
  var intValue: js.UndefOr[String] = js.undefined
  
  /** Output only. Nested message value of the parameter. */
  var msgValue: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ]
  ] = js.undefined
  
  /** The name of the parameter. For the User Usage Report parameter names, see the User Usage parameters reference. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. String value of the parameter. */
  var stringValue: js.UndefOr[String] = js.undefined
}
object DatetimeValue {
  
  inline def apply(): DatetimeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatetimeValue]
  }
  
  extension [Self <: DatetimeValue](x: Self) {
    
    inline def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
    
    inline def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
    
    inline def setDatetimeValue(value: String): Self = StObject.set(x, "datetimeValue", value.asInstanceOf[js.Any])
    
    inline def setDatetimeValueUndefined: Self = StObject.set(x, "datetimeValue", js.undefined)
    
    inline def setIntValue(value: String): Self = StObject.set(x, "intValue", value.asInstanceOf[js.Any])
    
    inline def setIntValueUndefined: Self = StObject.set(x, "intValue", js.undefined)
    
    inline def setMsgValue(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
        ]
    ): Self = StObject.set(x, "msgValue", value.asInstanceOf[js.Any])
    
    inline def setMsgValueUndefined: Self = StObject.set(x, "msgValue", js.undefined)
    
    inline def setMsgValueVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any)*
    ): Self = StObject.set(x, "msgValue", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
