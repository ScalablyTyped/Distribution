package typings.i18next.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowedHosts extends js.Object {
  /**
    * Hostnames that are allowed to send last used data.
    * Please keep those to your local system, staging, test servers (not production)
    * @default ['localhost']
    */
  var allowedHosts: js.UndefOr[js.Array[String]] = js.native
  /**
    * An api key if you want to send missing keys
    */
  var apiKey: js.UndefOr[String] = js.native
  /**
    * Debounce interval to send data in milliseconds
    * @default 90000
    */
  var debounceSubmit: js.UndefOr[Double] = js.native
  /**
    * The id of your locize project
    */
  var projectId: String = js.native
  /**
    * The reference language of your project
    * @default 'en'
    */
  var referenceLng: js.UndefOr[String] = js.native
  /**
    * Version
    * @default 'latest'
    */
  var version: js.UndefOr[String] = js.native
}

object AllowedHosts {
  @scala.inline
  def apply(projectId: String): AllowedHosts = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedHosts]
  }
  @scala.inline
  implicit class AllowedHostsOps[Self <: AllowedHosts] (val x: Self) extends AnyVal {
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
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowedHostsVarargs(value: String*): Self = this.set("allowedHosts", js.Array(value :_*))
    @scala.inline
    def setAllowedHosts(value: js.Array[String]): Self = this.set("allowedHosts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedHosts: Self = this.set("allowedHosts", js.undefined)
    @scala.inline
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiKey: Self = this.set("apiKey", js.undefined)
    @scala.inline
    def setDebounceSubmit(value: Double): Self = this.set("debounceSubmit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebounceSubmit: Self = this.set("debounceSubmit", js.undefined)
    @scala.inline
    def setReferenceLng(value: String): Self = this.set("referenceLng", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceLng: Self = this.set("referenceLng", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

