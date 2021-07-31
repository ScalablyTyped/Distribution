package typings.materialUiCore

import typings.enzyme.mod.CommonWrapper
import typings.materialUiCore.anon.Context
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object untilMod {
  
  @JSImport("@material-ui/core/test-utils/until", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[P, S](selector: String, options: Context): CommonWrapper[P, S, Component[P, S, js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CommonWrapper[P, S, Component[P, S, js.Any]]]
}
