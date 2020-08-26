package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `Version` is the collection of configuration and [static
  * files](sites.versions.files) that determine how a site is displayed.
  */
@js.native
trait SchemaVersion extends js.Object {
  /**
    * The configuration for the behavior of the site. This configuration exists
    * in the [`firebase.json`](/docs/cli/#the_firebasejson_file) file.
    */
  var config: js.UndefOr[SchemaServingConfig] = js.native
  /**
    * Output only. The time at which the version was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. Identifies the user who created the version.
    */
  var createUser: js.UndefOr[SchemaActingUser] = js.native
  /**
    * Output only. The time at which the version was `DELETED`.
    */
  var deleteTime: js.UndefOr[String] = js.native
  /**
    * Output only. Identifies the user who `DELETED` the version.
    */
  var deleteUser: js.UndefOr[SchemaActingUser] = js.native
  /**
    * Output only. The total number of files associated with the version.
    * &lt;br&gt;This value is calculated after a version is `FINALIZED`.
    */
  var fileCount: js.UndefOr[String] = js.native
  /**
    * Output only. The time at which the version was `FINALIZED`.
    */
  var finalizeTime: js.UndefOr[String] = js.native
  /**
    * Output only. Identifies the user who `FINALIZED` the version.
    */
  var finalizeUser: js.UndefOr[SchemaActingUser] = js.native
  /**
    * The labels used for extra metadata and/or filtering.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The unique identifier for a version, in the format:
    * &lt;code&gt;sites/&lt;var&gt;site-name&lt;/var&gt;/versions/&lt;var&gt;versionID&lt;/var&gt;&lt;/code&gt;
    * This name is provided in the response body when you call the
    * [`CreateVersion`](../sites.versions/create) endpoint.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The deploy status of a version. &lt;br&gt; &lt;br&gt;For a successful
    * deploy, call the [`CreateVersion`](sites.versions/create) endpoint to
    * make a new version (`CREATED` status), [upload all desired
    * files](sites.versions/populateFiles) to the version, then
    * [update](sites.versions/patch) the version to the `FINALIZED` status.
    * &lt;br&gt; &lt;br&gt;Note that if you leave the version in the `CREATED`
    * state for more than 12&amp;nbsp;hours, the system will automatically mark
    * the version as `ABANDONED`. &lt;br&gt; &lt;br&gt;You can also change the
    * status of a version to `DELETED` by calling the
    * [`DeleteVersion`](sites.versions/delete) endpoint.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Output only. The total stored bytesize of the version. &lt;br&gt;This
    * value is calculated after a version is `FINALIZED`.
    */
  var versionBytes: js.UndefOr[String] = js.native
}

object SchemaVersion {
  @scala.inline
  def apply(): SchemaVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVersion]
  }
  @scala.inline
  implicit class SchemaVersionOps[Self <: SchemaVersion] (val x: Self) extends AnyVal {
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
    def setConfig(value: SchemaServingConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setCreateUser(value: SchemaActingUser): Self = this.set("createUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateUser: Self = this.set("createUser", js.undefined)
    @scala.inline
    def setDeleteTime(value: String): Self = this.set("deleteTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteTime: Self = this.set("deleteTime", js.undefined)
    @scala.inline
    def setDeleteUser(value: SchemaActingUser): Self = this.set("deleteUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteUser: Self = this.set("deleteUser", js.undefined)
    @scala.inline
    def setFileCount(value: String): Self = this.set("fileCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileCount: Self = this.set("fileCount", js.undefined)
    @scala.inline
    def setFinalizeTime(value: String): Self = this.set("finalizeTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinalizeTime: Self = this.set("finalizeTime", js.undefined)
    @scala.inline
    def setFinalizeUser(value: SchemaActingUser): Self = this.set("finalizeUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinalizeUser: Self = this.set("finalizeUser", js.undefined)
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setVersionBytes(value: String): Self = this.set("versionBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionBytes: Self = this.set("versionBytes", js.undefined)
  }
  
}

