package typings.kdbxweb.mod

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "Meta")
@js.native
class Meta () extends StObject {
  
  def merge(remote: Meta, objectMap: ObjectMap): Unit = js.native
  
  def write(parentNode: Node, ctx: Context): Unit = js.native
}
/* static members */
object Meta {
  
  @JSImport("kdbxweb", "Meta")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(): Meta = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Meta]
  
  inline def read(xmlNode: Node, ctx: Context): Meta = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(xmlNode.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Meta]
}
