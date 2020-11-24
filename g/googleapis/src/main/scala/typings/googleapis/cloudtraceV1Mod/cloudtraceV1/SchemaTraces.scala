package typings.googleapis.cloudtraceV1Mod.cloudtraceV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List of new or updated traces.
  */
@js.native
trait SchemaTraces extends js.Object {
  
  /**
    * List of traces.
    */
  var traces: js.UndefOr[js.Array[SchemaTrace]] = js.native
}
object SchemaTraces {
  
  @scala.inline
  def apply(): SchemaTraces = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTraces]
  }
  
  @scala.inline
  implicit class SchemaTracesOps[Self <: SchemaTraces] (val x: Self) extends AnyVal {
    
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
    def setTracesVarargs(value: SchemaTrace*): Self = this.set("traces", js.Array(value :_*))
    
    @scala.inline
    def setTraces(value: js.Array[SchemaTrace]): Self = this.set("traces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraces: Self = this.set("traces", js.undefined)
  }
}
