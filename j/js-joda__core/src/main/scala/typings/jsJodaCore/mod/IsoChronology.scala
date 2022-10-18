package typings.jsJodaCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@js-joda/core", "IsoChronology")
@js.native
/* private */ open class IsoChronology () extends StObject {
  
  def resolveDate(fieldValues: Any, resolverStyle: Any): Any = js.native
}
/* static members */
object IsoChronology {
  
  @JSImport("@js-joda/core", "IsoChronology")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isLeapYear(prolepticYear: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeapYear")(prolepticYear.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
