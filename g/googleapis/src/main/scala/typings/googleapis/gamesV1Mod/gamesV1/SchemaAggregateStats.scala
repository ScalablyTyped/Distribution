package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for aggregate stats.
  */
@js.native
trait SchemaAggregateStats extends js.Object {
  
  /**
    * The number of messages sent between a pair of peers.
    */
  var count: js.UndefOr[String] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#aggregateStats.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The maximum amount.
    */
  var max: js.UndefOr[String] = js.native
  
  /**
    * The minimum amount.
    */
  var min: js.UndefOr[String] = js.native
  
  /**
    * The total number of bytes sent for messages between a pair of peers.
    */
  var sum: js.UndefOr[String] = js.native
}
object SchemaAggregateStats {
  
  @scala.inline
  def apply(): SchemaAggregateStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAggregateStats]
  }
  
  @scala.inline
  implicit class SchemaAggregateStatsOps[Self <: SchemaAggregateStats] (val x: Self) extends AnyVal {
    
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
    def setCount(value: String): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMax(value: String): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: String): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setSum(value: String): Self = this.set("sum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSum: Self = this.set("sum", js.undefined)
  }
}
