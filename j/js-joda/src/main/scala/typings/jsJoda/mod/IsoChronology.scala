package typings.jsJoda.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-joda", "IsoChronology")
@js.native
/* private */ abstract class IsoChronology () extends StObject {
  
  def equals(other: js.Any): Boolean = js.native
  
  def resolveDate(fieldValues: js.Any, resolverStyle: js.Any): js.Any = js.native
}
object IsoChronology {
  
  @JSImport("js-joda", "IsoChronology")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def isLeapYear(prolepticYear: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeapYear")(prolepticYear.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
