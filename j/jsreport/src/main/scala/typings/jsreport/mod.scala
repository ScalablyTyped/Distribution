package typings.jsreport

import typings.jsreportCore.anon.PartialConfiguration
import typings.jsreportCore.mod.Reporter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): Reporter = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Reporter]
  @scala.inline
  def apply(config: PartialConfiguration): Reporter = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[Reporter]
  
  @JSImport("jsreport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
