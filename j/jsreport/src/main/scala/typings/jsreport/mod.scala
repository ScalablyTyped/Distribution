package typings.jsreport

import typings.jsreportCore.anon.PartialConfiguration
import typings.jsreportCore.mod.Reporter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsreport", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(): Reporter = js.native
  def apply(config: PartialConfiguration): Reporter = js.native
}
