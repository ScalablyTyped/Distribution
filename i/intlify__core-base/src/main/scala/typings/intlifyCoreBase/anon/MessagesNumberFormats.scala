package typings.intlifyCoreBase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagesNumberFormats extends StObject {
  
  var datetimeFormats: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any
  ] = js.undefined
  
  var messages: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: infer M */ js.Any
  ] = js.undefined
  
  var numberFormats: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: infer N */ js.Any
  ] = js.undefined
}
object MessagesNumberFormats {
  
  inline def apply(): MessagesNumberFormats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagesNumberFormats]
  }
  
  extension [Self <: MessagesNumberFormats](x: Self) {
    
    inline def setDatetimeFormats(value: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any): Self = StObject.set(x, "datetimeFormats", value.asInstanceOf[js.Any])
    
    inline def setDatetimeFormatsUndefined: Self = StObject.set(x, "datetimeFormats", js.undefined)
    
    inline def setMessages(value: /* import warning: importer.ImportType#apply Failed type conversion: infer M */ js.Any): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setNumberFormats(value: /* import warning: importer.ImportType#apply Failed type conversion: infer N */ js.Any): Self = StObject.set(x, "numberFormats", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatsUndefined: Self = StObject.set(x, "numberFormats", js.undefined)
  }
}
