package typings.luxon

import typings.luxon.luxonStrings.long
import typings.luxon.luxonStrings.short
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcZoneMod {
  
  @JSImport("luxon/src/zone", "FixedOffsetZone")
  @js.native
  open class FixedOffsetZone () extends Zone
  /* static members */
  object FixedOffsetZone {
    
    @JSImport("luxon/src/zone", "FixedOffsetZone")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an instance with a specified offset
      *
      * @param offset - The offset in minutes
      */
    inline def instance(offset: Double): FixedOffsetZone = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")(offset.asInstanceOf[js.Any]).asInstanceOf[FixedOffsetZone]
    
    /**
      * Get an instance of FixedOffsetZone from a UTC offset string, like "UTC+6"
      *
      * @param s - The offset string to parse
      *
      * @example
      * FixedOffsetZone.parseSpecifier("UTC+6")
      * @example
      * FixedOffsetZone.parseSpecifier("UTC+06")
      * @example
      * FixedOffsetZone.parseSpecifier("UTC-6:00")
      */
    inline def parseSpecifier(s: String): FixedOffsetZone = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSpecifier")(s.asInstanceOf[js.Any]).asInstanceOf[FixedOffsetZone]
  }
  
  @JSImport("luxon/src/zone", "IANAZone")
  @js.native
  open class IANAZone protected () extends Zone {
    def this(name: String) = this()
  }
  /* static members */
  object IANAZone {
    
    @JSImport("luxon/src/zone", "IANAZone")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Same as constructor but has caching.
      */
    inline def create(name: String): IANAZone = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[IANAZone]
    
    /**
      * Returns whether the provided string is a valid specifier.
      * This only checks the string's format, not that the specifier
      * identifies a known zone; see {@link isValidZone} for that.
      *
      * @param s - The string to check validity on
      *
      * @example
      * IANAZone.isValidSpecifier("America/New_York") //=> true
      * @example
      * IANAZone.isValidSpecifier("Fantasia/Castle") //=> true
      * @example
      * IANAZone.isValidSpecifier("Sport~~blorp") //=> false
      */
    inline def isValidSpecifier(s: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidSpecifier")(s.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Returns whether the provided string identifies a real zone
      *
      * @param zone - The string to check
      *
      * @example
      * IANAZone.isValidZone("America/New_York") //=> true
      * @example
      * IANAZone.isValidZone("Fantasia/Castle") //=> false
      * @example
      * IANAZone.isValidZone("Sport~~blorp") //=> false
      */
    inline def isValidZone(zone: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidZone")(zone.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Reset local caches. Should only be necessary in testing scenarios.
      */
    inline def resetCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetCache")().asInstanceOf[Unit]
  }
  
  @JSImport("luxon/src/zone", "InvalidZone")
  @js.native
  open class InvalidZone () extends Zone
  
  @JSImport("luxon/src/zone", "SystemZone")
  @js.native
  open class SystemZone () extends Zone
  
  /* note: abstract class */ @JSImport("luxon/src/zone", "Zone")
  @js.native
  open class Zone () extends StObject {
    
    /**
      * Return whether this Zone is equal to another zone
      *
      * @param other - the zone to compare
      */
    def equals(other: Zone): Boolean = js.native
    
    /**
      * Returns the offset's value as a string
      *
      * @param ts - Epoch milliseconds for which to get the offset
      * @param format - What style of offset to return.
      *                 Accepts 'narrow', 'short', or 'techie'. Returning '+6', '+06:00', or '+0600' respectively
      */
    def formatOffset(ts: Double, format: ZoneOffsetFormat): String = js.native
    
    /**
      * Returns whether the offset is known to be fixed for the whole year.
      */
    def isUniversal: Boolean = js.native
    
    /**
      * Return whether this Zone is valid.
      */
    def isValid: Boolean = js.native
    
    /**
      * The name of this zone.
      */
    def name: String = js.native
    
    /**
      * Return the offset in minutes for this zone at the specified timestamp.
      *
      * @param ts - Epoch milliseconds for which to compute the offset
      */
    def offset(ts: Double): Double = js.native
    
    /**
      * Returns the offset's common name (such as EST) at the specified timestamp
      *
      * @param ts - Epoch milliseconds for which to get the name
      * @param options - Options to affect the format
      * @param options.format - What style of offset to return.
      * @param options.locale - What locale to return the offset name in.
      */
    def offsetName(ts: Double, options: ZoneOffsetOptions): String = js.native
    
    /**
      * The type of zone
      */
    def `type`: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.luxon.luxonStrings.narrow
    - typings.luxon.luxonStrings.short
    - typings.luxon.luxonStrings.techie
  */
  trait ZoneOffsetFormat extends StObject
  object ZoneOffsetFormat {
    
    inline def narrow: typings.luxon.luxonStrings.narrow = "narrow".asInstanceOf[typings.luxon.luxonStrings.narrow]
    
    inline def short: typings.luxon.luxonStrings.short = "short".asInstanceOf[typings.luxon.luxonStrings.short]
    
    inline def techie: typings.luxon.luxonStrings.techie = "techie".asInstanceOf[typings.luxon.luxonStrings.techie]
  }
  
  trait ZoneOffsetOptions extends StObject {
    
    /**
      * What style of offset to return.
      */
    var format: js.UndefOr[short | long] = js.undefined
    
    /**
      * What locale to return the offset name in.
      */
    var locale: js.UndefOr[String] = js.undefined
  }
  object ZoneOffsetOptions {
    
    inline def apply(): ZoneOffsetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoneOffsetOptions]
    }
    
    extension [Self <: ZoneOffsetOptions](x: Self) {
      
      inline def setFormat(value: short | long): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    }
  }
}
