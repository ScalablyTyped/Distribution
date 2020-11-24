package typings.ipfsCore.componentsResolveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolveSettings extends js.Object {
  
  /**
    * - Multibase codec name the CID in the resolved path will be encoded with.
    */
  var cidBase: js.UndefOr[String] = js.native
  
  /**
    * - Resolve until result is an IPFS name.
    */
  var recursive: js.UndefOr[Boolean] = js.native
}
object ResolveSettings {
  
  @scala.inline
  def apply(): ResolveSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveSettings]
  }
  
  @scala.inline
  implicit class ResolveSettingsOps[Self <: ResolveSettings] (val x: Self) extends AnyVal {
    
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
    def setCidBase(value: String): Self = this.set("cidBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCidBase: Self = this.set("cidBase", js.undefined)
    
    @scala.inline
    def setRecursive(value: Boolean): Self = this.set("recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecursive: Self = this.set("recursive", js.undefined)
  }
}
