package typings.jsonSchemaFaker

import typings.jsonSchema.mod.JSONSchema4
import typings.jsonSchema.mod.JSONSchema6
import typings.jsonSchema.mod.JSONSchema7
import typings.jsonSchemaFaker.anon.Callback
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** @deprecated calling JsonSchemaFaker() is deprecated, call either .generate() or .resolve()' */
  @JSImport("json-schema-faker", JSImport.Namespace)
  @js.native
  def apply(schema: Schema): js.Any = js.native
  @JSImport("json-schema-faker", JSImport.Namespace)
  @js.native
  def apply(schema: Schema, refs: String): js.Any = js.native
  @JSImport("json-schema-faker", JSImport.Namespace)
  @js.native
  def apply(schema: Schema, refs: js.Array[Schema]): js.Any = js.native
  
  @JSImport("json-schema-faker", "define")
  @js.native
  def define(name: String, cb: js.Function0[Unit]): js.Any = js.native
  
  @JSImport("json-schema-faker", "extend")
  @js.native
  def extend(name: String, cb: js.Function0[Unit]): js.Any = js.native
  
  @JSImport("json-schema-faker", "format")
  @js.native
  def format(): js.Any = js.native
  @JSImport("json-schema-faker", "format")
  @js.native
  def format(nameOrFormatMap: js.UndefOr[NameOrFormatMap], callback: js.Function1[js.UndefOr[Schema], Unit]): js.Any = js.native
  @JSImport("json-schema-faker", "format")
  @js.native
  def format(nameOrFormatMap: NameOrFormatMap): js.Any = js.native
  
  @JSImport("json-schema-faker", "generate")
  @js.native
  def generate(schema: Schema): js.Any = js.native
  @JSImport("json-schema-faker", "generate")
  @js.native
  def generate(schema: Schema, refs: String): js.Any = js.native
  @JSImport("json-schema-faker", "generate")
  @js.native
  def generate(schema: Schema, refs: js.Array[Schema]): js.Any = js.native
  
  @JSImport("json-schema-faker", "locate")
  @js.native
  def locate(name: String): js.Any = js.native
  
  @JSImport("json-schema-faker", "option")
  @js.native
  def option(option: String): js.Any = js.native
  @JSImport("json-schema-faker", "option")
  @js.native
  def option(option: String, value: js.Any): js.Any = js.native
  @JSImport("json-schema-faker", "option")
  @js.native
  def option(option: OptionInputObject): js.Any = js.native
  @JSImport("json-schema-faker", "option")
  @js.native
  def option(option: OptionInputObject, value: js.Any): js.Any = js.native
  
  // jsf.random
  object random {
    
    @JSImport("json-schema-faker", "random.date")
    @js.native
    def date(step: String): Date = js.native
    
    @JSImport("json-schema-faker", "random.number")
    @js.native
    def number(): Double = js.native
    @JSImport("json-schema-faker", "random.number")
    @js.native
    def number(
      min: js.UndefOr[scala.Nothing],
      max: js.UndefOr[scala.Nothing],
      defMin: js.UndefOr[scala.Nothing],
      defMax: js.UndefOr[scala.Nothing],
      hasPrecision: Boolean
    ): Double = js.native
    @JSImport("json-schema-faker", "random.number")
    @js.native
    def number(
      min: js.UndefOr[scala.Nothing],
      max: js.UndefOr[scala.Nothing],
      defMin: js.UndefOr[scala.Nothing],
      defMax: Double
    ): Double = js.native
    @JSImport("json-schema-faker", "random.number")
    @js.native
    def number(
      min: js.UndefOr[scala.Nothing],
      max: js.UndefOr[scala.Nothing],
      defMin: js.UndefOr[scala.Nothing],
      defMax: Double,
      hasPrecision: Boolean
    ): Double = js.native
    @JSImport("json-schema-faker", "random.number")
    @js.native
    def number(min: js.UndefOr[scala.Nothing], max: js.UndefOr[scala.Nothing], defMin: Double): Double = js.native
    @JSImport("json-schema-faker", "random.number")
    @js.native
    def number(
      min: js.UndefOr[scala.Nothing],
      max: js.UndefOr[scala.Nothing],
      defMin: Double,
      defMax: js.UndefOr[scala.Nothing],
      hasPrecision: Boolean
    ): Double = js.native
    @JSImport("json-schema-faker", "random.number")
    @js.native
    def number(min: js.UndefOr[scala.Nothing], max: js.UndefOr[scala.Nothing], defMin: Double, defMax: Double): Double = js.native
    @JSImport("json-schema-faker", "random.number")
    @js.native
    def number(
      min: js.UndefOr[scala.Nothing],
      max: js.UndefOr[scala.Nothing],
      defMin: Double,
      defMax: Double,
      hasPrecision: Boolean
    ): Double = js.native
    @JSImport("json-schema-faker", "random.number")
    @js.native
    def number(min: js.UndefOr[scala.Nothing], max: Double): Double = js.native
    @JSImport("json-schema-faker", "random.number")
    @js.native
    def number(
      min: js.UndefOr[scala.Nothing],
      max: Double,
      defMin: js.UndefOr[scala.Nothing],
      defMax: js.UndefOr[scala.Nothing],
      hasPrecision: Boolean
    ): Double = js.native
    @JSImport("json-schema-faker", "random.number")
    @js.native
    def number(min: js.UndefOr[scala.Nothing], max: Double, defMin: js.UndefOr[scala.Nothing], defMax: Double): Double = js.native
    @JSImport("json-schema-faker", "random.number")
    @js.native
    def number(
      min: js.UndefOr[scala.Nothing],
      max: Double,
      defMin: js.UndefOr[scala.Nothing],
      defMax: Double,
      hasPrecision: Boolean
    ): Double = js.native
    @JSImport("json-schema-faker", "random.number")
    @js.native
    def number(min: js.UndefOr[scala.Nothing], max: Double, defMin: Double): Double = js.native
    @JSImport("json-schema-faker", "random.number")
    @js.native
    def number(
      min: js.UndefOr[scala.Nothing],
      max: Double,
      defMin: Double,
      defMax: js.UndefOr[scala.Nothing],
      hasPrecision: Boolean
    ): Double = js.native
    @JSImport("json-schema-faker", "random.number")
    @js.native
    def number(min: js.UndefOr[scala.Nothing], max: Double, defMin: Double, defMax: Double): Double = js.native
    @JSImport("json-schema-faker", "random.number")
    @js.native
    def number(min: js.UndefOr[scala.Nothing], max: Double, defMin: Double, defMax: Double, hasPrecision: Boolean): Double = js.native
    @JSImport("json-schema-faker", "random.number")
    @js.native
    def number(min: Double): Double = js.native
    @JSImport("json-schema-faker", "random.number")
    @js.native
    def number(
      min: Double,
      max: js.UndefOr[scala.Nothing],
      defMin: js.UndefOr[scala.Nothing],
      defMax: js.UndefOr[scala.Nothing],
      hasPrecision: Boolean
    ): Double = js.native
    @JSImport("json-schema-faker", "random.number")
    @js.native
    def number(min: Double, max: js.UndefOr[scala.Nothing], defMin: js.UndefOr[scala.Nothing], defMax: Double): Double = js.native
    @JSImport("json-schema-faker", "random.number")
    @js.native
    def number(
      min: Double,
      max: js.UndefOr[scala.Nothing],
      defMin: js.UndefOr[scala.Nothing],
      defMax: Double,
      hasPrecision: Boolean
    ): Double = js.native
    @JSImport("json-schema-faker", "random.number")
    @js.native
    def number(min: Double, max: js.UndefOr[scala.Nothing], defMin: Double): Double = js.native
    @JSImport("json-schema-faker", "random.number")
    @js.native
    def number(
      min: Double,
      max: js.UndefOr[scala.Nothing],
      defMin: Double,
      defMax: js.UndefOr[scala.Nothing],
      hasPrecision: Boolean
    ): Double = js.native
    @JSImport("json-schema-faker", "random.number")
    @js.native
    def number(min: Double, max: js.UndefOr[scala.Nothing], defMin: Double, defMax: Double): Double = js.native
    @JSImport("json-schema-faker", "random.number")
    @js.native
    def number(min: Double, max: js.UndefOr[scala.Nothing], defMin: Double, defMax: Double, hasPrecision: Boolean): Double = js.native
    @JSImport("json-schema-faker", "random.number")
    @js.native
    def number(min: Double, max: Double): Double = js.native
    @JSImport("json-schema-faker", "random.number")
    @js.native
    def number(
      min: Double,
      max: Double,
      defMin: js.UndefOr[scala.Nothing],
      defMax: js.UndefOr[scala.Nothing],
      hasPrecision: Boolean
    ): Double = js.native
    @JSImport("json-schema-faker", "random.number")
    @js.native
    def number(min: Double, max: Double, defMin: js.UndefOr[scala.Nothing], defMax: Double): Double = js.native
    @JSImport("json-schema-faker", "random.number")
    @js.native
    def number(min: Double, max: Double, defMin: js.UndefOr[scala.Nothing], defMax: Double, hasPrecision: Boolean): Double = js.native
    @JSImport("json-schema-faker", "random.number")
    @js.native
    def number(min: Double, max: Double, defMin: Double): Double = js.native
    @JSImport("json-schema-faker", "random.number")
    @js.native
    def number(min: Double, max: Double, defMin: Double, defMax: js.UndefOr[scala.Nothing], hasPrecision: Boolean): Double = js.native
    @JSImport("json-schema-faker", "random.number")
    @js.native
    def number(min: Double, max: Double, defMin: Double, defMax: Double): Double = js.native
    @JSImport("json-schema-faker", "random.number")
    @js.native
    def number(min: Double, max: Double, defMin: Double, defMax: Double, hasPrecision: Boolean): Double = js.native
    
    @JSImport("json-schema-faker", "random.pick")
    @js.native
    def pick[T](collection: js.Array[T]): T = js.native
    
    @JSImport("json-schema-faker", "random.randexp")
    @js.native
    def randexp(value: String): String | Double = js.native
    
    @JSImport("json-schema-faker", "random.shuffle")
    @js.native
    def shuffle[T](collection: js.Array[T]): js.Array[T] = js.native
  }
  
  @JSImport("json-schema-faker", "reset")
  @js.native
  def reset(name: String): js.Any = js.native
  
  @JSImport("json-schema-faker", "resolve")
  @js.native
  def resolve(schema: Schema): js.Promise[js.Array[_]] = js.native
  @JSImport("json-schema-faker", "resolve")
  @js.native
  def resolve(schema: Schema, refs: js.UndefOr[scala.Nothing], cwd: String): js.Promise[js.Array[_]] = js.native
  @JSImport("json-schema-faker", "resolve")
  @js.native
  def resolve(schema: Schema, refs: String): js.Promise[js.Array[_]] = js.native
  @JSImport("json-schema-faker", "resolve")
  @js.native
  def resolve(schema: Schema, refs: String, cwd: String): js.Promise[js.Array[_]] = js.native
  @JSImport("json-schema-faker", "resolve")
  @js.native
  def resolve(schema: Schema, refs: js.Array[Schema]): js.Promise[js.Array[_]] = js.native
  @JSImport("json-schema-faker", "resolve")
  @js.native
  def resolve(schema: Schema, refs: js.Array[Schema], cwd: String): js.Promise[js.Array[_]] = js.native
  
  @JSImport("json-schema-faker", "version")
  @js.native
  val version: String = js.native
  
  type NameOrFormatMap = String | Callback
  
  /* Inlined std.Partial<{[ option in json-schema-faker.json-schema-faker.jsfOptions ]: any}> */
  @js.native
  trait OptionInputObject extends StObject {
    
    var alwaysFakeOptionals: js.UndefOr[js.Any] = js.native
    
    var defaultInvalidTypeProduct: js.UndefOr[js.Any] = js.native
    
    var defaultRandExpMax: js.UndefOr[js.Any] = js.native
    
    var failOnInvalidFormat: js.UndefOr[js.Any] = js.native
    
    var failOnInvalidTypes: js.UndefOr[js.Any] = js.native
    
    var fillProperties: js.UndefOr[js.Any] = js.native
    
    var fixedProbabilities: js.UndefOr[js.Any] = js.native
    
    var ignoreMissingRefs: js.UndefOr[js.Any] = js.native
    
    var ignoreProperties: js.UndefOr[js.Any] = js.native
    
    var maxItems: js.UndefOr[js.Any] = js.native
    
    var maxLength: js.UndefOr[js.Any] = js.native
    
    var minItems: js.UndefOr[js.Any] = js.native
    
    var minLength: js.UndefOr[js.Any] = js.native
    
    var optionalsProbability: js.UndefOr[js.Any] = js.native
    
    var random: js.UndefOr[js.Any] = js.native
    
    var refDepthMax: js.UndefOr[js.Any] = js.native
    
    var refDepthMin: js.UndefOr[js.Any] = js.native
    
    var replaceEmptyByRandomValue: js.UndefOr[js.Any] = js.native
    
    var requiredOnly: js.UndefOr[js.Any] = js.native
    
    var resolveJsonPath: js.UndefOr[js.Any] = js.native
    
    var reuseProperties: js.UndefOr[js.Any] = js.native
    
    var useDefaultValue: js.UndefOr[js.Any] = js.native
    
    var useExamplesValue: js.UndefOr[js.Any] = js.native
  }
  object OptionInputObject {
    
    @scala.inline
    def apply(): OptionInputObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionInputObject]
    }
    
    @scala.inline
    implicit class OptionInputObjectMutableBuilder[Self <: OptionInputObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysFakeOptionals(value: js.Any): Self = StObject.set(x, "alwaysFakeOptionals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysFakeOptionalsUndefined: Self = StObject.set(x, "alwaysFakeOptionals", js.undefined)
      
      @scala.inline
      def setDefaultInvalidTypeProduct(value: js.Any): Self = StObject.set(x, "defaultInvalidTypeProduct", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultInvalidTypeProductUndefined: Self = StObject.set(x, "defaultInvalidTypeProduct", js.undefined)
      
      @scala.inline
      def setDefaultRandExpMax(value: js.Any): Self = StObject.set(x, "defaultRandExpMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultRandExpMaxUndefined: Self = StObject.set(x, "defaultRandExpMax", js.undefined)
      
      @scala.inline
      def setFailOnInvalidFormat(value: js.Any): Self = StObject.set(x, "failOnInvalidFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailOnInvalidFormatUndefined: Self = StObject.set(x, "failOnInvalidFormat", js.undefined)
      
      @scala.inline
      def setFailOnInvalidTypes(value: js.Any): Self = StObject.set(x, "failOnInvalidTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailOnInvalidTypesUndefined: Self = StObject.set(x, "failOnInvalidTypes", js.undefined)
      
      @scala.inline
      def setFillProperties(value: js.Any): Self = StObject.set(x, "fillProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillPropertiesUndefined: Self = StObject.set(x, "fillProperties", js.undefined)
      
      @scala.inline
      def setFixedProbabilities(value: js.Any): Self = StObject.set(x, "fixedProbabilities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedProbabilitiesUndefined: Self = StObject.set(x, "fixedProbabilities", js.undefined)
      
      @scala.inline
      def setIgnoreMissingRefs(value: js.Any): Self = StObject.set(x, "ignoreMissingRefs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreMissingRefsUndefined: Self = StObject.set(x, "ignoreMissingRefs", js.undefined)
      
      @scala.inline
      def setIgnoreProperties(value: js.Any): Self = StObject.set(x, "ignoreProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnorePropertiesUndefined: Self = StObject.set(x, "ignoreProperties", js.undefined)
      
      @scala.inline
      def setMaxItems(value: js.Any): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
      
      @scala.inline
      def setMaxLength(value: js.Any): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setMinItems(value: js.Any): Self = StObject.set(x, "minItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinItemsUndefined: Self = StObject.set(x, "minItems", js.undefined)
      
      @scala.inline
      def setMinLength(value: js.Any): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      @scala.inline
      def setOptionalsProbability(value: js.Any): Self = StObject.set(x, "optionalsProbability", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalsProbabilityUndefined: Self = StObject.set(x, "optionalsProbability", js.undefined)
      
      @scala.inline
      def setRandom(value: js.Any): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRandomUndefined: Self = StObject.set(x, "random", js.undefined)
      
      @scala.inline
      def setRefDepthMax(value: js.Any): Self = StObject.set(x, "refDepthMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefDepthMaxUndefined: Self = StObject.set(x, "refDepthMax", js.undefined)
      
      @scala.inline
      def setRefDepthMin(value: js.Any): Self = StObject.set(x, "refDepthMin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefDepthMinUndefined: Self = StObject.set(x, "refDepthMin", js.undefined)
      
      @scala.inline
      def setReplaceEmptyByRandomValue(value: js.Any): Self = StObject.set(x, "replaceEmptyByRandomValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceEmptyByRandomValueUndefined: Self = StObject.set(x, "replaceEmptyByRandomValue", js.undefined)
      
      @scala.inline
      def setRequiredOnly(value: js.Any): Self = StObject.set(x, "requiredOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredOnlyUndefined: Self = StObject.set(x, "requiredOnly", js.undefined)
      
      @scala.inline
      def setResolveJsonPath(value: js.Any): Self = StObject.set(x, "resolveJsonPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveJsonPathUndefined: Self = StObject.set(x, "resolveJsonPath", js.undefined)
      
      @scala.inline
      def setReuseProperties(value: js.Any): Self = StObject.set(x, "reuseProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReusePropertiesUndefined: Self = StObject.set(x, "reuseProperties", js.undefined)
      
      @scala.inline
      def setUseDefaultValue(value: js.Any): Self = StObject.set(x, "useDefaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseDefaultValueUndefined: Self = StObject.set(x, "useDefaultValue", js.undefined)
      
      @scala.inline
      def setUseExamplesValue(value: js.Any): Self = StObject.set(x, "useExamplesValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseExamplesValueUndefined: Self = StObject.set(x, "useExamplesValue", js.undefined)
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
    
    @scala.inline
    def alwaysFakeOptionals: typings.jsonSchemaFaker.jsonSchemaFakerStrings.alwaysFakeOptionals = "alwaysFakeOptionals".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.alwaysFakeOptionals]
    
    @scala.inline
    def defaultInvalidTypeProduct: typings.jsonSchemaFaker.jsonSchemaFakerStrings.defaultInvalidTypeProduct = "defaultInvalidTypeProduct".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.defaultInvalidTypeProduct]
    
    @scala.inline
    def defaultRandExpMax: typings.jsonSchemaFaker.jsonSchemaFakerStrings.defaultRandExpMax = "defaultRandExpMax".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.defaultRandExpMax]
    
    @scala.inline
    def failOnInvalidFormat: typings.jsonSchemaFaker.jsonSchemaFakerStrings.failOnInvalidFormat = "failOnInvalidFormat".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.failOnInvalidFormat]
    
    @scala.inline
    def failOnInvalidTypes: typings.jsonSchemaFaker.jsonSchemaFakerStrings.failOnInvalidTypes = "failOnInvalidTypes".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.failOnInvalidTypes]
    
    @scala.inline
    def fillProperties: typings.jsonSchemaFaker.jsonSchemaFakerStrings.fillProperties = "fillProperties".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.fillProperties]
    
    @scala.inline
    def fixedProbabilities: typings.jsonSchemaFaker.jsonSchemaFakerStrings.fixedProbabilities = "fixedProbabilities".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.fixedProbabilities]
    
    @scala.inline
    def ignoreMissingRefs: typings.jsonSchemaFaker.jsonSchemaFakerStrings.ignoreMissingRefs = "ignoreMissingRefs".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.ignoreMissingRefs]
    
    @scala.inline
    def ignoreProperties: typings.jsonSchemaFaker.jsonSchemaFakerStrings.ignoreProperties = "ignoreProperties".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.ignoreProperties]
    
    @scala.inline
    def maxItems: typings.jsonSchemaFaker.jsonSchemaFakerStrings.maxItems = "maxItems".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.maxItems]
    
    @scala.inline
    def maxLength: typings.jsonSchemaFaker.jsonSchemaFakerStrings.maxLength = "maxLength".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.maxLength]
    
    @scala.inline
    def minItems: typings.jsonSchemaFaker.jsonSchemaFakerStrings.minItems = "minItems".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.minItems]
    
    @scala.inline
    def minLength: typings.jsonSchemaFaker.jsonSchemaFakerStrings.minLength = "minLength".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.minLength]
    
    @scala.inline
    def optionalsProbability: typings.jsonSchemaFaker.jsonSchemaFakerStrings.optionalsProbability = "optionalsProbability".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.optionalsProbability]
    
    @scala.inline
    def random: typings.jsonSchemaFaker.jsonSchemaFakerStrings.random = "random".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.random]
    
    @scala.inline
    def refDepthMax: typings.jsonSchemaFaker.jsonSchemaFakerStrings.refDepthMax = "refDepthMax".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.refDepthMax]
    
    @scala.inline
    def refDepthMin: typings.jsonSchemaFaker.jsonSchemaFakerStrings.refDepthMin = "refDepthMin".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.refDepthMin]
    
    @scala.inline
    def replaceEmptyByRandomValue: typings.jsonSchemaFaker.jsonSchemaFakerStrings.replaceEmptyByRandomValue = "replaceEmptyByRandomValue".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.replaceEmptyByRandomValue]
    
    @scala.inline
    def requiredOnly: typings.jsonSchemaFaker.jsonSchemaFakerStrings.requiredOnly = "requiredOnly".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.requiredOnly]
    
    @scala.inline
    def resolveJsonPath: typings.jsonSchemaFaker.jsonSchemaFakerStrings.resolveJsonPath = "resolveJsonPath".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.resolveJsonPath]
    
    @scala.inline
    def reuseProperties: typings.jsonSchemaFaker.jsonSchemaFakerStrings.reuseProperties = "reuseProperties".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.reuseProperties]
    
    @scala.inline
    def useDefaultValue: typings.jsonSchemaFaker.jsonSchemaFakerStrings.useDefaultValue = "useDefaultValue".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.useDefaultValue]
    
    @scala.inline
    def useExamplesValue: typings.jsonSchemaFaker.jsonSchemaFakerStrings.useExamplesValue = "useExamplesValue".asInstanceOf[typings.jsonSchemaFaker.jsonSchemaFakerStrings.useExamplesValue]
  }
}
