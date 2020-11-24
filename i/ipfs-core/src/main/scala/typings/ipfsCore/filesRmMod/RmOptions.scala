package typings.ipfsCore.filesRmMod

import typings.ipfsCore.ipfsCoreNumbers.`0`
import typings.ipfsCore.ipfsCoreNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RmOptions extends js.Object {
  
  /**
    * - The CID version to use for any updated entries
    */
  var cidVersion: js.UndefOr[`0` | `1`] = js.native
  
  /**
    * - If true the changes will be immediately flushed to disk
    */
  var flush: js.UndefOr[Boolean] = js.native
  
  /**
    * - The hash algorithm to use for any updated entries
    */
  var hashAlg: js.UndefOr[String] = js.native
  
  /**
    * - If true all paths under the specifed path(s) will be removed
    */
  var recursive: js.UndefOr[Boolean] = js.native
}
object RmOptions {
  
  @scala.inline
  def apply(): RmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RmOptions]
  }
  
  @scala.inline
  implicit class RmOptionsOps[Self <: RmOptions] (val x: Self) extends AnyVal {
    
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
    def setRecursive(value: Boolean): Self = this.set("recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecursive: Self = this.set("recursive", js.undefined)
  }
}
