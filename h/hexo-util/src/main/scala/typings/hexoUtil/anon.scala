package typings.hexoUtil

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.hexoUtil.hexoUtilNumbers.`1`
import typings.hexoUtil.hexoUtilNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AutoDetect extends StObject {
    
    var autoDetect: js.UndefOr[Boolean] = js.undefined
    
    var caption: js.UndefOr[String] = js.undefined
    
    var firstLine: js.UndefOr[Double] = js.undefined
    
    var gutter: js.UndefOr[Boolean] = js.undefined
    
    var hljs: js.UndefOr[Boolean] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var mark: js.UndefOr[js.Array[Double]] = js.undefined
    
    var tab: js.UndefOr[String] = js.undefined
    
    var wrap: js.UndefOr[Boolean] = js.undefined
  }
  object AutoDetect {
    
    inline def apply(): AutoDetect = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoDetect]
    }
    
    extension [Self <: AutoDetect](x: Self) {
      
      inline def setAutoDetect(value: Boolean): Self = StObject.set(x, "autoDetect", value.asInstanceOf[js.Any])
      
      inline def setAutoDetectUndefined: Self = StObject.set(x, "autoDetect", js.undefined)
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setFirstLine(value: Double): Self = StObject.set(x, "firstLine", value.asInstanceOf[js.Any])
      
      inline def setFirstLineUndefined: Self = StObject.set(x, "firstLine", js.undefined)
      
      inline def setGutter(value: Boolean): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      inline def setHljs(value: Boolean): Self = StObject.set(x, "hljs", value.asInstanceOf[js.Any])
      
      inline def setHljsUndefined: Self = StObject.set(x, "hljs", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setMark(value: js.Array[Double]): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      inline def setMarkVarargs(value: Double*): Self = StObject.set(x, "mark", js.Array(value*))
      
      inline def setTab(value: String): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
      
      inline def setTabUndefined: Self = StObject.set(x, "tab", js.undefined)
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  trait Dictindex
    extends StObject
       with /* index */ NumberDictionary[Any]
       with /* name */ StringDictionary[Any] {
    
    var `0`: String
  }
  object Dictindex {
    
    inline def apply(`0`: String): Dictindex = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictindex]
    }
    
    extension [Self <: Dictindex](x: Self) {
      
      inline def set0(value: String): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    }
  }
  
  trait Length extends StObject {
    
    var length: js.UndefOr[Double] = js.undefined
    
    var omission: js.UndefOr[String] = js.undefined
    
    var separator: js.UndefOr[String] = js.undefined
  }
  object Length {
    
    inline def apply(): Length = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Length]
    }
    
    extension [Self <: Length](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setOmission(value: String): Self = StObject.set(x, "omission", value.asInstanceOf[js.Any])
      
      inline def setOmissionUndefined: Self = StObject.set(x, "omission", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
  
  trait Segments extends StObject {
    
    var segments: js.UndefOr[StringDictionary[String | js.RegExp]] = js.undefined
  }
  object Segments {
    
    inline def apply(): Segments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Segments]
    }
    
    extension [Self <: Segments](x: Self) {
      
      inline def setSegments(value: StringDictionary[String | js.RegExp]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
      
      inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    }
  }
  
  trait Separator extends StObject {
    
    var separator: js.UndefOr[String] = js.undefined
    
    var transform: js.UndefOr[`1` | `2`] = js.undefined
  }
  object Separator {
    
    inline def apply(): Separator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Separator]
    }
    
    extension [Self <: Separator](x: Self) {
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setTransform(value: `1` | `2`): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  trait Width extends StObject {
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object Width {
    
    inline def apply(): Width = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Width]
    }
    
    extension [Self <: Width](x: Self) {
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
