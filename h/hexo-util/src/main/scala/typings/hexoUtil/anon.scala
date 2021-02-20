package typings.hexoUtil

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.hexoUtil.hexoUtilNumbers.`1`
import typings.hexoUtil.hexoUtilNumbers.`2`
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AutoDetect extends StObject {
    
    var autoDetect: js.UndefOr[Boolean] = js.native
    
    var caption: js.UndefOr[String] = js.native
    
    var firstLine: js.UndefOr[Double] = js.native
    
    var gutter: js.UndefOr[Boolean] = js.native
    
    var hljs: js.UndefOr[Boolean] = js.native
    
    var lang: js.UndefOr[String] = js.native
    
    var mark: js.UndefOr[js.Array[Double]] = js.native
    
    var tab: js.UndefOr[String] = js.native
    
    var wrap: js.UndefOr[Boolean] = js.native
  }
  object AutoDetect {
    
    @scala.inline
    def apply(): AutoDetect = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoDetect]
    }
    
    @scala.inline
    implicit class AutoDetectMutableBuilder[Self <: AutoDetect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoDetect(value: Boolean): Self = StObject.set(x, "autoDetect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoDetectUndefined: Self = StObject.set(x, "autoDetect", js.undefined)
      
      @scala.inline
      def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      @scala.inline
      def setFirstLine(value: Double): Self = StObject.set(x, "firstLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstLineUndefined: Self = StObject.set(x, "firstLine", js.undefined)
      
      @scala.inline
      def setGutter(value: Boolean): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      @scala.inline
      def setHljs(value: Boolean): Self = StObject.set(x, "hljs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHljsUndefined: Self = StObject.set(x, "hljs", js.undefined)
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setMark(value: js.Array[Double]): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      @scala.inline
      def setMarkVarargs(value: Double*): Self = StObject.set(x, "mark", js.Array(value :_*))
      
      @scala.inline
      def setTab(value: String): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabUndefined: Self = StObject.set(x, "tab", js.undefined)
      
      @scala.inline
      def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  @js.native
  trait Dictindex
    extends /* index */ NumberDictionary[js.Any]
       with /* name */ StringDictionary[js.Any] {
    
    var `0`: String = js.native
  }
  object Dictindex {
    
    @scala.inline
    def apply(`0`: String): Dictindex = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictindex]
    }
    
    @scala.inline
    implicit class DictindexMutableBuilder[Self <: Dictindex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set0(value: String): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Length extends StObject {
    
    var length: js.UndefOr[Double] = js.native
    
    var omission: js.UndefOr[String] = js.native
    
    var separator: js.UndefOr[String] = js.native
  }
  object Length {
    
    @scala.inline
    def apply(): Length = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Length]
    }
    
    @scala.inline
    implicit class LengthMutableBuilder[Self <: Length] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setOmission(value: String): Self = StObject.set(x, "omission", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOmissionUndefined: Self = StObject.set(x, "omission", js.undefined)
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
  
  @js.native
  trait Segments extends StObject {
    
    var segments: js.UndefOr[StringDictionary[String | RegExp]] = js.native
  }
  object Segments {
    
    @scala.inline
    def apply(): Segments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Segments]
    }
    
    @scala.inline
    implicit class SegmentsMutableBuilder[Self <: Segments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSegments(value: StringDictionary[String | RegExp]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    }
  }
  
  @js.native
  trait Separator extends StObject {
    
    var separator: js.UndefOr[String] = js.native
    
    var transform: js.UndefOr[`1` | `2`] = js.native
  }
  object Separator {
    
    @scala.inline
    def apply(): Separator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Separator]
    }
    
    @scala.inline
    implicit class SeparatorMutableBuilder[Self <: Separator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setTransform(value: `1` | `2`): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  @js.native
  trait Width extends StObject {
    
    var width: js.UndefOr[Double] = js.native
  }
  object Width {
    
    @scala.inline
    def apply(): Width = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Width]
    }
    
    @scala.inline
    implicit class WidthMutableBuilder[Self <: Width] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
