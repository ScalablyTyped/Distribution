package typings.jsonSchemaMergeAllof

import typings.jsonSchemaMergeAllof.jsonSchemaMergeAllofBooleans.`true`
import typings.jsonSchemaMergeAllof.mod.JSONSchema
import typings.jsonSchemaMergeAllof.mod.MergeChildSchemas
import typings.jsonSchemaMergeAllof.mod.MergeSchemas
import typings.jsonSchemaMergeAllof.mod.Options_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AdditionalProperties extends StObject {
    
    def additionalProperties[T /* <: JSONSchema */](schemas: js.Array[T]): T = js.native
    @JSName("additionalProperties")
    var additionalProperties_Original: MergeSchemas = js.native
    
    def patternProperties[T /* <: JSONSchema */](schemas: js.Array[T], childSchemaName: String): T = js.native
    @JSName("patternProperties")
    var patternProperties_Original: MergeChildSchemas = js.native
    
    def properties[T /* <: JSONSchema */](schemas: js.Array[T], childSchemaName: String): T = js.native
    @JSName("properties")
    var properties_Original: MergeChildSchemas = js.native
  }
  
  @js.native
  trait Contains extends StObject {
    
    var contains: js.UndefOr[js.Any] = js.native
  }
  object Contains {
    
    @scala.inline
    def apply(): Contains = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Contains]
    }
    
    @scala.inline
    implicit class ContainsMutableBuilder[Self <: Contains] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContains(value: js.Any): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    }
  }
  
  @js.native
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
          /* values */ js.Array[_], 
          /* path */ js.Array[String], 
          /* mergeSchemas */ MergeSchemas, 
          /* options */ Options_[Schema], 
          _
        ]
      ] = js.native
  }
  object DefaultResolver {
    
    @scala.inline
    def apply[Schema /* <: JSONSchema */](): DefaultResolver[Schema] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultResolver[Schema]]
    }
    
    @scala.inline
    implicit class DefaultResolverMutableBuilder[Self <: DefaultResolver[_], Schema /* <: JSONSchema */] (val x: Self with DefaultResolver[Schema]) extends AnyVal {
      
      @scala.inline
      def setDefaultResolver(
        value: (/* values */ js.Array[_], /* path */ js.Array[String], /* mergeSchemas */ MergeSchemas, /* options */ Options_[Schema]) => _
      ): Self = StObject.set(x, "defaultResolver", js.Any.fromFunction4(value))
      
      @scala.inline
      def setDefaultResolverUndefined: Self = StObject.set(x, "defaultResolver", js.undefined)
    }
  }
  
  @js.native
  trait Examples extends StObject {
    
    var examples: js.UndefOr[js.Any] = js.native
  }
  object Examples {
    
    @scala.inline
    def apply(): Examples = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Examples]
    }
    
    @scala.inline
    implicit class ExamplesMutableBuilder[Self <: Examples] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExamples(value: js.Any): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    @JSName("$id")
    var $id: js.UndefOr[js.Any] = js.native
  }
  object Id {
    
    @scala.inline
    def apply(): Id = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$id(value: js.Any): Self = StObject.set(x, "$id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$idUndefined: Self = StObject.set(x, "$id", js.undefined)
    }
  }
  
  @js.native
  trait IgnoreAdditionalProperties extends StObject {
    
    var ignoreAdditionalProperties: `true` = js.native
  }
  object IgnoreAdditionalProperties {
    
    @scala.inline
    def apply(ignoreAdditionalProperties: `true`): IgnoreAdditionalProperties = {
      val __obj = js.Dynamic.literal(ignoreAdditionalProperties = ignoreAdditionalProperties.asInstanceOf[js.Any])
      __obj.asInstanceOf[IgnoreAdditionalProperties]
    }
    
    @scala.inline
    implicit class IgnoreAdditionalPropertiesMutableBuilder[Self <: IgnoreAdditionalProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnoreAdditionalProperties(value: `true`): Self = StObject.set(x, "ignoreAdditionalProperties", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PropertyNames extends StObject {
    
    var propertyNames: js.UndefOr[js.Any] = js.native
  }
  object PropertyNames {
    
    @scala.inline
    def apply(): PropertyNames = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PropertyNames]
    }
    
    @scala.inline
    implicit class PropertyNamesMutableBuilder[Self <: PropertyNames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPropertyNames(value: js.Any): Self = StObject.set(x, "propertyNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyNamesUndefined: Self = StObject.set(x, "propertyNames", js.undefined)
    }
  }
}
