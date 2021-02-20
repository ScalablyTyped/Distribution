package typings.itunesconnectanalytics.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait queryType extends StObject
@JSImport("itunesconnectanalytics", "queryType")
@js.native
object queryType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[queryType with String] = js.native
  
  @js.native
  sealed trait metrics extends queryType
  /* "metrics" */ val metrics: typings.itunesconnectanalytics.mod.queryType.metrics with String = js.native
  
  @js.native
  sealed trait sources extends queryType
  /* "sources" */ val sources: typings.itunesconnectanalytics.mod.queryType.sources with String = js.native
}
