package typings.itunesconnectanalytics.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait frequency extends js.Object
@JSImport("itunesconnectanalytics", "frequency")
@js.native
object frequency extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[frequency with String] = js.native
  
  @js.native
  sealed trait days extends frequency
  /* "DAY" */ @js.native
  object days extends TopLevel[days with String]
  
  @js.native
  sealed trait months extends frequency
  /* "MONTH" */ @js.native
  object months extends TopLevel[months with String]
  
  @js.native
  sealed trait weeks extends frequency
  /* "WEEK" */ @js.native
  object weeks extends TopLevel[weeks with String]
}
