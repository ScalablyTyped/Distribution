package typings.kdbxweb.mod

import typings.std.Date
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "Times")
@js.native
class Times () extends js.Object {
  
  var creationTime: Date = js.native
  
  var expires: Boolean = js.native
  
  var expiryTime: Date = js.native
  
  var lastAccessTime: Date = js.native
  
  var lastModTime: Date = js.native
  
  var locationChanged: Date = js.native
  
  def update(): Unit = js.native
  
  var usageCount: Double = js.native
  
  def write(parentNode: Node, ctx: Context): Unit = js.native
}
/* static members */
@JSImport("kdbxweb", "Times")
@js.native
object Times extends js.Object {
  
  def create(): Times = js.native
  
  def read(xmlNode: Node): Times = js.native
}
