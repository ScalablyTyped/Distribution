package typings.matrixBotSdk.libSynapseAdminApisMod

import typings.matrixBotSdk.matrixBotSdkStrings.admin
import typings.matrixBotSdk.matrixBotSdkStrings.avatar_url
import typings.matrixBotSdk.matrixBotSdkStrings.creation_ts
import typings.matrixBotSdk.matrixBotSdkStrings.deactivated
import typings.matrixBotSdk.matrixBotSdkStrings.displayname
import typings.matrixBotSdk.matrixBotSdkStrings.is_guest
import typings.matrixBotSdk.matrixBotSdkStrings.name
import typings.matrixBotSdk.matrixBotSdkStrings.shadow_banned
import typings.matrixBotSdk.matrixBotSdkStrings.user_type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SynapseListUserOptions extends StObject {
  
  /**
    * If true will include deactivated users. Defaults to false to exclude deactivated users.
    */
  var deactivated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If false will exclude guest users. Defaults to true to include guest users.
    */
  var guests: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of results to return at a time.
    */
  var limit: js.UndefOr[Double] = js.undefined
  
  /**
    * Filters to only return users with user ID localparts or displaynames that contain this value.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The method by which to sort the returned list of users. If the ordered field has duplicates, the
    * second order is always by ascending name, which guarantees a stable ordering.
    * **Caution**: The database only has indexes on the columns `name` and `creation_ts`. This means
    * that if a different sort order is used, it can cause a large load on the database.
    */
  var order_by: js.UndefOr[
    name | is_guest | admin | user_type | deactivated | shadow_banned | displayname | avatar_url | creation_ts
  ] = js.undefined
  
  /**
    * Filters to only return users with user IDs that contain this value. This parameter is ignored when using the name parameter.
    */
  var user_id: js.UndefOr[String] = js.undefined
}
object SynapseListUserOptions {
  
  inline def apply(): SynapseListUserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SynapseListUserOptions]
  }
  
  extension [Self <: SynapseListUserOptions](x: Self) {
    
    inline def setDeactivated(value: Boolean): Self = StObject.set(x, "deactivated", value.asInstanceOf[js.Any])
    
    inline def setDeactivatedUndefined: Self = StObject.set(x, "deactivated", js.undefined)
    
    inline def setGuests(value: Boolean): Self = StObject.set(x, "guests", value.asInstanceOf[js.Any])
    
    inline def setGuestsUndefined: Self = StObject.set(x, "guests", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrder_by(
      value: name | is_guest | admin | user_type | deactivated | shadow_banned | displayname | avatar_url | creation_ts
    ): Self = StObject.set(x, "order_by", value.asInstanceOf[js.Any])
    
    inline def setOrder_byUndefined: Self = StObject.set(x, "order_by", js.undefined)
    
    inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    
    inline def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
  }
}
