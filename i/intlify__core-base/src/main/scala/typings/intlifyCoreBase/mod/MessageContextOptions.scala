package typings.intlifyCoreBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageContextOptions[T, N] extends StObject {
  
  var list: js.UndefOr[js.Array[Any]] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var messages: js.UndefOr[MessageFunctions[T] | MessageResolveFunction[T]] = js.undefined
  
  var modifiers: js.UndefOr[LinkedModifiers[T]] = js.undefined
  
  var named: js.UndefOr[NamedValue[N]] = js.undefined
  
  var parent: js.UndefOr[MessageContext[T]] = js.undefined
  
  var pluralIndex: js.UndefOr[Double] = js.undefined
  
  var pluralRules: js.UndefOr[PluralizationRules] = js.undefined
  
  var processor: js.UndefOr[MessageProcessor[T]] = js.undefined
}
object MessageContextOptions {
  
  inline def apply[T, N](): MessageContextOptions[T, N] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageContextOptions[T, N]]
  }
  
  extension [Self <: MessageContextOptions[?, ?], T, N](x: Self & (MessageContextOptions[T, N])) {
    
    inline def setList(value: js.Array[Any]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    inline def setListVarargs(value: Any*): Self = StObject.set(x, "list", js.Array(value*))
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMessages(value: MessageFunctions[T] | MessageResolveFunction[T]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesFunction1(value: /* key */ String => MessageFunction[T]): Self = StObject.set(x, "messages", js.Any.fromFunction1(value))
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setModifiers(value: LinkedModifiers[T]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    inline def setNamed(value: NamedValue[N]): Self = StObject.set(x, "named", value.asInstanceOf[js.Any])
    
    inline def setNamedUndefined: Self = StObject.set(x, "named", js.undefined)
    
    inline def setParent(value: MessageContext[T]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPluralIndex(value: Double): Self = StObject.set(x, "pluralIndex", value.asInstanceOf[js.Any])
    
    inline def setPluralIndexUndefined: Self = StObject.set(x, "pluralIndex", js.undefined)
    
    inline def setPluralRules(value: PluralizationRules): Self = StObject.set(x, "pluralRules", value.asInstanceOf[js.Any])
    
    inline def setPluralRulesUndefined: Self = StObject.set(x, "pluralRules", js.undefined)
    
    inline def setProcessor(value: MessageProcessor[T]): Self = StObject.set(x, "processor", value.asInstanceOf[js.Any])
    
    inline def setProcessorUndefined: Self = StObject.set(x, "processor", js.undefined)
  }
}
