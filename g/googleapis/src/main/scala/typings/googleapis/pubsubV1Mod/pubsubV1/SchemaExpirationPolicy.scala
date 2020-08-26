package typings.googleapis.pubsubV1Mod.pubsubV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A policy that specifies the conditions for resource expiration (i.e.,
  * automatic resource deletion).
  */
@js.native
trait SchemaExpirationPolicy extends js.Object {
  /**
    * Specifies the &quot;time-to-live&quot; duration for an associated
    * resource. The resource expires if it is not active for a period of `ttl`.
    * The definition of &quot;activity&quot; depends on the type of the
    * associated resource. The minimum and maximum allowed values for `ttl`
    * depend on the type of the associated resource, as well. If `ttl` is not
    * set, the associated resource never expires.
    */
  var ttl: js.UndefOr[String] = js.native
}

object SchemaExpirationPolicy {
  @scala.inline
  def apply(): SchemaExpirationPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExpirationPolicy]
  }
  @scala.inline
  implicit class SchemaExpirationPolicyOps[Self <: SchemaExpirationPolicy] (val x: Self) extends AnyVal {
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
    def setTtl(value: String): Self = this.set("ttl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
  }
  
}

