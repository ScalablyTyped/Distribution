package typings.jqueryMaskPlugin

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jQueryMask {
  
  trait Invalid extends StObject {
    
    var e: String
    
    var p: Double
    
    var v: String
  }
  object Invalid {
    
    @scala.inline
    def apply(e: String, p: Double, v: String): Invalid = {
      val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[Invalid]
    }
    
    @scala.inline
    implicit class InvalidMutableBuilder[Self <: Invalid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP(value: Double): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var byPassKeys: js.UndefOr[js.Array[Double]] = js.undefined
    
    var clearIfNotMatch: js.UndefOr[Boolean] = js.undefined
    
    var dataMask: js.UndefOr[Boolean] = js.undefined
    
    var dataMaskAttr: js.UndefOr[String] = js.undefined
    
    var maskElements: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function4[/* value */ String, /* e */ Event, /* $element */ JQuery, /* options */ this.type, Unit]
      ] = js.undefined
    
    var onComplete: js.UndefOr[
        js.Function4[/* value */ String, /* e */ Event, /* $element */ JQuery, /* options */ this.type, Unit]
      ] = js.undefined
    
    var onInvalid: js.UndefOr[
        js.Function5[
          /* value */ String, 
          /* e */ Event, 
          /* $element */ JQuery, 
          /* invalid */ js.Array[Invalid], 
          /* options */ this.type, 
          Unit
        ]
      ] = js.undefined
    
    var onKeyPress: js.UndefOr[
        js.Function4[/* value */ String, /* e */ Event, /* $element */ JQuery, /* options */ this.type, Unit]
      ] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    var selectOnFocus: js.UndefOr[Boolean] = js.undefined
    
    var translation: js.UndefOr[Translation] = js.undefined
    
    var watchDataMask: js.UndefOr[Boolean] = js.undefined
    
    var watchInputs: js.UndefOr[Boolean] = js.undefined
    
    var watchInterval: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setByPassKeys(value: js.Array[Double]): Self = StObject.set(x, "byPassKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByPassKeysUndefined: Self = StObject.set(x, "byPassKeys", js.undefined)
      
      @scala.inline
      def setByPassKeysVarargs(value: Double*): Self = StObject.set(x, "byPassKeys", js.Array(value :_*))
      
      @scala.inline
      def setClearIfNotMatch(value: Boolean): Self = StObject.set(x, "clearIfNotMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearIfNotMatchUndefined: Self = StObject.set(x, "clearIfNotMatch", js.undefined)
      
      @scala.inline
      def setDataMask(value: Boolean): Self = StObject.set(x, "dataMask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataMaskAttr(value: String): Self = StObject.set(x, "dataMaskAttr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataMaskAttrUndefined: Self = StObject.set(x, "dataMaskAttr", js.undefined)
      
      @scala.inline
      def setDataMaskUndefined: Self = StObject.set(x, "dataMask", js.undefined)
      
      @scala.inline
      def setMaskElements(value: String): Self = StObject.set(x, "maskElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskElementsUndefined: Self = StObject.set(x, "maskElements", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* value */ String, /* e */ Event, /* $element */ JQuery, Options) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnComplete(value: (/* value */ String, /* e */ Event, /* $element */ JQuery, Options) => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      @scala.inline
      def setOnInvalid(
        value: (/* value */ String, /* e */ Event, /* $element */ JQuery, /* invalid */ js.Array[Invalid], Options) => Unit
      ): Self = StObject.set(x, "onInvalid", js.Any.fromFunction5(value))
      
      @scala.inline
      def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      @scala.inline
      def setOnKeyPress(value: (/* value */ String, /* e */ Event, /* $element */ JQuery, Options) => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      @scala.inline
      def setSelectOnFocus(value: Boolean): Self = StObject.set(x, "selectOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectOnFocusUndefined: Self = StObject.set(x, "selectOnFocus", js.undefined)
      
      @scala.inline
      def setTranslation(value: Translation): Self = StObject.set(x, "translation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslationUndefined: Self = StObject.set(x, "translation", js.undefined)
      
      @scala.inline
      def setWatchDataMask(value: Boolean): Self = StObject.set(x, "watchDataMask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchDataMaskUndefined: Self = StObject.set(x, "watchDataMask", js.undefined)
      
      @scala.inline
      def setWatchInputs(value: Boolean): Self = StObject.set(x, "watchInputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchInputsUndefined: Self = StObject.set(x, "watchInputs", js.undefined)
      
      @scala.inline
      def setWatchInterval(value: Double): Self = StObject.set(x, "watchInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchIntervalUndefined: Self = StObject.set(x, "watchInterval", js.undefined)
    }
  }
  
  trait Pattern extends StObject {
    
    var fallback: js.UndefOr[String] = js.undefined
    
    var optional: js.UndefOr[Boolean] = js.undefined
    
    var pattern: js.UndefOr[RegExp] = js.undefined
    
    var recursive: js.UndefOr[Boolean] = js.undefined
  }
  object Pattern {
    
    @scala.inline
    def apply(): Pattern = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Pattern]
    }
    
    @scala.inline
    implicit class PatternMutableBuilder[Self <: Pattern] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFallback(value: String): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      @scala.inline
      def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
      
      @scala.inline
      def setPattern(value: RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      @scala.inline
      def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    }
  }
  
  trait Translation
    extends StObject
       with /* key */ StringDictionary[js.UndefOr[Pattern | js.Object]] {
    
    var placeholder: js.UndefOr[String] = js.undefined
  }
  object Translation {
    
    @scala.inline
    def apply(): Translation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Translation]
    }
    
    @scala.inline
    implicit class TranslationMutableBuilder[Self <: Translation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    }
  }
}
