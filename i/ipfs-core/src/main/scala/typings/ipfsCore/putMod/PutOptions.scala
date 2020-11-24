package typings.ipfsCore.putMod

import typings.ipfsCore.ipfsCoreNumbers.`0`
import typings.ipfsCore.ipfsCoreNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutOptions extends js.Object {
  
  /**
    * - A CID to store the block under (default: `undefined`)
    */
  var cid: js.UndefOr[typings.cids.mod.^] = js.native
  
  /**
    * - The codec to use to create the CID (default: `'dag-pb'`)
    */
  var format: js.UndefOr[String] = js.native
  
  var mhlen: js.UndefOr[Double] = js.native
  
  /**
    * - The hashing algorithm to use to create the CID (default: `'sha2-256'`)
    */
  var mhtype: js.UndefOr[String] = js.native
  
  /**
    * - If true, pin added blocks recursively (default: `false`)
    */
  var pin: js.UndefOr[Boolean] = js.native
  
  var preload: js.UndefOr[Boolean] = js.native
  
  /**
    * - The version to use to create the CID (default: `0`)
    */
  var version: js.UndefOr[`0` | `1`] = js.native
}
object PutOptions {
  
  @scala.inline
  def apply(): PutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutOptions]
  }
  
  @scala.inline
  implicit class PutOptionsOps[Self <: PutOptions] (val x: Self) extends AnyVal {
    
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
    def setCid(value: typings.cids.mod.^): Self = this.set("cid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCid: Self = this.set("cid", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setMhlen(value: Double): Self = this.set("mhlen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMhlen: Self = this.set("mhlen", js.undefined)
    
    @scala.inline
    def setMhtype(value: String): Self = this.set("mhtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMhtype: Self = this.set("mhtype", js.undefined)
    
    @scala.inline
    def setPin(value: Boolean): Self = this.set("pin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePin: Self = this.set("pin", js.undefined)
    
    @scala.inline
    def setPreload(value: Boolean): Self = this.set("preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    
    @scala.inline
    def setVersion(value: `0` | `1`): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
