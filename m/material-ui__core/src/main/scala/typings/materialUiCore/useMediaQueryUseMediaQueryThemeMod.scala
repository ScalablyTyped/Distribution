package typings.materialUiCore

import typings.materialUiCore.useMediaQueryUseMediaQueryMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMediaQueryUseMediaQueryThemeMod {
  
  @JSImport("@material-ui/core/useMediaQuery/useMediaQueryTheme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Theme](query: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(query.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def default[Theme](query: String, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default[Theme](query: js.Function1[/* theme */ Theme, String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(query.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def default[Theme](query: js.Function1[/* theme */ Theme, String], options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
