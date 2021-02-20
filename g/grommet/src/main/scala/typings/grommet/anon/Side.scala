package typings.grommet.anon

import typings.grommet.grommetStrings.bottom
import typings.grommet.grommetStrings.left
import typings.grommet.grommetStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Side extends StObject {
  
  var side: left | right | bottom = js.native
}
object Side {
  
  @scala.inline
  def apply(side: left | right | bottom): Side = {
    val __obj = js.Dynamic.literal(side = side.asInstanceOf[js.Any])
    __obj.asInstanceOf[Side]
  }
  
  @scala.inline
  implicit class SideMutableBuilder[Self <: Side] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSide(value: left | right | bottom): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
  }
}
