package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for status of room automatching that is in
  * progress.
  */
@js.native
trait SchemaRoomAutoMatchStatus extends js.Object {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#roomAutoMatchStatus.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * An estimate for the amount of time (in seconds) that auto-matching is
    * expected to take to complete.
    */
  var waitEstimateSeconds: js.UndefOr[Double] = js.native
}
object SchemaRoomAutoMatchStatus {
  
  @scala.inline
  def apply(): SchemaRoomAutoMatchStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoomAutoMatchStatus]
  }
  
  @scala.inline
  implicit class SchemaRoomAutoMatchStatusOps[Self <: SchemaRoomAutoMatchStatus] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setWaitEstimateSeconds(value: Double): Self = this.set("waitEstimateSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitEstimateSeconds: Self = this.set("waitEstimateSeconds", js.undefined)
  }
}
