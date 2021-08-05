package typings.i18nJs

import org.scalablytyped.runtime.StringDictionary
import typings.i18nJs.anon.Message
import typings.i18nJs.i18nJsStrings.currency
import typings.i18nJs.i18nJsStrings.guess
import typings.i18nJs.i18nJsStrings.message
import typings.i18nJs.i18nJsStrings.number
import typings.i18nJs.i18nJsStrings.percentage
import typings.std.Date
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("i18n-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def currentLocale(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("currentLocale")().asInstanceOf[String]
  
  @JSImport("i18n-js", "defaultLocale")
  @js.native
  def defaultLocale: String = js.native
  inline def defaultLocale_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultLocale")(x.asInstanceOf[js.Any])
  
  @JSImport("i18n-js", "defaultSeparator")
  @js.native
  def defaultSeparator: String = js.native
  inline def defaultSeparator_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSeparator")(x.asInstanceOf[js.Any])
  
  @JSImport("i18n-js", "fallbacks")
  @js.native
  def fallbacks: Boolean | String | (StringDictionary[String | js.Array[String]]) = js.native
  inline def fallbacks_=(x: Boolean | String | (StringDictionary[String | js.Array[String]])): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fallbacks")(x.asInstanceOf[js.Any])
  
  // tslint:disable-next-line prefer-declare-function
  @JSImport("i18n-js", "getFullScope")
  @js.native
  def getFullScope: js.Function2[
    /* scope */ String | js.Array[String], 
    /* options */ js.UndefOr[TranslateOptions], 
    String
  ] = js.native
  inline def getFullScope_=(
    x: js.Function2[
      /* scope */ String | js.Array[String], 
      /* options */ js.UndefOr[TranslateOptions], 
      String
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getFullScope")(x.asInstanceOf[js.Any])
  
  inline def l(scope: Scope, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("l")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def l(scope: Scope, value: String, options: InterpolateOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("l")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def l(scope: Scope, value: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("l")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def l(scope: Scope, value: Double, options: InterpolateOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("l")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def l(scope: Scope, value: Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("l")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def l(scope: Scope, value: Date, options: InterpolateOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("l")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def l_currency(scope: currency, value: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("l")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def l_currency(scope: currency, value: Double, options: InterpolateOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("l")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def l_number(scope: number, value: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("l")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def l_number(scope: number, value: Double, options: InterpolateOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("l")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def l_percentage(scope: percentage, value: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("l")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def l_percentage(scope: percentage, value: Double, options: InterpolateOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("l")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("i18n-js", "locale")
  @js.native
  def locale: String = js.native
  inline def locale_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
  
  inline def localize(scope: Scope, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("localize")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def localize(scope: Scope, value: String, options: InterpolateOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("localize")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def localize(scope: Scope, value: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("localize")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def localize(scope: Scope, value: Double, options: InterpolateOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("localize")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def localize(scope: Scope, value: Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("localize")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def localize(scope: Scope, value: Date, options: InterpolateOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("localize")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def localize_currency(scope: currency, value: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("localize")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def localize_currency(scope: currency, value: Double, options: InterpolateOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("localize")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def localize_number(scope: number, value: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("localize")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def localize_number(scope: number, value: Double, options: InterpolateOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("localize")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def localize_percentage(scope: percentage, value: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("localize")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def localize_percentage(scope: percentage, value: Double, options: InterpolateOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("localize")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("i18n-js", "missingBehaviour")
  @js.native
  def missingBehaviour: message | guess = js.native
  inline def missingBehaviour_=(x: message | guess): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("missingBehaviour")(x.asInstanceOf[js.Any])
  
  // tslint:disable-next-line prefer-declare-function
  @JSImport("i18n-js", "missingPlaceholder")
  @js.native
  def missingPlaceholder: js.Function3[
    /* placeholder */ String, 
    /* message */ String, 
    /* options */ js.UndefOr[InterpolateOptions], 
    js.UndefOr[String | Null]
  ] = js.native
  inline def missingPlaceholder_=(
    x: js.Function3[
      /* placeholder */ String, 
      /* message */ String, 
      /* options */ js.UndefOr[InterpolateOptions], 
      js.UndefOr[String | Null]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("missingPlaceholder")(x.asInstanceOf[js.Any])
  
  // tslint:disable-next-line prefer-declare-function
  @JSImport("i18n-js", "missingTranslation")
  @js.native
  def missingTranslation: js.Function2[
    /* scope */ String, 
    /* options */ js.UndefOr[TranslateOptions], 
    js.UndefOr[String | Null]
  ] = js.native
  
  @JSImport("i18n-js", "missingTranslationPrefix")
  @js.native
  def missingTranslationPrefix: String = js.native
  inline def missingTranslationPrefix_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("missingTranslationPrefix")(x.asInstanceOf[js.Any])
  
  inline def missingTranslation_=(
    x: js.Function2[
      /* scope */ String, 
      /* options */ js.UndefOr[TranslateOptions], 
      js.UndefOr[String | Null]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("missingTranslation")(x.asInstanceOf[js.Any])
  
  // tslint:disable-next-line prefer-declare-function
  @JSImport("i18n-js", "nullPlaceholder")
  @js.native
  def nullPlaceholder: js.Function3[
    /* placeholder */ String, 
    /* message */ String, 
    /* options */ js.UndefOr[InterpolateOptions], 
    js.UndefOr[String | Null]
  ] = js.native
  inline def nullPlaceholder_=(
    x: js.Function3[
      /* placeholder */ String, 
      /* message */ String, 
      /* options */ js.UndefOr[InterpolateOptions], 
      js.UndefOr[String | Null]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nullPlaceholder")(x.asInstanceOf[js.Any])
  
  @JSImport("i18n-js", "placeholder")
  @js.native
  def placeholder: RegExp = js.native
  inline def placeholder_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(x.asInstanceOf[js.Any])
  
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  
  inline def strftime(date: Date, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("strftime")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def t(scope: Scope): String = ^.asInstanceOf[js.Dynamic].applyDynamic("t")(scope.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def t(scope: Scope, options: TranslateOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("t")(scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toCurrency(num: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toCurrency")(num.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toCurrency(num: Double, options: ToCurrencyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toCurrency")(num.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toHumanSize(num: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHumanSize")(num.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toHumanSize(num: Double, options: ToHumanSizeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toHumanSize")(num.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toNumber(num: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toNumber")(num.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toNumber(num: Double, options: ToNumberOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toNumber")(num.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toPercentage(num: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toPercentage")(num.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toPercentage(num: Double, options: ToPercentageOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toPercentage")(num.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toTime(scope: Scope, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toTime")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toTime(scope: Scope, value: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toTime")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toTime(scope: Scope, value: Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toTime")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def translate(scope: Scope): String = ^.asInstanceOf[js.Dynamic].applyDynamic("translate")(scope.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def translate(scope: Scope, options: TranslateOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type InterpolateOptions = StringDictionary[js.Any]
  
  type Scope = String | js.Array[String]
  
  trait ToCurrencyOptions
    extends StObject
       with ToNumberOptions {
    
    var format: js.UndefOr[String] = js.undefined
    
    var sign_first: js.UndefOr[Boolean] = js.undefined
    
    var unit: js.UndefOr[String] = js.undefined
  }
  object ToCurrencyOptions {
    
    inline def apply(): ToCurrencyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToCurrencyOptions]
    }
    
    extension [Self <: ToCurrencyOptions](x: Self) {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setSign_first(value: Boolean): Self = StObject.set(x, "sign_first", value.asInstanceOf[js.Any])
      
      inline def setSign_firstUndefined: Self = StObject.set(x, "sign_first", js.undefined)
      
      inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
  
  trait ToHumanSizeOptions
    extends StObject
       with ToNumberOptions {
    
    var format: js.UndefOr[String] = js.undefined
  }
  object ToHumanSizeOptions {
    
    inline def apply(): ToHumanSizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToHumanSizeOptions]
    }
    
    extension [Self <: ToHumanSizeOptions](x: Self) {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    }
  }
  
  trait ToNumberOptions extends StObject {
    
    var delimiter: js.UndefOr[String] = js.undefined
    
    var precision: js.UndefOr[Double] = js.undefined
    
    var separator: js.UndefOr[String] = js.undefined
    
    var strip_insignificant_zeros: js.UndefOr[Boolean] = js.undefined
  }
  object ToNumberOptions {
    
    inline def apply(): ToNumberOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToNumberOptions]
    }
    
    extension [Self <: ToNumberOptions](x: Self) {
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setStrip_insignificant_zeros(value: Boolean): Self = StObject.set(x, "strip_insignificant_zeros", value.asInstanceOf[js.Any])
      
      inline def setStrip_insignificant_zerosUndefined: Self = StObject.set(x, "strip_insignificant_zeros", js.undefined)
    }
  }
  
  type ToPercentageOptions = ToNumberOptions
  
  trait TranslateOptions
    extends StObject
       with InterpolateOptions {
    
    var defaultValue: js.UndefOr[String] = js.undefined
    
    var defaults: js.UndefOr[js.Array[Message | typings.i18nJs.anon.Scope]] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var scope: js.UndefOr[Scope] = js.undefined
  }
  object TranslateOptions {
    
    inline def apply(): TranslateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TranslateOptions]
    }
    
    extension [Self <: TranslateOptions](x: Self) {
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaults(value: js.Array[Message | typings.i18nJs.anon.Scope]): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      inline def setDefaultsVarargs(value: (Message | typings.i18nJs.anon.Scope)*): Self = StObject.set(x, "defaults", js.Array(value :_*))
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
    }
  }
}
