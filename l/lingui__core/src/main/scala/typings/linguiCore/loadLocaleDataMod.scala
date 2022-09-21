package typings.linguiCore

import typings.linguiCore.anon.Plurals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadLocaleDataMod {
  
  @JSImport("@lingui/core/cjs/dev/loadLocaleData", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(locale: String): Plurals = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(locale.asInstanceOf[js.Any]).asInstanceOf[Plurals]
}
