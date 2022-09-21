package typings.jsonSchemaFaker

import typings.jsonSchema.mod.JSONSchema4
import typings.jsonSchema.mod.JSONSchema6
import typings.jsonSchema.mod.JSONSchema7
import typings.jsonSchemaFaker.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** @deprecated calling JsonSchemaFaker() is deprecated, call either .generate() or .resolve()' */
  inline def apply(schema: Schema): Any = ^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def apply(schema: Schema, refs: String): Any = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], refs.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(schema: Schema, refs: js.Array[Schema]): Any = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], refs.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("json-schema-faker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def define(name: String, cb: js.Function0[Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def extend(name: String, cb: js.Function0[Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(name.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def format(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("format")().asInstanceOf[Any]
  inline def format(nameOrFormatMap: Unit, callback: js.Function1[/* schema */ js.UndefOr[Schema], Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(nameOrFormatMap.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def format(nameOrFormatMap: NameOrFormatMap): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(nameOrFormatMap.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def format(nameOrFormatMap: NameOrFormatMap, callback: js.Function1[/* schema */ js.UndefOr[Schema], Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(nameOrFormatMap.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def generate(schema: Schema): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(schema.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def generate(schema: Schema, refs: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(schema.asInstanceOf[js.Any], refs.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def generate(schema: Schema, refs: js.Array[Schema]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(schema.asInstanceOf[js.Any], refs.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def locate(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("locate")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def option(option: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("option")(option.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def option(option: String, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("option")(option.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def option(option: OptionInputObject): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("option")(option.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def option(option: OptionInputObject, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("option")(option.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  // jsf.random
  object random {
    
    @JSImport("json-schema-faker", "random")
    @js.native
    val ^ : js.Any = js.native
    
    inline def date(step: String): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("date")(step.asInstanceOf[js.Any]).asInstanceOf[js.Date]
    
    inline def number(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("number")().asInstanceOf[Double]
    inline def number(min: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def number(min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def number(min: Double, max: Double, defMin: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def number(min: Double, max: Double, defMin: Double, defMax: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def number(min: Double, max: Double, defMin: Double, defMax: Double, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def number(min: Double, max: Double, defMin: Double, defMax: Unit, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def number(min: Double, max: Double, defMin: Unit, defMax: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def number(min: Double, max: Double, defMin: Unit, defMax: Double, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def number(min: Double, max: Double, defMin: Unit, defMax: Unit, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def number(min: Double, max: Unit, defMin: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def number(min: Double, max: Unit, defMin: Double, defMax: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def number(min: Double, max: Unit, defMin: Double, defMax: Double, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def number(min: Double, max: Unit, defMin: Double, defMax: Unit, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def number(min: Double, max: Unit, defMin: Unit, defMax: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def number(min: Double, max: Unit, defMin: Unit, defMax: Double, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def number(min: Double, max: Unit, defMin: Unit, defMax: Unit, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def number(min: Unit, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def number(min: Unit, max: Double, defMin: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def number(min: Unit, max: Double, defMin: Double, defMax: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def number(min: Unit, max: Double, defMin: Double, defMax: Double, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def number(min: Unit, max: Double, defMin: Double, defMax: Unit, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def number(min: Unit, max: Double, defMin: Unit, defMax: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def number(min: Unit, max: Double, defMin: Unit, defMax: Double, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def number(min: Unit, max: Double, defMin: Unit, defMax: Unit, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def number(min: Unit, max: Unit, defMin: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def number(min: Unit, max: Unit, defMin: Double, defMax: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def number(min: Unit, max: Unit, defMin: Double, defMax: Double, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def number(min: Unit, max: Unit, defMin: Double, defMax: Unit, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def number(min: Unit, max: Unit, defMin: Unit, defMax: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def number(min: Unit, max: Unit, defMin: Unit, defMax: Double, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def number(min: Unit, max: Unit, defMin: Unit, defMax: Unit, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def pick[T](collection: js.Array[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("pick")(collection.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def randexp(value: String): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("randexp")(value.asInstanceOf[js.Any]).asInstanceOf[String | Double]
    
    inline def shuffle[T](collection: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(collection.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  }
  
  inline def reset(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def resolve(schema: Schema): js.Promise[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(schema.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Any]]]
  inline def resolve(schema: Schema, refs: String): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(schema.asInstanceOf[js.Any], refs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
  inline def resolve(schema: Schema, refs: String, cwd: String): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(schema.asInstanceOf[js.Any], refs.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
  inline def resolve(schema: Schema, refs: js.Array[Schema]): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(schema.asInstanceOf[js.Any], refs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
  inline def resolve(schema: Schema, refs: js.Array[Schema], cwd: String): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(schema.asInstanceOf[js.Any], refs.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
  inline def resolve(schema: Schema, refs: Unit, cwd: String): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(schema.asInstanceOf[js.Any], refs.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
  
  @JSImport("json-schema-faker", "version")
  @js.native
  val version: String = js.native
  
  type NameOrFormatMap = String | Callback
  
  /* Inlined std.Partial<{[ option in json-schema-faker.json-schema-faker.jsfOptions ]: any}> */
  trait OptionInputObject extends StObject {
    
    var alwaysFakeOptionals: js.UndefOr[Any] = js.undefined
    
    var defaultInvalidTypeProduct: js.UndefOr[Any] = js.undefined
    
    var defaultRandExpMax: js.UndefOr[Any] = js.undefined
    
    var failOnInvalidFormat: js.UndefOr[Any] = js.undefined
    
    var failOnInvalidTypes: js.UndefOr[Any] = js.undefined
    
    var fillProperties: js.UndefOr[Any] = js.undefined
    
    var fixedProbabilities: js.UndefOr[Any] = js.undefined
    
    var ignoreMissingRefs: js.UndefOr[Any] = js.undefined
    
    var ignoreProperties: js.UndefOr[Any] = js.undefined
    
    var maxItems: js.UndefOr[Any] = js.undefined
    
    var maxLength: js.UndefOr[Any] = js.undefined
    
    var minItems: js.UndefOr[Any] = js.undefined
    
    var minLength: js.UndefOr[Any] = js.undefined
    
    var optionalsProbability: js.UndefOr[Any] = js.undefined
    
    var random: js.UndefOr[Any] = js.undefined
    
    var refDepthMax: js.UndefOr[Any] = js.undefined
    
    var refDepthMin: js.UndefOr[Any] = js.undefined
    
    var replaceEmptyByRandomValue: js.UndefOr[Any] = js.undefined
    
    var requiredOnly: js.UndefOr[Any] = js.undefined
    
    var resolveJsonPath: js.UndefOr[Any] = js.undefined
    
    var reuseProperties: js.UndefOr[Any] = js.undefined
    
    var useDefaultValue: js.UndefOr[Any] = js.undefined
    
    var useExamplesValue: js.UndefOr[Any] = js.undefined
  }
  object OptionInputObject {
    
    inline def apply(): OptionInputObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionInputObject]
    }
    
    extension [Self <: OptionInputObject](x: Self) {
      
      inline def setAlwaysFakeOptionals(value: Any): Self = StObject.set(x, "alwaysFakeOptionals", value.asInstanceOf[js.Any])
      
      inline def setAlwaysFakeOptionalsUndefined: Self = StObject.set(x, "alwaysFakeOptionals", js.undefined)
      
      inline def setDefaultInvalidTypeProduct(value: Any): Self = StObject.set(x, "defaultInvalidTypeProduct", value.asInstanceOf[js.Any])
      
      inline def setDefaultInvalidTypeProductUndefined: Self = StObject.set(x, "defaultInvalidTypeProduct", js.undefined)
      
      inline def setDefaultRandExpMax(value: Any): Self = StObject.set(x, "defaultRandExpMax", value.asInstanceOf[js.Any])
      
      inline def setDefaultRandExpMaxUndefined: Self = StObject.set(x, "defaultRandExpMax", js.undefined)
      
      inline def setFailOnInvalidFormat(value: Any): Self = StObject.set(x, "failOnInvalidFormat", value.asInstanceOf[js.Any])
      
      inline def setFailOnInvalidFormatUndefined: Self = StObject.set(x, "failOnInvalidFormat", js.undefined)
      
      inline def setFailOnInvalidTypes(value: Any): Self = StObject.set(x, "failOnInvalidTypes", value.asInstanceOf[js.Any])
      
      inline def setFailOnInvalidTypesUndefined: Self = StObject.set(x, "failOnInvalidTypes", js.undefined)
      
      inline def setFillProperties(value: Any): Self = StObject.set(x, "fillProperties", value.asInstanceOf[js.Any])
      
      inline def setFillPropertiesUndefined: Self = StObject.set(x, "fillProperties", js.undefined)
      
      inline def setFixedProbabilities(value: Any): Self = StObject.set(x, "fixedProbabilities", value.asInstanceOf[js.Any])
      
      inline def setFixedProbabilitiesUndefined: Self = StObject.set(x, "fixedProbabilities", js.undefined)
      
      inline def setIgnoreMissingRefs(value: Any): Self = StObject.set(x, "ignoreMissingRefs", value.asInstanceOf[js.Any])
      
      inline def setIgnoreMissingRefsUndefined: Self = StObject.set(x, "ignoreMissingRefs", js.undefined)
      
      inline def setIgnoreProperties(value: Any): Self = StObject.set(x, "ignoreProperties", value.asInstanceOf[js.Any])
      
      inline def setIgnorePropertiesUndefined: Self = StObject.set(x, "ignoreProperties", js.undefined)
      
      inline def setMaxItems(value: Any): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
      
      inline def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
      
      inline def setMaxLength(value: Any): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMinItems(value: Any): Self = StObject.set(x, "minItems", value.asInstanceOf[js.Any])
      
      inline def setMinItemsUndefined: Self = StObject.set(x, "minItems", js.undefined)
      
      inline def setMinLength(value: Any): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setOptionalsProbability(value: Any): Self = StObject.set(x, "optionalsProbability", value.asInstanceOf[js.Any])
      
      inline def setOptionalsProbabilityUndefined: Self = StObject.set(x, "optionalsProbability", js.undefined)
      
      inline def setRandom(value: Any): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
      
      inline def setRandomUndefined: Self = StObject.set(x, "random", js.undefined)
      
      inline def setRefDepthMax(value: Any): Self = StObject.set(x, "refDepthMax", value.asInstanceOf[js.Any])
      
      inline def setRefDepthMaxUndefined: Self = StObject.set(x, "refDepthMax", js.undefined)
      
      inline def setRefDepthMin(value: Any): Self = StObject.set(x, "refDepthMin", value.asInstanceOf[js.Any])
      
      inline def setRefDepthMinUndefined: Self = StObject.set(x, "refDepthMin", js.undefined)
      
      inline def setReplaceEmptyByRandomValue(value: Any): Self = StObject.set(x, "replaceEmptyByRandomValue", value.asInstanceOf[js.Any])
      
      inline def setReplaceEmptyByRandomValueUndefined: Self = StObject.set(x, "replaceEmptyByRandomValue", js.undefined)
      
      inline def setRequiredOnly(value: Any): Self = StObject.set(x, "requiredOnly", value.asInstanceOf[js.Any])
      
      inline def setRequiredOnlyUndefined: Self = StObject.set(x, "requiredOnly", js.undefined)
      
      inline def setResolveJsonPath(value: Any): Self = StObject.set(x, "resolveJsonPath", value.asInstanceOf[js.Any])
      
      inline def setResolveJsonPathUndefined: Self = StObject.set(x, "resolveJsonPath", js.undefined)
      
      inline def setReuseProperties(value: Any): Self = StObject.set(x, "reuseProperties", value.asInstanceOf[js.Any])
      
      inline def setReusePropertiesUndefined: Self = StObject.set(x, "reuseProperties", js.undefined)
      
      inline def setUseDefaultValue(value: Any): Self = StObject.set(x, "useDefaultValue", value.asInstanceOf[js.Any])
      
      inline def setUseDefaultValueUndefined: Self = StObject.set(x, "useDefaultValue", js.undefined)
      
      inline def setUseExamplesValue(value: Any): Self = StObject.set(x, "useExamplesValue", value.asInstanceOf[js.Any])
      
      inline def setUseExamplesValueUndefined: Self = StObject.set(x, "useExamplesValue", js.undefined)
    }
  }
  
  type Schema = JSONSchema4 | JSONSchema6 | JSONSchema7
  
  // List of all valid registerable options.
  /* Rewritten from type alias, can be one of: 
    - typings.jsonSchemaFaker.jsonSchemaFakerStrings.defaultInvalidTypeProduct
    - typings.jsonSchemaFaker.jsonSchemaFakerStrings.defaultRandExpMax
    - typings.jsonSchemaFaker.jsonSchemaFakerStrings.ignoreProperties
    - typings.jsonSchemaFaker.jsonSchemaFakerStrings.ignoreMissingRefs
    - typings.jsonSchemaFaker.jsonSchemaFakerStrings.failOnInvalidTypes
    - typings.jsonSchemaFaker.jsonSchemaFakerStrings.failOnInvalidFormat
    - typings.jsonSchemaFaker.jsonSchemaFakerStrings.alwaysFakeOptionals
    - typings.jsonSchemaFaker.jsonSchemaFakerStrings.optionalsProbability
    - typings.jsonSchemaFaker.jsonSchemaFakerStrings.fixedProbabilities
    - typings.jsonSchemaFaker.jsonSchemaFakerStrings.useExamplesValue
    - typings.jsonSchemaFaker.jsonSchemaFakerStrings.useDefaultValue
    - typings.jsonSchemaFaker.jsonSchemaFakerStrings.requiredOnly
    - typings.jsonSchemaFaker.jsonSchemaFakerStrings.minItems
    - typings.jsonSchemaFaker.jsonSchemaFakerStrings.maxItems
    - typings.jsonSchemaFaker.jsonSchemaFakerStrings.minLength
    - typings.jsonSchemaFaker.jsonSchemaFakerStrings.maxLength
    - typings.jsonSchemaFaker.jsonSchemaFakerStrings.refDepthMin
    - typings.jsonSchemaFaker.jsonSchemaFakerStrings.refDepthMax
    - typings.jsonSchemaFaker.jsonSchemaFakerStrings.resolveJsonPath
    - typings.jsonSchemaFaker.jsonSchemaFakerStrings.reuseProperties
    - typings.jsonSchemaFaker.jsonSchemaFakerStrings.fillProperties
    - typings.jsonSchemaFaker.jsonSchemaFakerStrings.random
    - typings.jsonSchemaFaker.jsonSchemaFakerStrings.replaceEmptyByRandomValue
  */
  trait jsfOptions extends StObject
  object jsfOptions {
    
    inline def alwaysFakeOptionals: typings.jsonSchemaFaker.jsonSchemaFakerStrings.alwaysFakeOptionals = "alwaysFakeOptionals".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.alwaysFakeOptionals]
    
    inline def defaultInvalidTypeProduct: typings.jsonSchemaFaker.jsonSchemaFakerStrings.defaultInvalidTypeProduct = "defaultInvalidTypeProduct".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.defaultInvalidTypeProduct]
    
    inline def defaultRandExpMax: typings.jsonSchemaFaker.jsonSchemaFakerStrings.defaultRandExpMax = "defaultRandExpMax".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.defaultRandExpMax]
    
    inline def failOnInvalidFormat: typings.jsonSchemaFaker.jsonSchemaFakerStrings.failOnInvalidFormat = "failOnInvalidFormat".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.failOnInvalidFormat]
    
    inline def failOnInvalidTypes: typings.jsonSchemaFaker.jsonSchemaFakerStrings.failOnInvalidTypes = "failOnInvalidTypes".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.failOnInvalidTypes]
    
    inline def fillProperties: typings.jsonSchemaFaker.jsonSchemaFakerStrings.fillProperties = "fillProperties".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.fillProperties]
    
    inline def fixedProbabilities: typings.jsonSchemaFaker.jsonSchemaFakerStrings.fixedProbabilities = "fixedProbabilities".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.fixedProbabilities]
    
    inline def ignoreMissingRefs: typings.jsonSchemaFaker.jsonSchemaFakerStrings.ignoreMissingRefs = "ignoreMissingRefs".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.ignoreMissingRefs]
    
    inline def ignoreProperties: typings.jsonSchemaFaker.jsonSchemaFakerStrings.ignoreProperties = "ignoreProperties".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.ignoreProperties]
    
    inline def maxItems: typings.jsonSchemaFaker.jsonSchemaFakerStrings.maxItems = "maxItems".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.maxItems]
    
    inline def maxLength: typings.jsonSchemaFaker.jsonSchemaFakerStrings.maxLength = "maxLength".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.maxLength]
    
    inline def minItems: typings.jsonSchemaFaker.jsonSchemaFakerStrings.minItems = "minItems".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.minItems]
    
    inline def minLength: typings.jsonSchemaFaker.jsonSchemaFakerStrings.minLength = "minLength".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.minLength]
    
    inline def optionalsProbability: typings.jsonSchemaFaker.jsonSchemaFakerStrings.optionalsProbability = "optionalsProbability".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.optionalsProbability]
    
    inline def random: typings.jsonSchemaFaker.jsonSchemaFakerStrings.random = "random".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.random]
    
    inline def refDepthMax: typings.jsonSchemaFaker.jsonSchemaFakerStrings.refDepthMax = "refDepthMax".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.refDepthMax]
    
    inline def refDepthMin: typings.jsonSchemaFaker.jsonSchemaFakerStrings.refDepthMin = "refDepthMin".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.refDepthMin]
    
    inline def replaceEmptyByRandomValue: typings.jsonSchemaFaker.jsonSchemaFakerStrings.replaceEmptyByRandomValue = "replaceEmptyByRandomValue".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.replaceEmptyByRandomValue]
    
    inline def requiredOnly: typings.jsonSchemaFaker.jsonSchemaFakerStrings.requiredOnly = "requiredOnly".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.requiredOnly]
    
    inline def resolveJsonPath: typings.jsonSchemaFaker.jsonSchemaFakerStrings.resolveJsonPath = "resolveJsonPath".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.resolveJsonPath]
    
    inline def reuseProperties: typings.jsonSchemaFaker.jsonSchemaFakerStrings.reuseProperties = "reuseProperties".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.reuseProperties]
    
    inline def useDefaultValue: typings.jsonSchemaFaker.jsonSchemaFakerStrings.useDefaultValue = "useDefaultValue".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.useDefaultValue]
    
    inline def useExamplesValue: typings.jsonSchemaFaker.jsonSchemaFakerStrings.useExamplesValue = "useExamplesValue".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.useExamplesValue]
  }
}
