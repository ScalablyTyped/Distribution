package typings.ipfsCore.anon

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictx extends /* x */ NumberDictionary[Enabled] {
  
  var autoDial: Boolean = js.native
  
  var bootstrap: Enabled = js.native
}
object Dictx {
  
  @scala.inline
  def apply(autoDial: Boolean, bootstrap: Enabled): Dictx = {
    val __obj = js.Dynamic.literal(autoDial = autoDial.asInstanceOf[js.Any], bootstrap = bootstrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictx]
  }
  
  @scala.inline
  implicit class DictxOps[Self <: Dictx] (val x: Self) extends AnyVal {
    
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
    def setAutoDial(value: Boolean): Self = this.set("autoDial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootstrap(value: Enabled): Self = this.set("bootstrap", value.asInstanceOf[js.Any])
  }
}
