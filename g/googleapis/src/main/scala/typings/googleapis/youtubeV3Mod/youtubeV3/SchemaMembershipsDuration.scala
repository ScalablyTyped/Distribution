package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMembershipsDuration extends StObject {
  
  /**
    * The date and time when the user became a continuous member across all levels.
    */
  var memberSince: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The cumulative time the user has been a member across all levels in complete months (the time is rounded down to the nearest integer).
    */
  var memberTotalDurationMonths: js.UndefOr[Double | Null] = js.undefined
}
object SchemaMembershipsDuration {
  
  inline def apply(): SchemaMembershipsDuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMembershipsDuration]
  }
  
  extension [Self <: SchemaMembershipsDuration](x: Self) {
    
    inline def setMemberSince(value: String): Self = StObject.set(x, "memberSince", value.asInstanceOf[js.Any])
    
    inline def setMemberSinceNull: Self = StObject.set(x, "memberSince", null)
    
    inline def setMemberSinceUndefined: Self = StObject.set(x, "memberSince", js.undefined)
    
    inline def setMemberTotalDurationMonths(value: Double): Self = StObject.set(x, "memberTotalDurationMonths", value.asInstanceOf[js.Any])
    
    inline def setMemberTotalDurationMonthsNull: Self = StObject.set(x, "memberTotalDurationMonths", null)
    
    inline def setMemberTotalDurationMonthsUndefined: Self = StObject.set(x, "memberTotalDurationMonths", js.undefined)
  }
}
