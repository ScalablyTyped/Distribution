package typings.googleapis.v3Mod.analyticsV3

import typings.googleapis.anon.ComparisonValue
import typings.googleapis.anon.EventConditions
import typings.googleapis.anon.FirstStepRequired
import typings.googleapis.anon.Href
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Analytics goal resource.
  */
@js.native
trait SchemaGoal extends js.Object {
  /**
    * Account ID to which this goal belongs.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Determines whether this goal is active.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Time this goal was created.
    */
  var created: js.UndefOr[String] = js.native
  /**
    * Details for the goal of the type EVENT.
    */
  var eventDetails: js.UndefOr[EventConditions] = js.native
  /**
    * Goal ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Internal ID for the web property to which this goal belongs.
    */
  var internalWebPropertyId: js.UndefOr[String] = js.native
  /**
    * Resource type for an Analytics goal.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Goal name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Parent link for a goal. Points to the view (profile) to which this goal
    * belongs.
    */
  var parentLink: js.UndefOr[Href] = js.native
  /**
    * View (Profile) ID to which this goal belongs.
    */
  var profileId: js.UndefOr[String] = js.native
  /**
    * Link for this goal.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * Goal type. Possible values are URL_DESTINATION, VISIT_TIME_ON_SITE,
    * VISIT_NUM_PAGES, AND EVENT.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Time this goal was last modified.
    */
  var updated: js.UndefOr[String] = js.native
  /**
    * Details for the goal of the type URL_DESTINATION.
    */
  var urlDestinationDetails: js.UndefOr[FirstStepRequired] = js.native
  /**
    * Goal value.
    */
  var value: js.UndefOr[Double] = js.native
  /**
    * Details for the goal of the type VISIT_NUM_PAGES.
    */
  var visitNumPagesDetails: js.UndefOr[ComparisonValue] = js.native
  /**
    * Details for the goal of the type VISIT_TIME_ON_SITE.
    */
  var visitTimeOnSiteDetails: js.UndefOr[ComparisonValue] = js.native
  /**
    * Web property ID to which this goal belongs. The web property ID is of the
    * form UA-XXXXX-YY.
    */
  var webPropertyId: js.UndefOr[String] = js.native
}

object SchemaGoal {
  @scala.inline
  def apply(): SchemaGoal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoal]
  }
  @scala.inline
  implicit class SchemaGoalOps[Self <: SchemaGoal] (val x: Self) extends AnyVal {
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setEventDetails(value: EventConditions): Self = this.set("eventDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventDetails: Self = this.set("eventDetails", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInternalWebPropertyId(value: String): Self = this.set("internalWebPropertyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInternalWebPropertyId: Self = this.set("internalWebPropertyId", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setParentLink(value: Href): Self = this.set("parentLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentLink: Self = this.set("parentLink", js.undefined)
    @scala.inline
    def setProfileId(value: String): Self = this.set("profileId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileId: Self = this.set("profileId", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
    @scala.inline
    def setUrlDestinationDetails(value: FirstStepRequired): Self = this.set("urlDestinationDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlDestinationDetails: Self = this.set("urlDestinationDetails", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setVisitNumPagesDetails(value: ComparisonValue): Self = this.set("visitNumPagesDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisitNumPagesDetails: Self = this.set("visitNumPagesDetails", js.undefined)
    @scala.inline
    def setVisitTimeOnSiteDetails(value: ComparisonValue): Self = this.set("visitTimeOnSiteDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisitTimeOnSiteDetails: Self = this.set("visitTimeOnSiteDetails", js.undefined)
    @scala.inline
    def setWebPropertyId(value: String): Self = this.set("webPropertyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebPropertyId: Self = this.set("webPropertyId", js.undefined)
  }
  
}

