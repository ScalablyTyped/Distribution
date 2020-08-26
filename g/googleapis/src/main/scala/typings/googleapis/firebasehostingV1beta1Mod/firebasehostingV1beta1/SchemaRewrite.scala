package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A [`rewrite`](/docs/hosting/full-config#rewrites) represents an internal
  * content rewrite on the version. If the pattern matches, the request will be
  * handled as if it were to the destination path specified in the
  * configuration.
  */
@js.native
trait SchemaRewrite extends js.Object {
  /**
    * The request will be forwarded to Firebase Dynamic Links.
    */
  var dynamicLinks: js.UndefOr[Boolean] = js.native
  /**
    * The function to proxy requests to. Must match the exported function name
    * exactly.
    */
  var function: js.UndefOr[String] = js.native
  /**
    * Required. The user-supplied [glob
    * pattern](/docs/hosting/full-config#glob_pattern_matching) to match
    * against the request URL path.
    */
  var glob: js.UndefOr[String] = js.native
  /**
    * The URL path to rewrite the request to.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * The request will be forwarded to Cloud Run.
    */
  var run: js.UndefOr[SchemaCloudRunRewrite] = js.native
}

object SchemaRewrite {
  @scala.inline
  def apply(): SchemaRewrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRewrite]
  }
  @scala.inline
  implicit class SchemaRewriteOps[Self <: SchemaRewrite] (val x: Self) extends AnyVal {
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
    def setDynamicLinks(value: Boolean): Self = this.set("dynamicLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamicLinks: Self = this.set("dynamicLinks", js.undefined)
    @scala.inline
    def setFunction(value: String): Self = this.set("function", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunction: Self = this.set("function", js.undefined)
    @scala.inline
    def setGlob(value: String): Self = this.set("glob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlob: Self = this.set("glob", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setRun(value: SchemaCloudRunRewrite): Self = this.set("run", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRun: Self = this.set("run", js.undefined)
  }
  
}

