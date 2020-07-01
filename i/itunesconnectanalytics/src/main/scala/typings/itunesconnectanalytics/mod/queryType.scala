package typings.itunesconnectanalytics.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait queryType extends js.Object

@JSImport("itunesconnectanalytics", "queryType")
@js.native
object queryType extends js.Object {
  @js.native
  sealed trait metrics extends queryType
  
  @js.native
  sealed trait sources extends queryType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[queryType with String] = js.native
  /* "metrics" */ @js.native
  object metrics extends TopLevel[metrics with String]
  
  /* "sources" */ @js.native
  object sources extends TopLevel[sources with String]
  
}

