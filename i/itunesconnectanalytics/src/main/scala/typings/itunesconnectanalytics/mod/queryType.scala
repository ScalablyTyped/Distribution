package typings.itunesconnectanalytics.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait queryType extends js.Object
@JSImport("itunesconnectanalytics", "queryType")
@js.native
object queryType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[queryType with String] = js.native
  
  @js.native
  sealed trait metrics extends queryType
  /* "metrics" */ @js.native
  object metrics extends TopLevel[metrics with String]
  
  @js.native
  sealed trait sources extends queryType
  /* "sources" */ @js.native
  object sources extends TopLevel[sources with String]
}
