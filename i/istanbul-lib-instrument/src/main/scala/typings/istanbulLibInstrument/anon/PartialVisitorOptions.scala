package typings.istanbulLibInstrument.anon

import typings.sourceMap.mod.RawSourceMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<istanbul-lib-instrument.istanbul-lib-instrument.VisitorOptions> */
@js.native
trait PartialVisitorOptions extends js.Object {
  
  var coverageVariable: js.UndefOr[String] = js.native
  
  var inputSourceMap: js.UndefOr[RawSourceMap] = js.native
}
object PartialVisitorOptions {
  
  @scala.inline
  def apply(): PartialVisitorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialVisitorOptions]
  }
  
  @scala.inline
  implicit class PartialVisitorOptionsOps[Self <: PartialVisitorOptions] (val x: Self) extends AnyVal {
    
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
    def setCoverageVariable(value: String): Self = this.set("coverageVariable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoverageVariable: Self = this.set("coverageVariable", js.undefined)
    
    @scala.inline
    def setInputSourceMap(value: RawSourceMap): Self = this.set("inputSourceMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputSourceMap: Self = this.set("inputSourceMap", js.undefined)
  }
}
