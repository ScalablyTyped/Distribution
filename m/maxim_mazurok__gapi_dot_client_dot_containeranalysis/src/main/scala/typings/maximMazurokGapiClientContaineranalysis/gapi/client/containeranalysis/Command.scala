package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Command extends StObject {
  
  /** Command-line arguments used when executing this command. */
  var args: js.UndefOr[js.Array[String]] = js.native
  
  /** Working directory (relative to project source root) used when running this command. */
  var dir: js.UndefOr[String] = js.native
  
  /** Environment variables set before running this command. */
  var env: js.UndefOr[js.Array[String]] = js.native
  
  /** Optional unique identifier for this command, used in wait_for to reference this command as a dependency. */
  var id: js.UndefOr[String] = js.native
  
  /** Required. Name of the command, as presented on the command line, or if the command is packaged as a Docker container, as presented to `docker pull`. */
  var name: js.UndefOr[String] = js.native
  
  /** The ID(s) of the command(s) that this command depends on. */
  var waitFor: js.UndefOr[js.Array[String]] = js.native
}
object Command {
  
  @scala.inline
  def apply(): Command = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Command]
  }
  
  @scala.inline
  implicit class CommandMutableBuilder[Self <: Command] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    @scala.inline
    def setEnv(value: js.Array[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    @scala.inline
    def setEnvVarargs(value: String*): Self = StObject.set(x, "env", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setWaitFor(value: js.Array[String]): Self = StObject.set(x, "waitFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForUndefined: Self = StObject.set(x, "waitFor", js.undefined)
    
    @scala.inline
    def setWaitForVarargs(value: String*): Self = StObject.set(x, "waitFor", js.Array(value :_*))
  }
}
