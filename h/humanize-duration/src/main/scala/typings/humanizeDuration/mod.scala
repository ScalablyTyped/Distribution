package typings.humanizeDuration

import org.scalablytyped.runtime.Shortcut
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("humanize-duration", JSImport.Namespace)
  @js.native
  val ^ : Humanizer = js.native
  
  @js.native
  trait Humanizer extends StObject {
    
    def apply(ms: Double): String = js.native
    def apply(ms: Double, options: Options): String = js.native
    
    /**
      * This function won't return any new languages you define; it will only return the defaults supported by the library.
      */
    def getSupportedLanguages(): js.Array[SupportedLanguage] = js.native
    
    def humanizer(): Humanizer = js.native
    def humanizer(options: HumanizerOptions): Humanizer = js.native
    
    var languages: Record[String, UnitTranslationOptions] = js.native
  }
  
  trait HumanizerOptions
    extends StObject
       with Options {
    
    var languages: js.UndefOr[Record[String, UnitTranslationOptions]] = js.undefined
  }
  object HumanizerOptions {
    
    inline def apply(): HumanizerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HumanizerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HumanizerOptions] (val x: Self) extends AnyVal {
      
      inline def setLanguages(value: Record[String, UnitTranslationOptions]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      inline def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.humanizeDuration.humanizeDurationStrings.af
    - typings.humanizeDuration.humanizeDurationStrings.ar
    - typings.humanizeDuration.humanizeDurationStrings.bg
    - typings.humanizeDuration.humanizeDurationStrings.bn
    - typings.humanizeDuration.humanizeDurationStrings.ca
    - typings.humanizeDuration.humanizeDurationStrings.cs
    - typings.humanizeDuration.humanizeDurationStrings.cy
    - typings.humanizeDuration.humanizeDurationStrings.da
    - typings.humanizeDuration.humanizeDurationStrings.de
    - typings.humanizeDuration.humanizeDurationStrings.el
    - typings.humanizeDuration.humanizeDurationStrings.en
    - typings.humanizeDuration.humanizeDurationStrings.eo
    - typings.humanizeDuration.humanizeDurationStrings.es
    - typings.humanizeDuration.humanizeDurationStrings.et
    - typings.humanizeDuration.humanizeDurationStrings.eu
    - typings.humanizeDuration.humanizeDurationStrings.fa
    - typings.humanizeDuration.humanizeDurationStrings.fi
    - typings.humanizeDuration.humanizeDurationStrings.fo
    - typings.humanizeDuration.humanizeDurationStrings.fr
    - typings.humanizeDuration.humanizeDurationStrings.gr
    - typings.humanizeDuration.humanizeDurationStrings.he
    - typings.humanizeDuration.humanizeDurationStrings.hi
    - typings.humanizeDuration.humanizeDurationStrings.hr
    - typings.humanizeDuration.humanizeDurationStrings.hu
    - typings.humanizeDuration.humanizeDurationStrings.id
    - typings.humanizeDuration.humanizeDurationStrings.is
    - typings.humanizeDuration.humanizeDurationStrings.it
    - typings.humanizeDuration.humanizeDurationStrings.ja
    - typings.humanizeDuration.humanizeDurationStrings.km
    - typings.humanizeDuration.humanizeDurationStrings.kn
    - typings.humanizeDuration.humanizeDurationStrings.ko
    - typings.humanizeDuration.humanizeDurationStrings.ku
    - typings.humanizeDuration.humanizeDurationStrings.lo
    - typings.humanizeDuration.humanizeDurationStrings.lt
    - typings.humanizeDuration.humanizeDurationStrings.lv
    - typings.humanizeDuration.humanizeDurationStrings.mk
    - typings.humanizeDuration.humanizeDurationStrings.mr
    - typings.humanizeDuration.humanizeDurationStrings.ms
    - typings.humanizeDuration.humanizeDurationStrings.nl
    - typings.humanizeDuration.humanizeDurationStrings.no
    - typings.humanizeDuration.humanizeDurationStrings.pl
    - typings.humanizeDuration.humanizeDurationStrings.pt
    - typings.humanizeDuration.humanizeDurationStrings.ro
    - typings.humanizeDuration.humanizeDurationStrings.ru
    - typings.humanizeDuration.humanizeDurationStrings.sk
    - typings.humanizeDuration.humanizeDurationStrings.sl
    - typings.humanizeDuration.humanizeDurationStrings.sq
    - typings.humanizeDuration.humanizeDurationStrings.sr
    - typings.humanizeDuration.humanizeDurationStrings.sv
    - typings.humanizeDuration.humanizeDurationStrings.sw
    - typings.humanizeDuration.humanizeDurationStrings.ta
    - typings.humanizeDuration.humanizeDurationStrings.te
    - typings.humanizeDuration.humanizeDurationStrings.th
    - typings.humanizeDuration.humanizeDurationStrings.tr
    - typings.humanizeDuration.humanizeDurationStrings.uk
    - typings.humanizeDuration.humanizeDurationStrings.ur
    - typings.humanizeDuration.humanizeDurationStrings.vi
    - typings.humanizeDuration.humanizeDurationStrings.zh_CN
    - typings.humanizeDuration.humanizeDurationStrings.zh_TW
  */
  trait LanguageCode extends StObject
  object LanguageCode {
    
    inline def af: typings.humanizeDuration.humanizeDurationStrings.af = "af".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.af]
    
    inline def ar: typings.humanizeDuration.humanizeDurationStrings.ar = "ar".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.ar]
    
    inline def bg: typings.humanizeDuration.humanizeDurationStrings.bg = "bg".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.bg]
    
    inline def bn: typings.humanizeDuration.humanizeDurationStrings.bn = "bn".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.bn]
    
    inline def ca: typings.humanizeDuration.humanizeDurationStrings.ca = "ca".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.ca]
    
    inline def cs: typings.humanizeDuration.humanizeDurationStrings.cs = "cs".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.cs]
    
    inline def cy: typings.humanizeDuration.humanizeDurationStrings.cy = "cy".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.cy]
    
    inline def da: typings.humanizeDuration.humanizeDurationStrings.da = "da".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.da]
    
    inline def de: typings.humanizeDuration.humanizeDurationStrings.de = "de".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.de]
    
    inline def el: typings.humanizeDuration.humanizeDurationStrings.el = "el".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.el]
    
    inline def en: typings.humanizeDuration.humanizeDurationStrings.en = "en".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.en]
    
    inline def eo: typings.humanizeDuration.humanizeDurationStrings.eo = "eo".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.eo]
    
    inline def es: typings.humanizeDuration.humanizeDurationStrings.es = "es".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.es]
    
    inline def et: typings.humanizeDuration.humanizeDurationStrings.et = "et".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.et]
    
    inline def eu: typings.humanizeDuration.humanizeDurationStrings.eu = "eu".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.eu]
    
    inline def fa: typings.humanizeDuration.humanizeDurationStrings.fa = "fa".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.fa]
    
    inline def fi: typings.humanizeDuration.humanizeDurationStrings.fi = "fi".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.fi]
    
    inline def fo: typings.humanizeDuration.humanizeDurationStrings.fo = "fo".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.fo]
    
    inline def fr: typings.humanizeDuration.humanizeDurationStrings.fr = "fr".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.fr]
    
    inline def gr: typings.humanizeDuration.humanizeDurationStrings.gr = "gr".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.gr]
    
    inline def he: typings.humanizeDuration.humanizeDurationStrings.he = "he".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.he]
    
    inline def hi: typings.humanizeDuration.humanizeDurationStrings.hi = "hi".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.hi]
    
    inline def hr: typings.humanizeDuration.humanizeDurationStrings.hr = "hr".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.hr]
    
    inline def hu: typings.humanizeDuration.humanizeDurationStrings.hu = "hu".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.hu]
    
    inline def id: typings.humanizeDuration.humanizeDurationStrings.id = "id".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.id]
    
    inline def is: typings.humanizeDuration.humanizeDurationStrings.is = "is".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.is]
    
    inline def it: typings.humanizeDuration.humanizeDurationStrings.it = "it".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.it]
    
    inline def ja: typings.humanizeDuration.humanizeDurationStrings.ja = "ja".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.ja]
    
    inline def km: typings.humanizeDuration.humanizeDurationStrings.km = "km".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.km]
    
    inline def kn: typings.humanizeDuration.humanizeDurationStrings.kn = "kn".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.kn]
    
    inline def ko: typings.humanizeDuration.humanizeDurationStrings.ko = "ko".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.ko]
    
    inline def ku: typings.humanizeDuration.humanizeDurationStrings.ku = "ku".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.ku]
    
    inline def lo: typings.humanizeDuration.humanizeDurationStrings.lo = "lo".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.lo]
    
    inline def lt: typings.humanizeDuration.humanizeDurationStrings.lt = "lt".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.lt]
    
    inline def lv: typings.humanizeDuration.humanizeDurationStrings.lv = "lv".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.lv]
    
    inline def mk: typings.humanizeDuration.humanizeDurationStrings.mk = "mk".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.mk]
    
    inline def mr: typings.humanizeDuration.humanizeDurationStrings.mr = "mr".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.mr]
    
    inline def ms: typings.humanizeDuration.humanizeDurationStrings.ms = "ms".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.ms]
    
    inline def nl: typings.humanizeDuration.humanizeDurationStrings.nl = "nl".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.nl]
    
    inline def no: typings.humanizeDuration.humanizeDurationStrings.no = "no".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.no]
    
    inline def pl: typings.humanizeDuration.humanizeDurationStrings.pl = "pl".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.pl]
    
    inline def pt: typings.humanizeDuration.humanizeDurationStrings.pt = "pt".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.pt]
    
    inline def ro: typings.humanizeDuration.humanizeDurationStrings.ro = "ro".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.ro]
    
    inline def ru: typings.humanizeDuration.humanizeDurationStrings.ru = "ru".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.ru]
    
    inline def sk: typings.humanizeDuration.humanizeDurationStrings.sk = "sk".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.sk]
    
    inline def sl: typings.humanizeDuration.humanizeDurationStrings.sl = "sl".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.sl]
    
    inline def sq: typings.humanizeDuration.humanizeDurationStrings.sq = "sq".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.sq]
    
    inline def sr: typings.humanizeDuration.humanizeDurationStrings.sr = "sr".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.sr]
    
    inline def sv: typings.humanizeDuration.humanizeDurationStrings.sv = "sv".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.sv]
    
    inline def sw: typings.humanizeDuration.humanizeDurationStrings.sw = "sw".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.sw]
    
    inline def ta: typings.humanizeDuration.humanizeDurationStrings.ta = "ta".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.ta]
    
    inline def te: typings.humanizeDuration.humanizeDurationStrings.te = "te".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.te]
    
    inline def th: typings.humanizeDuration.humanizeDurationStrings.th = "th".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.th]
    
    inline def tr: typings.humanizeDuration.humanizeDurationStrings.tr = "tr".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.tr]
    
    inline def uk: typings.humanizeDuration.humanizeDurationStrings.uk = "uk".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.uk]
    
    inline def ur: typings.humanizeDuration.humanizeDurationStrings.ur = "ur".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.ur]
    
    inline def vi: typings.humanizeDuration.humanizeDurationStrings.vi = "vi".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.vi]
    
    inline def zh_CN: typings.humanizeDuration.humanizeDurationStrings.zh_CN = "zh_CN".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.zh_CN]
    
    inline def zh_TW: typings.humanizeDuration.humanizeDurationStrings.zh_TW = "zh_TW".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.zh_TW]
  }
  
  trait Options extends StObject {
    
    /**
      * String to include before the final unit. You can also set serialComma to false to eliminate the final comma.
      * @default ""
      */
    var conjunction: js.UndefOr[String] = js.undefined
    
    /**
      * String to substitute for the decimal point in a decimal fraction.
      */
    var decimal: js.UndefOr[String] = js.undefined
    
    /**
      * String to display between the previous unit and the next value.
      * @default ','
      */
    var delimiter: js.UndefOr[String] = js.undefined
    
    /**
      * Fallback languages if the provided language cannot be found (accepts an ISO 639-1 code from one of the supported languages). It works from left to right.
      */
    var fallbacks: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Language for unit display (accepts an ISO 639-1 code from one of the supported languages).
      * @default 'en'
      */
    var language: js.UndefOr[String] = js.undefined
    
    /**
      * Number representing the maximum number of units to display for the duration.
      */
    var largest: js.UndefOr[Double] = js.undefined
    
    /**
      * Number that defines a maximal decimal points for float values.
      */
    var maxDecimalPoints: js.UndefOr[Double] = js.undefined
    
    /**
      * Boolean value. Use true to round the smallest unit displayed (can be combined with largest and units).
      * @default false
      */
    var round: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default true
      */
    var serialComma: js.UndefOr[Boolean] = js.undefined
    
    /**
      * String to display between each value and unit.
      * @default " "
      */
    var spacer: js.UndefOr[String] = js.undefined
    
    /**
      * Customize the value used to calculate each unit of time.
      */
    var unitMeasures: js.UndefOr[UnitMeasuresOptions] = js.undefined
    
    /**
      * Array of strings to define which units are used to display the duration (if needed).
      */
    var units: js.UndefOr[js.Array[Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setConjunction(value: String): Self = StObject.set(x, "conjunction", value.asInstanceOf[js.Any])
      
      inline def setConjunctionUndefined: Self = StObject.set(x, "conjunction", js.undefined)
      
      inline def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
      
      inline def setDecimalUndefined: Self = StObject.set(x, "decimal", js.undefined)
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setFallbacks(value: js.Array[String]): Self = StObject.set(x, "fallbacks", value.asInstanceOf[js.Any])
      
      inline def setFallbacksUndefined: Self = StObject.set(x, "fallbacks", js.undefined)
      
      inline def setFallbacksVarargs(value: String*): Self = StObject.set(x, "fallbacks", js.Array(value*))
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLargest(value: Double): Self = StObject.set(x, "largest", value.asInstanceOf[js.Any])
      
      inline def setLargestUndefined: Self = StObject.set(x, "largest", js.undefined)
      
      inline def setMaxDecimalPoints(value: Double): Self = StObject.set(x, "maxDecimalPoints", value.asInstanceOf[js.Any])
      
      inline def setMaxDecimalPointsUndefined: Self = StObject.set(x, "maxDecimalPoints", js.undefined)
      
      inline def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      inline def setSerialComma(value: Boolean): Self = StObject.set(x, "serialComma", value.asInstanceOf[js.Any])
      
      inline def setSerialCommaUndefined: Self = StObject.set(x, "serialComma", js.undefined)
      
      inline def setSpacer(value: String): Self = StObject.set(x, "spacer", value.asInstanceOf[js.Any])
      
      inline def setSpacerUndefined: Self = StObject.set(x, "spacer", js.undefined)
      
      inline def setUnitMeasures(value: UnitMeasuresOptions): Self = StObject.set(x, "unitMeasures", value.asInstanceOf[js.Any])
      
      inline def setUnitMeasuresUndefined: Self = StObject.set(x, "unitMeasures", js.undefined)
      
      inline def setUnits(value: js.Array[Unit]): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
      
      inline def setUnitsVarargs(value: Unit*): Self = StObject.set(x, "units", js.Array(value*))
    }
  }
  
  /* Inlined std.Exclude<humanize-duration.humanize-duration.LanguageCode, 'gr'> */
  /* Rewritten from type alias, can be one of: 
    - typings.humanizeDuration.humanizeDurationStrings.da
    - typings.humanizeDuration.humanizeDurationStrings.hi
    - typings.humanizeDuration.humanizeDurationStrings.bn
    - typings.humanizeDuration.humanizeDurationStrings.he
    - typings.humanizeDuration.humanizeDurationStrings.pt
    - typings.humanizeDuration.humanizeDurationStrings.uk
    - typings.humanizeDuration.humanizeDurationStrings.tr
    - typings.humanizeDuration.humanizeDurationStrings.vi
    - typings.humanizeDuration.humanizeDurationStrings.fi
    - typings.humanizeDuration.humanizeDurationStrings.th
    - typings.humanizeDuration.humanizeDurationStrings.ru
    - typings.humanizeDuration.humanizeDurationStrings.ur
    - typings.humanizeDuration.humanizeDurationStrings.et
    - typings.humanizeDuration.humanizeDurationStrings.ca
    - typings.humanizeDuration.humanizeDurationStrings.no
    - typings.humanizeDuration.humanizeDurationStrings.sq
    - typings.humanizeDuration.humanizeDurationStrings.pl
    - typings.humanizeDuration.humanizeDurationStrings.af
    - typings.humanizeDuration.humanizeDurationStrings.sk
    - typings.humanizeDuration.humanizeDurationStrings.hu
    - typings.humanizeDuration.humanizeDurationStrings.te
    - typings.humanizeDuration.humanizeDurationStrings.is
    - typings.humanizeDuration.humanizeDurationStrings.ja
    - typings.humanizeDuration.humanizeDurationStrings.cs
    - typings.humanizeDuration.humanizeDurationStrings.el
    - typings.humanizeDuration.humanizeDurationStrings.it
    - typings.humanizeDuration.humanizeDurationStrings.de
    - typings.humanizeDuration.humanizeDurationStrings.ro
    - typings.humanizeDuration.humanizeDurationStrings.km
    - typings.humanizeDuration.humanizeDurationStrings.zh_CN
    - typings.humanizeDuration.humanizeDurationStrings.ar
    - typings.humanizeDuration.humanizeDurationStrings.sl
    - typings.humanizeDuration.humanizeDurationStrings.ko
    - typings.humanizeDuration.humanizeDurationStrings.nl
    - typings.humanizeDuration.humanizeDurationStrings.eu
    - typings.humanizeDuration.humanizeDurationStrings.eo
    - typings.humanizeDuration.humanizeDurationStrings.fa
    - typings.humanizeDuration.humanizeDurationStrings.sv
    - typings.humanizeDuration.humanizeDurationStrings.bg
    - typings.humanizeDuration.humanizeDurationStrings.ku
    - typings.humanizeDuration.humanizeDurationStrings.lo
    - typings.humanizeDuration.humanizeDurationStrings.ta
    - typings.humanizeDuration.humanizeDurationStrings.ms
    - typings.humanizeDuration.humanizeDurationStrings.zh_TW
    - typings.humanizeDuration.humanizeDurationStrings.lv
    - typings.humanizeDuration.humanizeDurationStrings.sr
    - typings.humanizeDuration.humanizeDurationStrings.mk
    - typings.humanizeDuration.humanizeDurationStrings.fo
    - typings.humanizeDuration.humanizeDurationStrings.sw
    - typings.humanizeDuration.humanizeDurationStrings.kn
    - typings.humanizeDuration.humanizeDurationStrings.mr
    - typings.humanizeDuration.humanizeDurationStrings.lt
    - typings.humanizeDuration.humanizeDurationStrings.hr
    - typings.humanizeDuration.humanizeDurationStrings.cy
    - typings.humanizeDuration.humanizeDurationStrings.id
    - typings.humanizeDuration.humanizeDurationStrings.en
    - typings.humanizeDuration.humanizeDurationStrings.fr
    - typings.humanizeDuration.humanizeDurationStrings.es
  */
  trait SupportedLanguage extends StObject
  object SupportedLanguage {
    
    inline def af: typings.humanizeDuration.humanizeDurationStrings.af = "af".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.af]
    
    inline def ar: typings.humanizeDuration.humanizeDurationStrings.ar = "ar".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.ar]
    
    inline def bg: typings.humanizeDuration.humanizeDurationStrings.bg = "bg".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.bg]
    
    inline def bn: typings.humanizeDuration.humanizeDurationStrings.bn = "bn".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.bn]
    
    inline def ca: typings.humanizeDuration.humanizeDurationStrings.ca = "ca".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.ca]
    
    inline def cs: typings.humanizeDuration.humanizeDurationStrings.cs = "cs".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.cs]
    
    inline def cy: typings.humanizeDuration.humanizeDurationStrings.cy = "cy".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.cy]
    
    inline def da: typings.humanizeDuration.humanizeDurationStrings.da = "da".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.da]
    
    inline def de: typings.humanizeDuration.humanizeDurationStrings.de = "de".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.de]
    
    inline def el: typings.humanizeDuration.humanizeDurationStrings.el = "el".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.el]
    
    inline def en: typings.humanizeDuration.humanizeDurationStrings.en = "en".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.en]
    
    inline def eo: typings.humanizeDuration.humanizeDurationStrings.eo = "eo".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.eo]
    
    inline def es: typings.humanizeDuration.humanizeDurationStrings.es = "es".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.es]
    
    inline def et: typings.humanizeDuration.humanizeDurationStrings.et = "et".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.et]
    
    inline def eu: typings.humanizeDuration.humanizeDurationStrings.eu = "eu".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.eu]
    
    inline def fa: typings.humanizeDuration.humanizeDurationStrings.fa = "fa".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.fa]
    
    inline def fi: typings.humanizeDuration.humanizeDurationStrings.fi = "fi".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.fi]
    
    inline def fo: typings.humanizeDuration.humanizeDurationStrings.fo = "fo".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.fo]
    
    inline def fr: typings.humanizeDuration.humanizeDurationStrings.fr = "fr".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.fr]
    
    inline def he: typings.humanizeDuration.humanizeDurationStrings.he = "he".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.he]
    
    inline def hi: typings.humanizeDuration.humanizeDurationStrings.hi = "hi".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.hi]
    
    inline def hr: typings.humanizeDuration.humanizeDurationStrings.hr = "hr".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.hr]
    
    inline def hu: typings.humanizeDuration.humanizeDurationStrings.hu = "hu".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.hu]
    
    inline def id: typings.humanizeDuration.humanizeDurationStrings.id = "id".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.id]
    
    inline def is: typings.humanizeDuration.humanizeDurationStrings.is = "is".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.is]
    
    inline def it: typings.humanizeDuration.humanizeDurationStrings.it = "it".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.it]
    
    inline def ja: typings.humanizeDuration.humanizeDurationStrings.ja = "ja".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.ja]
    
    inline def km: typings.humanizeDuration.humanizeDurationStrings.km = "km".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.km]
    
    inline def kn: typings.humanizeDuration.humanizeDurationStrings.kn = "kn".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.kn]
    
    inline def ko: typings.humanizeDuration.humanizeDurationStrings.ko = "ko".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.ko]
    
    inline def ku: typings.humanizeDuration.humanizeDurationStrings.ku = "ku".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.ku]
    
    inline def lo: typings.humanizeDuration.humanizeDurationStrings.lo = "lo".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.lo]
    
    inline def lt: typings.humanizeDuration.humanizeDurationStrings.lt = "lt".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.lt]
    
    inline def lv: typings.humanizeDuration.humanizeDurationStrings.lv = "lv".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.lv]
    
    inline def mk: typings.humanizeDuration.humanizeDurationStrings.mk = "mk".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.mk]
    
    inline def mr: typings.humanizeDuration.humanizeDurationStrings.mr = "mr".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.mr]
    
    inline def ms: typings.humanizeDuration.humanizeDurationStrings.ms = "ms".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.ms]
    
    inline def nl: typings.humanizeDuration.humanizeDurationStrings.nl = "nl".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.nl]
    
    inline def no: typings.humanizeDuration.humanizeDurationStrings.no = "no".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.no]
    
    inline def pl: typings.humanizeDuration.humanizeDurationStrings.pl = "pl".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.pl]
    
    inline def pt: typings.humanizeDuration.humanizeDurationStrings.pt = "pt".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.pt]
    
    inline def ro: typings.humanizeDuration.humanizeDurationStrings.ro = "ro".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.ro]
    
    inline def ru: typings.humanizeDuration.humanizeDurationStrings.ru = "ru".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.ru]
    
    inline def sk: typings.humanizeDuration.humanizeDurationStrings.sk = "sk".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.sk]
    
    inline def sl: typings.humanizeDuration.humanizeDurationStrings.sl = "sl".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.sl]
    
    inline def sq: typings.humanizeDuration.humanizeDurationStrings.sq = "sq".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.sq]
    
    inline def sr: typings.humanizeDuration.humanizeDurationStrings.sr = "sr".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.sr]
    
    inline def sv: typings.humanizeDuration.humanizeDurationStrings.sv = "sv".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.sv]
    
    inline def sw: typings.humanizeDuration.humanizeDurationStrings.sw = "sw".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.sw]
    
    inline def ta: typings.humanizeDuration.humanizeDurationStrings.ta = "ta".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.ta]
    
    inline def te: typings.humanizeDuration.humanizeDurationStrings.te = "te".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.te]
    
    inline def th: typings.humanizeDuration.humanizeDurationStrings.th = "th".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.th]
    
    inline def tr: typings.humanizeDuration.humanizeDurationStrings.tr = "tr".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.tr]
    
    inline def uk: typings.humanizeDuration.humanizeDurationStrings.uk = "uk".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.uk]
    
    inline def ur: typings.humanizeDuration.humanizeDurationStrings.ur = "ur".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.ur]
    
    inline def vi: typings.humanizeDuration.humanizeDurationStrings.vi = "vi".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.vi]
    
    inline def zh_CN: typings.humanizeDuration.humanizeDurationStrings.zh_CN = "zh_CN".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.zh_CN]
    
    inline def zh_TW: typings.humanizeDuration.humanizeDurationStrings.zh_TW = "zh_TW".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.zh_TW]
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
    
    inline def d: typings.humanizeDuration.humanizeDurationStrings.d = "d".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.d]
    
    inline def h: typings.humanizeDuration.humanizeDurationStrings.h = "h".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.h]
    
    inline def m: typings.humanizeDuration.humanizeDurationStrings.m = "m".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.m]
    
    inline def mo: typings.humanizeDuration.humanizeDurationStrings.mo = "mo".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.mo]
    
    inline def ms: typings.humanizeDuration.humanizeDurationStrings.ms = "ms".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.ms]
    
    inline def s: typings.humanizeDuration.humanizeDurationStrings.s = "s".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.s]
    
    inline def w: typings.humanizeDuration.humanizeDurationStrings.w = "w".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.w]
    
    inline def y: typings.humanizeDuration.humanizeDurationStrings.y = "y".asInstanceOf[typings.humanizeDuration.humanizeDurationStrings.y]
  }
  
  trait UnitMeasuresOptions extends StObject {
    
    var d: js.UndefOr[Double] = js.undefined
    
    var h: js.UndefOr[Double] = js.undefined
    
    var m: js.UndefOr[Double] = js.undefined
    
    var mo: js.UndefOr[Double] = js.undefined
    
    var ms: js.UndefOr[Double] = js.undefined
    
    var s: js.UndefOr[Double] = js.undefined
    
    var w: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object UnitMeasuresOptions {
    
    inline def apply(): UnitMeasuresOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnitMeasuresOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnitMeasuresOptions] (val x: Self) extends AnyVal {
      
      inline def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      inline def setM(value: Double): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      inline def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      inline def setMo(value: Double): Self = StObject.set(x, "mo", value.asInstanceOf[js.Any])
      
      inline def setMoUndefined: Self = StObject.set(x, "mo", js.undefined)
      
      inline def setMs(value: Double): Self = StObject.set(x, "ms", value.asInstanceOf[js.Any])
      
      inline def setMsUndefined: Self = StObject.set(x, "ms", js.undefined)
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      inline def setWUndefined: Self = StObject.set(x, "w", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait UnitTranslationOptions extends StObject {
    
    var d: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.undefined
    
    var h: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.undefined
    
    var m: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.undefined
    
    var mo: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.undefined
    
    var ms: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.undefined
    
    var s: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.undefined
    
    var w: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.undefined
    
    var y: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.undefined
  }
  object UnitTranslationOptions {
    
    inline def apply(): UnitTranslationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnitTranslationOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnitTranslationOptions] (val x: Self) extends AnyVal {
      
      inline def setD(value: /* count */ js.UndefOr[Double] => String): Self = StObject.set(x, "d", js.Any.fromFunction1(value))
      
      inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      inline def setH(value: /* count */ js.UndefOr[Double] => String): Self = StObject.set(x, "h", js.Any.fromFunction1(value))
      
      inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      inline def setM(value: /* count */ js.UndefOr[Double] => String): Self = StObject.set(x, "m", js.Any.fromFunction1(value))
      
      inline def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      inline def setMo(value: /* count */ js.UndefOr[Double] => String): Self = StObject.set(x, "mo", js.Any.fromFunction1(value))
      
      inline def setMoUndefined: Self = StObject.set(x, "mo", js.undefined)
      
      inline def setMs(value: /* count */ js.UndefOr[Double] => String): Self = StObject.set(x, "ms", js.Any.fromFunction1(value))
      
      inline def setMsUndefined: Self = StObject.set(x, "ms", js.undefined)
      
      inline def setS(value: /* count */ js.UndefOr[Double] => String): Self = StObject.set(x, "s", js.Any.fromFunction1(value))
      
      inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
      
      inline def setW(value: /* count */ js.UndefOr[Double] => String): Self = StObject.set(x, "w", js.Any.fromFunction1(value))
      
      inline def setWUndefined: Self = StObject.set(x, "w", js.undefined)
      
      inline def setY(value: /* count */ js.UndefOr[Double] => String): Self = StObject.set(x, "y", js.Any.fromFunction1(value))
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  type _To = Humanizer
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Humanizer = ^
}
