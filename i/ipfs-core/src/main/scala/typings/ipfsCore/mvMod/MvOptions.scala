package typings.ipfsCore.mvMod

import typings.ipfsCore.ipfsCoreNumbers.`0`
import typings.ipfsCore.ipfsCoreNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MvOptions extends js.Object {
  
  var cidVersion: js.UndefOr[`0` | `1`] = js.native
  
  var flush: js.UndefOr[Boolean] = js.native
  
  var hashAlg: js.UndefOr[String] = js.native
  
  var parents: js.UndefOr[Boolean] = js.native
}
object MvOptions {
  
  @scala.inline
  def apply(): MvOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MvOptions]
  }
  
  @scala.inline
  implicit class MvOptionsOps[Self <: MvOptions] (val x: Self) extends AnyVal {
    
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
    def setCidVersion(value: `0` | `1`): Self = this.set("cidVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCidVersion: Self = this.set("cidVersion", js.undefined)
    
    @scala.inline
    def setFlush(value: Boolean): Self = this.set("flush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlush: Self = this.set("flush", js.undefined)
    
    @scala.inline
    def setHashAlg(value: String): Self = this.set("hashAlg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashAlg: Self = this.set("hashAlg", js.undefined)
    
    @scala.inline
    def setParents(value: Boolean): Self = this.set("parents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParents: Self = this.set("parents", js.undefined)
  }
}
