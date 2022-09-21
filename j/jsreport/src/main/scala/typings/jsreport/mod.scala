package typings.jsreport

import typings.jsreportCore.mod.Configuration
import typings.jsreportCore.mod.Defaults
import typings.jsreportCore.mod.Reporter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Reporter = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Reporter]
  inline def apply(config: Unit, defaults: Defaults): Reporter = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Reporter]
  inline def apply(config: Configuration): Reporter = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[Reporter]
  inline def apply(config: Configuration, defaults: Defaults): Reporter = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Reporter]
  
  @JSImport("jsreport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
