package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A representation of an integer mean metric contribution.
  */
@js.native
trait SchemaIntegerMean extends js.Object {
  
  /**
    * The number of values being aggregated.
    */
  var count: js.UndefOr[SchemaSplitInt64] = js.native
  
  /**
    * The sum of all values being aggregated.
    */
  var sum: js.UndefOr[SchemaSplitInt64] = js.native
}
object SchemaIntegerMean {
  
  @scala.inline
  def apply(): SchemaIntegerMean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIntegerMean]
  }
  
  @scala.inline
  implicit class SchemaIntegerMeanOps[Self <: SchemaIntegerMean] (val x: Self) extends AnyVal {
    
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
    def setCount(value: SchemaSplitInt64): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setSum(value: SchemaSplitInt64): Self = this.set("sum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSum: Self = this.set("sum", js.undefined)
  }
}
