package typings.jsgraph.anon

import typings.jsgraph.mod.DirectedGraph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dirgaph extends js.Object {
  
  var dirgaph: DirectedGraph = js.native
}
object Dirgaph {
  
  @scala.inline
  def apply(dirgaph: DirectedGraph): Dirgaph = {
    val __obj = js.Dynamic.literal(dirgaph = dirgaph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dirgaph]
  }
  
  @scala.inline
  implicit class DirgaphOps[Self <: Dirgaph] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDirgaph(value: DirectedGraph): Self = this.set("dirgaph", value.asInstanceOf[js.Any])
  }
}
