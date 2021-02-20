package typings.kdbxweb.mod

import typings.std.Date
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "Times")
@js.native
class Times () extends StObject {
  
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
object Times {
  
  @JSImport("kdbxweb", "Times.create")
  @js.native
  def create(): Times = js.native
  
  @JSImport("kdbxweb", "Times.read")
  @js.native
  def read(xmlNode: Node): Times = js.native
}
