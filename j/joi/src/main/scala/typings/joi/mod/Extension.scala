package typings.joi.mod

import typings.joi.anon.Build
import typings.joi.anon.To
import typings.std.Record
import typings.std.RegExp
import typings.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Extension extends StObject {
  
  var args: js.UndefOr[js.Function1[/* repeated */ SchemaLike, Schema]] = js.native
  
  var base: js.UndefOr[Schema] = js.native
  
  /**
    * undocumented options
    */
  var cast: js.UndefOr[Record[String, To]] = js.native
  
  var coerce: js.UndefOr[CoerceFunction | CoerceObject] = js.native
  
  var flags: js.UndefOr[Record[String, ExtensionFlag]] = js.native
  
  var manifest: js.UndefOr[Build] = js.native
  
  var messages: js.UndefOr[LanguageMessages | String] = js.native
  
  var modifiers: js.UndefOr[Record[String, js.Function2[/* rule */ _, /* enabled */ js.UndefOr[Boolean], _]]] = js.native
  
  var overrides: js.UndefOr[Record[String, js.Function1[/* value */ _, Schema]]] = js.native
  
  var prepare: js.UndefOr[js.Function2[/* value */ js.Any, /* helpers */ CustomHelpers[_], _]] = js.native
  
  var properties: js.UndefOr[Record[String, _]] = js.native
  
  var rebuild: js.UndefOr[js.Function1[/* schema */ ExtensionBoundSchema, Unit]] = js.native
  
  var rules: js.UndefOr[Record[String, ExtensionRule with ThisType[SchemaInternals]]] = js.native
  
  var terms: js.UndefOr[Record[String, ExtensionTerm]] = js.native
  
  var `type`: String | RegExp = js.native
  
  var validate: js.UndefOr[js.Function2[/* value */ js.Any, /* helpers */ CustomHelpers[_], _]] = js.native
}
object Extension {
  
  @scala.inline
  def apply(`type`: String | RegExp): Extension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extension]
  }
  
  @scala.inline
  implicit class ExtensionMutableBuilder[Self <: Extension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: /* repeated */ SchemaLike => Schema): Self = StObject.set(x, "args", js.Any.fromFunction1(value))
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setBase(value: Schema): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    @scala.inline
    def setCast(value: Record[String, To]): Self = StObject.set(x, "cast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCastUndefined: Self = StObject.set(x, "cast", js.undefined)
    
    @scala.inline
    def setCoerce(value: CoerceFunction | CoerceObject): Self = StObject.set(x, "coerce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoerceFunction2(value: (/* value */ js.Any, /* helpers */ CustomHelpers[js.Any]) => CoerceResult): Self = StObject.set(x, "coerce", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCoerceUndefined: Self = StObject.set(x, "coerce", js.undefined)
    
    @scala.inline
    def setFlags(value: Record[String, ExtensionFlag]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    @scala.inline
    def setManifest(value: Build): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
    
    @scala.inline
    def setMessages(value: LanguageMessages | String): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setModifiers(value: Record[String, js.Function2[/* rule */ _, /* enabled */ js.UndefOr[Boolean], _]]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    @scala.inline
    def setOverrides(value: Record[String, js.Function1[/* value */ _, Schema]]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    @scala.inline
    def setPrepare(value: (/* value */ js.Any, /* helpers */ CustomHelpers[_]) => _): Self = StObject.set(x, "prepare", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPrepareUndefined: Self = StObject.set(x, "prepare", js.undefined)
    
    @scala.inline
    def setProperties(value: Record[String, _]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setRebuild(value: /* schema */ ExtensionBoundSchema => Unit): Self = StObject.set(x, "rebuild", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRebuildUndefined: Self = StObject.set(x, "rebuild", js.undefined)
    
    @scala.inline
    def setRules(value: Record[String, ExtensionRule with ThisType[SchemaInternals]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setTerms(value: Record[String, ExtensionTerm]): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermsUndefined: Self = StObject.set(x, "terms", js.undefined)
    
    @scala.inline
    def setType(value: String | RegExp): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidate(value: (/* value */ js.Any, /* helpers */ CustomHelpers[_]) => _): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
