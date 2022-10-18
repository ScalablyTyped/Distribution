package typings.intlifyCoreBase.mod

import typings.intlifyMessageCompiler.mod.CompileOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreTranslationContext[Messages, Message] extends StObject {
  
  var escapeParameter: Boolean
  
  var messageCompiler: MessageCompiler[Message] | Null
  
  def messageResolver(obj: Any, path: Path): PathValue
  @JSName("messageResolver")
  var messageResolver_Original: MessageResolver
  
  var messages: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Messages ]: Messages[K]} */ js.Any
  
  var modifiers: LinkedModifiers[Message]
  
  var pluralRules: js.UndefOr[PluralizationRules] = js.undefined
  
  var postTranslation: PostTranslationHandler[Message] | Null
  
  var processor: MessageProcessor[Message] | Null
  
  var warnHtmlMessage: Boolean
}
object CoreTranslationContext {
  
  inline def apply[Messages, Message](
    escapeParameter: Boolean,
    messageResolver: MessageResolver,
    messages: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Messages ]: Messages[K]} */ js.Any,
    modifiers: LinkedModifiers[Message],
    warnHtmlMessage: Boolean
  ): CoreTranslationContext[Messages, Message] = {
    val __obj = js.Dynamic.literal(escapeParameter = escapeParameter.asInstanceOf[js.Any], messageResolver = messageResolver.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], warnHtmlMessage = warnHtmlMessage.asInstanceOf[js.Any], messageCompiler = null, postTranslation = null, processor = null)
    __obj.asInstanceOf[CoreTranslationContext[Messages, Message]]
  }
  
  extension [Self <: CoreTranslationContext[?, ?], Messages, Message](x: Self & (CoreTranslationContext[Messages, Message])) {
    
    inline def setEscapeParameter(value: Boolean): Self = StObject.set(x, "escapeParameter", value.asInstanceOf[js.Any])
    
    inline def setMessageCompiler(value: (/* source */ String, /* options */ js.UndefOr[CompileOptions]) => MessageFunction[Message]): Self = StObject.set(x, "messageCompiler", js.Any.fromFunction2(value))
    
    inline def setMessageCompilerNull: Self = StObject.set(x, "messageCompiler", null)
    
    inline def setMessageResolver(value: MessageResolver): Self = StObject.set(x, "messageResolver", value.asInstanceOf[js.Any])
    
    inline def setMessages(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Messages ]: Messages[K]} */ js.Any
    ): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setModifiers(value: LinkedModifiers[Message]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setPluralRules(value: PluralizationRules): Self = StObject.set(x, "pluralRules", value.asInstanceOf[js.Any])
    
    inline def setPluralRulesUndefined: Self = StObject.set(x, "pluralRules", js.undefined)
    
    inline def setPostTranslation(value: (/* translated */ MessageType[Message], /* key */ String) => MessageType[Message]): Self = StObject.set(x, "postTranslation", js.Any.fromFunction2(value))
    
    inline def setPostTranslationNull: Self = StObject.set(x, "postTranslation", null)
    
    inline def setProcessor(value: MessageProcessor[Message]): Self = StObject.set(x, "processor", value.asInstanceOf[js.Any])
    
    inline def setProcessorNull: Self = StObject.set(x, "processor", null)
    
    inline def setWarnHtmlMessage(value: Boolean): Self = StObject.set(x, "warnHtmlMessage", value.asInstanceOf[js.Any])
  }
}
