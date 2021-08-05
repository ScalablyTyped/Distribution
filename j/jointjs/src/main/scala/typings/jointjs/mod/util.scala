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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object util {
  
  @JSImport("jointjs", "util")
  @js.native
  val ^ : js.Any = js.native
  
  inline def assign(destinationObject: js.Object, sourceObjects: js.Object*): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(destinationObject.asInstanceOf[js.Any], sourceObjects.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def bindAll(`object`: js.Object, methodNames: js.Array[PropertyPath]): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(`object`.asInstanceOf[js.Any], methodNames.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def breakText(text: String, size: Height): String = (^.asInstanceOf[js.Dynamic].applyDynamic("breakText")(text.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def breakText(text: String, size: Height, attrs: Unit, opt: Ellipsis): String = (^.asInstanceOf[js.Dynamic].applyDynamic("breakText")(text.asInstanceOf[js.Any], size.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def breakText(text: String, size: Height, attrs: NativeSVGAttributes): String = (^.asInstanceOf[js.Dynamic].applyDynamic("breakText")(text.asInstanceOf[js.Any], size.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def breakText(text: String, size: Height, attrs: NativeSVGAttributes, opt: Ellipsis): String = (^.asInstanceOf[js.Dynamic].applyDynamic("breakText")(text.asInstanceOf[js.Any], size.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def camelCase(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelCase")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def cancelFrame(requestId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelFrame")(requestId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def cloneDeep[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneDeep")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def clone_[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def dataUriToBlob(dataUri: String): Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("dataUriToBlob")(dataUri.asInstanceOf[js.Any]).asInstanceOf[Blob]
  
  inline def debounce[T /* <: js.Function */](func: T): T & Cancelable = ^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any]).asInstanceOf[T & Cancelable]
  inline def debounce[T /* <: js.Function */](func: T, wait: Double): T & Cancelable = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[T & Cancelable]
  inline def debounce[T /* <: js.Function */](func: T, wait: Double, options: js.Object): T & Cancelable = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T & Cancelable]
  inline def debounce[T /* <: js.Function */](func: T, wait: Unit, options: js.Object): T & Cancelable = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T & Cancelable]
  
  inline def deepMixin(destinationObject: js.Object, sourceObject: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("deepMixin")(destinationObject.asInstanceOf[js.Any], sourceObject.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def deepMixin(destinationObject: js.Object, sourceObject: js.Object, options: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("deepMixin")(destinationObject.asInstanceOf[js.Any], sourceObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def deepSupplement(destionationObject: js.Object, sourceObjects: js.Object*): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("deepSupplement")(destionationObject.asInstanceOf[js.Any], sourceObjects.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def defaults(destinationObject: js.Object, sourceObjects: js.Object*): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(destinationObject.asInstanceOf[js.Any], sourceObjects.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def defaultsDeep(destinationObject: js.Object, sourceObjects: js.Object*): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultsDeep")(destinationObject.asInstanceOf[js.Any], sourceObjects.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def difference(array: js.Array[js.Any], excludedValuesArrays: js.Array[js.Any]*): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("difference")(array.asInstanceOf[js.Any], excludedValuesArrays.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  inline def downloadBlob(blob: Blob, fileName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadBlob")(blob.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def downloadDataUri(dataUri: String, fileName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadDataUri")(dataUri.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object filter {
    
    @JSImport("jointjs", "util.filter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("jointjs", "util.filter.blur")
    @js.native
    def blur: FilterFunction[typings.jointjs.jointjsStrings.blur] = js.native
    inline def blur_=(x: FilterFunction[blur]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blur")(x.asInstanceOf[js.Any])
    
    @JSImport("jointjs", "util.filter.brightness")
    @js.native
    def brightness: FilterFunction[typings.jointjs.jointjsStrings.brightness] = js.native
    inline def brightness_=(x: FilterFunction[brightness]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("brightness")(x.asInstanceOf[js.Any])
    
    @JSImport("jointjs", "util.filter.contrast")
    @js.native
    def contrast: FilterFunction[typings.jointjs.jointjsStrings.contrast] = js.native
    inline def contrast_=(x: FilterFunction[contrast]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contrast")(x.asInstanceOf[js.Any])
    
    @JSImport("jointjs", "util.filter.dropShadow")
    @js.native
    def dropShadow: FilterFunction[typings.jointjs.jointjsStrings.dropShadow] = js.native
    inline def dropShadow_=(x: FilterFunction[dropShadow]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dropShadow")(x.asInstanceOf[js.Any])
    
    @JSImport("jointjs", "util.filter.grayscale")
    @js.native
    def grayscale: FilterFunction[typings.jointjs.jointjsStrings.grayscale] = js.native
    inline def grayscale_=(x: FilterFunction[grayscale]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grayscale")(x.asInstanceOf[js.Any])
    
    @JSImport("jointjs", "util.filter.highlight")
    @js.native
    def highlight: FilterFunction[typings.jointjs.jointjsStrings.highlight] = js.native
    inline def highlight_=(x: FilterFunction[highlight]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("highlight")(x.asInstanceOf[js.Any])
    
    @JSImport("jointjs", "util.filter.hueRotate")
    @js.native
    def hueRotate: FilterFunction[typings.jointjs.jointjsStrings.hueRotate] = js.native
    inline def hueRotate_=(x: FilterFunction[hueRotate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hueRotate")(x.asInstanceOf[js.Any])
    
    @JSImport("jointjs", "util.filter.invert")
    @js.native
    def invert: FilterFunction[typings.jointjs.jointjsStrings.invert] = js.native
    inline def invert_=(x: FilterFunction[invert]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invert")(x.asInstanceOf[js.Any])
    
    @JSImport("jointjs", "util.filter.outline")
    @js.native
    def outline: FilterFunction[typings.jointjs.jointjsStrings.outline] = js.native
    inline def outline_=(x: FilterFunction[outline]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outline")(x.asInstanceOf[js.Any])
    
    @JSImport("jointjs", "util.filter.saturate")
    @js.native
    def saturate: FilterFunction[typings.jointjs.jointjsStrings.saturate] = js.native
    inline def saturate_=(x: FilterFunction[saturate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("saturate")(x.asInstanceOf[js.Any])
    
    @JSImport("jointjs", "util.filter.sepia")
    @js.native
    def sepia: FilterFunction[typings.jointjs.jointjsStrings.sepia] = js.native
    inline def sepia_=(x: FilterFunction[sepia]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sepia")(x.asInstanceOf[js.Any])
    
    trait FilterArgumentsMap extends StObject {
      
      var blur: Y
      
      var brightness: Amount
      
      var contrast: Amount
      
      var dropShadow: Dx
      
      var grayscale: Amount
      
      var highlight: Blur
      
      var hueRotate: Angle
      
      var invert: Amount
      
      var outline: Margin
      
      var saturate: Amount
      
      var sepia: Amount
    }
    object FilterArgumentsMap {
      
      inline def apply(
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
      
      extension [Self <: FilterArgumentsMap](x: Self) {
        
        inline def setBlur(value: Y): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
        
        inline def setBrightness(value: Amount): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
        
        inline def setContrast(value: Amount): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
        
        inline def setDropShadow(value: Dx): Self = StObject.set(x, "dropShadow", value.asInstanceOf[js.Any])
        
        inline def setGrayscale(value: Amount): Self = StObject.set(x, "grayscale", value.asInstanceOf[js.Any])
        
        inline def setHighlight(value: Blur): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
        
        inline def setHueRotate(value: Angle): Self = StObject.set(x, "hueRotate", value.asInstanceOf[js.Any])
        
        inline def setInvert(value: Amount): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
        
        inline def setOutline(value: Margin): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
        
        inline def setSaturate(value: Amount): Self = StObject.set(x, "saturate", value.asInstanceOf[js.Any])
        
        inline def setSepia(value: Amount): Self = StObject.set(x, "sepia", value.asInstanceOf[js.Any])
      }
    }
    
    type FilterFunction[K /* <: outline | highlight | blur | dropShadow | grayscale | sepia | saturate | hueRotate | invert | brightness | contrast */] = js.Function1[
        /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.util.filter.FilterArgumentsMap[K] */ /* args */ js.Any, 
        String
      ]
  }
  
  inline def flattenDeep(array: js.Array[js.Any]): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenDeep")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  inline def flattenObject(`object`: StringDictionary[js.Any]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def flattenObject(`object`: StringDictionary[js.Any], delim: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenObject")(`object`.asInstanceOf[js.Any], delim.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def flattenObject(`object`: StringDictionary[js.Any], delim: String, stop: js.Function1[/* node */ js.Any, Boolean]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenObject")(`object`.asInstanceOf[js.Any], delim.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def flattenObject(`object`: StringDictionary[js.Any], delim: Unit, stop: js.Function1[/* node */ js.Any, Boolean]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenObject")(`object`.asInstanceOf[js.Any], delim.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def forIn(`object`: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("forIn")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def forIn(`object`: js.Object, iteratee: Iteratee): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("forIn")(`object`.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  object format {
    
    @JSImport("jointjs", "util.format")
    @js.native
    val ^ : js.Any = js.native
    
    inline def convert(`type`: String, value: Double, precision: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def number(specifier: String, value: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(specifier.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def number(specifier: String, value: Double, locale: NumberLocale): String = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(specifier.asInstanceOf[js.Any], value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def precision(value: Double, precision: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("precision")(value.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def prefix(value: Double, precision: Double): js.UndefOr[Scale] = (^.asInstanceOf[js.Dynamic].applyDynamic("prefix")(value.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Scale]]
    
    inline def round(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("round")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def round(value: Double, precision: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("round")(value.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def string(str: String, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("string")(str.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    
    trait NumberLocale extends StObject {
      
      var currency: js.Tuple2[String, String]
      
      var decimal: String
      
      var grouping: js.Array[Double]
      
      var thousands: String
    }
    object NumberLocale {
      
      inline def apply(
        currency: js.Tuple2[String, String],
        decimal: String,
        grouping: js.Array[Double],
        thousands: String
      ): NumberLocale = {
        val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], decimal = decimal.asInstanceOf[js.Any], grouping = grouping.asInstanceOf[js.Any], thousands = thousands.asInstanceOf[js.Any])
        __obj.asInstanceOf[NumberLocale]
      }
      
      extension [Self <: NumberLocale](x: Self) {
        
        inline def setCurrency(value: js.Tuple2[String, String]): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        inline def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
        
        inline def setGrouping(value: js.Array[Double]): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
        
        inline def setGroupingVarargs(value: Double*): Self = StObject.set(x, "grouping", js.Array(value :_*))
        
        inline def setThousands(value: String): Self = StObject.set(x, "thousands", value.asInstanceOf[js.Any])
      }
    }
  }
  
  inline def getByPath(`object`: StringDictionary[js.Any], path: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getByPath")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def getByPath(`object`: StringDictionary[js.Any], path: String, delim: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getByPath")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], delim.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def getByPath(`object`: StringDictionary[js.Any], path: js.Array[String]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getByPath")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def getByPath(`object`: StringDictionary[js.Any], path: js.Array[String], delim: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getByPath")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], delim.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def getElementBBox(el: Element): BBox = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementBBox")(el.asInstanceOf[js.Any]).asInstanceOf[BBox]
  
  inline def groupBy(collection: Collection): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(collection.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def groupBy(collection: Collection, iteratee: Iteratee): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(collection.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def guid(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("guid")().asInstanceOf[String]
  inline def guid(obj: StringDictionary[js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("guid")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def has(`object`: js.Object, path: PropertyPath): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hashCode_(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hashCode")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def imageToDataUri(url: String, callback: js.Function2[/* err */ Error | Null, /* dataUri */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("imageToDataUri")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object interpolate {
    
    @JSImport("jointjs", "util.interpolate")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("jointjs", "util.interpolate.hexColor")
    @js.native
    def hexColor: InterpolateFunction[String] = js.native
    inline def hexColor_=(x: InterpolateFunction[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hexColor")(x.asInstanceOf[js.Any])
    
    @JSImport("jointjs", "util.interpolate.number")
    @js.native
    def number: InterpolateFunction[Double] = js.native
    inline def number_=(x: InterpolateFunction[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("number")(x.asInstanceOf[js.Any])
    
    @JSImport("jointjs", "util.interpolate.object")
    @js.native
    val `object`: InterpolateFunction[StringDictionary[js.Any]] = js.native
    
    @JSImport("jointjs", "util.interpolate.unit")
    @js.native
    def unit: InterpolateFunction[String] = js.native
    inline def unit_=(x: InterpolateFunction[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unit")(x.asInstanceOf[js.Any])
    
    type InterpolateFunction[T] = js.Function2[/* start */ T, /* end */ T, js.Function1[/* time */ Double, T]]
  }
  
  inline def intersection(arrays: js.Array[js.Any]*): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(arrays.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  inline def invoke(collection: Collection, functionToInvokeForAll: IterateeFunction): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("invoke")(collection.asInstanceOf[js.Any], functionToInvokeForAll.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  inline def invoke(collection: Collection, functionToInvokeForAll: IterateeFunction, args: js.Array[js.Any]): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("invoke")(collection.asInstanceOf[js.Any], functionToInvokeForAll.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  inline def invoke(collection: Collection, methodPath: PropertyPath): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("invoke")(collection.asInstanceOf[js.Any], methodPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  inline def invoke(collection: Collection, methodPath: PropertyPath, args: js.Array[js.Any]): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("invoke")(collection.asInstanceOf[js.Any], methodPath.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  inline def isBoolean(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEmpty(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEqual(value: js.Any, otherValue: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(value.asInstanceOf[js.Any], otherValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isFunction(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNumber(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObject(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPercentage(`val`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPercentage")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPlainObject(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isString(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def merge(destinationObject: js.Object, sourceObject1: js.Object, sourceObject2: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(destinationObject.asInstanceOf[js.Any], sourceObject1.asInstanceOf[js.Any], sourceObject2.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def merge(
    destinationObject: js.Object,
    sourceObject1: js.Object,
    sourceObject2: js.Object,
    customizer: CustomizerFunction
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(destinationObject.asInstanceOf[js.Any], sourceObject1.asInstanceOf[js.Any], sourceObject2.asInstanceOf[js.Any], customizer.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def merge(
    destinationObject: js.Object,
    sourceObject1: js.Object,
    sourceObject2: js.Object,
    sourceObject3: js.Object
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(destinationObject.asInstanceOf[js.Any], sourceObject1.asInstanceOf[js.Any], sourceObject2.asInstanceOf[js.Any], sourceObject3.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def merge(
    destinationObject: js.Object,
    sourceObject1: js.Object,
    sourceObject2: js.Object,
    sourceObject3: js.Object,
    customizer: CustomizerFunction
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(destinationObject.asInstanceOf[js.Any], sourceObject1.asInstanceOf[js.Any], sourceObject2.asInstanceOf[js.Any], sourceObject3.asInstanceOf[js.Any], customizer.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def merge(
    destinationObject: js.Object,
    sourceObject1: js.Object,
    sourceObject2: js.Object,
    sourceObject3: js.Object,
    sourceObject4: js.Object
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(destinationObject.asInstanceOf[js.Any], sourceObject1.asInstanceOf[js.Any], sourceObject2.asInstanceOf[js.Any], sourceObject3.asInstanceOf[js.Any], sourceObject4.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def merge(
    destinationObject: js.Object,
    sourceObject1: js.Object,
    sourceObject2: js.Object,
    sourceObject3: js.Object,
    sourceObject4: js.Object,
    customizer: CustomizerFunction
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(destinationObject.asInstanceOf[js.Any], sourceObject1.asInstanceOf[js.Any], sourceObject2.asInstanceOf[js.Any], sourceObject3.asInstanceOf[js.Any], sourceObject4.asInstanceOf[js.Any], customizer.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def merge(destinationObject: js.Object, sourceObject: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(destinationObject.asInstanceOf[js.Any], sourceObject.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def merge(destinationObject: js.Object, sourceObject: js.Object, customizer: CustomizerFunction): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(destinationObject.asInstanceOf[js.Any], sourceObject.asInstanceOf[js.Any], customizer.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def merge(
    destinationObject: js.Object,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param sourceObjectsOptionalFinalCustomizer because its type SourceObjectsOptionalFinalCustomizer is not an array type */ sourceObjectsOptionalFinalCustomizer: SourceObjectsOptionalFinalCustomizer
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(destinationObject.asInstanceOf[js.Any], sourceObjectsOptionalFinalCustomizer.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def mixin(destinationObject: js.Object, sourceObjects: js.Object*): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("mixin")(destinationObject.asInstanceOf[js.Any], sourceObjects.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def nextFrame(callback: js.Function0[Unit], context: StringDictionary[js.Any], args: js.Any*): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("nextFrame")(callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def nextFrame(callback: js.Function0[Unit], context: Unit, args: js.Any*): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("nextFrame")(callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  inline def normalizeEvent(evt: Event): Event = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeEvent")(evt.asInstanceOf[js.Any]).asInstanceOf[Event]
  
  inline def normalizeSides(sides: Sides): PaddingJSON = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeSides")(sides.asInstanceOf[js.Any]).asInstanceOf[PaddingJSON]
  
  inline def omit(`object`: js.Object, propertyPathsToOmit: PropertyPath*): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("omit")(`object`.asInstanceOf[js.Any], propertyPathsToOmit.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def parseCssNumeric(`val`: js.Any, restrictUnits: String): typings.jointjs.anon.Unit | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseCssNumeric")(`val`.asInstanceOf[js.Any], restrictUnits.asInstanceOf[js.Any])).asInstanceOf[typings.jointjs.anon.Unit | Null]
  inline def parseCssNumeric(`val`: js.Any, restrictUnits: js.Array[String]): typings.jointjs.anon.Unit | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseCssNumeric")(`val`.asInstanceOf[js.Any], restrictUnits.asInstanceOf[js.Any])).asInstanceOf[typings.jointjs.anon.Unit | Null]
  
  inline def parseDOMJSON(json: MarkupJSON): DOMJSONDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDOMJSON")(json.asInstanceOf[js.Any]).asInstanceOf[DOMJSONDocument]
  
  inline def pick(`object`: js.Object, propertyPathsToPick: PropertyPath*): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(`object`.asInstanceOf[js.Any], propertyPathsToPick.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def result(`object`: js.Object, propertyPath: PropertyPath): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("result")(`object`.asInstanceOf[js.Any], propertyPath.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def result(`object`: js.Object, propertyPath: PropertyPath, defaultValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("result")(`object`.asInstanceOf[js.Any], propertyPath.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def sanitizeHTML(html: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeHTML")(html.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def setAttributesBySelector(el: Element, attrs: StringDictionary[StringDictionary[js.Any]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAttributesBySelector")(el.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setByPath(`object`: StringDictionary[js.Any], path: String, value: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setByPath")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def setByPath(`object`: StringDictionary[js.Any], path: String, value: js.Any, delim: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setByPath")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any], delim.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def setByPath(`object`: StringDictionary[js.Any], path: js.Array[String], value: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setByPath")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def setByPath(`object`: StringDictionary[js.Any], path: js.Array[String], value: js.Any, delim: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setByPath")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any], delim.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @JSImport("jointjs", "util.shapePerimeterConnectionPoint")
  @js.native
  def shapePerimeterConnectionPoint: GetConnectionPoint = js.native
  inline def shapePerimeterConnectionPoint_=(x: GetConnectionPoint): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shapePerimeterConnectionPoint")(x.asInstanceOf[js.Any])
  
  inline def sortBy(collection: Collection, iterateesArray: js.Array[Iteratee]): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sortBy")(collection.asInstanceOf[js.Any], iterateesArray.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  inline def sortElements(elements: String, comparator: js.Function2[/* a */ Element, /* b */ Element, Double]): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("sortElements")(elements.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def sortElements(elements: js.Array[Element], comparator: js.Function2[/* a */ Element, /* b */ Element, Double]): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("sortElements")(elements.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def sortElements(elements: JQuery[HTMLElement], comparator: js.Function2[/* a */ Element, /* b */ Element, Double]): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("sortElements")(elements.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  
  inline def sortedIndex(sortedArray: js.Array[js.Any], valueToInsert: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sortedIndex")(sortedArray.asInstanceOf[js.Any], valueToInsert.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def sortedIndex(sortedArray: js.Array[js.Any], valueToInsert: js.Any, iteratee: Iteratee): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sortedIndex")(sortedArray.asInstanceOf[js.Any], valueToInsert.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def supplement(destinationObject: js.Object, sourceObjects: js.Object*): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("supplement")(destinationObject.asInstanceOf[js.Any], sourceObjects.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def template(html: String): js.Function1[/* data */ js.Any, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("template")(html.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* data */ js.Any, String]]
  
  object timing {
    
    @JSImport("jointjs", "util.timing")
    @js.native
    val ^ : js.Any = js.native
    
    inline def back(): TimingFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("back")().asInstanceOf[TimingFunction]
    inline def back(s: Double): TimingFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("back")(s.asInstanceOf[js.Any]).asInstanceOf[TimingFunction]
    
    @JSImport("jointjs", "util.timing.bounce")
    @js.native
    def bounce: TimingFunction = js.native
    inline def bounce_=(x: TimingFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bounce")(x.asInstanceOf[js.Any])
    
    inline def clamp(f: TimingFunction): TimingFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(f.asInstanceOf[js.Any]).asInstanceOf[TimingFunction]
    inline def clamp(f: TimingFunction, min: Double): TimingFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(f.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[TimingFunction]
    inline def clamp(f: TimingFunction, min: Double, max: Double): TimingFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(f.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[TimingFunction]
    inline def clamp(f: TimingFunction, min: Unit, max: Double): TimingFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(f.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[TimingFunction]
    
    @JSImport("jointjs", "util.timing.cubic")
    @js.native
    def cubic: TimingFunction = js.native
    inline def cubic_=(x: TimingFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cubic")(x.asInstanceOf[js.Any])
    
    inline def elastic(): TimingFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("elastic")().asInstanceOf[TimingFunction]
    inline def elastic(x: Double): TimingFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("elastic")(x.asInstanceOf[js.Any]).asInstanceOf[TimingFunction]
    
    @JSImport("jointjs", "util.timing.exponential")
    @js.native
    def exponential: TimingFunction = js.native
    inline def exponential_=(x: TimingFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exponential")(x.asInstanceOf[js.Any])
    
    @JSImport("jointjs", "util.timing.inout")
    @js.native
    def inout: TimingFunction = js.native
    inline def inout_=(x: TimingFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inout")(x.asInstanceOf[js.Any])
    
    @JSImport("jointjs", "util.timing.linear")
    @js.native
    def linear: TimingFunction = js.native
    inline def linear_=(x: TimingFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linear")(x.asInstanceOf[js.Any])
    
    @JSImport("jointjs", "util.timing.quad")
    @js.native
    def quad: TimingFunction = js.native
    inline def quad_=(x: TimingFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("quad")(x.asInstanceOf[js.Any])
    
    inline def reflect(f: TimingFunction): TimingFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("reflect")(f.asInstanceOf[js.Any]).asInstanceOf[TimingFunction]
    
    inline def reverse(f: TimingFunction): TimingFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(f.asInstanceOf[js.Any]).asInstanceOf[TimingFunction]
    
    type TimingFunction = js.Function1[/* time */ Double, Double]
  }
  
  inline def toArray(value: js.Any): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  inline def toKebabCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toKebabCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toggleFullScreen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleFullScreen")().asInstanceOf[Unit]
  inline def toggleFullScreen(el: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleFullScreen")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def union(arrays: js.Array[js.Any]*): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(arrays.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  inline def uniq(array: js.Array[js.Any]): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniq")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  inline def uniq(array: js.Array[js.Any], iteratee: Iteratee): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniq")(array.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  inline def uniqueId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqueId")().asInstanceOf[String]
  inline def uniqueId(prefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqueId")(prefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unsetByPath(`object`: StringDictionary[js.Any], path: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unsetByPath")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def unsetByPath(`object`: StringDictionary[js.Any], path: String, delim: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unsetByPath")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], delim.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def unsetByPath(`object`: StringDictionary[js.Any], path: js.Array[String]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unsetByPath")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def unsetByPath(`object`: StringDictionary[js.Any], path: js.Array[String], delim: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unsetByPath")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], delim.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def uuid(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uuid")().asInstanceOf[String]
  
  inline def without(array: js.Array[js.Any], values: js.Any*): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("without")(array.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  // there are other shorthands in Lodash but not in the methods we duplicate
  trait Cancelable extends StObject {
    
    def cancel(): Unit
    
    def flush(): Unit
  }
  object Cancelable {
    
    inline def apply(cancel: () => Unit, flush: () => Unit): Cancelable = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), flush = js.Any.fromFunction0(flush))
      __obj.asInstanceOf[Cancelable]
    }
    
    extension [Self <: Cancelable](x: Self) {
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
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
  
  trait DOMJSONDocument extends StObject {
    
    var fragment: DocumentFragment
    
    var groupSelectors: StringDictionary[js.Array[Element]]
    
    var selectors: StringDictionary[Element]
  }
  object DOMJSONDocument {
    
    inline def apply(
      fragment: DocumentFragment,
      groupSelectors: StringDictionary[js.Array[Element]],
      selectors: StringDictionary[Element]
    ): DOMJSONDocument = {
      val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], groupSelectors = groupSelectors.asInstanceOf[js.Any], selectors = selectors.asInstanceOf[js.Any])
      __obj.asInstanceOf[DOMJSONDocument]
    }
    
    extension [Self <: DOMJSONDocument](x: Self) {
      
      inline def setFragment(value: DocumentFragment): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      inline def setGroupSelectors(value: StringDictionary[js.Array[Element]]): Self = StObject.set(x, "groupSelectors", value.asInstanceOf[js.Any])
      
      inline def setSelectors(value: StringDictionary[Element]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
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
