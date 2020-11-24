package typings.ipfsCore.dhtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvideOptions extends js.Object {
  
  /**
    * - Provide not only the given object but also all objects linked from it.
    */
  var recursive: js.UndefOr[Boolean] = js.native
}
object ProvideOptions {
  
  @scala.inline
  def apply(): ProvideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvideOptions]
  }
  
  @scala.inline
  implicit class ProvideOptionsOps[Self <: ProvideOptions] (val x: Self) extends AnyVal {
    
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
    def setRecursive(value: Boolean): Self = this.set("recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecursive: Self = this.set("recursive", js.undefined)
  }
}
