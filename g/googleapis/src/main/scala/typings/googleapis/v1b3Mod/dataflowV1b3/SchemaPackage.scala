package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The packages that must be installed in order for a worker to run the steps
  * of the Cloud Dataflow job that will be assigned to its worker pool.  This
  * is the mechanism by which the Cloud Dataflow SDK causes code to be loaded
  * onto the workers. For example, the Cloud Dataflow Java SDK might use this
  * to install jars containing the user&#39;s code and all of the various
  * dependencies (libraries, data files, etc.) required in order for that code
  * to run.
  */
@js.native
trait SchemaPackage extends js.Object {
  
  /**
    * The resource to read the package from. The supported resource type is:
    * Google Cloud Storage:    storage.googleapis.com/{bucket}
    * bucket.storage.googleapis.com/
    */
  var location: js.UndefOr[String] = js.native
  
  /**
    * The name of the package.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaPackage {
  
  @scala.inline
  def apply(): SchemaPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPackage]
  }
  
  @scala.inline
  implicit class SchemaPackageOps[Self <: SchemaPackage] (val x: Self) extends AnyVal {
    
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
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
