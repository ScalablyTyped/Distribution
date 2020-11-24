package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about an output of a SeqMapTask.
  */
@js.native
trait SchemaSeqMapTaskOutputInfo extends js.Object {
  
  /**
    * The sink to write the output value to.
    */
  var sink: js.UndefOr[SchemaSink] = js.native
  
  /**
    * The id of the TupleTag the user code will tag the output value by.
    */
  var tag: js.UndefOr[String] = js.native
}
object SchemaSeqMapTaskOutputInfo {
  
  @scala.inline
  def apply(): SchemaSeqMapTaskOutputInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSeqMapTaskOutputInfo]
  }
  
  @scala.inline
  implicit class SchemaSeqMapTaskOutputInfoOps[Self <: SchemaSeqMapTaskOutputInfo] (val x: Self) extends AnyVal {
    
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
    def setSink(value: SchemaSink): Self = this.set("sink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSink: Self = this.set("sink", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
}
