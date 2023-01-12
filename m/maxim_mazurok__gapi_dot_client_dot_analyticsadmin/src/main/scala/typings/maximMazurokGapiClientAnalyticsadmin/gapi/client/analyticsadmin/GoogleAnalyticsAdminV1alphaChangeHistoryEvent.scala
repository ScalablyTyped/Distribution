package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaChangeHistoryEvent extends StObject {
  
  /** The type of actor that made this change. */
  var actorType: js.UndefOr[String] = js.undefined
  
  /** Time when change was made. */
  var changeTime: js.UndefOr[String] = js.undefined
  
  /** A list of changes made in this change history event that fit the filters specified in SearchChangeHistoryEventsRequest. */
  var changes: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaChangeHistoryChange]] = js.undefined
  
  /** If true, then the list of changes returned was filtered, and does not represent all changes that occurred in this event. */
  var changesFiltered: js.UndefOr[Boolean] = js.undefined
  
  /** ID of this change history event. This ID is unique across Google Analytics. */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Email address of the Google account that made the change. This will be a valid email address if the actor field is set to USER, and empty otherwise. Google accounts that have been
    * deleted will cause an error.
    */
  var userActorEmail: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaChangeHistoryEvent {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaChangeHistoryEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaChangeHistoryEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAnalyticsAdminV1alphaChangeHistoryEvent] (val x: Self) extends AnyVal {
    
    inline def setActorType(value: String): Self = StObject.set(x, "actorType", value.asInstanceOf[js.Any])
    
    inline def setActorTypeUndefined: Self = StObject.set(x, "actorType", js.undefined)
    
    inline def setChangeTime(value: String): Self = StObject.set(x, "changeTime", value.asInstanceOf[js.Any])
    
    inline def setChangeTimeUndefined: Self = StObject.set(x, "changeTime", js.undefined)
    
    inline def setChanges(value: js.Array[GoogleAnalyticsAdminV1alphaChangeHistoryChange]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesFiltered(value: Boolean): Self = StObject.set(x, "changesFiltered", value.asInstanceOf[js.Any])
    
    inline def setChangesFilteredUndefined: Self = StObject.set(x, "changesFiltered", js.undefined)
    
    inline def setChangesUndefined: Self = StObject.set(x, "changes", js.undefined)
    
    inline def setChangesVarargs(value: GoogleAnalyticsAdminV1alphaChangeHistoryChange*): Self = StObject.set(x, "changes", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setUserActorEmail(value: String): Self = StObject.set(x, "userActorEmail", value.asInstanceOf[js.Any])
    
    inline def setUserActorEmailUndefined: Self = StObject.set(x, "userActorEmail", js.undefined)
  }
}
