package typings.intlifyCoreBase.mod

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreDateTimeContext[DateTimeFormats] extends StObject {
  
  var datetimeFormats: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof DateTimeFormats ]: DateTimeFormats[K]}
    */ typings.intlifyCoreBase.intlifyCoreBaseStrings.CoreDateTimeContext & TopLevel[DateTimeFormats]
}
object CoreDateTimeContext {
  
  inline def apply[DateTimeFormats](
    datetimeFormats: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof DateTimeFormats ]: DateTimeFormats[K]}
    */ typings.intlifyCoreBase.intlifyCoreBaseStrings.CoreDateTimeContext & TopLevel[DateTimeFormats]
  ): CoreDateTimeContext[DateTimeFormats] = {
    val __obj = js.Dynamic.literal(datetimeFormats = datetimeFormats.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreDateTimeContext[DateTimeFormats]]
  }
  
  extension [Self <: CoreDateTimeContext[?], DateTimeFormats](x: Self & CoreDateTimeContext[DateTimeFormats]) {
    
    inline def setDatetimeFormats(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof DateTimeFormats ]: DateTimeFormats[K]}
      */ typings.intlifyCoreBase.intlifyCoreBaseStrings.CoreDateTimeContext & TopLevel[DateTimeFormats]
    ): Self = StObject.set(x, "datetimeFormats", value.asInstanceOf[js.Any])
  }
}
