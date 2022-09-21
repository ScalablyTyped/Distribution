package typings.jqueryMaskPlugin

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
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
    
    inline def apply(e: String, p: Double, v: String): Invalid = {
      val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[Invalid]
    }
    
    extension [Self <: Invalid](x: Self) {
      
      inline def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setP(value: Double): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
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
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setByPassKeys(value: js.Array[Double]): Self = StObject.set(x, "byPassKeys", value.asInstanceOf[js.Any])
      
      inline def setByPassKeysUndefined: Self = StObject.set(x, "byPassKeys", js.undefined)
      
      inline def setByPassKeysVarargs(value: Double*): Self = StObject.set(x, "byPassKeys", js.Array(value*))
      
      inline def setClearIfNotMatch(value: Boolean): Self = StObject.set(x, "clearIfNotMatch", value.asInstanceOf[js.Any])
      
      inline def setClearIfNotMatchUndefined: Self = StObject.set(x, "clearIfNotMatch", js.undefined)
      
      inline def setDataMask(value: Boolean): Self = StObject.set(x, "dataMask", value.asInstanceOf[js.Any])
      
      inline def setDataMaskAttr(value: String): Self = StObject.set(x, "dataMaskAttr", value.asInstanceOf[js.Any])
      
      inline def setDataMaskAttrUndefined: Self = StObject.set(x, "dataMaskAttr", js.undefined)
      
      inline def setDataMaskUndefined: Self = StObject.set(x, "dataMask", js.undefined)
      
      inline def setMaskElements(value: String): Self = StObject.set(x, "maskElements", value.asInstanceOf[js.Any])
      
      inline def setMaskElementsUndefined: Self = StObject.set(x, "maskElements", js.undefined)
      
      inline def setOnChange(value: (/* value */ String, /* e */ Event, /* $element */ JQuery, Options) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction4(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnComplete(value: (/* value */ String, /* e */ Event, /* $element */ JQuery, Options) => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction4(value))
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      inline def setOnInvalid(
        value: (/* value */ String, /* e */ Event, /* $element */ JQuery, /* invalid */ js.Array[Invalid], Options) => Unit
      ): Self = StObject.set(x, "onInvalid", js.Any.fromFunction5(value))
      
      inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      inline def setOnKeyPress(value: (/* value */ String, /* e */ Event, /* $element */ JQuery, Options) => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction4(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setSelectOnFocus(value: Boolean): Self = StObject.set(x, "selectOnFocus", value.asInstanceOf[js.Any])
      
      inline def setSelectOnFocusUndefined: Self = StObject.set(x, "selectOnFocus", js.undefined)
      
      inline def setTranslation(value: Translation): Self = StObject.set(x, "translation", value.asInstanceOf[js.Any])
      
      inline def setTranslationUndefined: Self = StObject.set(x, "translation", js.undefined)
      
      inline def setWatchDataMask(value: Boolean): Self = StObject.set(x, "watchDataMask", value.asInstanceOf[js.Any])
      
      inline def setWatchDataMaskUndefined: Self = StObject.set(x, "watchDataMask", js.undefined)
      
      inline def setWatchInputs(value: Boolean): Self = StObject.set(x, "watchInputs", value.asInstanceOf[js.Any])
      
      inline def setWatchInputsUndefined: Self = StObject.set(x, "watchInputs", js.undefined)
      
      inline def setWatchInterval(value: Double): Self = StObject.set(x, "watchInterval", value.asInstanceOf[js.Any])
      
      inline def setWatchIntervalUndefined: Self = StObject.set(x, "watchInterval", js.undefined)
    }
  }
  
  trait Pattern extends StObject {
    
    var fallback: js.UndefOr[String] = js.undefined
    
    var optional: js.UndefOr[Boolean] = js.undefined
    
    var pattern: js.UndefOr[js.RegExp] = js.undefined
    
    var recursive: js.UndefOr[Boolean] = js.undefined
  }
  object Pattern {
    
    inline def apply(): Pattern = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Pattern]
    }
    
    extension [Self <: Pattern](x: Self) {
      
      inline def setFallback(value: String): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
      
      inline def setPattern(value: js.RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    }
  }
  
  trait Translation
    extends StObject
       with /* key */ StringDictionary[js.UndefOr[Pattern | js.Object]] {
    
    var placeholder: js.UndefOr[String] = js.undefined
  }
  object Translation {
    
    inline def apply(): Translation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Translation]
    }
    
    extension [Self <: Translation](x: Self) {
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    }
  }
}
