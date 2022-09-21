package typings.luxon

import typings.luxon.miscMod.CalendarSystem
import typings.luxon.miscMod.NumberingSystem
import typings.luxon.miscMod.StringUnitLength
import typings.luxon.miscMod.UnitLength
import typings.luxon.zoneMod.Zone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infoMod {
  
  object Info {
    
    @JSImport("luxon/src/info", "Info")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Return an array of eras, such as ['BC', 'AD']. The locale can be specified, but the calendar system is always Gregorian.
      *
      * @param length - the length of the era representation, such as "short" or "long". Defaults to 'short'.
      * @param opts - options
      * @param opts.locale - the locale code
      *
      * @example
      * Info.eras() //=> [ 'BC', 'AD' ]
      * @example
      * Info.eras('long') //=> [ 'Before Christ', 'Anno Domini' ]
      * @example
      * Info.eras('long', { locale: 'fr' }) //=> [ 'avant Jésus-Christ', 'après Jésus-Christ' ]
      */
    inline def eras(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("eras")().asInstanceOf[js.Array[String]]
    inline def eras(length: Unit, options: InfoOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("eras")(length.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def eras(length: StringUnitLength): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("eras")(length.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def eras(length: StringUnitLength, options: InfoOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("eras")(length.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Return the set of available features in this environment.
      * Some features of Luxon are not available in all environments. For example, on older browsers, timezone support is not available. Use this function to figure out if that's the case.
      * Keys:
      * * `relative`: whether this environment supports relative time formatting
      *
      * @example
      * Info.features() //=> { intl: true, intlTokens: false, zones: true, relative: false }
      */
    inline def features(): Features = ^.asInstanceOf[js.Dynamic].applyDynamic("features")().asInstanceOf[Features]
    
    /**
      * Return whether the specified zone contains a DST.
      *
      * @param zone - Zone to check. Defaults to the environment's local zone. Defaults to 'local'.
      */
    inline def hasDST(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasDST")().asInstanceOf[Boolean]
    inline def hasDST(zone: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasDST")(zone.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def hasDST(zone: Zone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasDST")(zone.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Return whether the specified zone is a valid IANA specifier.
      *
      * @param zone - Zone to check
      */
    inline def isValidIANAZone(zone: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidIANAZone")(zone.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Return an array of meridiems.
      *
      * @param opts - options
      * @param opts.locale - the locale code
      *
      * @example
      * Info.meridiems() //=> [ 'AM', 'PM' ]
      * @example
      * Info.meridiems({ locale: 'my' }) //=> [ 'နံနက်', 'ညနေ' ]
      */
    inline def meridiems(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("meridiems")().asInstanceOf[js.Array[String]]
    inline def meridiems(options: InfoOptions): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("meridiems")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /**
      * Return an array of standalone month names.
      * @see https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DateTimeFormat
      *
      * @param length - the length of the month representation, such as "numeric", "2-digit", "narrow", "short", "long". Defaults to 'long'.
      * @param opts - options
      * @param opts.locale - the locale code
      * @param opts.numberingSystem - the numbering system. Defaults to null.
      * @param opts.locObj - an existing locale object to use. Defaults to null.
      * @param opts.outputCalendar - the calendar. Defaults to 'gregory'.
      *
      * @example
      * Info.months()[0] //=> 'January'
      * @example
      * Info.months('short')[0] //=> 'Jan'
      * @example
      * Info.months('numeric')[0] //=> '1'
      * @example
      * Info.months('short', { locale: 'fr-CA' } )[0] //=> 'janv.'
      * @example
      * Info.months('numeric', { locale: 'ar' })[0] //=> '١'
      * @example
      * Info.months('long', { outputCalendar: 'islamic' })[0] //=> 'Rabiʻ I'
      */
    inline def months(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("months")().asInstanceOf[js.Array[String]]
    inline def months(length: Unit, opts: InfoCalendarOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("months")(length.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def months(length: UnitLength): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("months")(length.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def months(length: UnitLength, opts: InfoCalendarOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("months")(length.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Return an array of format month names.
      * Format months differ from standalone months in that they're meant to appear next to the day of the month. In some languages, that
      * changes the string.
      * See {@link Info#months}
      *
      * @param length - the length of the month representation, such as "numeric", "2-digit", "narrow", "short", "long". Defaults to 'long'.
      * @param opts - options
      * @param opts.locale - the locale code
      * @param opts.numberingSystem - the numbering system. Defaults to null.
      * @param opts.locObj - an existing locale object to use. Defaults to null.
      * @param opts.outputCalendar - the calendar. Defaults to 'gregory'.
      */
    inline def monthsFormat(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("monthsFormat")().asInstanceOf[js.Array[String]]
    inline def monthsFormat(length: Unit, options: InfoCalendarOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("monthsFormat")(length.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def monthsFormat(length: UnitLength): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("monthsFormat")(length.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def monthsFormat(length: UnitLength, options: InfoCalendarOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("monthsFormat")(length.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Converts the input into a {@link Zone} instance.
      *
      * * If `input` is already a Zone instance, it is returned unchanged.
      * * If `input` is a string containing a valid time zone name, a Zone instance
      *   with that name is returned.
      * * If `input` is a string that doesn't refer to a known time zone, a Zone
      *   instance with {@link Zone.isValid} == false is returned.
      * * If `input is a number, a Zone instance with the specified fixed offset
      *   in minutes is returned.
      * * If `input` is `null` or `undefined`, the default zone is returned.
      *
      * @param input - the value to be converted
      */
    inline def normalizeZone(): Zone = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeZone")().asInstanceOf[Zone]
    inline def normalizeZone(input: String): Zone = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeZone")(input.asInstanceOf[js.Any]).asInstanceOf[Zone]
    inline def normalizeZone(input: Double): Zone = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeZone")(input.asInstanceOf[js.Any]).asInstanceOf[Zone]
    inline def normalizeZone(input: Zone): Zone = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeZone")(input.asInstanceOf[js.Any]).asInstanceOf[Zone]
    
    /**
      * Return an array of standalone week names.
      * @see https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DateTimeFormat
      *
      * @param length - the length of the weekday representation, such as "narrow", "short", "long". Defaults to 'long'.
      * @param opts - options
      * @param opts.locale - the locale code
      * @param opts.numberingSystem - the numbering system. Defaults to null.
      * @param opts.locObj - an existing locale object to use. Defaults to null.
      *
      * @example
      * Info.weekdays()[0] //=> 'Monday'
      * @example
      * Info.weekdays('short')[0] //=> 'Mon'
      * @example
      * Info.weekdays('short', { locale: 'fr-CA' })[0] //=> 'lun.'
      * @example
      * Info.weekdays('short', { locale: 'ar' })[0] //=> 'الاثنين'
      */
    inline def weekdays(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")().asInstanceOf[js.Array[String]]
    inline def weekdays(length: Unit, options: InfoUnitOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(length.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def weekdays(length: StringUnitLength): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(length.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def weekdays(length: StringUnitLength, options: InfoUnitOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(length.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Return an array of format week names.
      * Format weekdays differ from standalone weekdays in that they're meant to appear next to more date information. In some languages, that
      * changes the string.
      * See {@link Info#weekdays}
      *
      * @param length - the length of the month representation, such as "narrow", "short", "long". Defaults to 'long'.
      * @param opts - options
      * @param opts.locale - the locale code. Defaults to null.
      * @param opts.numberingSystem - the numbering system. Defaults to null.
      * @param opts.locObj - an existing locale object to use. Defaults to null.
      */
    inline def weekdaysFormat(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysFormat")().asInstanceOf[js.Array[String]]
    inline def weekdaysFormat(length: Unit, options: InfoUnitOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysFormat")(length.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def weekdaysFormat(length: StringUnitLength): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysFormat")(length.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def weekdaysFormat(length: StringUnitLength, options: InfoUnitOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysFormat")(length.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  }
  
  trait Features extends StObject {
    
    /**
      * Whether this environment supports relative time formatting
      */
    var relative: Boolean
  }
  object Features {
    
    inline def apply(relative: Boolean): Features = {
      val __obj = js.Dynamic.literal(relative = relative.asInstanceOf[js.Any])
      __obj.asInstanceOf[Features]
    }
    
    extension [Self <: Features](x: Self) {
      
      inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
    }
  }
  
  trait InfoCalendarOptions
    extends StObject
       with InfoUnitOptions {
    
    var outputCalendar: js.UndefOr[CalendarSystem] = js.undefined
  }
  object InfoCalendarOptions {
    
    inline def apply(): InfoCalendarOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InfoCalendarOptions]
    }
    
    extension [Self <: InfoCalendarOptions](x: Self) {
      
      inline def setOutputCalendar(value: CalendarSystem): Self = StObject.set(x, "outputCalendar", value.asInstanceOf[js.Any])
      
      inline def setOutputCalendarUndefined: Self = StObject.set(x, "outputCalendar", js.undefined)
    }
  }
  
  trait InfoOptions extends StObject {
    
    var locale: js.UndefOr[String] = js.undefined
  }
  object InfoOptions {
    
    inline def apply(): InfoOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InfoOptions]
    }
    
    extension [Self <: InfoOptions](x: Self) {
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    }
  }
  
  trait InfoUnitOptions
    extends StObject
       with InfoOptions {
    
    var numberingSystem: js.UndefOr[NumberingSystem] = js.undefined
  }
  object InfoUnitOptions {
    
    inline def apply(): InfoUnitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InfoUnitOptions]
    }
    
    extension [Self <: InfoUnitOptions](x: Self) {
      
      inline def setNumberingSystem(value: NumberingSystem): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
      
      inline def setNumberingSystemUndefined: Self = StObject.set(x, "numberingSystem", js.undefined)
    }
  }
  
  type UnitOptions = InfoUnitOptions
}
