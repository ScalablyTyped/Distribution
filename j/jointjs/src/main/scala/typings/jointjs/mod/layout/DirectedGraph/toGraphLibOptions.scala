package typings.jointjs.mod.layout.DirectedGraph

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait toGraphLibOptions
  extends /* key */ StringDictionary[js.Any] {
  
  var graphlib: js.UndefOr[js.Any] = js.native
}
object toGraphLibOptions {
  
  @scala.inline
  def apply(): toGraphLibOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[toGraphLibOptions]
  }
  
  @scala.inline
  implicit class toGraphLibOptionsOps[Self <: toGraphLibOptions] (val x: Self) extends AnyVal {
    
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
    def setGraphlib(value: js.Any): Self = this.set("graphlib", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGraphlib: Self = this.set("graphlib", js.undefined)
  }
}
