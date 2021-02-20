package typings.karmaViewport

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inspectMod {
  
  @JSImport("karma-viewport/dist/adapter/util/inspect", "inspect")
  @js.native
  def inspect(value: InspectValue): String = js.native
  
  type InspectFunction = js.Function1[/* repeated */ js.Any, js.Any]
  
  type InspectValue = js.UndefOr[Null | Double | String | js.Object | InspectFunction]
}
