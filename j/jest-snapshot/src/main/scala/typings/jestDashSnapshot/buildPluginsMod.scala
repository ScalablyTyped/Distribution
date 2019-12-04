package typings.jestDashSnapshot

import typings.prettyDashFormat.buildTypesMod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-snapshot/build/plugins", JSImport.Namespace)
@js.native
object buildPluginsMod extends js.Object {
  def addSerializer(plugin: Plugin): Unit = js.native
  def getSerializers(): js.Array[Plugin] = js.native
}

