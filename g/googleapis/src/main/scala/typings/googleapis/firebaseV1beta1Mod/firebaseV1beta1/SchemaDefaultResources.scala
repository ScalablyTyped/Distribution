package typings.googleapis.firebaseV1beta1Mod.firebaseV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDefaultResources extends StObject {
  
  /**
    * Output only. The default Firebase Hosting site name, in the format: PROJECT_ID Though rare, your `projectId` might already be used as the name for an existing Hosting site in another project (learn more about creating non-default, [additional sites](https://firebase.google.com/docs/hosting/multisites)). In these cases, your `projectId` is appended with a hyphen then five alphanumeric characters to create your default Hosting site name. For example, if your `projectId` is `myproject123`, your default Hosting site name might be: `myproject123-a5c16`
    */
  var hostingSite: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The ID of the Project's default GCP resource location. The location is one of the available [GCP resource locations](https://firebase.google.com/docs/projects/locations). This field is omitted if the default GCP resource location has not been finalized yet. To set a Project's default GCP resource location, call [`FinalizeDefaultLocation`](../projects.defaultLocation/finalize) after you add Firebase resources to the Project.
    */
  var locationId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The default Firebase Realtime Database instance name, in the format: PROJECT_ID Though rare, your `projectId` might already be used as the name for an existing Realtime Database instance in another project (learn more about [database sharding](https://firebase.google.com/docs/database/usage/sharding)). In these cases, your `projectId` is appended with a hyphen then five alphanumeric characters to create your default Realtime Database instance name. For example, if your `projectId` is `myproject123`, your default database instance name might be: `myproject123-a5c16`
    */
  var realtimeDatabaseInstance: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The default Cloud Storage for Firebase storage bucket, in the format: PROJECT_ID.appspot.com
    */
  var storageBucket: js.UndefOr[String | Null] = js.undefined
}
object SchemaDefaultResources {
  
  inline def apply(): SchemaDefaultResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDefaultResources]
  }
  
  extension [Self <: SchemaDefaultResources](x: Self) {
    
    inline def setHostingSite(value: String): Self = StObject.set(x, "hostingSite", value.asInstanceOf[js.Any])
    
    inline def setHostingSiteNull: Self = StObject.set(x, "hostingSite", null)
    
    inline def setHostingSiteUndefined: Self = StObject.set(x, "hostingSite", js.undefined)
    
    inline def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    inline def setLocationIdNull: Self = StObject.set(x, "locationId", null)
    
    inline def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    inline def setRealtimeDatabaseInstance(value: String): Self = StObject.set(x, "realtimeDatabaseInstance", value.asInstanceOf[js.Any])
    
    inline def setRealtimeDatabaseInstanceNull: Self = StObject.set(x, "realtimeDatabaseInstance", null)
    
    inline def setRealtimeDatabaseInstanceUndefined: Self = StObject.set(x, "realtimeDatabaseInstance", js.undefined)
    
    inline def setStorageBucket(value: String): Self = StObject.set(x, "storageBucket", value.asInstanceOf[js.Any])
    
    inline def setStorageBucketNull: Self = StObject.set(x, "storageBucket", null)
    
    inline def setStorageBucketUndefined: Self = StObject.set(x, "storageBucket", js.undefined)
  }
}
