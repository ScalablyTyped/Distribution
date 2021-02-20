package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `Version` is the collection of configuration and [static
  * files](sites.versions.files) that determine how a site is displayed.
  */
@js.native
trait SchemaVersion extends StObject {
  
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
  implicit class SchemaVersionMutableBuilder[Self <: SchemaVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: SchemaServingConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setCreateUser(value: SchemaActingUser): Self = StObject.set(x, "createUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateUserUndefined: Self = StObject.set(x, "createUser", js.undefined)
    
    @scala.inline
    def setDeleteTime(value: String): Self = StObject.set(x, "deleteTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteTimeUndefined: Self = StObject.set(x, "deleteTime", js.undefined)
    
    @scala.inline
    def setDeleteUser(value: SchemaActingUser): Self = StObject.set(x, "deleteUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteUserUndefined: Self = StObject.set(x, "deleteUser", js.undefined)
    
    @scala.inline
    def setFileCount(value: String): Self = StObject.set(x, "fileCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileCountUndefined: Self = StObject.set(x, "fileCount", js.undefined)
    
    @scala.inline
    def setFinalizeTime(value: String): Self = StObject.set(x, "finalizeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalizeTimeUndefined: Self = StObject.set(x, "finalizeTime", js.undefined)
    
    @scala.inline
    def setFinalizeUser(value: SchemaActingUser): Self = StObject.set(x, "finalizeUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalizeUserUndefined: Self = StObject.set(x, "finalizeUser", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setVersionBytes(value: String): Self = StObject.set(x, "versionBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionBytesUndefined: Self = StObject.set(x, "versionBytes", js.undefined)
  }
}
