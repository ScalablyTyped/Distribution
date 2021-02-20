package typings.jsonSchemaTraverse

import typings.jsonSchemaTraverse.anon.Post
import typings.jsonSchemaTraverse.jsonSchemaTraverseBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json-schema-traverse", JSImport.Namespace)
  @js.native
  def apply(schema: js.Object, cb: TraverseCallback): Unit = js.native
  @JSImport("json-schema-traverse", JSImport.Namespace)
  @js.native
  def apply(schema: js.Object, opts: TraverseOptions): Unit = js.native
  @JSImport("json-schema-traverse", JSImport.Namespace)
  @js.native
  def apply(schema: js.Object, opts: TraverseOptions, cb: TraverseCallback): Unit = js.native
  
  object arrayKeywords {
    
    @JSImport("json-schema-traverse", "arrayKeywords")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("json-schema-traverse", "arrayKeywords.allOf")
    @js.native
    def allOf: `true` = js.native
    @scala.inline
    def allOf_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allOf")(x.asInstanceOf[js.Any])
    
    @JSImport("json-schema-traverse", "arrayKeywords.anyOf")
    @js.native
    def anyOf: `true` = js.native
    @scala.inline
    def anyOf_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("anyOf")(x.asInstanceOf[js.Any])
    
    @JSImport("json-schema-traverse", "arrayKeywords.items")
    @js.native
    def items: `true` = js.native
    @scala.inline
    def items_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("items")(x.asInstanceOf[js.Any])
    
    @JSImport("json-schema-traverse", "arrayKeywords.oneOf")
    @js.native
    def oneOf: `true` = js.native
    @scala.inline
    def oneOf_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("oneOf")(x.asInstanceOf[js.Any])
  }
  
  object keywords {
    
    @JSImport("json-schema-traverse", "keywords")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("json-schema-traverse", "keywords.additionalItems")
    @js.native
    def additionalItems: `true` = js.native
    @scala.inline
    def additionalItems_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("additionalItems")(x.asInstanceOf[js.Any])
    
    @JSImport("json-schema-traverse", "keywords.additionalProperties")
    @js.native
    def additionalProperties: `true` = js.native
    @scala.inline
    def additionalProperties_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("additionalProperties")(x.asInstanceOf[js.Any])
    
    @JSImport("json-schema-traverse", "keywords.contains")
    @js.native
    def contains: `true` = js.native
    @scala.inline
    def contains_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contains")(x.asInstanceOf[js.Any])
    
    @JSImport("json-schema-traverse", "keywords.items")
    @js.native
    def items: `true` = js.native
    @scala.inline
    def items_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("items")(x.asInstanceOf[js.Any])
    
    @JSImport("json-schema-traverse", "keywords.not")
    @js.native
    def not: `true` = js.native
    @scala.inline
    def not_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("not")(x.asInstanceOf[js.Any])
    
    @JSImport("json-schema-traverse", "keywords.propertyNames")
    @js.native
    def propertyNames: `true` = js.native
    @scala.inline
    def propertyNames_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propertyNames")(x.asInstanceOf[js.Any])
    
    @JSImport("json-schema-traverse", "keywords.else")
    @js.native
    val `else`: `true` = js.native
    
    @JSImport("json-schema-traverse", "keywords.if")
    @js.native
    val `if`: `true` = js.native
    
    @JSImport("json-schema-traverse", "keywords.then")
    @js.native
    val `then`: `true` = js.native
  }
  
  object propsKeywords {
    
    @JSImport("json-schema-traverse", "propsKeywords")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("json-schema-traverse", "propsKeywords.definitions")
    @js.native
    def definitions: `true` = js.native
    @scala.inline
    def definitions_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("definitions")(x.asInstanceOf[js.Any])
    
    @JSImport("json-schema-traverse", "propsKeywords.dependencies")
    @js.native
    def dependencies: `true` = js.native
    @scala.inline
    def dependencies_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    @JSImport("json-schema-traverse", "propsKeywords.patternProperties")
    @js.native
    def patternProperties: `true` = js.native
    @scala.inline
    def patternProperties_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("patternProperties")(x.asInstanceOf[js.Any])
    
    @JSImport("json-schema-traverse", "propsKeywords.properties")
    @js.native
    def properties: `true` = js.native
    @scala.inline
    def properties_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("properties")(x.asInstanceOf[js.Any])
  }
  
  object skipKeywords {
    
    @JSImport("json-schema-traverse", "skipKeywords")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("json-schema-traverse", "skipKeywords.default")
    @js.native
    def default: `true` = js.native
    
    @JSImport("json-schema-traverse", "skipKeywords.const")
    @js.native
    def const: `true` = js.native
    @scala.inline
    def const_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("const")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def default_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
    
    @JSImport("json-schema-traverse", "skipKeywords.enum")
    @js.native
    def enum: `true` = js.native
    @scala.inline
    def enum_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enum")(x.asInstanceOf[js.Any])
    
    @JSImport("json-schema-traverse", "skipKeywords.exclusiveMaximum")
    @js.native
    def exclusiveMaximum: `true` = js.native
    @scala.inline
    def exclusiveMaximum_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exclusiveMaximum")(x.asInstanceOf[js.Any])
    
    @JSImport("json-schema-traverse", "skipKeywords.exclusiveMinimum")
    @js.native
    def exclusiveMinimum: `true` = js.native
    @scala.inline
    def exclusiveMinimum_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exclusiveMinimum")(x.asInstanceOf[js.Any])
    
    @JSImport("json-schema-traverse", "skipKeywords.format")
    @js.native
    def format: `true` = js.native
    @scala.inline
    def format_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("format")(x.asInstanceOf[js.Any])
    
    @JSImport("json-schema-traverse", "skipKeywords.maxItems")
    @js.native
    def maxItems: `true` = js.native
    @scala.inline
    def maxItems_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxItems")(x.asInstanceOf[js.Any])
    
    @JSImport("json-schema-traverse", "skipKeywords.maxLength")
    @js.native
    def maxLength: `true` = js.native
    @scala.inline
    def maxLength_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(x.asInstanceOf[js.Any])
    
    @JSImport("json-schema-traverse", "skipKeywords.maxProperties")
    @js.native
    def maxProperties: `true` = js.native
    @scala.inline
    def maxProperties_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxProperties")(x.asInstanceOf[js.Any])
    
    @JSImport("json-schema-traverse", "skipKeywords.maximum")
    @js.native
    def maximum: `true` = js.native
    @scala.inline
    def maximum_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maximum")(x.asInstanceOf[js.Any])
    
    @JSImport("json-schema-traverse", "skipKeywords.minItems")
    @js.native
    def minItems: `true` = js.native
    @scala.inline
    def minItems_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minItems")(x.asInstanceOf[js.Any])
    
    @JSImport("json-schema-traverse", "skipKeywords.minLength")
    @js.native
    def minLength: `true` = js.native
    @scala.inline
    def minLength_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minLength")(x.asInstanceOf[js.Any])
    
    @JSImport("json-schema-traverse", "skipKeywords.minProperties")
    @js.native
    def minProperties: `true` = js.native
    @scala.inline
    def minProperties_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minProperties")(x.asInstanceOf[js.Any])
    
    @JSImport("json-schema-traverse", "skipKeywords.minimum")
    @js.native
    def minimum: `true` = js.native
    @scala.inline
    def minimum_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minimum")(x.asInstanceOf[js.Any])
    
    @JSImport("json-schema-traverse", "skipKeywords.multipleOf")
    @js.native
    def multipleOf: `true` = js.native
    @scala.inline
    def multipleOf_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multipleOf")(x.asInstanceOf[js.Any])
    
    @JSImport("json-schema-traverse", "skipKeywords.pattern")
    @js.native
    def pattern: `true` = js.native
    @scala.inline
    def pattern_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pattern")(x.asInstanceOf[js.Any])
    
    @JSImport("json-schema-traverse", "skipKeywords.required")
    @js.native
    def required: `true` = js.native
    @scala.inline
    def required_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
    
    @JSImport("json-schema-traverse", "skipKeywords.uniqueItems")
    @js.native
    def uniqueItems: `true` = js.native
    @scala.inline
    def uniqueItems_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uniqueItems")(x.asInstanceOf[js.Any])
  }
  
  type TraverseCallback = TraverseCallbackDef | Post
  
  type TraverseCallbackDef = js.Function7[
    /* schema */ js.Object, 
    /* jsonPtr */ String, 
    /* rootSchema */ js.Object, 
    /* parentJsonPtr */ String, 
    /* parentKeyword */ String, 
    /* parentSchema */ js.Object, 
    /* keyIndex */ String | Double, 
    Unit
  ]
  
  @js.native
  trait TraverseOptions extends StObject {
    
    /** Without option allKeys: true callback will be called only with root schema. */
    var allKeys: js.UndefOr[Boolean] = js.native
    
    /**
      * Callback function `cb` is called for each schema object (not including draft-06 boolean schemas),
      * including the root schema, in pre-order traversal. Schema references (`$ref`) are not resolved,
      * they are passed as is. Alternatively, you can pass a `{pre, post}` object as `cb`, and then `pre`
      * will be called before traversing child elements, and `post` will be called
      * after all child elementshave been traversed.
      */
    var cb: js.UndefOr[TraverseCallback] = js.native
  }
  object TraverseOptions {
    
    @scala.inline
    def apply(): TraverseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TraverseOptions]
    }
    
    @scala.inline
    implicit class TraverseOptionsMutableBuilder[Self <: TraverseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllKeys(value: Boolean): Self = StObject.set(x, "allKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllKeysUndefined: Self = StObject.set(x, "allKeys", js.undefined)
      
      @scala.inline
      def setCb(value: TraverseCallback): Self = StObject.set(x, "cb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCbFunction7(
        value: (/* schema */ js.Object, /* jsonPtr */ String, /* rootSchema */ js.Object, /* parentJsonPtr */ String, /* parentKeyword */ String, /* parentSchema */ js.Object, /* keyIndex */ String | Double) => Unit
      ): Self = StObject.set(x, "cb", js.Any.fromFunction7(value))
      
      @scala.inline
      def setCbUndefined: Self = StObject.set(x, "cb", js.undefined)
    }
  }
}
