package typings.materialUiCore

import typings.materialUiCore.unstableUseMediaQueryMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMediaQueryMod {
  
  @JSImport("@material-ui/core/useMediaQuery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unstableUseMediaQuery(query: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_useMediaQuery")(query.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def unstableUseMediaQuery(query: String, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_useMediaQuery")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
