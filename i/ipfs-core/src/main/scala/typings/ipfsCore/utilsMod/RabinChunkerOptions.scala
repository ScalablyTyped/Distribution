package typings.ipfsCore.utilsMod

import typings.ipfsCore.ipfsCoreStrings.rabin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RabinChunkerOptions extends ChunkerOptions {
  
  var avgChunkSize: Double = js.native
  
  var chunker: rabin = js.native
  
  var maxChunkSize: js.UndefOr[Double] = js.native
  
  var minChunkSize: js.UndefOr[Double] = js.native
}
object RabinChunkerOptions {
  
  @scala.inline
  def apply(avgChunkSize: Double, chunker: rabin): RabinChunkerOptions = {
    val __obj = js.Dynamic.literal(avgChunkSize = avgChunkSize.asInstanceOf[js.Any], chunker = chunker.asInstanceOf[js.Any])
    __obj.asInstanceOf[RabinChunkerOptions]
  }
  
  @scala.inline
  implicit class RabinChunkerOptionsOps[Self <: RabinChunkerOptions] (val x: Self) extends AnyVal {
    
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
    def setAvgChunkSize(value: Double): Self = this.set("avgChunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunker(value: rabin): Self = this.set("chunker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxChunkSize(value: Double): Self = this.set("maxChunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxChunkSize: Self = this.set("maxChunkSize", js.undefined)
    
    @scala.inline
    def setMinChunkSize(value: Double): Self = this.set("minChunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinChunkSize: Self = this.set("minChunkSize", js.undefined)
  }
}
