package typings.istanbulLibInstrument.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<istanbul-lib-instrument.istanbul-lib-instrument.InstrumenterOptions> */
@js.native
trait PartialInstrumenterOption extends js.Object {
  
  var autoWrap: js.UndefOr[Boolean] = js.native
  
  var compact: js.UndefOr[Boolean] = js.native
  
  var coverageVariable: js.UndefOr[String] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var esModules: js.UndefOr[Boolean] = js.native
  
  var preserveComments: js.UndefOr[Boolean] = js.native
  
  var produceSourceMap: js.UndefOr[Boolean] = js.native
  
  var sourceMapUrlCallback: js.UndefOr[js.Function2[/* filename */ String, /* url */ String, Unit]] = js.native
}
object PartialInstrumenterOption {
  
  @scala.inline
  def apply(): PartialInstrumenterOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialInstrumenterOption]
  }
  
  @scala.inline
  implicit class PartialInstrumenterOptionOps[Self <: PartialInstrumenterOption] (val x: Self) extends AnyVal {
    
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
    def setAutoWrap(value: Boolean): Self = this.set("autoWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoWrap: Self = this.set("autoWrap", js.undefined)
    
    @scala.inline
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    
    @scala.inline
    def setCoverageVariable(value: String): Self = this.set("coverageVariable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoverageVariable: Self = this.set("coverageVariable", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setEsModules(value: Boolean): Self = this.set("esModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEsModules: Self = this.set("esModules", js.undefined)
    
    @scala.inline
    def setPreserveComments(value: Boolean): Self = this.set("preserveComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveComments: Self = this.set("preserveComments", js.undefined)
    
    @scala.inline
    def setProduceSourceMap(value: Boolean): Self = this.set("produceSourceMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProduceSourceMap: Self = this.set("produceSourceMap", js.undefined)
    
    @scala.inline
    def setSourceMapUrlCallback(value: (/* filename */ String, /* url */ String) => Unit): Self = this.set("sourceMapUrlCallback", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSourceMapUrlCallback: Self = this.set("sourceMapUrlCallback", js.undefined)
  }
}
