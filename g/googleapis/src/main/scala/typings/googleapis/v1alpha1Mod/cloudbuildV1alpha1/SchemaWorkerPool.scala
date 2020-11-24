package typings.googleapis.v1alpha1Mod.cloudbuildV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for a WorkerPool to run the builds.  Workers are machines
  * that Cloud Build uses to run your builds. By default, all workers run in a
  * project owned by Cloud Build. To have full control over the workers that
  * execute your builds -- such as enabling them to access private resources on
  * your private network -- you can request Cloud Build to run the workers in
  * your own project by creating a custom workers pool.
  */
@js.native
trait SchemaWorkerPool extends js.Object {
  
  /**
    * Output only. Time at which the request to create the `WorkerPool` was
    * received.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * Output only. Time at which the request to delete the `WorkerPool` was
    * received.
    */
  var deleteTime: js.UndefOr[String] = js.native
  
  /**
    * User-defined name of the `WorkerPool`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The project ID of the GCP project in which the `WorkerPool` is created.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * List of regions to create the `WorkerPool`. Regions can&#39;t be empty.
    * If Cloud Build adds a new GCP region in the future, the existing
    * `WorkerPool` will not be enabled in the new region automatically; you
    * must add the new region to the `regions` field to enable the `WorkerPool`
    * in that region.
    */
  var regions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Output only. The service account used to manage the `WorkerPool`. The
    * service account must have the Compute Instance Admin (Beta) permission at
    * the project level.
    */
  var serviceAccountEmail: js.UndefOr[String] = js.native
  
  /**
    * Output only. WorkerPool Status.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * Output only. Time at which the request to update the `WorkerPool` was
    * received.
    */
  var updateTime: js.UndefOr[String] = js.native
  
  /**
    * Configuration to be used for a creating workers in the `WorkerPool`.
    */
  var workerConfig: js.UndefOr[SchemaWorkerConfig] = js.native
  
  /**
    * Total number of workers to be created across all requested regions.
    */
  var workerCount: js.UndefOr[String] = js.native
}
object SchemaWorkerPool {
  
  @scala.inline
  def apply(): SchemaWorkerPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerPool]
  }
  
  @scala.inline
  implicit class SchemaWorkerPoolOps[Self <: SchemaWorkerPool] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDeleteTime(value: String): Self = this.set("deleteTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteTime: Self = this.set("deleteTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setRegionsVarargs(value: String*): Self = this.set("regions", js.Array(value :_*))
    
    @scala.inline
    def setRegions(value: js.Array[String]): Self = this.set("regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegions: Self = this.set("regions", js.undefined)
    
    @scala.inline
    def setServiceAccountEmail(value: String): Self = this.set("serviceAccountEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAccountEmail: Self = this.set("serviceAccountEmail", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
    
    @scala.inline
    def setWorkerConfig(value: SchemaWorkerConfig): Self = this.set("workerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkerConfig: Self = this.set("workerConfig", js.undefined)
    
    @scala.inline
    def setWorkerCount(value: String): Self = this.set("workerCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkerCount: Self = this.set("workerCount", js.undefined)
  }
}
