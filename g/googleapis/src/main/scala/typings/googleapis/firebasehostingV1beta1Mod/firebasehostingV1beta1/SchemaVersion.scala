package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVersion extends StObject {
  
  /**
    * The configuration for the behavior of the site. This configuration exists in the [`firebase.json`](https://firebase.google.com/docs/cli/#the_firebasejson_file) file.
    */
  var config: js.UndefOr[SchemaServingConfig] = js.undefined
  
  /**
    * Output only. The time at which the version was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Identifies the user who created the version.
    */
  var createUser: js.UndefOr[SchemaActingUser] = js.undefined
  
  /**
    * Output only. The time at which the version was `DELETED`.
    */
  var deleteTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Identifies the user who `DELETED` the version.
    */
  var deleteUser: js.UndefOr[SchemaActingUser] = js.undefined
  
  /**
    * Output only. The total number of files associated with the version. This value is calculated after a version is `FINALIZED`.
    */
  var fileCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time at which the version was `FINALIZED`.
    */
  var finalizeTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Identifies the user who `FINALIZED` the version.
    */
  var finalizeUser: js.UndefOr[SchemaActingUser] = js.undefined
  
  /**
    * The labels used for extra metadata and/or filtering.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The fully-qualified resource name for the version, in the format: sites/ SITE_ID/versions/VERSION_ID This name is provided in the response body when you call [`CreateVersion`](sites.versions/create).
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The deploy status of the version. For a successful deploy, call [`CreateVersion`](sites.versions/create) to make a new version (`CREATED` status), [upload all desired files](sites.versions/populateFiles) to the version, then [update](sites.versions/patch) the version to the `FINALIZED` status. Note that if you leave the version in the `CREATED` state for more than 12 hours, the system will automatically mark the version as `ABANDONED`. You can also change the status of a version to `DELETED` by calling [`DeleteVersion`](sites.versions/delete).
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The total stored bytesize of the version. This value is calculated after a version is `FINALIZED`.
    */
  var versionBytes: js.UndefOr[String | Null] = js.undefined
}
object SchemaVersion {
  
  inline def apply(): SchemaVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVersion]
  }
  
  extension [Self <: SchemaVersion](x: Self) {
    
    inline def setConfig(value: SchemaServingConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCreateUser(value: SchemaActingUser): Self = StObject.set(x, "createUser", value.asInstanceOf[js.Any])
    
    inline def setCreateUserUndefined: Self = StObject.set(x, "createUser", js.undefined)
    
    inline def setDeleteTime(value: String): Self = StObject.set(x, "deleteTime", value.asInstanceOf[js.Any])
    
    inline def setDeleteTimeNull: Self = StObject.set(x, "deleteTime", null)
    
    inline def setDeleteTimeUndefined: Self = StObject.set(x, "deleteTime", js.undefined)
    
    inline def setDeleteUser(value: SchemaActingUser): Self = StObject.set(x, "deleteUser", value.asInstanceOf[js.Any])
    
    inline def setDeleteUserUndefined: Self = StObject.set(x, "deleteUser", js.undefined)
    
    inline def setFileCount(value: String): Self = StObject.set(x, "fileCount", value.asInstanceOf[js.Any])
    
    inline def setFileCountNull: Self = StObject.set(x, "fileCount", null)
    
    inline def setFileCountUndefined: Self = StObject.set(x, "fileCount", js.undefined)
    
    inline def setFinalizeTime(value: String): Self = StObject.set(x, "finalizeTime", value.asInstanceOf[js.Any])
    
    inline def setFinalizeTimeNull: Self = StObject.set(x, "finalizeTime", null)
    
    inline def setFinalizeTimeUndefined: Self = StObject.set(x, "finalizeTime", js.undefined)
    
    inline def setFinalizeUser(value: SchemaActingUser): Self = StObject.set(x, "finalizeUser", value.asInstanceOf[js.Any])
    
    inline def setFinalizeUserUndefined: Self = StObject.set(x, "finalizeUser", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setVersionBytes(value: String): Self = StObject.set(x, "versionBytes", value.asInstanceOf[js.Any])
    
    inline def setVersionBytesNull: Self = StObject.set(x, "versionBytes", null)
    
    inline def setVersionBytesUndefined: Self = StObject.set(x, "versionBytes", js.undefined)
  }
}
