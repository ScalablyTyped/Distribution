package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The actor of a Drive activity.
  */
@js.native
trait SchemaActor extends js.Object {
  /**
    * An administrator.
    */
  var administrator: js.UndefOr[SchemaAdministrator] = js.native
  /**
    * An anonymous user.
    */
  var anonymous: js.UndefOr[SchemaAnonymousUser] = js.native
  /**
    * An account acting on behalf of another.
    */
  var impersonation: js.UndefOr[SchemaImpersonation] = js.native
  /**
    * A non-user actor (i.e. system triggered).
    */
  var system: js.UndefOr[SchemaSystemEvent] = js.native
  /**
    * An end user.
    */
  var user: js.UndefOr[SchemaUser] = js.native
}

object SchemaActor {
  @scala.inline
  def apply(): SchemaActor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActor]
  }
  @scala.inline
  implicit class SchemaActorOps[Self <: SchemaActor] (val x: Self) extends AnyVal {
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
    def setAdministrator(value: SchemaAdministrator): Self = this.set("administrator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdministrator: Self = this.set("administrator", js.undefined)
    @scala.inline
    def setAnonymous(value: SchemaAnonymousUser): Self = this.set("anonymous", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnonymous: Self = this.set("anonymous", js.undefined)
    @scala.inline
    def setImpersonation(value: SchemaImpersonation): Self = this.set("impersonation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImpersonation: Self = this.set("impersonation", js.undefined)
    @scala.inline
    def setSystem(value: SchemaSystemEvent): Self = this.set("system", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystem: Self = this.set("system", js.undefined)
    @scala.inline
    def setUser(value: SchemaUser): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

