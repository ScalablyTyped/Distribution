package typings.jestSnapshot

import typings.prettyFormat.mod.Plugin
import typings.prettyFormat.typesMod.Plugins
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-snapshot/build/plugins", JSImport.Namespace)
@js.native
object pluginsMod extends js.Object {
  
  def addSerializer(plugin: Plugin): Unit = js.native
  
  def getSerializers(): Plugins = js.native
}
