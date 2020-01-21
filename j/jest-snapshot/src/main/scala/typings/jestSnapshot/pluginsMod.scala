package typings.jestSnapshot

import typings.prettyFormat.typesMod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-snapshot/build/plugins", JSImport.Namespace)
@js.native
object pluginsMod extends js.Object {
  def addSerializer(plugin: Plugin): Unit = js.native
  def getSerializers(): js.Array[Plugin] = js.native
}

