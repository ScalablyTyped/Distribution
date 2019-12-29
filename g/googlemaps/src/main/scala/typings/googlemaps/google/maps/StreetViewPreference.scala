package typings.googlemaps.google.maps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StreetViewPreference extends js.Object

@JSGlobal("google.maps.StreetViewPreference")
@js.native
object StreetViewPreference extends js.Object {
  @js.native
  sealed trait BEST extends StreetViewPreference
  
  @js.native
  sealed trait NEAREST extends StreetViewPreference
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StreetViewPreference with String] = js.native
  /* "best" */ @js.native
  object BEST extends TopLevel[BEST with String]
  
  /* "nearest" */ @js.native
  object NEAREST extends TopLevel[NEAREST with String]
  
}

