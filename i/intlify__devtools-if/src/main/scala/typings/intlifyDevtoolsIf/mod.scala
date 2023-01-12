package typings.intlifyDevtoolsIf

import typings.intlifyDevtoolsIf.intlifyDevtoolsIfStrings.functionColontranslate
import typings.intlifyDevtoolsIf.intlifyDevtoolsIfStrings.i18nColoninit
import typings.intlifyShared.mod.Emittable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Inlined { readonly I18nInit :'i18n:init',  readonly FunctionTranslate :'function:translate'}[keyof { readonly I18nInit :'i18n:init',  readonly FunctionTranslate :'function:translate'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.intlifyDevtoolsIf.intlifyDevtoolsIfStrings.i18nColoninit
    - typings.intlifyDevtoolsIf.intlifyDevtoolsIfStrings.functionColontranslate
  */
  trait IntlifyDevToolsHooks extends StObject
  object IntlifyDevToolsHooks {
    
    @JSImport("@intlify/devtools-if", "IntlifyDevToolsHooks.FunctionTranslate")
    @js.native
    val FunctionTranslate: functionColontranslate = js.native
    
    @JSImport("@intlify/devtools-if", "IntlifyDevToolsHooks.I18nInit")
    @js.native
    val I18nInit: i18nColoninit = js.native
  }
  
  trait AdditionalPayloads extends StObject {
    
    var meta: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object AdditionalPayloads {
    
    inline def apply(): AdditionalPayloads = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdditionalPayloads]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AdditionalPayloads] (val x: Self) extends AnyVal {
      
      inline def setMeta(value: Record[String, Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    }
  }
  
  type IntlifyDevToolsEmitter = Emittable[IntlifyDevToolsEmitterHooks]
  
  @js.native
  trait IntlifyDevToolsEmitterHooks extends StObject
  
  @js.native
  trait IntlifyDevToolsHookPayloads extends StObject
  
  trait IntlifyRecord extends StObject {
    
    var i18n: Any
    
    var id: Double
    
    var types: Record[String, String | js.Symbol]
    
    var version: String
  }
  object IntlifyRecord {
    
    inline def apply(i18n: Any, id: Double, types: Record[String, String | js.Symbol], version: String): IntlifyRecord = {
      val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntlifyRecord]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IntlifyRecord] (val x: Self) extends AnyVal {
      
      inline def setI18n(value: Any): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTypes(value: Record[String, String | js.Symbol]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
