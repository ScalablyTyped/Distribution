package typings.kdbxweb.mod

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "Meta")
@js.native
class Meta () extends StObject {
  
  def merge(remote: Meta, objectMap: ObjectMap): Unit = js.native
  
  def write(parentNode: Node, ctx: Context): Unit = js.native
}
/* static members */
object Meta {
  
  @JSImport("kdbxweb", "Meta.create")
  @js.native
  def create(): Meta = js.native
  
  @JSImport("kdbxweb", "Meta.read")
  @js.native
  def read(xmlNode: Node, ctx: Context): Meta = js.native
}
