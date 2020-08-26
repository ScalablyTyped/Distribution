package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Google Apps Domain membership.
  */
@js.native
trait SchemaDomainMembership extends js.Object {
  /**
    * True if the person is in the viewer&#39;s Google Apps domain.
    */
  var inViewerDomain: js.UndefOr[Boolean] = js.native
}

object SchemaDomainMembership {
  @scala.inline
  def apply(): SchemaDomainMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomainMembership]
  }
  @scala.inline
  implicit class SchemaDomainMembershipOps[Self <: SchemaDomainMembership] (val x: Self) extends AnyVal {
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
    def setInViewerDomain(value: Boolean): Self = this.set("inViewerDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInViewerDomain: Self = this.set("inViewerDomain", js.undefined)
  }
  
}

