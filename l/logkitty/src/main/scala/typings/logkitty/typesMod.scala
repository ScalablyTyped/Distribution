package typings.logkitty

import typings.dayjs.mod.Dayjs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait Entry extends StObject {
    
    var appId: js.UndefOr[String] = js.undefined
    
    var date: Dayjs
    
    var messages: js.Array[String]
    
    var pid: Double
    
    var platform: Platform
    
    var priority: Double
    
    var tag: js.UndefOr[String] = js.undefined
  }
  object Entry {
    
    inline def apply(date: Dayjs, messages: js.Array[String], pid: Double, platform: Platform, priority: Double): Entry = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
    
    extension [Self <: Entry](x: Self) {
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
      
      inline def setDate(value: Dayjs): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setMessages(value: js.Array[String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesVarargs(value: String*): Self = StObject.set(x, "messages", js.Array(value*))
      
      inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
  
  trait IFilter extends StObject {
    
    def shouldInclude(entry: Entry): Boolean
  }
  object IFilter {
    
    inline def apply(shouldInclude: Entry => Boolean): IFilter = {
      val __obj = js.Dynamic.literal(shouldInclude = js.Any.fromFunction1(shouldInclude))
      __obj.asInstanceOf[IFilter]
    }
    
    extension [Self <: IFilter](x: Self) {
      
      inline def setShouldInclude(value: Entry => Boolean): Self = StObject.set(x, "shouldInclude", js.Any.fromFunction1(value))
    }
  }
  
  trait IParser extends StObject {
    
    def parseMessages(messages: js.Array[String]): js.Array[Entry]
    
    def splitMessages(data: String): js.Array[String]
  }
  object IParser {
    
    inline def apply(parseMessages: js.Array[String] => js.Array[Entry], splitMessages: String => js.Array[String]): IParser = {
      val __obj = js.Dynamic.literal(parseMessages = js.Any.fromFunction1(parseMessages), splitMessages = js.Any.fromFunction1(splitMessages))
      __obj.asInstanceOf[IParser]
    }
    
    extension [Self <: IParser](x: Self) {
      
      inline def setParseMessages(value: js.Array[String] => js.Array[Entry]): Self = StObject.set(x, "parseMessages", js.Any.fromFunction1(value))
      
      inline def setSplitMessages(value: String => js.Array[String]): Self = StObject.set(x, "splitMessages", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.logkitty.logkittyStrings.ios
    - typings.logkitty.logkittyStrings.android
  */
  trait Platform extends StObject
  object Platform {
    
    inline def android: typings.logkitty.logkittyStrings.android = "android".asInstanceOf[typings.logkitty.logkittyStrings.android]
    
    inline def ios: typings.logkitty.logkittyStrings.ios = "ios".asInstanceOf[typings.logkitty.logkittyStrings.ios]
  }
}
