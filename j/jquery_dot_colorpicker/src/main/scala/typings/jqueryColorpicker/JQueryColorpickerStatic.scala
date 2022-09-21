package typings.jqueryColorpicker

import org.scalablytyped.runtime.StringDictionary
import typings.jqueryColorpicker.JQueryColorpickerStatic.RGB
import typings.jqueryColorpicker.anon.A
import typings.jqueryColorpicker.anon.Cmyk
import typings.jqueryColorpicker.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryColorpickerStatic extends StObject {
  
  var Color: Instantiable
  
  var limits: StringDictionary[js.Function1[/* color */ Any, Unit]]
  
  var parsers: StringDictionary[js.Function1[/* color */ Any, Any]]
  
  var parts: StringDictionary[js.Function1[/* inst */ Any, Any]]
  
  var partslists: StringDictionary[js.Array[String]]
  
  var regional: StringDictionary[String]
  
  var swatches: StringDictionary[StringDictionary[RGB]]
  
  var writers: StringDictionary[js.Function2[/* color */ Any, /* that */ Any, Any]]
}
object JQueryColorpickerStatic {
  
  inline def apply(
    Color: Instantiable,
    limits: StringDictionary[js.Function1[/* color */ Any, Unit]],
    parsers: StringDictionary[js.Function1[/* color */ Any, Any]],
    parts: StringDictionary[js.Function1[/* inst */ Any, Any]],
    partslists: StringDictionary[js.Array[String]],
    regional: StringDictionary[String],
    swatches: StringDictionary[StringDictionary[RGB]],
    writers: StringDictionary[js.Function2[/* color */ Any, /* that */ Any, Any]]
  ): JQueryColorpickerStatic = {
    val __obj = js.Dynamic.literal(Color = Color.asInstanceOf[js.Any], limits = limits.asInstanceOf[js.Any], parsers = parsers.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any], partslists = partslists.asInstanceOf[js.Any], regional = regional.asInstanceOf[js.Any], swatches = swatches.asInstanceOf[js.Any], writers = writers.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryColorpickerStatic]
  }
  
  trait CMYK extends StObject {
    
    var c: Double
    
    var k: Double
    
    var m: Double
    
    var y: Double
  }
  object CMYK {
    
    inline def apply(c: Double, k: Double, m: Double, y: Double): CMYK = {
      val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], k = k.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[CMYK]
    }
    
    extension [Self <: CMYK](x: Self) {
      
      inline def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      inline def setK(value: Double): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      inline def setM(value: Double): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Color extends StObject {
    
    def copy(): Color
    
    def distance(color: Color): Double
    
    def equals(color: Color): Boolean
    
    def getAlpha(): Double
    
    def getCMYK(): CMYK
    
    def getChannels(): A
    
    def getHSL(): HSL
    
    def getHSV(): HSV
    
    def getLAB(): LAB
    
    def getRGB(): RGB
    
    def getSpaces(): Cmyk
    
    def limit(steps: Double): Unit
    
    def normalize(): Color
    
    var set: Boolean
    
    def setAlpha(a: Double): Color
    
    def setCMYK(c: Double, m: Double, y: Double, k: Double): Color
    
    def setHSL(h: Double, s: Double, l: Double): Color
    
    def setHSV(h: Double, s: Double, v: Double): Color
    
    def setLAB(l: Double, a: Double, b: Double): Color
    
    def setRGB(r: Double, g: Double, b: Double): Color
    
    def setSpaces(new_spaces: Any): Color
    
    def toCSS(): String
    
    def toHEX(): String
  }
  object Color {
    
    inline def apply(
      copy: () => Color,
      distance: Color => Double,
      equals_ : Color => Boolean,
      getAlpha: () => Double,
      getCMYK: () => CMYK,
      getChannels: () => A,
      getHSL: () => HSL,
      getHSV: () => HSV,
      getLAB: () => LAB,
      getRGB: () => RGB,
      getSpaces: () => Cmyk,
      limit: Double => Unit,
      normalize: () => Color,
      set: Boolean,
      setAlpha: Double => Color,
      setCMYK: (Double, Double, Double, Double) => Color,
      setHSL: (Double, Double, Double) => Color,
      setHSV: (Double, Double, Double) => Color,
      setLAB: (Double, Double, Double) => Color,
      setRGB: (Double, Double, Double) => Color,
      setSpaces: Any => Color,
      toCSS: () => String,
      toHEX: () => String
    ): Color = {
      val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), distance = js.Any.fromFunction1(distance), getAlpha = js.Any.fromFunction0(getAlpha), getCMYK = js.Any.fromFunction0(getCMYK), getChannels = js.Any.fromFunction0(getChannels), getHSL = js.Any.fromFunction0(getHSL), getHSV = js.Any.fromFunction0(getHSV), getLAB = js.Any.fromFunction0(getLAB), getRGB = js.Any.fromFunction0(getRGB), getSpaces = js.Any.fromFunction0(getSpaces), limit = js.Any.fromFunction1(limit), normalize = js.Any.fromFunction0(normalize), set = set.asInstanceOf[js.Any], setAlpha = js.Any.fromFunction1(setAlpha), setCMYK = js.Any.fromFunction4(setCMYK), setHSL = js.Any.fromFunction3(setHSL), setHSV = js.Any.fromFunction3(setHSV), setLAB = js.Any.fromFunction3(setLAB), setRGB = js.Any.fromFunction3(setRGB), setSpaces = js.Any.fromFunction1(setSpaces), toCSS = js.Any.fromFunction0(toCSS), toHEX = js.Any.fromFunction0(toHEX))
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[Color]
    }
    
    extension [Self <: Color](x: Self) {
      
      inline def setCopy(value: () => Color): Self = StObject.set(x, "copy", js.Any.fromFunction0(value))
      
      inline def setDistance(value: Color => Double): Self = StObject.set(x, "distance", js.Any.fromFunction1(value))
      
      inline def setEquals_(value: Color => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      inline def setGetAlpha(value: () => Double): Self = StObject.set(x, "getAlpha", js.Any.fromFunction0(value))
      
      inline def setGetCMYK(value: () => CMYK): Self = StObject.set(x, "getCMYK", js.Any.fromFunction0(value))
      
      inline def setGetChannels(value: () => A): Self = StObject.set(x, "getChannels", js.Any.fromFunction0(value))
      
      inline def setGetHSL(value: () => HSL): Self = StObject.set(x, "getHSL", js.Any.fromFunction0(value))
      
      inline def setGetHSV(value: () => HSV): Self = StObject.set(x, "getHSV", js.Any.fromFunction0(value))
      
      inline def setGetLAB(value: () => LAB): Self = StObject.set(x, "getLAB", js.Any.fromFunction0(value))
      
      inline def setGetRGB(value: () => RGB): Self = StObject.set(x, "getRGB", js.Any.fromFunction0(value))
      
      inline def setGetSpaces(value: () => Cmyk): Self = StObject.set(x, "getSpaces", js.Any.fromFunction0(value))
      
      inline def setLimit(value: Double => Unit): Self = StObject.set(x, "limit", js.Any.fromFunction1(value))
      
      inline def setNormalize(value: () => Color): Self = StObject.set(x, "normalize", js.Any.fromFunction0(value))
      
      inline def setSet(value: Boolean): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
      
      inline def setSetAlpha(value: Double => Color): Self = StObject.set(x, "setAlpha", js.Any.fromFunction1(value))
      
      inline def setSetCMYK(value: (Double, Double, Double, Double) => Color): Self = StObject.set(x, "setCMYK", js.Any.fromFunction4(value))
      
      inline def setSetHSL(value: (Double, Double, Double) => Color): Self = StObject.set(x, "setHSL", js.Any.fromFunction3(value))
      
      inline def setSetHSV(value: (Double, Double, Double) => Color): Self = StObject.set(x, "setHSV", js.Any.fromFunction3(value))
      
      inline def setSetLAB(value: (Double, Double, Double) => Color): Self = StObject.set(x, "setLAB", js.Any.fromFunction3(value))
      
      inline def setSetRGB(value: (Double, Double, Double) => Color): Self = StObject.set(x, "setRGB", js.Any.fromFunction3(value))
      
      inline def setSetSpaces(value: Any => Color): Self = StObject.set(x, "setSpaces", js.Any.fromFunction1(value))
      
      inline def setToCSS(value: () => String): Self = StObject.set(x, "toCSS", js.Any.fromFunction0(value))
      
      inline def setToHEX(value: () => String): Self = StObject.set(x, "toHEX", js.Any.fromFunction0(value))
    }
  }
  
  trait HSL extends StObject {
    
    var h: Double
    
    var l: Double
    
    var s: Double
  }
  object HSL {
    
    inline def apply(h: Double, l: Double, s: Double): HSL = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[HSL]
    }
    
    extension [Self <: HSL](x: Self) {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
  
  trait HSV extends StObject {
    
    var h: Double
    
    var s: Double
    
    var v: Double
  }
  object HSV {
    
    inline def apply(h: Double, s: Double, v: Double): HSV = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[HSV]
    }
    
    extension [Self <: HSV](x: Self) {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  extension [Self <: JQueryColorpickerStatic](x: Self) {
    
    inline def setColor(value: Instantiable): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setLimits(value: StringDictionary[js.Function1[/* color */ Any, Unit]]): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
    
    inline def setParsers(value: StringDictionary[js.Function1[/* color */ Any, Any]]): Self = StObject.set(x, "parsers", value.asInstanceOf[js.Any])
    
    inline def setParts(value: StringDictionary[js.Function1[/* inst */ Any, Any]]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    inline def setPartslists(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "partslists", value.asInstanceOf[js.Any])
    
    inline def setRegional(value: StringDictionary[String]): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    inline def setSwatches(value: StringDictionary[StringDictionary[RGB]]): Self = StObject.set(x, "swatches", value.asInstanceOf[js.Any])
    
    inline def setWriters(value: StringDictionary[js.Function2[/* color */ Any, /* that */ Any, Any]]): Self = StObject.set(x, "writers", value.asInstanceOf[js.Any])
  }
  
  trait LAB extends StObject {
    
    var a: Double
    
    var b: Double
    
    var l: Double
  }
  object LAB {
    
    inline def apply(a: Double, b: Double, l: Double): LAB = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any])
      __obj.asInstanceOf[LAB]
    }
    
    extension [Self <: LAB](x: Self) {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    }
  }
  
  trait RGB extends StObject {
    
    var b: Double
    
    var g: Double
    
    var r: Double
  }
  object RGB {
    
    inline def apply(b: Double, g: Double, r: Double): RGB = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGB]
    }
    
    extension [Self <: RGB](x: Self) {
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
}
