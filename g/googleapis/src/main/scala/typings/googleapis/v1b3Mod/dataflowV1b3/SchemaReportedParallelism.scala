package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the level of parallelism in a WorkItem&#39;s input, reported by
  * the worker.
  */
@js.native
trait SchemaReportedParallelism extends js.Object {
  
  /**
    * Specifies whether the parallelism is infinite. If true, &quot;value&quot;
    * is ignored. Infinite parallelism means the service will assume that the
    * work item can always be split into more non-empty work items by dynamic
    * splitting. This is a work-around for lack of support for infinity by the
    * current JSON-based Java RPC stack.
    */
  var isInfinite: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the level of parallelism in case it is finite.
    */
  var value: js.UndefOr[Double] = js.native
}
object SchemaReportedParallelism {
  
  @scala.inline
  def apply(): SchemaReportedParallelism = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportedParallelism]
  }
  
  @scala.inline
  implicit class SchemaReportedParallelismOps[Self <: SchemaReportedParallelism] (val x: Self) extends AnyVal {
    
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
    def setIsInfinite(value: Boolean): Self = this.set("isInfinite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInfinite: Self = this.set("isInfinite", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
