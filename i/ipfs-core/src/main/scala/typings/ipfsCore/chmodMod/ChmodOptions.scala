package typings.ipfsCore.chmodMod

import typings.ipfsCore.ipfsCoreNumbers.`0`
import typings.ipfsCore.ipfsCoreNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChmodOptions extends js.Object {
  
  var cidVersion: js.UndefOr[`0` | `1`] = js.native
  
  var flush: js.UndefOr[Boolean] = js.native
  
  var hashAlg: js.UndefOr[String] = js.native
  
  var recursive: js.UndefOr[Boolean] = js.native
  
  var shardSplitThreshold: js.UndefOr[Double] = js.native
}
object ChmodOptions {
  
  @scala.inline
  def apply(): ChmodOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChmodOptions]
  }
  
  @scala.inline
  implicit class ChmodOptionsOps[Self <: ChmodOptions] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setShardSplitThreshold(value: Double): Self = this.set("shardSplitThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShardSplitThreshold: Self = this.set("shardSplitThreshold", js.undefined)
  }
}
