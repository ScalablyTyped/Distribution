package typings.jsonSchemaMergeAllof

import typings.jsonSchemaMergeAllof.jsonSchemaMergeAllofBooleans.`true`
import typings.jsonSchemaMergeAllof.mod.JSONSchema
import typings.jsonSchemaMergeAllof.mod.MergeChildSchemas
import typings.jsonSchemaMergeAllof.mod.MergeSchemas
import typings.jsonSchemaMergeAllof.mod.Options_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AdditionalProperties extends StObject {
    
    def additionalProperties[T /* <: JSONSchema */](schemas: js.Array[T]): T
    @JSName("additionalProperties")
    var additionalProperties_Original: MergeSchemas
    
    def patternProperties[T /* <: JSONSchema */](schemas: js.Array[T], childSchemaName: String): T
    @JSName("patternProperties")
    var patternProperties_Original: MergeChildSchemas
    
    def properties[T /* <: JSONSchema */](schemas: js.Array[T], childSchemaName: String): T
    @JSName("properties")
    var properties_Original: MergeChildSchemas
  }
  object AdditionalProperties {
    
    inline def apply(
      additionalProperties: /* schemas */ js.Array[JSONSchema] => JSONSchema,
      patternProperties: (/* schemas */ js.Array[JSONSchema], /* childSchemaName */ String) => JSONSchema,
      properties: (/* schemas */ js.Array[JSONSchema], /* childSchemaName */ String) => JSONSchema
    ): AdditionalProperties = {
      val __obj = js.Dynamic.literal(additionalProperties = js.Any.fromFunction1(additionalProperties), patternProperties = js.Any.fromFunction2(patternProperties), properties = js.Any.fromFunction2(properties))
      __obj.asInstanceOf[AdditionalProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AdditionalProperties] (val x: Self) extends AnyVal {
      
      inline def setAdditionalProperties(value: /* schemas */ js.Array[JSONSchema] => JSONSchema): Self = StObject.set(x, "additionalProperties", js.Any.fromFunction1(value))
      
      inline def setPatternProperties(value: (/* schemas */ js.Array[JSONSchema], /* childSchemaName */ String) => JSONSchema): Self = StObject.set(x, "patternProperties", js.Any.fromFunction2(value))
      
      inline def setProperties(value: (/* schemas */ js.Array[JSONSchema], /* childSchemaName */ String) => JSONSchema): Self = StObject.set(x, "properties", js.Any.fromFunction2(value))
    }
  }
  
  trait Contains extends StObject {
    
    var contains: js.UndefOr[Any] = js.undefined
  }
  object Contains {
    
    inline def apply(): Contains = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Contains]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Contains] (val x: Self) extends AnyVal {
      
      inline def setContains(value: Any): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    }
  }
  
  trait DefaultResolver[Schema /* <: JSONSchema */] extends StObject {
    
    /**
      * ### Default resolver
      * You can set a default resolver that catches any unknown keyword.
      * Let's say you want to use the same strategy as the ones for the
      * meta keywords, to use the first value found. You can accomplish
      * that like this:
      *
      * ```js
      * mergeJsonSchema({
      *   ...
      * }, {
      *   resolvers: {
      *       defaultResolver: mergeJsonSchema.options.resolvers.title
      *   }
      * })
      * ```
      */
    var defaultResolver: js.UndefOr[
        js.Function4[
          /* values */ js.Array[Any], 
          /* path */ js.Array[String], 
          /* mergeSchemas */ MergeSchemas, 
          /* options */ Options_[Schema], 
          Any
        ]
      ] = js.undefined
  }
  object DefaultResolver {
    
    inline def apply[Schema /* <: JSONSchema */](): DefaultResolver[Schema] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultResolver[Schema]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultResolver[?], Schema /* <: JSONSchema */] (val x: Self & DefaultResolver[Schema]) extends AnyVal {
      
      inline def setDefaultResolver(
        value: (/* values */ js.Array[Any], /* path */ js.Array[String], /* mergeSchemas */ MergeSchemas, /* options */ Options_[Schema]) => Any
      ): Self = StObject.set(x, "defaultResolver", js.Any.fromFunction4(value))
      
      inline def setDefaultResolverUndefined: Self = StObject.set(x, "defaultResolver", js.undefined)
    }
  }
  
  trait Examples extends StObject {
    
    var examples: js.UndefOr[Any] = js.undefined
  }
  object Examples {
    
    inline def apply(): Examples = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Examples]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Examples] (val x: Self) extends AnyVal {
      
      inline def setExamples(value: Any): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
      
      inline def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
    }
  }
  
  trait Id extends StObject {
    
    @JSName("$id")
    var $id: js.UndefOr[Any] = js.undefined
  }
  object Id {
    
    inline def apply(): Id = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      inline def set$id(value: Any): Self = StObject.set(x, "$id", value.asInstanceOf[js.Any])
      
      inline def set$idUndefined: Self = StObject.set(x, "$id", js.undefined)
    }
  }
  
  trait IgnoreAdditionalProperties extends StObject {
    
    var ignoreAdditionalProperties: `true`
  }
  object IgnoreAdditionalProperties {
    
    inline def apply(): IgnoreAdditionalProperties = {
      val __obj = js.Dynamic.literal(ignoreAdditionalProperties = true)
      __obj.asInstanceOf[IgnoreAdditionalProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IgnoreAdditionalProperties] (val x: Self) extends AnyVal {
      
      inline def setIgnoreAdditionalProperties(value: `true`): Self = StObject.set(x, "ignoreAdditionalProperties", value.asInstanceOf[js.Any])
    }
  }
  
  trait PropertyNames extends StObject {
    
    var propertyNames: js.UndefOr[Any] = js.undefined
  }
  object PropertyNames {
    
    inline def apply(): PropertyNames = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PropertyNames]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PropertyNames] (val x: Self) extends AnyVal {
      
      inline def setPropertyNames(value: Any): Self = StObject.set(x, "propertyNames", value.asInstanceOf[js.Any])
      
      inline def setPropertyNamesUndefined: Self = StObject.set(x, "propertyNames", js.undefined)
    }
  }
}
