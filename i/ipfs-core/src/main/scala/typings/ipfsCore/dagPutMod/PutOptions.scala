package typings.ipfsCore.dagPutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutOptions extends js.Object {
  
  var cid: js.UndefOr[typings.cids.mod.^] = js.native
  
  var format: js.UndefOr[String | Double] = js.native
  
  var hashAlg: js.UndefOr[String | Double] = js.native
  
  var pin: js.UndefOr[Boolean] = js.native
  
  var preload: js.UndefOr[Boolean] = js.native
  
  var version: js.UndefOr[Double] = js.native
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
    def setFormat(value: String | Double): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setHashAlg(value: String | Double): Self = this.set("hashAlg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashAlg: Self = this.set("hashAlg", js.undefined)
    
    @scala.inline
    def setPin(value: Boolean): Self = this.set("pin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePin: Self = this.set("pin", js.undefined)
    
    @scala.inline
    def setPreload(value: Boolean): Self = this.set("preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
