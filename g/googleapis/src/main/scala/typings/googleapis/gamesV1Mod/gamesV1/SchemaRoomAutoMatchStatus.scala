package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for status of room automatching that is in
  * progress.
  */
trait SchemaRoomAutoMatchStatus extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#roomAutoMatchStatus.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * An estimate for the amount of time (in seconds) that auto-matching is
    * expected to take to complete.
    */
  var waitEstimateSeconds: js.UndefOr[Double] = js.undefined
}
object SchemaRoomAutoMatchStatus {
  
  @scala.inline
  def apply(): SchemaRoomAutoMatchStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoomAutoMatchStatus]
  }
  
  @scala.inline
  implicit class SchemaRoomAutoMatchStatusMutableBuilder[Self <: SchemaRoomAutoMatchStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setWaitEstimateSeconds(value: Double): Self = StObject.set(x, "waitEstimateSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitEstimateSecondsUndefined: Self = StObject.set(x, "waitEstimateSeconds", js.undefined)
  }
}
