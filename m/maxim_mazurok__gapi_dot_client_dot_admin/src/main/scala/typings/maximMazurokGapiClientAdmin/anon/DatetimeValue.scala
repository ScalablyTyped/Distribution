package typings.maximMazurokGapiClientAdmin.anon

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatetimeValue extends StObject {
  
  /** Output only. Boolean value of the parameter. */
  var boolValue: js.UndefOr[Boolean] = js.native
  
  /** The RFC 3339 formatted value of the parameter, for example 2010-10-28T10:26:35.000Z. */
  var datetimeValue: js.UndefOr[String] = js.native
  
  /** Output only. Integer value of the parameter. */
  var intValue: js.UndefOr[String] = js.native
  
  /** Output only. Nested message value of the parameter. */
  var msgValue: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientAdmin.maximMazurokGapiClientAdminStrings.DatetimeValue with TopLevel[js.Any]
    ]
  ] = js.native
  
  /** Name of the parameter. */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. String value of the parameter. */
  var stringValue: js.UndefOr[String] = js.native
}
object DatetimeValue {
  
  @scala.inline
  def apply(): DatetimeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatetimeValue]
  }
  
  @scala.inline
  implicit class DatetimeValueMutableBuilder[Self <: DatetimeValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
    
    @scala.inline
    def setDatetimeValue(value: String): Self = StObject.set(x, "datetimeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatetimeValueUndefined: Self = StObject.set(x, "datetimeValue", js.undefined)
    
    @scala.inline
    def setIntValue(value: String): Self = StObject.set(x, "intValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntValueUndefined: Self = StObject.set(x, "intValue", js.undefined)
    
    @scala.inline
    def setMsgValue(
      value: js.Array[
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientAdmin.maximMazurokGapiClientAdminStrings.DatetimeValue with TopLevel[js.Any]
        ]
    ): Self = StObject.set(x, "msgValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsgValueUndefined: Self = StObject.set(x, "msgValue", js.undefined)
    
    @scala.inline
    def setMsgValueVarargs(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientAdmin.maximMazurokGapiClientAdminStrings.DatetimeValue with TopLevel[js.Any])*
    ): Self = StObject.set(x, "msgValue", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
