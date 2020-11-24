package typings.istanbulLibInstrument.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstrumenterOptions extends js.Object {
  
  var autoWrap: Boolean = js.native
  
  var compact: Boolean = js.native
  
  var coverageVariable: String = js.native
  
  var debug: Boolean = js.native
  
  var esModules: Boolean = js.native
  
  var preserveComments: Boolean = js.native
  
  var produceSourceMap: Boolean = js.native
  
  def sourceMapUrlCallback(filename: String, url: String): Unit = js.native
}
object InstrumenterOptions {
  
  @scala.inline
  def apply(
    autoWrap: Boolean,
    compact: Boolean,
    coverageVariable: String,
    debug: Boolean,
    esModules: Boolean,
    preserveComments: Boolean,
    produceSourceMap: Boolean,
    sourceMapUrlCallback: (String, String) => Unit
  ): InstrumenterOptions = {
    val __obj = js.Dynamic.literal(autoWrap = autoWrap.asInstanceOf[js.Any], compact = compact.asInstanceOf[js.Any], coverageVariable = coverageVariable.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], esModules = esModules.asInstanceOf[js.Any], preserveComments = preserveComments.asInstanceOf[js.Any], produceSourceMap = produceSourceMap.asInstanceOf[js.Any], sourceMapUrlCallback = js.Any.fromFunction2(sourceMapUrlCallback))
    __obj.asInstanceOf[InstrumenterOptions]
  }
  
  @scala.inline
  implicit class InstrumenterOptionsOps[Self <: InstrumenterOptions] (val x: Self) extends AnyVal {
    
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
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverageVariable(value: String): Self = this.set("coverageVariable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEsModules(value: Boolean): Self = this.set("esModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveComments(value: Boolean): Self = this.set("preserveComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduceSourceMap(value: Boolean): Self = this.set("produceSourceMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMapUrlCallback(value: (String, String) => Unit): Self = this.set("sourceMapUrlCallback", js.Any.fromFunction2(value))
  }
}
