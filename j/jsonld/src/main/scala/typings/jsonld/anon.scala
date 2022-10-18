package typings.jsonld

import typings.jsonld.jsonldMod.ContainerType
import typings.jsonld.jsonldMod.ContainerTypeArray
import typings.jsonld.jsonldMod.ContextDefinition
import typings.jsonld.jsonldMod.ExpandedTermDefinition
import typings.jsonld.jsonldMod.JsonArray
import typings.jsonld.jsonldMod.JsonObject
import typings.jsonld.jsonldMod.JsonValue
import typings.jsonld.jsonldMod.NodeObject
import typings.jsonld.jsonldMod.OrArray
import typings.jsonld.jsonldMod.ValueObject
import typings.jsonld.jsonldMod._JsonLdDocument
import typings.jsonld.jsonldStrings.`@id`
import typings.jsonld.jsonldStrings.`@index`
import typings.jsonld.jsonldStrings.`@json`
import typings.jsonld.jsonldStrings.`@list`
import typings.jsonld.jsonldStrings.`@nest`
import typings.jsonld.jsonldStrings.`@none`
import typings.jsonld.jsonldStrings.`@set`
import typings.jsonld.jsonldStrings.`@vocab`
import typings.jsonld.jsonldStrings.ltr
import typings.jsonld.jsonldStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Container extends StObject {
    
    var `@container`: `@set`
    
    var `@protected`: js.UndefOr[Boolean] = js.undefined
  }
  object Container {
    
    inline def apply(): Container = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("@container")("@set")
      __obj.asInstanceOf[Container]
    }
    
    extension [Self <: Container](x: Self) {
      
      inline def `set@container`(value: `@set`): Self = StObject.set(x, "@container", value.asInstanceOf[js.Any])
      
      inline def `set@protected`(value: Boolean): Self = StObject.set(x, "@protected", value.asInstanceOf[js.Any])
      
      inline def `set@protectedUndefined`: Self = StObject.set(x, "@protected", js.undefined)
    }
  }
  
  trait Context
    extends StObject
       with _JsonLdDocument {
    
    var `@context`: js.UndefOr[OrArray[Null | String | ContextDefinition]] = js.undefined
    
    var `@graph`: js.UndefOr[OrArray[ValueObject | NodeObject]] = js.undefined
  }
  object Context {
    
    inline def apply(): Context = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def `set@context`(value: OrArray[Null | String | ContextDefinition]): Self = StObject.set(x, "@context", value.asInstanceOf[js.Any])
      
      inline def `set@contextNull`: Self = StObject.set(x, "@context", null)
      
      inline def `set@contextUndefined`: Self = StObject.set(x, "@context", js.undefined)
      
      inline def `set@contextVarargs`(value: (Null | String | ContextDefinition)*): Self = StObject.set(x, "@context", js.Array(value*))
      
      inline def `set@graph`(value: OrArray[ValueObject | NodeObject]): Self = StObject.set(x, "@graph", value.asInstanceOf[js.Any])
      
      inline def `set@graphUndefined`: Self = StObject.set(x, "@graph", js.undefined)
      
      inline def `set@graphVarargs`(value: (ValueObject | NodeObject)*): Self = StObject.set(x, "@graph", js.Array(value*))
    }
  }
  
  trait Protected extends StObject {
    
    var `@container`: `@set`
    
    var `@protected`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: jsonld.jsonld/jsonld.Keyword['@protected'] */ js.Any
      ] = js.undefined
  }
  object Protected {
    
    inline def apply(): Protected = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("@container")("@set")
      __obj.asInstanceOf[Protected]
    }
    
    extension [Self <: Protected](x: Self) {
      
      inline def `set@container`(value: `@set`): Self = StObject.set(x, "@container", value.asInstanceOf[js.Any])
      
      inline def `set@protected`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: jsonld.jsonld/jsonld.Keyword['@protected'] */ js.Any
      ): Self = StObject.set(x, "@protected", value.asInstanceOf[js.Any])
      
      inline def `set@protectedUndefined`: Self = StObject.set(x, "@protected", js.undefined)
    }
  }
  
  /* Inlined {  @id :jsonld.jsonld/jsonld.Keyword['@id'] | null | undefined,   @nest :'@nest' | string | undefined,   @container :jsonld.jsonld/jsonld.Keyword['@container'] | undefined} & {  @type :'@id' | '@json' | '@none' | '@vocab' | string | undefined,   @language :jsonld.jsonld/jsonld.Keyword['@language'] | undefined,   @index :jsonld.jsonld/jsonld.Keyword['@index'] | undefined,   @context :jsonld.jsonld/jsonld.ContextDefinition | undefined,   @prefix :jsonld.jsonld/jsonld.Keyword['@prefix'] | undefined,   @propagate :jsonld.jsonld/jsonld.Keyword['@propagate'] | undefined,   @protected :jsonld.jsonld/jsonld.Keyword['@protected'] | undefined} */
  trait idKeywordidnullundefinedn
    extends StObject
       with ExpandedTermDefinition {
    
    var `@container`: js.UndefOr[(OrArray[`@list` | `@set` | ContainerType]) | ContainerTypeArray | Null] = js.undefined
    
    var `@context`: js.UndefOr[ContextDefinition] = js.undefined
    
    var `@id`: js.UndefOr[OrArray[String] | Null] = js.undefined
    
    var `@index`: js.UndefOr[String] = js.undefined
    
    var `@language`: js.UndefOr[String] = js.undefined
    
    var `@nest`: js.UndefOr[typings.jsonld.jsonldStrings.`@nest` | String] = js.undefined
    
    var `@prefix`: js.UndefOr[Boolean] = js.undefined
    
    var `@propagate`: js.UndefOr[Boolean] = js.undefined
    
    var `@protected`: js.UndefOr[Boolean] = js.undefined
    
    var `@type`: js.UndefOr[`@id` | `@json` | `@none` | `@vocab` | String] = js.undefined
  }
  object idKeywordidnullundefinedn {
    
    inline def apply(): idKeywordidnullundefinedn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[idKeywordidnullundefinedn]
    }
    
    extension [Self <: idKeywordidnullundefinedn](x: Self) {
      
      inline def `set@container`(value: (OrArray[`@list` | `@set` | ContainerType]) | ContainerTypeArray): Self = StObject.set(x, "@container", value.asInstanceOf[js.Any])
      
      inline def `set@containerNull`: Self = StObject.set(x, "@container", null)
      
      inline def `set@containerUndefined`: Self = StObject.set(x, "@container", js.undefined)
      
      inline def `set@containerVarargs`(value: (`@list` | `@set` | ContainerType)*): Self = StObject.set(x, "@container", js.Array(value*))
      
      inline def `set@context`(value: ContextDefinition): Self = StObject.set(x, "@context", value.asInstanceOf[js.Any])
      
      inline def `set@contextUndefined`: Self = StObject.set(x, "@context", js.undefined)
      
      inline def `set@id`(value: OrArray[String]): Self = StObject.set(x, "@id", value.asInstanceOf[js.Any])
      
      inline def `set@idNull`: Self = StObject.set(x, "@id", null)
      
      inline def `set@idUndefined`: Self = StObject.set(x, "@id", js.undefined)
      
      inline def `set@idVarargs`(value: String*): Self = StObject.set(x, "@id", js.Array(value*))
      
      inline def `set@index`(value: String): Self = StObject.set(x, "@index", value.asInstanceOf[js.Any])
      
      inline def `set@indexUndefined`: Self = StObject.set(x, "@index", js.undefined)
      
      inline def `set@language`(value: String): Self = StObject.set(x, "@language", value.asInstanceOf[js.Any])
      
      inline def `set@languageUndefined`: Self = StObject.set(x, "@language", js.undefined)
      
      inline def `set@nest`(value: `@nest` | String): Self = StObject.set(x, "@nest", value.asInstanceOf[js.Any])
      
      inline def `set@nestUndefined`: Self = StObject.set(x, "@nest", js.undefined)
      
      inline def `set@prefix`(value: Boolean): Self = StObject.set(x, "@prefix", value.asInstanceOf[js.Any])
      
      inline def `set@prefixUndefined`: Self = StObject.set(x, "@prefix", js.undefined)
      
      inline def `set@propagate`(value: Boolean): Self = StObject.set(x, "@propagate", value.asInstanceOf[js.Any])
      
      inline def `set@propagateUndefined`: Self = StObject.set(x, "@propagate", js.undefined)
      
      inline def `set@protected`(value: Boolean): Self = StObject.set(x, "@protected", value.asInstanceOf[js.Any])
      
      inline def `set@protectedUndefined`: Self = StObject.set(x, "@protected", js.undefined)
      
      inline def `set@type`(value: `@id` | `@json` | `@none` | `@vocab` | String): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
      
      inline def `set@typeUndefined`: Self = StObject.set(x, "@type", js.undefined)
    }
  }
  
  /* Inlined {  @reverse :jsonld.jsonld/jsonld.Keyword['@reverse'],   @container :'@set' | '@index' | null | undefined} & {  @type :'@id' | '@json' | '@none' | '@vocab' | string | undefined,   @language :jsonld.jsonld/jsonld.Keyword['@language'] | undefined,   @index :jsonld.jsonld/jsonld.Keyword['@index'] | undefined,   @context :jsonld.jsonld/jsonld.ContextDefinition | undefined,   @prefix :jsonld.jsonld/jsonld.Keyword['@prefix'] | undefined,   @propagate :jsonld.jsonld/jsonld.Keyword['@propagate'] | undefined,   @protected :jsonld.jsonld/jsonld.Keyword['@protected'] | undefined} */
  trait reverseKeywordreversecont
    extends StObject
       with ExpandedTermDefinition {
    
    var `@container`: js.UndefOr[`@set` | `@index` | Null] = js.undefined
    
    var `@context`: js.UndefOr[ContextDefinition] = js.undefined
    
    var `@index`: js.UndefOr[String] = js.undefined
    
    var `@language`: js.UndefOr[String] = js.undefined
    
    var `@prefix`: js.UndefOr[Boolean] = js.undefined
    
    var `@propagate`: js.UndefOr[Boolean] = js.undefined
    
    var `@protected`: js.UndefOr[Boolean] = js.undefined
    
    var `@reverse`: String
    
    var `@type`: js.UndefOr[`@id` | `@json` | `@none` | `@vocab` | String] = js.undefined
  }
  object reverseKeywordreversecont {
    
    inline def apply(`@reverse`: String): reverseKeywordreversecont = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("@reverse")(`@reverse`.asInstanceOf[js.Any])
      __obj.asInstanceOf[reverseKeywordreversecont]
    }
    
    extension [Self <: reverseKeywordreversecont](x: Self) {
      
      inline def `set@container`(value: `@set` | `@index`): Self = StObject.set(x, "@container", value.asInstanceOf[js.Any])
      
      inline def `set@containerNull`: Self = StObject.set(x, "@container", null)
      
      inline def `set@containerUndefined`: Self = StObject.set(x, "@container", js.undefined)
      
      inline def `set@context`(value: ContextDefinition): Self = StObject.set(x, "@context", value.asInstanceOf[js.Any])
      
      inline def `set@contextUndefined`: Self = StObject.set(x, "@context", js.undefined)
      
      inline def `set@index`(value: String): Self = StObject.set(x, "@index", value.asInstanceOf[js.Any])
      
      inline def `set@indexUndefined`: Self = StObject.set(x, "@index", js.undefined)
      
      inline def `set@language`(value: String): Self = StObject.set(x, "@language", value.asInstanceOf[js.Any])
      
      inline def `set@languageUndefined`: Self = StObject.set(x, "@language", js.undefined)
      
      inline def `set@prefix`(value: Boolean): Self = StObject.set(x, "@prefix", value.asInstanceOf[js.Any])
      
      inline def `set@prefixUndefined`: Self = StObject.set(x, "@prefix", js.undefined)
      
      inline def `set@propagate`(value: Boolean): Self = StObject.set(x, "@propagate", value.asInstanceOf[js.Any])
      
      inline def `set@propagateUndefined`: Self = StObject.set(x, "@propagate", js.undefined)
      
      inline def `set@protected`(value: Boolean): Self = StObject.set(x, "@protected", value.asInstanceOf[js.Any])
      
      inline def `set@protectedUndefined`: Self = StObject.set(x, "@protected", js.undefined)
      
      inline def `set@reverse`(value: String): Self = StObject.set(x, "@reverse", value.asInstanceOf[js.Any])
      
      inline def `set@type`(value: `@id` | `@json` | `@none` | `@vocab` | String): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
      
      inline def `set@typeUndefined`: Self = StObject.set(x, "@type", js.undefined)
    }
  }
  
  /* Inlined {  @value :jsonld.jsonld/jsonld.Keyword['@value'] | jsonld.jsonld/jsonld.JsonObject | jsonld.jsonld/jsonld.JsonArray,   @type :'@json'} & {  @index :jsonld.jsonld/jsonld.Keyword['@index'] | undefined,   @context :jsonld.jsonld/jsonld.Keyword['@context'] | undefined} */
  trait valueKeywordvalueJsonObje
    extends StObject
       with ValueObject {
    
    var `@context`: js.UndefOr[OrArray[Null | String | ContextDefinition]] = js.undefined
    
    var `@index`: js.UndefOr[String] = js.undefined
    
    var `@type`: `@json`
    
    var `@value`: Null | Boolean | Double | String | JsonObject | JsonArray
  }
  object valueKeywordvalueJsonObje {
    
    inline def apply(): valueKeywordvalueJsonObje = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("@type")("@json")
      __obj.updateDynamic("@value")(null)
      __obj.asInstanceOf[valueKeywordvalueJsonObje]
    }
    
    extension [Self <: valueKeywordvalueJsonObje](x: Self) {
      
      inline def `set@context`(value: OrArray[Null | String | ContextDefinition]): Self = StObject.set(x, "@context", value.asInstanceOf[js.Any])
      
      inline def `set@contextNull`: Self = StObject.set(x, "@context", null)
      
      inline def `set@contextUndefined`: Self = StObject.set(x, "@context", js.undefined)
      
      inline def `set@contextVarargs`(value: (Null | String | ContextDefinition)*): Self = StObject.set(x, "@context", js.Array(value*))
      
      inline def `set@index`(value: String): Self = StObject.set(x, "@index", value.asInstanceOf[js.Any])
      
      inline def `set@indexUndefined`: Self = StObject.set(x, "@index", js.undefined)
      
      inline def `set@type`(value: `@json`): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
      
      inline def `set@value`(value: Boolean | Double | String | JsonObject | JsonArray): Self = StObject.set(x, "@value", value.asInstanceOf[js.Any])
      
      inline def `set@valueNull`: Self = StObject.set(x, "@value", null)
      
      inline def `set@valueVarargs`(value: JsonValue*): Self = StObject.set(x, "@value", js.Array(value*))
    }
  }
  
  /* Inlined {  @value :jsonld.jsonld/jsonld.Keyword['@value'],   @language :jsonld.jsonld/jsonld.Keyword['@language'] | undefined,   @direction :jsonld.jsonld/jsonld.Keyword['@direction'] | undefined} & {  @index :jsonld.jsonld/jsonld.Keyword['@index'] | undefined,   @context :jsonld.jsonld/jsonld.Keyword['@context'] | undefined} */
  trait valueKeywordvaluelanguage
    extends StObject
       with ValueObject {
    
    var `@context`: js.UndefOr[OrArray[Null | String | ContextDefinition]] = js.undefined
    
    var `@direction`: js.UndefOr[ltr | rtl | Null] = js.undefined
    
    var `@index`: js.UndefOr[String] = js.undefined
    
    var `@language`: js.UndefOr[String] = js.undefined
    
    var `@value`: Null | Boolean | Double | String
  }
  object valueKeywordvaluelanguage {
    
    inline def apply(): valueKeywordvaluelanguage = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("@value")(null)
      __obj.asInstanceOf[valueKeywordvaluelanguage]
    }
    
    extension [Self <: valueKeywordvaluelanguage](x: Self) {
      
      inline def `set@context`(value: OrArray[Null | String | ContextDefinition]): Self = StObject.set(x, "@context", value.asInstanceOf[js.Any])
      
      inline def `set@contextNull`: Self = StObject.set(x, "@context", null)
      
      inline def `set@contextUndefined`: Self = StObject.set(x, "@context", js.undefined)
      
      inline def `set@contextVarargs`(value: (Null | String | ContextDefinition)*): Self = StObject.set(x, "@context", js.Array(value*))
      
      inline def `set@direction`(value: ltr | rtl): Self = StObject.set(x, "@direction", value.asInstanceOf[js.Any])
      
      inline def `set@directionNull`: Self = StObject.set(x, "@direction", null)
      
      inline def `set@directionUndefined`: Self = StObject.set(x, "@direction", js.undefined)
      
      inline def `set@index`(value: String): Self = StObject.set(x, "@index", value.asInstanceOf[js.Any])
      
      inline def `set@indexUndefined`: Self = StObject.set(x, "@index", js.undefined)
      
      inline def `set@language`(value: String): Self = StObject.set(x, "@language", value.asInstanceOf[js.Any])
      
      inline def `set@languageUndefined`: Self = StObject.set(x, "@language", js.undefined)
      
      inline def `set@value`(value: Boolean | Double | String): Self = StObject.set(x, "@value", value.asInstanceOf[js.Any])
      
      inline def `set@valueNull`: Self = StObject.set(x, "@value", null)
    }
  }
  
  /* Inlined {  @value :jsonld.jsonld/jsonld.Keyword['@value'],   @type :jsonld.jsonld/jsonld.Keyword['@type']} & {  @index :jsonld.jsonld/jsonld.Keyword['@index'] | undefined,   @context :jsonld.jsonld/jsonld.Keyword['@context'] | undefined} */
  trait valueKeywordvaluetypeKeyw
    extends StObject
       with ValueObject {
    
    var `@context`: js.UndefOr[OrArray[Null | String | ContextDefinition]] = js.undefined
    
    var `@index`: js.UndefOr[String] = js.undefined
    
    var `@type`: String
    
    var `@value`: Null | Boolean | Double | String
  }
  object valueKeywordvaluetypeKeyw {
    
    inline def apply(`@type`: String): valueKeywordvaluetypeKeyw = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
      __obj.updateDynamic("@value")(null)
      __obj.asInstanceOf[valueKeywordvaluetypeKeyw]
    }
    
    extension [Self <: valueKeywordvaluetypeKeyw](x: Self) {
      
      inline def `set@context`(value: OrArray[Null | String | ContextDefinition]): Self = StObject.set(x, "@context", value.asInstanceOf[js.Any])
      
      inline def `set@contextNull`: Self = StObject.set(x, "@context", null)
      
      inline def `set@contextUndefined`: Self = StObject.set(x, "@context", js.undefined)
      
      inline def `set@contextVarargs`(value: (Null | String | ContextDefinition)*): Self = StObject.set(x, "@context", js.Array(value*))
      
      inline def `set@index`(value: String): Self = StObject.set(x, "@index", value.asInstanceOf[js.Any])
      
      inline def `set@indexUndefined`: Self = StObject.set(x, "@index", js.undefined)
      
      inline def `set@type`(value: String): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
      
      inline def `set@value`(value: Boolean | Double | String): Self = StObject.set(x, "@value", value.asInstanceOf[js.Any])
      
      inline def `set@valueNull`: Self = StObject.set(x, "@value", null)
    }
  }
}
