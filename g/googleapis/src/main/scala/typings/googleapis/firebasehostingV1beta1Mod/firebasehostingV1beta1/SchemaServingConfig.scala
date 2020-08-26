package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration for how incoming requests to a site should be routed and
  * processed before serving content. The patterns are matched and applied
  * according to a specific [priority
  * order](/docs/hosting/full-config#hosting_priority_order).
  */
@js.native
trait SchemaServingConfig extends js.Object {
  /**
    * How to handle well known App Association files.
    */
  var appAssociation: js.UndefOr[String] = js.native
  /**
    * Defines whether to drop the file extension from uploaded files.
    */
  var cleanUrls: js.UndefOr[Boolean] = js.native
  /**
    * A list of custom response headers that are added to the content if the
    * request URL path matches the glob.
    */
  var headers: js.UndefOr[js.Array[SchemaHeader]] = js.native
  /**
    * A list of globs that will cause the response to redirect to another
    * location.
    */
  var redirects: js.UndefOr[js.Array[SchemaRedirect]] = js.native
  /**
    * A list of rewrites that will act as if the service were given the
    * destination URL.
    */
  var rewrites: js.UndefOr[js.Array[SchemaRewrite]] = js.native
  /**
    * Defines how to handle a trailing slash in the URL path.
    */
  var trailingSlashBehavior: js.UndefOr[String] = js.native
}

object SchemaServingConfig {
  @scala.inline
  def apply(): SchemaServingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServingConfig]
  }
  @scala.inline
  implicit class SchemaServingConfigOps[Self <: SchemaServingConfig] (val x: Self) extends AnyVal {
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
    def setAppAssociation(value: String): Self = this.set("appAssociation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppAssociation: Self = this.set("appAssociation", js.undefined)
    @scala.inline
    def setCleanUrls(value: Boolean): Self = this.set("cleanUrls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCleanUrls: Self = this.set("cleanUrls", js.undefined)
    @scala.inline
    def setHeadersVarargs(value: SchemaHeader*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: js.Array[SchemaHeader]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setRedirectsVarargs(value: SchemaRedirect*): Self = this.set("redirects", js.Array(value :_*))
    @scala.inline
    def setRedirects(value: js.Array[SchemaRedirect]): Self = this.set("redirects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirects: Self = this.set("redirects", js.undefined)
    @scala.inline
    def setRewritesVarargs(value: SchemaRewrite*): Self = this.set("rewrites", js.Array(value :_*))
    @scala.inline
    def setRewrites(value: js.Array[SchemaRewrite]): Self = this.set("rewrites", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRewrites: Self = this.set("rewrites", js.undefined)
    @scala.inline
    def setTrailingSlashBehavior(value: String): Self = this.set("trailingSlashBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrailingSlashBehavior: Self = this.set("trailingSlashBehavior", js.undefined)
  }
  
}

