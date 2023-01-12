package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsersInfoResponse extends StObject {
  
  /** the number of emails that are queued for delivery due to exceeding your monthly or hourly quotas */
  var backlog: Double
  
  /**
    * the date and time that the user's Mandrill account was created as a UTC string in
    * YYYY-MM-DD HH:MM:SS format
    */
  var created_at: String
  
  /**
    * the maximum number of emails Mandrill will deliver for this user each hour. Any emails beyond
    * that will be accepted and queued for later delivery. Users with higher reputations will have
    * higher hourly quotas
    */
  var hourly_quota: Double
  
  /** a unique, permanent identifier for this user */
  var public_id: String
  
  /** the reputation of the user on a scale from 0 to 100, with 75 generally being a "good" reputation */
  var reputation: Double
  
  /** an aggregate summary of the account's sending stats */
  var stats: UserInfoAggregatedStats
  
  /** the username of the user (used for SMTP authentication) */
  var username: String
}
object UsersInfoResponse {
  
  inline def apply(
    backlog: Double,
    created_at: String,
    hourly_quota: Double,
    public_id: String,
    reputation: Double,
    stats: UserInfoAggregatedStats,
    username: String
  ): UsersInfoResponse = {
    val __obj = js.Dynamic.literal(backlog = backlog.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], hourly_quota = hourly_quota.asInstanceOf[js.Any], public_id = public_id.asInstanceOf[js.Any], reputation = reputation.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersInfoResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UsersInfoResponse] (val x: Self) extends AnyVal {
    
    inline def setBacklog(value: Double): Self = StObject.set(x, "backlog", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setHourly_quota(value: Double): Self = StObject.set(x, "hourly_quota", value.asInstanceOf[js.Any])
    
    inline def setPublic_id(value: String): Self = StObject.set(x, "public_id", value.asInstanceOf[js.Any])
    
    inline def setReputation(value: Double): Self = StObject.set(x, "reputation", value.asInstanceOf[js.Any])
    
    inline def setStats(value: UserInfoAggregatedStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
