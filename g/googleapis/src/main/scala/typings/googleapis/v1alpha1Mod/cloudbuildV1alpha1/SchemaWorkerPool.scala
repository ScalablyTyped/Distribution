package typings.googleapis.v1alpha1Mod.cloudbuildV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for a WorkerPool to run the builds.  Workers are machines
  * that Cloud Build uses to run your builds. By default, all workers run in a
  * project owned by Cloud Build. To have full control over the workers that
  * execute your builds -- such as enabling them to access private resources on
  * your private network -- you can request Cloud Build to run the workers in
  * your own project by creating a custom workers pool.
  */
trait SchemaWorkerPool extends StObject {
  
  /**
    * Output only. Time at which the request to create the `WorkerPool` was
    * received.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Time at which the request to delete the `WorkerPool` was
    * received.
    */
  var deleteTime: js.UndefOr[String] = js.undefined
  
  /**
    * User-defined name of the `WorkerPool`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The project ID of the GCP project in which the `WorkerPool` is created.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * List of regions to create the `WorkerPool`. Regions can&#39;t be empty.
    * If Cloud Build adds a new GCP region in the future, the existing
    * `WorkerPool` will not be enabled in the new region automatically; you
    * must add the new region to the `regions` field to enable the `WorkerPool`
    * in that region.
    */
  var regions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Output only. The service account used to manage the `WorkerPool`. The
    * service account must have the Compute Instance Admin (Beta) permission at
    * the project level.
    */
  var serviceAccountEmail: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. WorkerPool Status.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Time at which the request to update the `WorkerPool` was
    * received.
    */
  var updateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Configuration to be used for a creating workers in the `WorkerPool`.
    */
  var workerConfig: js.UndefOr[SchemaWorkerConfig] = js.undefined
  
  /**
    * Total number of workers to be created across all requested regions.
    */
  var workerCount: js.UndefOr[String] = js.undefined
}
object SchemaWorkerPool {
  
  @scala.inline
  def apply(): SchemaWorkerPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerPool]
  }
  
  @scala.inline
  implicit class SchemaWorkerPoolMutableBuilder[Self <: SchemaWorkerPool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDeleteTime(value: String): Self = StObject.set(x, "deleteTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteTimeUndefined: Self = StObject.set(x, "deleteTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setRegions(value: js.Array[String]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    @scala.inline
    def setRegionsVarargs(value: String*): Self = StObject.set(x, "regions", js.Array(value :_*))
    
    @scala.inline
    def setServiceAccountEmail(value: String): Self = StObject.set(x, "serviceAccountEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountEmailUndefined: Self = StObject.set(x, "serviceAccountEmail", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    @scala.inline
    def setWorkerConfig(value: SchemaWorkerConfig): Self = StObject.set(x, "workerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerConfigUndefined: Self = StObject.set(x, "workerConfig", js.undefined)
    
    @scala.inline
    def setWorkerCount(value: String): Self = StObject.set(x, "workerCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerCountUndefined: Self = StObject.set(x, "workerCount", js.undefined)
  }
}
