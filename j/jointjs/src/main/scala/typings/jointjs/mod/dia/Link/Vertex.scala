package typings.jointjs.mod.dia.Link

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.mod.g.PlainPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vertex
  extends PlainPoint
     with /* key */ StringDictionary[js.Any]
object Vertex {
  
  @scala.inline
  def apply(x: Double, y: Double): Vertex = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vertex]
  }
}
