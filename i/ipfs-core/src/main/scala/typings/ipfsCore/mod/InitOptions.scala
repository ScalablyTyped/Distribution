package typings.ipfsCore.mod

import typings.ipfsCore.configMod.IPFSConfig
import typings.peerId.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitOptions extends js.Object {
  
  /**
    * - Set to `false` to disallow
    * initialization if the repo does not already exist.
    */
  var allowNew: js.UndefOr[Boolean] = js.native
  
  /**
    * - Number of bits to use in the generated key
    * pair (rsa only).
    */
  var bits: js.UndefOr[Double] = js.native
  
  var config: js.UndefOr[IPFSConfig] = js.native
  
  /**
    * - Whether to remove built-in assets,
    * like the instructional tour and empty mutable file system, from the repo.
    */
  var emptyRepo: js.UndefOr[Boolean] = js.native
  
  /**
    * - A passphrase to encrypt keys. You should
    * generally use the top-level `pass` option instead of the `init.pass`
    * option (this one will take its value from the top-level option if not set).
    */
  var pass: js.UndefOr[String] = js.native
  
  /**
    * - A pre-generated private key to use.
    * **NOTE: This overrides `bits`.**
    */
  var privateKey: js.UndefOr[String | ^ ] = js.native
  
  /**
    * - Apply profile settings to config.
    */
  var profiles: js.UndefOr[js.Array[String]] = js.native
}
object InitOptions {
  
  @scala.inline
  def apply(): InitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitOptions]
  }
  
  @scala.inline
  implicit class InitOptionsOps[Self <: InitOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowNew(value: Boolean): Self = this.set("allowNew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowNew: Self = this.set("allowNew", js.undefined)
    
    @scala.inline
    def setBits(value: Double): Self = this.set("bits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBits: Self = this.set("bits", js.undefined)
    
    @scala.inline
    def setConfig(value: IPFSConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setEmptyRepo(value: Boolean): Self = this.set("emptyRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyRepo: Self = this.set("emptyRepo", js.undefined)
    
    @scala.inline
    def setPass(value: String): Self = this.set("pass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePass: Self = this.set("pass", js.undefined)
    
    @scala.inline
    def setPrivateKey(value: String | ^ ): Self = this.set("privateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateKey: Self = this.set("privateKey", js.undefined)
    
    @scala.inline
    def setProfilesVarargs(value: String*): Self = this.set("profiles", js.Array(value :_*))
    
    @scala.inline
    def setProfiles(value: js.Array[String]): Self = this.set("profiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfiles: Self = this.set("profiles", js.undefined)
  }
}
