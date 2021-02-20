package typings.jointjs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.anon.Amount
import typings.jointjs.anon.Angle
import typings.jointjs.anon.Blur
import typings.jointjs.anon.Dx
import typings.jointjs.anon.Ellipsis
import typings.jointjs.anon.Height
import typings.jointjs.anon.Margin
import typings.jointjs.anon.Scale
import typings.jointjs.anon.Y
import typings.jointjs.jointjsStrings.blur
import typings.jointjs.jointjsStrings.brightness
import typings.jointjs.jointjsStrings.contrast
import typings.jointjs.jointjsStrings.dropShadow
import typings.jointjs.jointjsStrings.grayscale
import typings.jointjs.jointjsStrings.highlight
import typings.jointjs.jointjsStrings.hueRotate
import typings.jointjs.jointjsStrings.invert
import typings.jointjs.jointjsStrings.outline
import typings.jointjs.jointjsStrings.saturate
import typings.jointjs.jointjsStrings.sepia
import typings.jointjs.mod.attributes.NativeSVGAttributes
import typings.jointjs.mod.dia.BBox
import typings.jointjs.mod.dia.Event
import typings.jointjs.mod.dia.LinkView.GetConnectionPoint
import typings.jointjs.mod.dia.MarkupJSON
import typings.jointjs.mod.dia.PaddingJSON
import typings.jointjs.mod.dia.Sides
import typings.jquery.JQuery
import typings.std.Blob
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.Error
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object util {
  
  @JSImport("jointjs", "util")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jointjs", "util.assign")
  @js.native
  def assign(destinationObject: js.Object, sourceObjects: js.Object*): js.Object = js.native
  
  @JSImport("jointjs", "util.bindAll")
  @js.native
  def bindAll(`object`: js.Object, methodNames: js.Array[PropertyPath]): js.Object = js.native
  
  @JSImport("jointjs", "util.breakText")
  @js.native
  def breakText(text: String, size: Height): String = js.native
  @JSImport("jointjs", "util.breakText")
  @js.native
  def breakText(text: String, size: Height, attrs: js.UndefOr[scala.Nothing], opt: Ellipsis): String = js.native
  @JSImport("jointjs", "util.breakText")
  @js.native
  def breakText(text: String, size: Height, attrs: NativeSVGAttributes): String = js.native
  @JSImport("jointjs", "util.breakText")
  @js.native
  def breakText(text: String, size: Height, attrs: NativeSVGAttributes, opt: Ellipsis): String = js.native
  
  @JSImport("jointjs", "util.camelCase")
  @js.native
  def camelCase(string: String): String = js.native
  
  @JSImport("jointjs", "util.cancelFrame")
  @js.native
  def cancelFrame(requestId: Double): Unit = js.native
  
  @JSImport("jointjs", "util.cloneDeep")
  @js.native
  def cloneDeep[T](value: T): T = js.native
  
  @JSImport("jointjs", "util.clone")
  @js.native
  def clone_[T](value: T): T = js.native
  
  @JSImport("jointjs", "util.dataUriToBlob")
  @js.native
  def dataUriToBlob(dataUri: String): Blob = js.native
  
  @JSImport("jointjs", "util.debounce")
  @js.native
  def debounce[T /* <: js.Function */](func: T): T with Cancelable = js.native
  @JSImport("jointjs", "util.debounce")
  @js.native
  def debounce[T /* <: js.Function */](func: T, wait: js.UndefOr[scala.Nothing], options: js.Object): T with Cancelable = js.native
  @JSImport("jointjs", "util.debounce")
  @js.native
  def debounce[T /* <: js.Function */](func: T, wait: Double): T with Cancelable = js.native
  @JSImport("jointjs", "util.debounce")
  @js.native
  def debounce[T /* <: js.Function */](func: T, wait: Double, options: js.Object): T with Cancelable = js.native
  
  @JSImport("jointjs", "util.deepMixin")
  @js.native
  def deepMixin(destinationObject: js.Object, sourceObject: js.Object): js.Object = js.native
  @JSImport("jointjs", "util.deepMixin")
  @js.native
  def deepMixin(destinationObject: js.Object, sourceObject: js.Object, options: js.Object): js.Object = js.native
  
  @JSImport("jointjs", "util.deepSupplement")
  @js.native
  def deepSupplement(destionationObject: js.Object, sourceObjects: js.Object*): js.Object = js.native
  
  @JSImport("jointjs", "util.defaults")
  @js.native
  def defaults(destinationObject: js.Object, sourceObjects: js.Object*): js.Object = js.native
  
  @JSImport("jointjs", "util.defaultsDeep")
  @js.native
  def defaultsDeep(destinationObject: js.Object, sourceObjects: js.Object*): js.Object = js.native
  
  @JSImport("jointjs", "util.difference")
  @js.native
  def difference(array: js.Array[_], excludedValuesArrays: js.Array[_]*): js.Array[_] = js.native
  
  @JSImport("jointjs", "util.downloadBlob")
  @js.native
  def downloadBlob(blob: Blob, fileName: String): Unit = js.native
  
  @JSImport("jointjs", "util.downloadDataUri")
  @js.native
  def downloadDataUri(dataUri: String, fileName: String): Unit = js.native
  
  object filter {
    
    @JSImport("jointjs", "util.filter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("jointjs", "util.filter.blur")
    @js.native
    def blur: FilterFunction[typings.jointjs.jointjsStrings.blur] = js.native
    @scala.inline
    def blur_=(x: FilterFunction[blur]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blur")(x.asInstanceOf[js.Any])
    
    @JSImport("jointjs", "util.filter.brightness")
    @js.native
    def brightness: FilterFunction[typings.jointjs.jointjsStrings.brightness] = js.native
    @scala.inline
    def brightness_=(x: FilterFunction[brightness]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("brightness")(x.asInstanceOf[js.Any])
    
    @JSImport("jointjs", "util.filter.contrast")
    @js.native
    def contrast: FilterFunction[typings.jointjs.jointjsStrings.contrast] = js.native
    @scala.inline
    def contrast_=(x: FilterFunction[contrast]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contrast")(x.asInstanceOf[js.Any])
    
    @JSImport("jointjs", "util.filter.dropShadow")
    @js.native
    def dropShadow: FilterFunction[typings.jointjs.jointjsStrings.dropShadow] = js.native
    @scala.inline
    def dropShadow_=(x: FilterFunction[dropShadow]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dropShadow")(x.asInstanceOf[js.Any])
    
    @JSImport("jointjs", "util.filter.grayscale")
    @js.native
    def grayscale: FilterFunction[typings.jointjs.jointjsStrings.grayscale] = js.native
    @scala.inline
    def grayscale_=(x: FilterFunction[grayscale]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grayscale")(x.asInstanceOf[js.Any])
    
    @JSImport("jointjs", "util.filter.highlight")
    @js.native
    def highlight: FilterFunction[typings.jointjs.jointjsStrings.highlight] = js.native
    @scala.inline
    def highlight_=(x: FilterFunction[highlight]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("highlight")(x.asInstanceOf[js.Any])
    
    @JSImport("jointjs", "util.filter.hueRotate")
    @js.native
    def hueRotate: FilterFunction[typings.jointjs.jointjsStrings.hueRotate] = js.native
    @scala.inline
    def hueRotate_=(x: FilterFunction[hueRotate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hueRotate")(x.asInstanceOf[js.Any])
    
    @JSImport("jointjs", "util.filter.invert")
    @js.native
    def invert: FilterFunction[typings.jointjs.jointjsStrings.invert] = js.native
    @scala.inline
    def invert_=(x: FilterFunction[invert]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invert")(x.asInstanceOf[js.Any])
    
    @JSImport("jointjs", "util.filter.outline")
    @js.native
    def outline: FilterFunction[typings.jointjs.jointjsStrings.outline] = js.native
    @scala.inline
    def outline_=(x: FilterFunction[outline]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outline")(x.asInstanceOf[js.Any])
    
    @JSImport("jointjs", "util.filter.saturate")
    @js.native
    def saturate: FilterFunction[typings.jointjs.jointjsStrings.saturate] = js.native
    @scala.inline
    def saturate_=(x: FilterFunction[saturate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("saturate")(x.asInstanceOf[js.Any])
    
    @JSImport("jointjs", "util.filter.sepia")
    @js.native
    def sepia: FilterFunction[typings.jointjs.jointjsStrings.sepia] = js.native
    @scala.inline
    def sepia_=(x: FilterFunction[sepia]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sepia")(x.asInstanceOf[js.Any])
    
    @js.native
    trait FilterArgumentsMap extends StObject {
      
      var blur: Y = js.native
      
      var brightness: Amount = js.native
      
      var contrast: Amount = js.native
      
      var dropShadow: Dx = js.native
      
      var grayscale: Amount = js.native
      
      var highlight: Blur = js.native
      
      var hueRotate: Angle = js.native
      
      var invert: Amount = js.native
      
      var outline: Margin = js.native
      
      var saturate: Amount = js.native
      
      var sepia: Amount = js.native
    }
    object FilterArgumentsMap {
      
      @scala.inline
      def apply(
        blur: Y,
        brightness: Amount,
        contrast: Amount,
        dropShadow: Dx,
        grayscale: Amount,
        highlight: Blur,
        hueRotate: Angle,
        invert: Amount,
        outline: Margin,
        saturate: Amount,
        sepia: Amount
      ): FilterArgumentsMap = {
        val __obj = js.Dynamic.literal(blur = blur.asInstanceOf[js.Any], brightness = brightness.asInstanceOf[js.Any], contrast = contrast.asInstanceOf[js.Any], dropShadow = dropShadow.asInstanceOf[js.Any], grayscale = grayscale.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], hueRotate = hueRotate.asInstanceOf[js.Any], invert = invert.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], saturate = saturate.asInstanceOf[js.Any], sepia = sepia.asInstanceOf[js.Any])
        __obj.asInstanceOf[FilterArgumentsMap]
      }
      
      @scala.inline
      implicit class FilterArgumentsMapMutableBuilder[Self <: FilterArgumentsMap] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBlur(value: Y): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBrightness(value: Amount): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContrast(value: Amount): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDropShadow(value: Dx): Self = StObject.set(x, "dropShadow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGrayscale(value: Amount): Self = StObject.set(x, "grayscale", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHighlight(value: Blur): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHueRotate(value: Angle): Self = StObject.set(x, "hueRotate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInvert(value: Amount): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOutline(value: Margin): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSaturate(value: Amount): Self = StObject.set(x, "saturate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSepia(value: Amount): Self = StObject.set(x, "sepia", value.asInstanceOf[js.Any])
      }
    }
    
    type FilterFunction[K /* <: outline | highlight | blur | dropShadow | grayscale | sepia | saturate | hueRotate | invert | brightness | contrast */] = js.Function1[
        /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.util.filter.FilterArgumentsMap[K] */ /* args */ js.Any, 
        String
      ]
  }
  
  @JSImport("jointjs", "util.flattenDeep")
  @js.native
  def flattenDeep(array: js.Array[_]): js.Array[_] = js.native
  
  @JSImport("jointjs", "util.flattenObject")
  @js.native
  def flattenObject(`object`: StringDictionary[js.Any]): js.Any = js.native
  @JSImport("jointjs", "util.flattenObject")
  @js.native
  def flattenObject(
    `object`: StringDictionary[js.Any],
    delim: js.UndefOr[scala.Nothing],
    stop: js.Function1[/* node */ js.Any, Boolean]
  ): js.Any = js.native
  @JSImport("jointjs", "util.flattenObject")
  @js.native
  def flattenObject(`object`: StringDictionary[js.Any], delim: String): js.Any = js.native
  @JSImport("jointjs", "util.flattenObject")
  @js.native
  def flattenObject(`object`: StringDictionary[js.Any], delim: String, stop: js.Function1[/* node */ js.Any, Boolean]): js.Any = js.native
  
  @JSImport("jointjs", "util.forIn")
  @js.native
  def forIn(`object`: js.Object): js.Object = js.native
  @JSImport("jointjs", "util.forIn")
  @js.native
  def forIn(`object`: js.Object, iteratee: Iteratee): js.Object = js.native
  
  object format {
    
    @JSImport("jointjs", "util.format.convert")
    @js.native
    def convert(`type`: String, value: Double, precision: Double): String = js.native
    
    @JSImport("jointjs", "util.format.number")
    @js.native
    def number(specifier: String, value: Double): String = js.native
    @JSImport("jointjs", "util.format.number")
    @js.native
    def number(specifier: String, value: Double, locale: NumberLocale): String = js.native
    
    @JSImport("jointjs", "util.format.precision")
    @js.native
    def precision(value: Double, precision: Double): Double = js.native
    
    @JSImport("jointjs", "util.format.prefix")
    @js.native
    def prefix(value: Double, precision: Double): js.UndefOr[Scale] = js.native
    
    @JSImport("jointjs", "util.format.round")
    @js.native
    def round(value: Double): Double = js.native
    @JSImport("jointjs", "util.format.round")
    @js.native
    def round(value: Double, precision: Double): Double = js.native
    
    @JSImport("jointjs", "util.format.string")
    @js.native
    def string(str: String, value: String): String = js.native
    
    @js.native
    trait NumberLocale extends StObject {
      
      var currency: js.Tuple2[String, String] = js.native
      
      var decimal: String = js.native
      
      var grouping: js.Array[Double] = js.native
      
      var thousands: String = js.native
    }
    object NumberLocale {
      
      @scala.inline
      def apply(
        currency: js.Tuple2[String, String],
        decimal: String,
        grouping: js.Array[Double],
        thousands: String
      ): NumberLocale = {
        val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], decimal = decimal.asInstanceOf[js.Any], grouping = grouping.asInstanceOf[js.Any], thousands = thousands.asInstanceOf[js.Any])
        __obj.asInstanceOf[NumberLocale]
      }
      
      @scala.inline
      implicit class NumberLocaleMutableBuilder[Self <: NumberLocale] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCurrency(value: js.Tuple2[String, String]): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGrouping(value: js.Array[Double]): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroupingVarargs(value: Double*): Self = StObject.set(x, "grouping", js.Array(value :_*))
        
        @scala.inline
        def setThousands(value: String): Self = StObject.set(x, "thousands", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("jointjs", "util.getByPath")
  @js.native
  def getByPath(`object`: StringDictionary[js.Any], path: String): js.Any = js.native
  @JSImport("jointjs", "util.getByPath")
  @js.native
  def getByPath(`object`: StringDictionary[js.Any], path: String, delim: String): js.Any = js.native
  @JSImport("jointjs", "util.getByPath")
  @js.native
  def getByPath(`object`: StringDictionary[js.Any], path: js.Array[String]): js.Any = js.native
  @JSImport("jointjs", "util.getByPath")
  @js.native
  def getByPath(`object`: StringDictionary[js.Any], path: js.Array[String], delim: String): js.Any = js.native
  
  @JSImport("jointjs", "util.getElementBBox")
  @js.native
  def getElementBBox(el: Element): BBox = js.native
  
  @JSImport("jointjs", "util.groupBy")
  @js.native
  def groupBy(collection: Collection): js.Object = js.native
  @JSImport("jointjs", "util.groupBy")
  @js.native
  def groupBy(collection: Collection, iteratee: Iteratee): js.Object = js.native
  
  @JSImport("jointjs", "util.guid")
  @js.native
  def guid(): String = js.native
  @JSImport("jointjs", "util.guid")
  @js.native
  def guid(obj: StringDictionary[js.Any]): String = js.native
  
  @JSImport("jointjs", "util.has")
  @js.native
  def has(`object`: js.Object, path: PropertyPath): Boolean = js.native
  
  @JSImport("jointjs", "util.hashCode")
  @js.native
  def hashCode_(str: String): String = js.native
  
  @JSImport("jointjs", "util.imageToDataUri")
  @js.native
  def imageToDataUri(url: String, callback: js.Function2[/* err */ Error | Null, /* dataUri */ String, Unit]): Unit = js.native
  
  object interpolate {
    
    @JSImport("jointjs", "util.interpolate")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("jointjs", "util.interpolate.hexColor")
    @js.native
    def hexColor: InterpolateFunction[String] = js.native
    @scala.inline
    def hexColor_=(x: InterpolateFunction[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hexColor")(x.asInstanceOf[js.Any])
    
    @JSImport("jointjs", "util.interpolate.number")
    @js.native
    def number: InterpolateFunction[Double] = js.native
    @scala.inline
    def number_=(x: InterpolateFunction[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("number")(x.asInstanceOf[js.Any])
    
    @JSImport("jointjs", "util.interpolate.unit")
    @js.native
    def unit: InterpolateFunction[String] = js.native
    @scala.inline
    def unit_=(x: InterpolateFunction[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unit")(x.asInstanceOf[js.Any])
    
    type InterpolateFunction[T] = js.Function2[/* start */ T, /* end */ T, js.Function1[/* time */ Double, T]]
    
    @JSImport("jointjs", "util.interpolate.object")
    @js.native
    val `object`: InterpolateFunction[StringDictionary[js.Any]] = js.native
  }
  
  @JSImport("jointjs", "util.intersection")
  @js.native
  def intersection(arrays: js.Array[_]*): js.Array[_] = js.native
  
  @JSImport("jointjs", "util.invoke")
  @js.native
  def invoke(collection: Collection, functionToInvokeForAll: IterateeFunction): js.Array[_] = js.native
  @JSImport("jointjs", "util.invoke")
  @js.native
  def invoke(collection: Collection, functionToInvokeForAll: IterateeFunction, args: js.Array[_]): js.Array[_] = js.native
  @JSImport("jointjs", "util.invoke")
  @js.native
  def invoke(collection: Collection, methodPath: PropertyPath): js.Array[_] = js.native
  @JSImport("jointjs", "util.invoke")
  @js.native
  def invoke(collection: Collection, methodPath: PropertyPath, args: js.Array[_]): js.Array[_] = js.native
  
  @JSImport("jointjs", "util.isBoolean")
  @js.native
  def isBoolean(value: js.Any): Boolean = js.native
  
  @JSImport("jointjs", "util.isEmpty")
  @js.native
  def isEmpty(value: js.Any): Boolean = js.native
  
  @JSImport("jointjs", "util.isEqual")
  @js.native
  def isEqual(value: js.Any, otherValue: js.Any): Boolean = js.native
  
  @JSImport("jointjs", "util.isFunction")
  @js.native
  def isFunction(value: js.Any): Boolean = js.native
  
  @JSImport("jointjs", "util.isNumber")
  @js.native
  def isNumber(value: js.Any): Boolean = js.native
  
  @JSImport("jointjs", "util.isObject")
  @js.native
  def isObject(value: js.Any): Boolean = js.native
  
  @JSImport("jointjs", "util.isPercentage")
  @js.native
  def isPercentage(`val`: js.Any): Boolean = js.native
  
  @JSImport("jointjs", "util.isPlainObject")
  @js.native
  def isPlainObject(value: js.Any): Boolean = js.native
  
  @JSImport("jointjs", "util.isString")
  @js.native
  def isString(value: js.Any): Boolean = js.native
  
  @JSImport("jointjs", "util.merge")
  @js.native
  def merge(destinationObject: js.Object, sourceObject1: js.Object, sourceObject2: js.Object): js.Object = js.native
  @JSImport("jointjs", "util.merge")
  @js.native
  def merge(
    destinationObject: js.Object,
    sourceObject1: js.Object,
    sourceObject2: js.Object,
    customizer: CustomizerFunction
  ): js.Object = js.native
  @JSImport("jointjs", "util.merge")
  @js.native
  def merge(
    destinationObject: js.Object,
    sourceObject1: js.Object,
    sourceObject2: js.Object,
    sourceObject3: js.Object
  ): js.Object = js.native
  @JSImport("jointjs", "util.merge")
  @js.native
  def merge(
    destinationObject: js.Object,
    sourceObject1: js.Object,
    sourceObject2: js.Object,
    sourceObject3: js.Object,
    customizer: CustomizerFunction
  ): js.Object = js.native
  @JSImport("jointjs", "util.merge")
  @js.native
  def merge(
    destinationObject: js.Object,
    sourceObject1: js.Object,
    sourceObject2: js.Object,
    sourceObject3: js.Object,
    sourceObject4: js.Object
  ): js.Object = js.native
  @JSImport("jointjs", "util.merge")
  @js.native
  def merge(
    destinationObject: js.Object,
    sourceObject1: js.Object,
    sourceObject2: js.Object,
    sourceObject3: js.Object,
    sourceObject4: js.Object,
    customizer: CustomizerFunction
  ): js.Object = js.native
  @JSImport("jointjs", "util.merge")
  @js.native
  def merge(destinationObject: js.Object, sourceObject: js.Object): js.Object = js.native
  @JSImport("jointjs", "util.merge")
  @js.native
  def merge(destinationObject: js.Object, sourceObject: js.Object, customizer: CustomizerFunction): js.Object = js.native
  @JSImport("jointjs", "util.merge")
  @js.native
  def merge(
    destinationObject: js.Object,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param sourceObjectsOptionalFinalCustomizer because its type SourceObjectsOptionalFinalCustomizer is not an array type */ sourceObjectsOptionalFinalCustomizer: SourceObjectsOptionalFinalCustomizer
  ): js.Object = js.native
  
  @JSImport("jointjs", "util.mixin")
  @js.native
  def mixin(destinationObject: js.Object, sourceObjects: js.Object*): js.Object = js.native
  
  @JSImport("jointjs", "util.nextFrame")
  @js.native
  def nextFrame(callback: js.Function0[Unit], context: js.UndefOr[scala.Nothing], args: js.Any*): Double = js.native
  @JSImport("jointjs", "util.nextFrame")
  @js.native
  def nextFrame(callback: js.Function0[Unit], context: StringDictionary[js.Any], args: js.Any*): Double = js.native
  
  @JSImport("jointjs", "util.noop")
  @js.native
  def noop(): Unit = js.native
  
  @JSImport("jointjs", "util.normalizeEvent")
  @js.native
  def normalizeEvent(evt: Event): Event = js.native
  
  @JSImport("jointjs", "util.normalizeSides")
  @js.native
  def normalizeSides(sides: Sides): PaddingJSON = js.native
  
  @JSImport("jointjs", "util.omit")
  @js.native
  def omit(`object`: js.Object, propertyPathsToOmit: PropertyPath*): js.Object = js.native
  
  @JSImport("jointjs", "util.parseCssNumeric")
  @js.native
  def parseCssNumeric(`val`: js.Any, restrictUnits: String): typings.jointjs.anon.Unit | Null = js.native
  @JSImport("jointjs", "util.parseCssNumeric")
  @js.native
  def parseCssNumeric(`val`: js.Any, restrictUnits: js.Array[String]): typings.jointjs.anon.Unit | Null = js.native
  
  @JSImport("jointjs", "util.parseDOMJSON")
  @js.native
  def parseDOMJSON(json: MarkupJSON): DOMJSONDocument = js.native
  
  @JSImport("jointjs", "util.pick")
  @js.native
  def pick(`object`: js.Object, propertyPathsToPick: PropertyPath*): js.Object = js.native
  
  @JSImport("jointjs", "util.result")
  @js.native
  def result(`object`: js.Object, propertyPath: PropertyPath): js.Any = js.native
  @JSImport("jointjs", "util.result")
  @js.native
  def result(`object`: js.Object, propertyPath: PropertyPath, defaultValue: js.Any): js.Any = js.native
  
  @JSImport("jointjs", "util.sanitizeHTML")
  @js.native
  def sanitizeHTML(html: String): String = js.native
  
  @JSImport("jointjs", "util.setAttributesBySelector")
  @js.native
  def setAttributesBySelector(el: Element, attrs: StringDictionary[StringDictionary[js.Any]]): Unit = js.native
  
  @JSImport("jointjs", "util.setByPath")
  @js.native
  def setByPath(`object`: StringDictionary[js.Any], path: String, value: js.Any): js.Any = js.native
  @JSImport("jointjs", "util.setByPath")
  @js.native
  def setByPath(`object`: StringDictionary[js.Any], path: String, value: js.Any, delim: String): js.Any = js.native
  @JSImport("jointjs", "util.setByPath")
  @js.native
  def setByPath(`object`: StringDictionary[js.Any], path: js.Array[String], value: js.Any): js.Any = js.native
  @JSImport("jointjs", "util.setByPath")
  @js.native
  def setByPath(`object`: StringDictionary[js.Any], path: js.Array[String], value: js.Any, delim: String): js.Any = js.native
  
  @JSImport("jointjs", "util.shapePerimeterConnectionPoint")
  @js.native
  def shapePerimeterConnectionPoint: GetConnectionPoint = js.native
  @scala.inline
  def shapePerimeterConnectionPoint_=(x: GetConnectionPoint): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shapePerimeterConnectionPoint")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "util.sortBy")
  @js.native
  def sortBy(collection: Collection, iterateesArray: js.Array[Iteratee]): js.Array[_] = js.native
  
  @JSImport("jointjs", "util.sortElements")
  @js.native
  def sortElements(elements: String, comparator: js.Function2[/* a */ Element, /* b */ Element, Double]): js.Array[Element] = js.native
  @JSImport("jointjs", "util.sortElements")
  @js.native
  def sortElements(elements: js.Array[Element], comparator: js.Function2[/* a */ Element, /* b */ Element, Double]): js.Array[Element] = js.native
  @JSImport("jointjs", "util.sortElements")
  @js.native
  def sortElements(elements: JQuery[HTMLElement], comparator: js.Function2[/* a */ Element, /* b */ Element, Double]): js.Array[Element] = js.native
  
  @JSImport("jointjs", "util.sortedIndex")
  @js.native
  def sortedIndex(sortedArray: js.Array[_], valueToInsert: js.Any): Double = js.native
  @JSImport("jointjs", "util.sortedIndex")
  @js.native
  def sortedIndex(sortedArray: js.Array[_], valueToInsert: js.Any, iteratee: Iteratee): Double = js.native
  
  @JSImport("jointjs", "util.supplement")
  @js.native
  def supplement(destinationObject: js.Object, sourceObjects: js.Object*): js.Object = js.native
  
  @JSImport("jointjs", "util.template")
  @js.native
  def template(html: String): js.Function1[/* data */ js.Any, String] = js.native
  
  object timing {
    
    @JSImport("jointjs", "util.timing")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("jointjs", "util.timing.back")
    @js.native
    def back(): TimingFunction = js.native
    @JSImport("jointjs", "util.timing.back")
    @js.native
    def back(s: Double): TimingFunction = js.native
    
    @JSImport("jointjs", "util.timing.bounce")
    @js.native
    def bounce: TimingFunction = js.native
    @scala.inline
    def bounce_=(x: TimingFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bounce")(x.asInstanceOf[js.Any])
    
    @JSImport("jointjs", "util.timing.clamp")
    @js.native
    def clamp(f: TimingFunction): TimingFunction = js.native
    @JSImport("jointjs", "util.timing.clamp")
    @js.native
    def clamp(f: TimingFunction, min: js.UndefOr[scala.Nothing], max: Double): TimingFunction = js.native
    @JSImport("jointjs", "util.timing.clamp")
    @js.native
    def clamp(f: TimingFunction, min: Double): TimingFunction = js.native
    @JSImport("jointjs", "util.timing.clamp")
    @js.native
    def clamp(f: TimingFunction, min: Double, max: Double): TimingFunction = js.native
    
    @JSImport("jointjs", "util.timing.cubic")
    @js.native
    def cubic: TimingFunction = js.native
    @scala.inline
    def cubic_=(x: TimingFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cubic")(x.asInstanceOf[js.Any])
    
    @JSImport("jointjs", "util.timing.elastic")
    @js.native
    def elastic(): TimingFunction = js.native
    @JSImport("jointjs", "util.timing.elastic")
    @js.native
    def elastic(x: Double): TimingFunction = js.native
    
    @JSImport("jointjs", "util.timing.exponential")
    @js.native
    def exponential: TimingFunction = js.native
    @scala.inline
    def exponential_=(x: TimingFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exponential")(x.asInstanceOf[js.Any])
    
    @JSImport("jointjs", "util.timing.inout")
    @js.native
    def inout: TimingFunction = js.native
    @scala.inline
    def inout_=(x: TimingFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inout")(x.asInstanceOf[js.Any])
    
    @JSImport("jointjs", "util.timing.linear")
    @js.native
    def linear: TimingFunction = js.native
    @scala.inline
    def linear_=(x: TimingFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linear")(x.asInstanceOf[js.Any])
    
    @JSImport("jointjs", "util.timing.quad")
    @js.native
    def quad: TimingFunction = js.native
    @scala.inline
    def quad_=(x: TimingFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("quad")(x.asInstanceOf[js.Any])
    
    @JSImport("jointjs", "util.timing.reflect")
    @js.native
    def reflect(f: TimingFunction): TimingFunction = js.native
    
    @JSImport("jointjs", "util.timing.reverse")
    @js.native
    def reverse(f: TimingFunction): TimingFunction = js.native
    
    type TimingFunction = js.Function1[/* time */ Double, Double]
  }
  
  @JSImport("jointjs", "util.toArray")
  @js.native
  def toArray(value: js.Any): js.Array[_] = js.native
  
  @JSImport("jointjs", "util.toKebabCase")
  @js.native
  def toKebabCase(str: String): String = js.native
  
  @JSImport("jointjs", "util.toggleFullScreen")
  @js.native
  def toggleFullScreen(): Unit = js.native
  @JSImport("jointjs", "util.toggleFullScreen")
  @js.native
  def toggleFullScreen(el: Element): Unit = js.native
  
  @JSImport("jointjs", "util.union")
  @js.native
  def union(arrays: js.Array[_]*): js.Array[_] = js.native
  
  @JSImport("jointjs", "util.uniq")
  @js.native
  def uniq(array: js.Array[_]): js.Array[_] = js.native
  @JSImport("jointjs", "util.uniq")
  @js.native
  def uniq(array: js.Array[_], iteratee: Iteratee): js.Array[_] = js.native
  
  @JSImport("jointjs", "util.uniqueId")
  @js.native
  def uniqueId(): String = js.native
  @JSImport("jointjs", "util.uniqueId")
  @js.native
  def uniqueId(prefix: String): String = js.native
  
  @JSImport("jointjs", "util.unsetByPath")
  @js.native
  def unsetByPath(`object`: StringDictionary[js.Any], path: String): js.Any = js.native
  @JSImport("jointjs", "util.unsetByPath")
  @js.native
  def unsetByPath(`object`: StringDictionary[js.Any], path: String, delim: String): js.Any = js.native
  @JSImport("jointjs", "util.unsetByPath")
  @js.native
  def unsetByPath(`object`: StringDictionary[js.Any], path: js.Array[String]): js.Any = js.native
  @JSImport("jointjs", "util.unsetByPath")
  @js.native
  def unsetByPath(`object`: StringDictionary[js.Any], path: js.Array[String], delim: String): js.Any = js.native
  
  @JSImport("jointjs", "util.uuid")
  @js.native
  def uuid(): String = js.native
  
  @JSImport("jointjs", "util.without")
  @js.native
  def without(array: js.Array[_], values: js.Any*): js.Array[_] = js.native
  
  // there are other shorthands in Lodash but not in the methods we duplicate
  @js.native
  trait Cancelable extends StObject {
    
    def cancel(): Unit = js.native
    
    def flush(): Unit = js.native
  }
  object Cancelable {
    
    @scala.inline
    def apply(cancel: () => Unit, flush: () => Unit): Cancelable = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), flush = js.Any.fromFunction0(flush))
      __obj.asInstanceOf[Cancelable]
    }
    
    @scala.inline
    implicit class CancelableMutableBuilder[Self <: Cancelable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
    }
  }
  
  // the `any` type without `void` and `never`
  type Collection = js.Object | js.Array[js.Any]
  
  // typescript cannot express "any number of objects optionally followed by CustomizerFunction"
  type CustomizerFunction = js.Function6[
    /* objValue */ js.Any, 
    /* srcValue */ js.Any, 
    /* key */ String, 
    /* object */ js.Any, 
    /* source */ js.Any, 
    /* stack */ js.Any, 
    NotVoid
  ]
  
  @js.native
  trait DOMJSONDocument extends StObject {
    
    var fragment: DocumentFragment = js.native
    
    var groupSelectors: StringDictionary[js.Array[Element]] = js.native
    
    var selectors: StringDictionary[Element] = js.native
  }
  object DOMJSONDocument {
    
    @scala.inline
    def apply(
      fragment: DocumentFragment,
      groupSelectors: StringDictionary[js.Array[Element]],
      selectors: StringDictionary[Element]
    ): DOMJSONDocument = {
      val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], groupSelectors = groupSelectors.asInstanceOf[js.Any], selectors = selectors.asInstanceOf[js.Any])
      __obj.asInstanceOf[DOMJSONDocument]
    }
    
    @scala.inline
    implicit class DOMJSONDocumentMutableBuilder[Self <: DOMJSONDocument] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFragment(value: DocumentFragment): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupSelectors(value: StringDictionary[js.Array[Element]]): Self = StObject.set(x, "groupSelectors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectors(value: StringDictionary[Element]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
    }
  }
  
  type Iteratee = IterateeFunction | IterateeShorthand
  
  type IterateeFunction = js.Function1[/* value */ js.Any, NotVoid]
  
  type IterateeShorthand = PropertyPath
  
  // LODASH FUNCTIONS:
  type NotVoid = js.UndefOr[js.Object | Null]
  
  // an object or an array
  type PropertyPath = String | js.Array[String]
  
  type SourceObjectsOptionalFinalCustomizer = js.Array[js.Object | CustomizerFunction]
}
