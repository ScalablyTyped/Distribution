package typings.graphite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphiteClientProperties extends js.Object {
  
  var carbon: js.Any = js.native
}
object GraphiteClientProperties {
  
  @scala.inline
  def apply(carbon: js.Any): GraphiteClientProperties = {
    val __obj = js.Dynamic.literal(carbon = carbon.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphiteClientProperties]
  }
  
  @scala.inline
  implicit class GraphiteClientPropertiesOps[Self <: GraphiteClientProperties] (val x: Self) extends AnyVal {
    
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
    def setCarbon(value: js.Any): Self = this.set("carbon", value.asInstanceOf[js.Any])
  }
}
