package typings.intlifyCoreBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreDateTimeContext[DateTimeFormats] extends StObject {
  
  var datetimeFormats: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof DateTimeFormats ]: DateTimeFormats[K]} */ js.Any
}
object CoreDateTimeContext {
  
  inline def apply[DateTimeFormats](
    datetimeFormats: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof DateTimeFormats ]: DateTimeFormats[K]} */ js.Any
  ): CoreDateTimeContext[DateTimeFormats] = {
    val __obj = js.Dynamic.literal(datetimeFormats = datetimeFormats.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreDateTimeContext[DateTimeFormats]]
  }
  
  extension [Self <: CoreDateTimeContext[?], DateTimeFormats](x: Self & CoreDateTimeContext[DateTimeFormats]) {
    
    inline def setDatetimeFormats(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof DateTimeFormats ]: DateTimeFormats[K]} */ js.Any
    ): Self = StObject.set(x, "datetimeFormats", value.asInstanceOf[js.Any])
  }
}
