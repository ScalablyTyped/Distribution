package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typings.maximMazurokGapiClientAnalytics.anon.ComparisonValue
import typings.maximMazurokGapiClientAnalytics.anon.EventConditions
import typings.maximMazurokGapiClientAnalytics.anon.FirstStepRequired
import typings.maximMazurokGapiClientAnalytics.anon.Href
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Goal extends StObject {
  
  /** Account ID to which this goal belongs. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** Determines whether this goal is active. */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /** Time this goal was created. */
  var created: js.UndefOr[String] = js.undefined
  
  /** Details for the goal of the type EVENT. */
  var eventDetails: js.UndefOr[EventConditions] = js.undefined
  
  /** Goal ID. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Internal ID for the web property to which this goal belongs. */
  var internalWebPropertyId: js.UndefOr[String] = js.undefined
  
  /** Resource type for an Analytics goal. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Goal name. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Parent link for a goal. Points to the view (profile) to which this goal belongs. */
  var parentLink: js.UndefOr[Href] = js.undefined
  
  /** View (Profile) ID to which this goal belongs. */
  var profileId: js.UndefOr[String] = js.undefined
  
  /** Link for this goal. */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /** Goal type. Possible values are URL_DESTINATION, VISIT_TIME_ON_SITE, VISIT_NUM_PAGES, AND EVENT. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** Time this goal was last modified. */
  var updated: js.UndefOr[String] = js.undefined
  
  /** Details for the goal of the type URL_DESTINATION. */
  var urlDestinationDetails: js.UndefOr[FirstStepRequired] = js.undefined
  
  /** Goal value. */
  var value: js.UndefOr[Double] = js.undefined
  
  /** Details for the goal of the type VISIT_NUM_PAGES. */
  var visitNumPagesDetails: js.UndefOr[ComparisonValue] = js.undefined
  
  /** Details for the goal of the type VISIT_TIME_ON_SITE. */
  var visitTimeOnSiteDetails: js.UndefOr[ComparisonValue] = js.undefined
  
  /** Web property ID to which this goal belongs. The web property ID is of the form UA-XXXXX-YY. */
  var webPropertyId: js.UndefOr[String] = js.undefined
}
object Goal {
  
  inline def apply(): Goal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Goal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Goal] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setEventDetails(value: EventConditions): Self = StObject.set(x, "eventDetails", value.asInstanceOf[js.Any])
    
    inline def setEventDetailsUndefined: Self = StObject.set(x, "eventDetails", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInternalWebPropertyId(value: String): Self = StObject.set(x, "internalWebPropertyId", value.asInstanceOf[js.Any])
    
    inline def setInternalWebPropertyIdUndefined: Self = StObject.set(x, "internalWebPropertyId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParentLink(value: Href): Self = StObject.set(x, "parentLink", value.asInstanceOf[js.Any])
    
    inline def setParentLinkUndefined: Self = StObject.set(x, "parentLink", js.undefined)
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    inline def setUrlDestinationDetails(value: FirstStepRequired): Self = StObject.set(x, "urlDestinationDetails", value.asInstanceOf[js.Any])
    
    inline def setUrlDestinationDetailsUndefined: Self = StObject.set(x, "urlDestinationDetails", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVisitNumPagesDetails(value: ComparisonValue): Self = StObject.set(x, "visitNumPagesDetails", value.asInstanceOf[js.Any])
    
    inline def setVisitNumPagesDetailsUndefined: Self = StObject.set(x, "visitNumPagesDetails", js.undefined)
    
    inline def setVisitTimeOnSiteDetails(value: ComparisonValue): Self = StObject.set(x, "visitTimeOnSiteDetails", value.asInstanceOf[js.Any])
    
    inline def setVisitTimeOnSiteDetailsUndefined: Self = StObject.set(x, "visitTimeOnSiteDetails", js.undefined)
    
    inline def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
