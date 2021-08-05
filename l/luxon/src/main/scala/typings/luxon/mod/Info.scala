package typings.luxon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Info {
  
  @JSImport("luxon", "Info")
  @js.native
  val ^ : js.Any = js.native
  
  inline def eras(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("eras")().asInstanceOf[js.Array[String]]
  inline def eras(length: Unit, options: InfoOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("eras")(length.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def eras(length: StringUnitLength): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("eras")(length.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def eras(length: StringUnitLength, options: InfoOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("eras")(length.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def features(): Features = ^.asInstanceOf[js.Dynamic].applyDynamic("features")().asInstanceOf[Features]
  
  inline def hasDST(zone: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasDST")(zone.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def hasDST(zone: Zone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasDST")(zone.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidIANAZone(zone: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidIANAZone")(zone.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def meridiems(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("meridiems")().asInstanceOf[js.Array[String]]
  inline def meridiems(options: InfoOptions): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("meridiems")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def months(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("months")().asInstanceOf[js.Array[String]]
  inline def months(length: Unit, options: InfoCalendarOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("months")(length.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def months(length: UnitLength): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("months")(length.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def months(length: UnitLength, options: InfoCalendarOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("months")(length.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def monthsFormat(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("monthsFormat")().asInstanceOf[js.Array[String]]
  inline def monthsFormat(length: Unit, options: InfoCalendarOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("monthsFormat")(length.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def monthsFormat(length: UnitLength): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("monthsFormat")(length.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def monthsFormat(length: UnitLength, options: InfoCalendarOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("monthsFormat")(length.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def normalizeZone(): Zone = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeZone")().asInstanceOf[Zone]
  inline def normalizeZone(input: String): Zone = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeZone")(input.asInstanceOf[js.Any]).asInstanceOf[Zone]
  inline def normalizeZone(input: Double): Zone = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeZone")(input.asInstanceOf[js.Any]).asInstanceOf[Zone]
  inline def normalizeZone(input: Zone): Zone = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeZone")(input.asInstanceOf[js.Any]).asInstanceOf[Zone]
  
  inline def weekdays(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")().asInstanceOf[js.Array[String]]
  inline def weekdays(length: Unit, options: InfoUnitOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(length.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def weekdays(length: StringUnitLength): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(length.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def weekdays(length: StringUnitLength, options: InfoUnitOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(length.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def weekdaysFormat(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysFormat")().asInstanceOf[js.Array[String]]
  inline def weekdaysFormat(length: Unit, options: InfoUnitOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysFormat")(length.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def weekdaysFormat(length: StringUnitLength): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysFormat")(length.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def weekdaysFormat(length: StringUnitLength, options: InfoUnitOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysFormat")(length.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
