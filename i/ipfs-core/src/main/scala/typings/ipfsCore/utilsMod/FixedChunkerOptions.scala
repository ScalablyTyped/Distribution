package typings.ipfsCore.utilsMod

import typings.ipfsCore.ipfsCoreStrings.fixed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FixedChunkerOptions extends ChunkerOptions {
  
  var chunker: fixed = js.native
  
  var maxChunkSize: js.UndefOr[Double] = js.native
}
object FixedChunkerOptions {
  
  @scala.inline
  def apply(chunker: fixed): FixedChunkerOptions = {
    val __obj = js.Dynamic.literal(chunker = chunker.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedChunkerOptions]
  }
  
  @scala.inline
  implicit class FixedChunkerOptionsOps[Self <: FixedChunkerOptions] (val x: Self) extends AnyVal {
    
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
    def setChunker(value: fixed): Self = this.set("chunker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxChunkSize(value: Double): Self = this.set("maxChunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxChunkSize: Self = this.set("maxChunkSize", js.undefined)
  }
}
