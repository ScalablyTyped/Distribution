package typings.iltorb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrotliEncodeParams extends js.Object {
  
  var disable_literal_context_modeling: js.UndefOr[Boolean] = js.native
  
  var lgblock: js.UndefOr[Double] = js.native
  
  var lgwin: js.UndefOr[Double] = js.native
  
  /** @default 0 */
  var mode: js.UndefOr[BrotliMode] = js.native
  
  /** @default 11 */
  var quality: js.UndefOr[BrotliCompressionQuality] = js.native
  
  var size_hint: js.UndefOr[Double] = js.native
}
object BrotliEncodeParams {
  
  @scala.inline
  def apply(): BrotliEncodeParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrotliEncodeParams]
  }
  
  @scala.inline
  implicit class BrotliEncodeParamsOps[Self <: BrotliEncodeParams] (val x: Self) extends AnyVal {
    
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
    def setDisable_literal_context_modeling(value: Boolean): Self = this.set("disable_literal_context_modeling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisable_literal_context_modeling: Self = this.set("disable_literal_context_modeling", js.undefined)
    
    @scala.inline
    def setLgblock(value: Double): Self = this.set("lgblock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLgblock: Self = this.set("lgblock", js.undefined)
    
    @scala.inline
    def setLgwin(value: Double): Self = this.set("lgwin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLgwin: Self = this.set("lgwin", js.undefined)
    
    @scala.inline
    def setMode(value: BrotliMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setQuality(value: BrotliCompressionQuality): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    
    @scala.inline
    def setSize_hint(value: Double): Self = this.set("size_hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize_hint: Self = this.set("size_hint", js.undefined)
  }
}
