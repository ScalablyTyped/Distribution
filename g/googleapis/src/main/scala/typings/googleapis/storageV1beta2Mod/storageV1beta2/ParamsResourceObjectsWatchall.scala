package typings.googleapis.storageV1beta2Mod.storageV1beta2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceObjectsWatchall extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Name of the bucket in which to look for objects.
    */
  var bucket: js.UndefOr[String] = js.native
  /**
    * Returns results in a directory-like mode. items will contain only objects
    * whose names, aside from the prefix, do not contain delimiter. Objects
    * whose names, aside from the prefix, contain delimiter will have their
    * name, truncated after the delimiter, returned in prefixes. Duplicate
    * prefixes are omitted.
    */
  var delimiter: js.UndefOr[String] = js.native
  /**
    * Maximum number of items plus prefixes to return. As duplicate prefixes
    * are omitted, fewer total results may be returned than requested.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * A previously-returned page token representing part of the larger set of
    * results to view.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Filter results to objects whose names begin with this prefix.
    */
  var prefix: js.UndefOr[String] = js.native
  /**
    * Set of properties to return. Defaults to noAcl.
    */
  var projection: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaChannel] = js.native
  /**
    * If true, lists all versions of a file as distinct results.
    */
  var versions: js.UndefOr[Boolean] = js.native
}

object ParamsResourceObjectsWatchall {
  @scala.inline
  def apply(): ParamsResourceObjectsWatchall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceObjectsWatchall]
  }
  @scala.inline
  implicit class ParamsResourceObjectsWatchallOps[Self <: ParamsResourceObjectsWatchall] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setBucket(value: String): Self = this.set("bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucket: Self = this.set("bucket", js.undefined)
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setProjection(value: String): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaChannel): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    @scala.inline
    def setVersions(value: Boolean): Self = this.set("versions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersions: Self = this.set("versions", js.undefined)
  }
  
}

