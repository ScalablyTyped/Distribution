package typings.jupyterlabExtensionmanager.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Insecure extends js.Object {
  
  /**
    * Package is insecure or have vulnerable dependencies (based on the nsp registry).
    */
  var insecure: Double = js.native
  
  /**
    * Package has a version < 1.0.0.
    */
  var unstable: Boolean = js.native
}
object Insecure {
  
  @scala.inline
  def apply(insecure: Double, unstable: Boolean): Insecure = {
    val __obj = js.Dynamic.literal(insecure = insecure.asInstanceOf[js.Any], unstable = unstable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Insecure]
  }
  
  @scala.inline
  implicit class InsecureOps[Self <: Insecure] (val x: Self) extends AnyVal {
    
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
    def setInsecure(value: Double): Self = this.set("insecure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnstable(value: Boolean): Self = this.set("unstable", value.asInstanceOf[js.Any])
  }
}
