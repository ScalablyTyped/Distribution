package typings.jsonSchemaFaker

import typings.jsonSchema.mod.JSONSchema4
import typings.jsonSchema.mod.JSONSchema6
import typings.jsonSchema.mod.JSONSchema7
import typings.jsonSchemaFaker.anon.Callback
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** @deprecated calling JsonSchemaFaker() is deprecated, call either .generate() or .resolve()' */
  @scala.inline
  def apply(schema: Schema): js.Any = ^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def apply(schema: Schema, refs: String): js.Any = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], refs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def apply(schema: Schema, refs: js.Array[Schema]): js.Any = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], refs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @JSImport("json-schema-faker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def define(name: String, cb: js.Function0[Unit]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def extend(name: String, cb: js.Function0[Unit]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(name.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def format(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("format")().asInstanceOf[js.Any]
  @scala.inline
  def format(nameOrFormatMap: Unit, callback: js.Function1[/* schema */ js.UndefOr[Schema], Unit]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(nameOrFormatMap.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def format(nameOrFormatMap: NameOrFormatMap): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(nameOrFormatMap.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def format(nameOrFormatMap: NameOrFormatMap, callback: js.Function1[/* schema */ js.UndefOr[Schema], Unit]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(nameOrFormatMap.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def generate(schema: Schema): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(schema.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def generate(schema: Schema, refs: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(schema.asInstanceOf[js.Any], refs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def generate(schema: Schema, refs: js.Array[Schema]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(schema.asInstanceOf[js.Any], refs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def locate(name: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("locate")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def option(option: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("option")(option.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def option(option: String, value: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("option")(option.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def option(option: OptionInputObject): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("option")(option.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def option(option: OptionInputObject, value: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("option")(option.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  // jsf.random
  object random {
    
    @JSImport("json-schema-faker", "random")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def date(step: String): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("date")(step.asInstanceOf[js.Any]).asInstanceOf[Date]
    
    @scala.inline
    def number(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("number")().asInstanceOf[Double]
    @scala.inline
    def number(min: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def number(min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def number(min: Double, max: Double, defMin: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def number(min: Double, max: Double, defMin: Double, defMax: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def number(min: Double, max: Double, defMin: Double, defMax: Double, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def number(min: Double, max: Double, defMin: Double, defMax: Unit, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def number(min: Double, max: Double, defMin: Unit, defMax: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def number(min: Double, max: Double, defMin: Unit, defMax: Double, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def number(min: Double, max: Double, defMin: Unit, defMax: Unit, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def number(min: Double, max: Unit, defMin: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def number(min: Double, max: Unit, defMin: Double, defMax: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def number(min: Double, max: Unit, defMin: Double, defMax: Double, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def number(min: Double, max: Unit, defMin: Double, defMax: Unit, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def number(min: Double, max: Unit, defMin: Unit, defMax: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def number(min: Double, max: Unit, defMin: Unit, defMax: Double, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def number(min: Double, max: Unit, defMin: Unit, defMax: Unit, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def number(min: Unit, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def number(min: Unit, max: Double, defMin: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def number(min: Unit, max: Double, defMin: Double, defMax: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def number(min: Unit, max: Double, defMin: Double, defMax: Double, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def number(min: Unit, max: Double, defMin: Double, defMax: Unit, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def number(min: Unit, max: Double, defMin: Unit, defMax: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def number(min: Unit, max: Double, defMin: Unit, defMax: Double, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def number(min: Unit, max: Double, defMin: Unit, defMax: Unit, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def number(min: Unit, max: Unit, defMin: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def number(min: Unit, max: Unit, defMin: Double, defMax: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def number(min: Unit, max: Unit, defMin: Double, defMax: Double, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def number(min: Unit, max: Unit, defMin: Double, defMax: Unit, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def number(min: Unit, max: Unit, defMin: Unit, defMax: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def number(min: Unit, max: Unit, defMin: Unit, defMax: Double, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def number(min: Unit, max: Unit, defMin: Unit, defMax: Unit, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def pick[T](collection: js.Array[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("pick")(collection.asInstanceOf[js.Any]).asInstanceOf[T]
    
    @scala.inline
    def randexp(value: String): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("randexp")(value.asInstanceOf[js.Any]).asInstanceOf[String | Double]
    
    @scala.inline
    def shuffle[T](collection: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(collection.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  }
  
  @scala.inline
  def reset(name: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def resolve(schema: Schema): js.Promise[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(schema.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[js.Any]]]
  @scala.inline
  def resolve(schema: Schema, refs: String): js.Promise[js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(schema.asInstanceOf[js.Any], refs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Any]]]
  @scala.inline
  def resolve(schema: Schema, refs: String, cwd: String): js.Promise[js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(schema.asInstanceOf[js.Any], refs.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Any]]]
  @scala.inline
  def resolve(schema: Schema, refs: js.Array[Schema]): js.Promise[js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(schema.asInstanceOf[js.Any], refs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Any]]]
  @scala.inline
  def resolve(schema: Schema, refs: js.Array[Schema], cwd: String): js.Promise[js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(schema.asInstanceOf[js.Any], refs.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Any]]]
  @scala.inline
  def resolve(schema: Schema, refs: Unit, cwd: String): js.Promise[js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(schema.asInstanceOf[js.Any], refs.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Any]]]
  
  @JSImport("json-schema-faker", "version")
  @js.native
  val version: String = js.native
  
  type NameOrFormatMap = String | Callback
  
  /* Inlined std.Partial<{[ option in json-schema-faker.json-schema-faker.jsfOptions ]: any}> */
  trait OptionInputObject extends StObject {
    
    var alwaysFakeOptionals: js.UndefOr[js.Any] = js.undefined
    
    var defaultInvalidTypeProduct: js.UndefOr[js.Any] = js.undefined
    
    var defaultRandExpMax: js.UndefOr[js.Any] = js.undefined
    
    var failOnInvalidFormat: js.UndefOr[js.Any] = js.undefined
    
    var failOnInvalidTypes: js.UndefOr[js.Any] = js.undefined
    
    var fillProperties: js.UndefOr[js.Any] = js.undefined
    
    var fixedProbabilities: js.UndefOr[js.Any] = js.undefined
    
    var ignoreMissingRefs: js.UndefOr[js.Any] = js.undefined
    
    var ignoreProperties: js.UndefOr[js.Any] = js.undefined
    
    var maxItems: js.UndefOr[js.Any] = js.undefined
    
    var maxLength: js.UndefOr[js.Any] = js.undefined
    
    var minItems: js.UndefOr[js.Any] = js.undefined
    
    var minLength: js.UndefOr[js.Any] = js.undefined
    
    var optionalsProbability: js.UndefOr[js.Any] = js.undefined
    
    var random: js.UndefOr[js.Any] = js.undefined
    
    var refDepthMax: js.UndefOr[js.Any] = js.undefined
    
    var refDepthMin: js.UndefOr[js.Any] = js.undefined
    
    var replaceEmptyByRandomValue: js.UndefOr[js.Any] = js.undefined
    
    var requiredOnly: js.UndefOr[js.Any] = js.undefined
    
    var resolveJsonPath: js.UndefOr[js.Any] = js.undefined
    
    var reuseProperties: js.UndefOr[js.Any] = js.undefined
    
    var useDefaultValue: js.UndefOr[js.Any] = js.undefined
    
    var useExamplesValue: js.UndefOr[js.Any] = js.undefined
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
