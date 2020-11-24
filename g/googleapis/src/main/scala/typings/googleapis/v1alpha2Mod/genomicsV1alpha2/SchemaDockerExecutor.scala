package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Docker execuctor specification.
  */
@js.native
trait SchemaDockerExecutor extends js.Object {
  
  /**
    * Required. The command or newline delimited script to run. The command
    * string will be executed within a bash shell.  If the command exits with a
    * non-zero exit code, output parameter de-localization will be skipped and
    * the pipeline operation&#39;s `error` field will be populated.  Maximum
    * command string length is 16384.
    */
  var cmd: js.UndefOr[String] = js.native
  
  /**
    * Required. Image name from either Docker Hub or Google Container Registry.
    * Users that run pipelines must have READ access to the image.
    */
  var imageName: js.UndefOr[String] = js.native
}
object SchemaDockerExecutor {
  
  @scala.inline
  def apply(): SchemaDockerExecutor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDockerExecutor]
  }
  
  @scala.inline
  implicit class SchemaDockerExecutorOps[Self <: SchemaDockerExecutor] (val x: Self) extends AnyVal {
    
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
    def setCmd(value: String): Self = this.set("cmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCmd: Self = this.set("cmd", js.undefined)
    
    @scala.inline
    def setImageName(value: String): Self = this.set("imageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageName: Self = this.set("imageName", js.undefined)
  }
}
