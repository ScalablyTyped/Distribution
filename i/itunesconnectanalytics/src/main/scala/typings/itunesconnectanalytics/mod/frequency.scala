package typings.itunesconnectanalytics.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait frequency extends js.Object

@JSImport("itunesconnectanalytics", "frequency")
@js.native
object frequency extends js.Object {
  @js.native
  sealed trait days extends frequency
  
  @js.native
  sealed trait months extends frequency
  
  @js.native
  sealed trait weeks extends frequency
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[frequency with String] = js.native
  /* "DAY" */ @js.native
  object days extends TopLevel[days with String]
  
  /* "MONTH" */ @js.native
  object months extends TopLevel[months with String]
  
  /* "WEEK" */ @js.native
  object weeks extends TopLevel[weeks with String]
  
}

