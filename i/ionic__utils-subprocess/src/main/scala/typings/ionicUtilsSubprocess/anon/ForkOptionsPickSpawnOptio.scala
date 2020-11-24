package typings.ionicUtilsSubprocess.anon

import typings.node.childProcessMod.SerializationType
import typings.node.childProcessMod.StdioOptions
import typings.node.nodeStrings.ignore
import typings.node.nodeStrings.inherit
import typings.node.nodeStrings.ipc
import typings.node.nodeStrings.pipe
import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.child_process.ForkOptions & std.Pick<node.child_process.SpawnOptions, 'stdio'> */
@js.native
trait ForkOptionsPickSpawnOptio extends js.Object {
  
  var cwd: js.UndefOr[String] = js.native
  
  var detached: js.UndefOr[Boolean] = js.native
  
  var env: js.UndefOr[ProcessEnv] = js.native
  
  var execArgv: js.UndefOr[js.Array[String]] = js.native
  
  var execPath: js.UndefOr[String] = js.native
  
  var gid: js.UndefOr[Double] = js.native
  
  /**
    * Specify the kind of serialization used for sending messages between processes.
    * @default 'json'
    */
  var serialization: js.UndefOr[SerializationType] = js.native
  
  var silent: js.UndefOr[Boolean] = js.native
  
  var stdio: js.UndefOr[StdioOptions] = js.native
  
  var uid: js.UndefOr[Double] = js.native
  
  var windowsVerbatimArguments: js.UndefOr[Boolean] = js.native
}
object ForkOptionsPickSpawnOptio {
  
  @scala.inline
  def apply(): ForkOptionsPickSpawnOptio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForkOptionsPickSpawnOptio]
  }
  
  @scala.inline
  implicit class ForkOptionsPickSpawnOptioOps[Self <: ForkOptionsPickSpawnOptio] (val x: Self) extends AnyVal {
    
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
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    
    @scala.inline
    def setDetached(value: Boolean): Self = this.set("detached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetached: Self = this.set("detached", js.undefined)
    
    @scala.inline
    def setEnv(value: ProcessEnv): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setExecArgvVarargs(value: String*): Self = this.set("execArgv", js.Array(value :_*))
    
    @scala.inline
    def setExecArgv(value: js.Array[String]): Self = this.set("execArgv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecArgv: Self = this.set("execArgv", js.undefined)
    
    @scala.inline
    def setExecPath(value: String): Self = this.set("execPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecPath: Self = this.set("execPath", js.undefined)
    
    @scala.inline
    def setGid(value: Double): Self = this.set("gid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGid: Self = this.set("gid", js.undefined)
    
    @scala.inline
    def setSerialization(value: SerializationType): Self = this.set("serialization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerialization: Self = this.set("serialization", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    
    @scala.inline
    def setStdioVarargs(value: (js.UndefOr[pipe | ipc | ignore | inherit | Stream | Double | Null])*): Self = this.set("stdio", js.Array(value :_*))
    
    @scala.inline
    def setStdio(value: StdioOptions): Self = this.set("stdio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStdio: Self = this.set("stdio", js.undefined)
    
    @scala.inline
    def setUid(value: Double): Self = this.set("uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUid: Self = this.set("uid", js.undefined)
    
    @scala.inline
    def setWindowsVerbatimArguments(value: Boolean): Self = this.set("windowsVerbatimArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowsVerbatimArguments: Self = this.set("windowsVerbatimArguments", js.undefined)
  }
}
