package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration of authorization.  This section determines the authorization
  * provider, if unspecified, then no authorization check will be done.
  * Example:      experimental:       authorization:         provider:
  * firebaserules.googleapis.com
  */
@js.native
trait SchemaAuthorizationConfig extends js.Object {
  /**
    * The name of the authorization provider, such as
    * firebaserules.googleapis.com.
    */
  var provider: js.UndefOr[String] = js.native
}

object SchemaAuthorizationConfig {
  @scala.inline
  def apply(): SchemaAuthorizationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthorizationConfig]
  }
  @scala.inline
  implicit class SchemaAuthorizationConfigOps[Self <: SchemaAuthorizationConfig] (val x: Self) extends AnyVal {
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
    def setProvider(value: String): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
  }
  
}

