package typings.googleapis.fitnessV1Mod.fitnessV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sessions contain metadata, such as a user-friendly name and time interval
  * information.
  */
@js.native
trait SchemaSession extends js.Object {
  /**
    * Session active time. While start_time_millis and end_time_millis define
    * the full session time, the active time can be shorter and specified by
    * active_time_millis. If the inactive time during the session is known, it
    * should also be inserted via a com.google.activity.segment data point with
    * a STILL activity value
    */
  var activeTimeMillis: js.UndefOr[String] = js.native
  /**
    * The type of activity this session represents.
    */
  var activityType: js.UndefOr[Double] = js.native
  /**
    * The application that created the session.
    */
  var application: js.UndefOr[SchemaApplication] = js.native
  /**
    * A description for this session.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * An end time, in milliseconds since epoch, inclusive.
    */
  var endTimeMillis: js.UndefOr[String] = js.native
  /**
    * A client-generated identifier that is unique across all sessions owned by
    * this particular user.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * A timestamp that indicates when the session was last modified.
    */
  var modifiedTimeMillis: js.UndefOr[String] = js.native
  /**
    * A human readable name of the session.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A start time, in milliseconds since epoch, inclusive.
    */
  var startTimeMillis: js.UndefOr[String] = js.native
}

object SchemaSession {
  @scala.inline
  def apply(): SchemaSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSession]
  }
  @scala.inline
  implicit class SchemaSessionOps[Self <: SchemaSession] (val x: Self) extends AnyVal {
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
    def setActiveTimeMillis(value: String): Self = this.set("activeTimeMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveTimeMillis: Self = this.set("activeTimeMillis", js.undefined)
    @scala.inline
    def setActivityType(value: Double): Self = this.set("activityType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivityType: Self = this.set("activityType", js.undefined)
    @scala.inline
    def setApplication(value: SchemaApplication): Self = this.set("application", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplication: Self = this.set("application", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEndTimeMillis(value: String): Self = this.set("endTimeMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTimeMillis: Self = this.set("endTimeMillis", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setModifiedTimeMillis(value: String): Self = this.set("modifiedTimeMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifiedTimeMillis: Self = this.set("modifiedTimeMillis", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setStartTimeMillis(value: String): Self = this.set("startTimeMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTimeMillis: Self = this.set("startTimeMillis", js.undefined)
  }
  
}

