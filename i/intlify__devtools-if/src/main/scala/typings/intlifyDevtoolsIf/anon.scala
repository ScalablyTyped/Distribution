package typings.intlifyDevtoolsIf

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined {  timestamp :number,   i18n :unknown,   version :string} & @intlify/devtools-if.@intlify/devtools-if.AdditionalPayloads */
  trait timestampnumberi18nunknow extends StObject {
    
    var i18n: Any
    
    var meta: js.UndefOr[Record[String, Any]] = js.undefined
    
    var timestamp: Double
    
    var version: String
  }
  object timestampnumberi18nunknow {
    
    inline def apply(i18n: Any, timestamp: Double, version: String): timestampnumberi18nunknow = {
      val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[timestampnumberi18nunknow]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: timestampnumberi18nunknow] (val x: Self) extends AnyVal {
      
      inline def setI18n(value: Any): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Record[String, Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  timestamp :number,   message :string | number,   key :string,   locale :string,   format :string | undefined} & @intlify/devtools-if.@intlify/devtools-if.AdditionalPayloads */
  trait timestampnumbermessagestr extends StObject {
    
    var format: js.UndefOr[String] = js.undefined
    
    var key: String
    
    var locale: String
    
    var message: String | Double
    
    var meta: js.UndefOr[Record[String, Any]] = js.undefined
    
    var timestamp: Double
  }
  object timestampnumbermessagestr {
    
    inline def apply(key: String, locale: String, message: String | Double, timestamp: Double): timestampnumbermessagestr = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[timestampnumbermessagestr]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: timestampnumbermessagestr] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String | Double): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Record[String, Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
}
