package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputAttributes extends js.Object {
  
  var `noise-removal`: js.UndefOr[Double] = js.native
  
  var `output-compression-quality-factor`: js.UndefOr[Double] = js.native
}
object OutputAttributes {
  
  @scala.inline
  def apply(): OutputAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputAttributes]
  }
  
  @scala.inline
  implicit class OutputAttributesOps[Self <: OutputAttributes] (val x: Self) extends AnyVal {
    
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
    def `setNoise-removal`(value: Double): Self = this.set("noise-removal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteNoise-removal`: Self = this.set("noise-removal", js.undefined)
    
    @scala.inline
    def `setOutput-compression-quality-factor`(value: Double): Self = this.set("output-compression-quality-factor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteOutput-compression-quality-factor`: Self = this.set("output-compression-quality-factor", js.undefined)
  }
}
