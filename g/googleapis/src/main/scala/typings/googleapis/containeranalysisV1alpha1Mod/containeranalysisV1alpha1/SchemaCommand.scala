package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Command describes a step performed as part of the build pipeline.
  */
@js.native
trait SchemaCommand extends js.Object {
  
  /**
    * Command-line arguments used when executing this Command.
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Working directory (relative to project source root) used when running
    * this Command.
    */
  var dir: js.UndefOr[String] = js.native
  
  /**
    * Environment variables set before running this Command.
    */
  var env: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional unique identifier for this Command, used in wait_for to
    * reference this Command as a dependency.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Name of the command, as presented on the command line, or if the command
    * is packaged as a Docker container, as presented to `docker pull`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The ID(s) of the Command(s) that this Command depends on.
    */
  var waitFor: js.UndefOr[js.Array[String]] = js.native
}
object SchemaCommand {
  
  @scala.inline
  def apply(): SchemaCommand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommand]
  }
  
  @scala.inline
  implicit class SchemaCommandOps[Self <: SchemaCommand] (val x: Self) extends AnyVal {
    
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
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    
    @scala.inline
    def setEnvVarargs(value: String*): Self = this.set("env", js.Array(value :_*))
    
    @scala.inline
    def setEnv(value: js.Array[String]): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setWaitForVarargs(value: String*): Self = this.set("waitFor", js.Array(value :_*))
    
    @scala.inline
    def setWaitFor(value: js.Array[String]): Self = this.set("waitFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitFor: Self = this.set("waitFor", js.undefined)
  }
}
