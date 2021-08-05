package typings.joi.mod

import typings.joi.anon.Build
import typings.joi.anon.To
import typings.std.Record
import typings.std.RegExp
import typings.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extension extends StObject {
  
  var args: js.UndefOr[js.Function1[/* repeated */ SchemaLike, Schema]] = js.undefined
  
  var base: js.UndefOr[Schema] = js.undefined
  
  /**
    * undocumented options
    */
  var cast: js.UndefOr[Record[String, To]] = js.undefined
  
  var coerce: js.UndefOr[CoerceFunction | CoerceObject] = js.undefined
  
  var flags: js.UndefOr[Record[String, ExtensionFlag]] = js.undefined
  
  var manifest: js.UndefOr[Build] = js.undefined
  
  var messages: js.UndefOr[LanguageMessages | String] = js.undefined
  
  var modifiers: js.UndefOr[
    Record[String, js.Function2[/* rule */ js.Any, /* enabled */ js.UndefOr[Boolean], js.Any]]
  ] = js.undefined
  
  var overrides: js.UndefOr[Record[String, js.Function1[/* value */ js.Any, Schema]]] = js.undefined
  
  var prepare: js.UndefOr[js.Function2[/* value */ js.Any, /* helpers */ CustomHelpers[js.Any], js.Any]] = js.undefined
  
  var properties: js.UndefOr[Record[String, js.Any]] = js.undefined
  
  var rebuild: js.UndefOr[js.Function1[/* schema */ ExtensionBoundSchema, Unit]] = js.undefined
  
  var rules: js.UndefOr[Record[String, ExtensionRule & ThisType[SchemaInternals]]] = js.undefined
  
  var terms: js.UndefOr[Record[String, ExtensionTerm]] = js.undefined
  
  var `type`: String | RegExp
  
  var validate: js.UndefOr[js.Function2[/* value */ js.Any, /* helpers */ CustomHelpers[js.Any], js.Any]] = js.undefined
}
object Extension {
  
  inline def apply(`type`: String | RegExp): Extension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extension]
  }
  
  extension [Self <: Extension](x: Self) {
    
    inline def setArgs(value: /* repeated */ SchemaLike => Schema): Self = StObject.set(x, "args", js.Any.fromFunction1(value))
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setBase(value: Schema): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    inline def setCast(value: Record[String, To]): Self = StObject.set(x, "cast", value.asInstanceOf[js.Any])
    
    inline def setCastUndefined: Self = StObject.set(x, "cast", js.undefined)
    
    inline def setCoerce(value: CoerceFunction | CoerceObject): Self = StObject.set(x, "coerce", value.asInstanceOf[js.Any])
    
    inline def setCoerceFunction2(value: (/* value */ js.Any, /* helpers */ CustomHelpers[js.Any]) => CoerceResult): Self = StObject.set(x, "coerce", js.Any.fromFunction2(value))
    
    inline def setCoerceUndefined: Self = StObject.set(x, "coerce", js.undefined)
    
    inline def setFlags(value: Record[String, ExtensionFlag]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setManifest(value: Build): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
    
    inline def setMessages(value: LanguageMessages | String): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setModifiers(value: Record[String, js.Function2[/* rule */ js.Any, /* enabled */ js.UndefOr[Boolean], js.Any]]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    inline def setOverrides(value: Record[String, js.Function1[/* value */ js.Any, Schema]]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setPrepare(value: (/* value */ js.Any, /* helpers */ CustomHelpers[js.Any]) => js.Any): Self = StObject.set(x, "prepare", js.Any.fromFunction2(value))
    
    inline def setPrepareUndefined: Self = StObject.set(x, "prepare", js.undefined)
    
    inline def setProperties(value: Record[String, js.Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setRebuild(value: /* schema */ ExtensionBoundSchema => Unit): Self = StObject.set(x, "rebuild", js.Any.fromFunction1(value))
    
    inline def setRebuildUndefined: Self = StObject.set(x, "rebuild", js.undefined)
    
    inline def setRules(value: Record[String, ExtensionRule & ThisType[SchemaInternals]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setTerms(value: Record[String, ExtensionTerm]): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    inline def setTermsUndefined: Self = StObject.set(x, "terms", js.undefined)
    
    inline def setType(value: String | RegExp): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValidate(value: (/* value */ js.Any, /* helpers */ CustomHelpers[js.Any]) => js.Any): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
