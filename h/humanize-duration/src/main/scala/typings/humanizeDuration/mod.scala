package typings.humanizeDuration

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("humanize-duration", JSImport.Namespace)
  @js.native
  def apply(ms: Double): String = js.native
  @JSImport("humanize-duration", JSImport.Namespace)
  @js.native
  def apply(ms: Double, options: Options): String = js.native
  
  /**
    * This function won't return any new languages you define; it will only return the defaults supported by the library.
    */
  @JSImport("humanize-duration", "getSupportedLanguages")
  @js.native
  def getSupportedLanguages(): js.Array[LanguageCode] = js.native
  
  @JSImport("humanize-duration", "humanizer")
  @js.native
  def humanizer(): Humanizer_ = js.native
  @JSImport("humanize-duration", "humanizer")
  @js.native
  def humanizer(options: HumanizerOptions): Humanizer_ = js.native
  
  @js.native
  trait HumanizerOptions extends Options {
    
    var languages: js.UndefOr[StringDictionary[UnitTranslationOptions]] = js.native
  }
  object HumanizerOptions {
    
    @scala.inline
    def apply(): HumanizerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HumanizerOptions]
    }
    
    @scala.inline
    implicit class HumanizerOptionsMutableBuilder[Self <: HumanizerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLanguages(value: StringDictionary[UnitTranslationOptions]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    }
  }
  
  @js.native
  trait Humanizer_ extends StObject {
    
    def apply(ms: Double): String = js.native
    def apply(ms: Double, options: Options): String = js.native
    
    var languages: StringDictionary[UnitTranslationOptions] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.humanizeDuration.humanizeDurationStrings.ar
    - typings.humanizeDuration.humanizeDurationStrings.bg
    - typings.humanizeDuration.humanizeDurationStrings.ca
    - typings.humanizeDuration.humanizeDurationStrings.zh_CN
    - typings.humanizeDuration.humanizeDurationStrings.zh_TW
    - typings.humanizeDuration.humanizeDurationStrings.hr
    - typings.humanizeDuration.humanizeDurationStrings.cs
    - typings.humanizeDuration.humanizeDurationStrings.da
    - typings.humanizeDuration.humanizeDurationStrings.nl
    - typings.humanizeDuration.humanizeDurationStrings.en
    - typings.humanizeDuration.humanizeDurationStrings.fa
    - typings.humanizeDuration.humanizeDurationStrings.fi
    - typings.humanizeDuration.humanizeDurationStrings.fr
    - typings.humanizeDuration.humanizeDurationStrings.de
    - typings.humanizeDuration.humanizeDurationStrings.el
    - typings.humanizeDuration.humanizeDurationStrings.hu
    - typings.humanizeDuration.humanizeDurationStrings.is
    - typings.humanizeDuration.humanizeDurationStrings.id
    - typings.humanizeDuration.humanizeDurationStrings.it
    - typings.humanizeDuration.humanizeDurationStrings.ja
    - typings.humanizeDuration.humanizeDurationStrings.ko
    - typings.humanizeDuration.humanizeDurationStrings.lo
    - typings.humanizeDuration.humanizeDurationStrings.lt
    - typings.humanizeDuration.humanizeDurationStrings.ms
    - typings.humanizeDuration.humanizeDurationStrings.no
    - typings.humanizeDuration.humanizeDurationStrings.pl
    - typings.humanizeDuration.humanizeDurationStrings.pt
    - typings.humanizeDuration.humanizeDurationStrings.ro
    - typings.humanizeDuration.humanizeDurationStrings.ru
    - typings.humanizeDuration.humanizeDurationStrings.sk
    - typings.humanizeDuration.humanizeDurationStrings.es
    - typings.humanizeDuration.humanizeDurationStrings.sv
    - typings.humanizeDuration.humanizeDurationStrings.tr
    - typings.humanizeDuration.humanizeDurationStrings.th
    - typings.humanizeDuration.humanizeDurationStrings.uk
    - typings.humanizeDuration.humanizeDurationStrings.ur
    - typings.humanizeDuration.humanizeDurationStrings.vi
  */
  trait LanguageCode extends StObject
  object LanguageCode {
    
    @scala.inline
    def ar: typings.humanizeDuration.humanizeDurationStrings.ar = "ar".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.ar]
    
    @scala.inline
    def bg: typings.humanizeDuration.humanizeDurationStrings.bg = "bg".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.bg]
    
    @scala.inline
    def ca: typings.humanizeDuration.humanizeDurationStrings.ca = "ca".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.ca]
    
    @scala.inline
    def cs: typings.humanizeDuration.humanizeDurationStrings.cs = "cs".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.cs]
    
    @scala.inline
    def da: typings.humanizeDuration.humanizeDurationStrings.da = "da".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.da]
    
    @scala.inline
    def de: typings.humanizeDuration.humanizeDurationStrings.de = "de".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.de]
    
    @scala.inline
    def el: typings.humanizeDuration.humanizeDurationStrings.el = "el".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.el]
    
    @scala.inline
    def en: typings.humanizeDuration.humanizeDurationStrings.en = "en".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.en]
    
    @scala.inline
    def es: typings.humanizeDuration.humanizeDurationStrings.es = "es".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.es]
    
    @scala.inline
    def fa: typings.humanizeDuration.humanizeDurationStrings.fa = "fa".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.fa]
    
    @scala.inline
    def fi: typings.humanizeDuration.humanizeDurationStrings.fi = "fi".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.fi]
    
    @scala.inline
    def fr: typings.humanizeDuration.humanizeDurationStrings.fr = "fr".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.fr]
    
    @scala.inline
    def hr: typings.humanizeDuration.humanizeDurationStrings.hr = "hr".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.hr]
    
    @scala.inline
    def hu: typings.humanizeDuration.humanizeDurationStrings.hu = "hu".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.hu]
    
    @scala.inline
    def id: typings.humanizeDuration.humanizeDurationStrings.id = "id".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.id]
    
    @scala.inline
    def is: typings.humanizeDuration.humanizeDurationStrings.is = "is".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.is]
    
    @scala.inline
    def it: typings.humanizeDuration.humanizeDurationStrings.it = "it".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.it]
    
    @scala.inline
    def ja: typings.humanizeDuration.humanizeDurationStrings.ja = "ja".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.ja]
    
    @scala.inline
    def ko: typings.humanizeDuration.humanizeDurationStrings.ko = "ko".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.ko]
    
    @scala.inline
    def lo: typings.humanizeDuration.humanizeDurationStrings.lo = "lo".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.lo]
    
    @scala.inline
    def lt: typings.humanizeDuration.humanizeDurationStrings.lt = "lt".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.lt]
    
    @scala.inline
    def ms: typings.humanizeDuration.humanizeDurationStrings.ms = "ms".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.ms]
    
    @scala.inline
    def nl: typings.humanizeDuration.humanizeDurationStrings.nl = "nl".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.nl]
    
    @scala.inline
    def no: typings.humanizeDuration.humanizeDurationStrings.no = "no".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.no]
    
    @scala.inline
    def pl: typings.humanizeDuration.humanizeDurationStrings.pl = "pl".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.pl]
    
    @scala.inline
    def pt: typings.humanizeDuration.humanizeDurationStrings.pt = "pt".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.pt]
    
    @scala.inline
    def ro: typings.humanizeDuration.humanizeDurationStrings.ro = "ro".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.ro]
    
    @scala.inline
    def ru: typings.humanizeDuration.humanizeDurationStrings.ru = "ru".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.ru]
    
    @scala.inline
    def sk: typings.humanizeDuration.humanizeDurationStrings.sk = "sk".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.sk]
    
    @scala.inline
    def sv: typings.humanizeDuration.humanizeDurationStrings.sv = "sv".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.sv]
    
    @scala.inline
    def th: typings.humanizeDuration.humanizeDurationStrings.th = "th".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.th]
    
    @scala.inline
    def tr: typings.humanizeDuration.humanizeDurationStrings.tr = "tr".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.tr]
    
    @scala.inline
    def uk: typings.humanizeDuration.humanizeDurationStrings.uk = "uk".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.uk]
    
    @scala.inline
    def ur: typings.humanizeDuration.humanizeDurationStrings.ur = "ur".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.ur]
    
    @scala.inline
    def vi: typings.humanizeDuration.humanizeDurationStrings.vi = "vi".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.vi]
    
    @scala.inline
    def zh_CN: typings.humanizeDuration.humanizeDurationStrings.zh_CN = "zh_CN".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.zh_CN]
    
    @scala.inline
    def zh_TW: typings.humanizeDuration.humanizeDurationStrings.zh_TW = "zh_TW".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.zh_TW]
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * String to include before the final unit. You can also set serialComma to false to eliminate the final comma.
      */
    var conjunction: js.UndefOr[String] = js.native
    
    /**
      * String to substitute for the decimal point in a decimal fraction.
      */
    var decimal: js.UndefOr[String] = js.native
    
    /**
      * String to display between the previous unit and the next value.
      */
    var delimiter: js.UndefOr[String] = js.native
    
    /**
      * Fallback languages if the provided language cannot be found (accepts an ISO 639-1 code from one of the supported languages). It works from left to right.
      */
    var fallbacks: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Language for unit display (accepts an ISO 639-1 code from one of the supported languages).
      */
    var language: js.UndefOr[String] = js.native
    
    /**
      * Number representing the maximum number of units to display for the duration.
      */
    var largest: js.UndefOr[Double] = js.native
    
    /**
      * Number that defines a maximal decimal points for float values.
      */
    var maxDecimalPoints: js.UndefOr[Double] = js.native
    
    /**
      * Boolean value. Use true to round the smallest unit displayed (can be combined with largest and units).
      */
    var round: js.UndefOr[Boolean] = js.native
    
    var serialComma: js.UndefOr[Boolean] = js.native
    
    /**
      * String to display between each value and unit.
      */
    var spacer: js.UndefOr[String] = js.native
    
    /**
      * Customize the value used to calculate each unit of time.
      */
    var unitMeasures: js.UndefOr[UnitMeasuresOptions] = js.native
    
    /**
      * Array of strings to define which units are used to display the duration (if needed).
      */
    var units: js.UndefOr[js.Array[Unit]] = js.native
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
      def setConjunction(value: String): Self = StObject.set(x, "conjunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConjunctionUndefined: Self = StObject.set(x, "conjunction", js.undefined)
      
      @scala.inline
      def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalUndefined: Self = StObject.set(x, "decimal", js.undefined)
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setFallbacks(value: js.Array[String]): Self = StObject.set(x, "fallbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbacksUndefined: Self = StObject.set(x, "fallbacks", js.undefined)
      
      @scala.inline
      def setFallbacksVarargs(value: String*): Self = StObject.set(x, "fallbacks", js.Array(value :_*))
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setLargest(value: Double): Self = StObject.set(x, "largest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargestUndefined: Self = StObject.set(x, "largest", js.undefined)
      
      @scala.inline
      def setMaxDecimalPoints(value: Double): Self = StObject.set(x, "maxDecimalPoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDecimalPointsUndefined: Self = StObject.set(x, "maxDecimalPoints", js.undefined)
      
      @scala.inline
      def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      @scala.inline
      def setSerialComma(value: Boolean): Self = StObject.set(x, "serialComma", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerialCommaUndefined: Self = StObject.set(x, "serialComma", js.undefined)
      
      @scala.inline
      def setSpacer(value: String): Self = StObject.set(x, "spacer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacerUndefined: Self = StObject.set(x, "spacer", js.undefined)
      
      @scala.inline
      def setUnitMeasures(value: UnitMeasuresOptions): Self = StObject.set(x, "unitMeasures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitMeasuresUndefined: Self = StObject.set(x, "unitMeasures", js.undefined)
      
      @scala.inline
      def setUnits(value: js.Array[Unit]): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
      
      @scala.inline
      def setUnitsVarargs(value: Unit*): Self = StObject.set(x, "units", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.humanizeDuration.humanizeDurationStrings.y
    - typings.humanizeDuration.humanizeDurationStrings.mo
    - typings.humanizeDuration.humanizeDurationStrings.w
    - typings.humanizeDuration.humanizeDurationStrings.d
    - typings.humanizeDuration.humanizeDurationStrings.h
    - typings.humanizeDuration.humanizeDurationStrings.m
    - typings.humanizeDuration.humanizeDurationStrings.s
    - typings.humanizeDuration.humanizeDurationStrings.ms
  */
  trait Unit extends StObject
  object Unit {
    
    @scala.inline
    def d: typings.humanizeDuration.humanizeDurationStrings.d = "d".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.d]
    
    @scala.inline
    def h: typings.humanizeDuration.humanizeDurationStrings.h = "h".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.h]
    
    @scala.inline
    def m: typings.humanizeDuration.humanizeDurationStrings.m = "m".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.m]
    
    @scala.inline
    def mo: typings.humanizeDuration.humanizeDurationStrings.mo = "mo".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.mo]
    
    @scala.inline
    def ms: typings.humanizeDuration.humanizeDurationStrings.ms = "ms".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.ms]
    
    @scala.inline
    def s: typings.humanizeDuration.humanizeDurationStrings.s = "s".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.s]
    
    @scala.inline
    def w: typings.humanizeDuration.humanizeDurationStrings.w = "w".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.w]
    
    @scala.inline
    def y: typings.humanizeDuration.humanizeDurationStrings.y = "y".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.y]
  }
  
  @js.native
  trait UnitMeasuresOptions extends StObject {
    
    var d: js.UndefOr[Double] = js.native
    
    var h: js.UndefOr[Double] = js.native
    
    var m: js.UndefOr[Double] = js.native
    
    var mo: js.UndefOr[Double] = js.native
    
    var ms: js.UndefOr[Double] = js.native
    
    var s: js.UndefOr[Double] = js.native
    
    var w: js.UndefOr[Double] = js.native
    
    var y: js.UndefOr[Double] = js.native
  }
  object UnitMeasuresOptions {
    
    @scala.inline
    def apply(): UnitMeasuresOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnitMeasuresOptions]
    }
    
    @scala.inline
    implicit class UnitMeasuresOptionsMutableBuilder[Self <: UnitMeasuresOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      @scala.inline
      def setM(value: Double): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      @scala.inline
      def setMo(value: Double): Self = StObject.set(x, "mo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoUndefined: Self = StObject.set(x, "mo", js.undefined)
      
      @scala.inline
      def setMs(value: Double): Self = StObject.set(x, "ms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsUndefined: Self = StObject.set(x, "ms", js.undefined)
      
      @scala.inline
      def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSUndefined: Self = StObject.set(x, "s", js.undefined)
      
      @scala.inline
      def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWUndefined: Self = StObject.set(x, "w", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait UnitTranslationOptions extends StObject {
    
    var d: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.native
    
    var h: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.native
    
    var m: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.native
    
    var mo: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.native
    
    var ms: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.native
    
    var s: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.native
    
    var w: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.native
    
    var y: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.native
  }
  object UnitTranslationOptions {
    
    @scala.inline
    def apply(): UnitTranslationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnitTranslationOptions]
    }
    
    @scala.inline
    implicit class UnitTranslationOptionsMutableBuilder[Self <: UnitTranslationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setD(value: /* count */ js.UndefOr[Double] => String): Self = StObject.set(x, "d", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      @scala.inline
      def setH(value: /* count */ js.UndefOr[Double] => String): Self = StObject.set(x, "h", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      @scala.inline
      def setM(value: /* count */ js.UndefOr[Double] => String): Self = StObject.set(x, "m", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      @scala.inline
      def setMo(value: /* count */ js.UndefOr[Double] => String): Self = StObject.set(x, "mo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMoUndefined: Self = StObject.set(x, "mo", js.undefined)
      
      @scala.inline
      def setMs(value: /* count */ js.UndefOr[Double] => String): Self = StObject.set(x, "ms", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMsUndefined: Self = StObject.set(x, "ms", js.undefined)
      
      @scala.inline
      def setS(value: /* count */ js.UndefOr[Double] => String): Self = StObject.set(x, "s", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSUndefined: Self = StObject.set(x, "s", js.undefined)
      
      @scala.inline
      def setW(value: /* count */ js.UndefOr[Double] => String): Self = StObject.set(x, "w", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWUndefined: Self = StObject.set(x, "w", js.undefined)
      
      @scala.inline
      def setY(value: /* count */ js.UndefOr[Double] => String): Self = StObject.set(x, "y", js.Any.fromFunction1(value))
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
