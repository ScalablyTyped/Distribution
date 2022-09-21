package typings.googleapis.ondemandscanningV1Mod.ondemandscanningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCommand extends StObject {
  
  /**
    * Command-line arguments used when executing this command.
    */
  var args: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Working directory (relative to project source root) used when running this command.
    */
  var dir: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Environment variables set before running this command.
    */
  var env: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional unique identifier for this command, used in wait_for to reference this command as a dependency.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Name of the command, as presented on the command line, or if the command is packaged as a Docker container, as presented to `docker pull`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID(s) of the command(s) that this command depends on.
    */
  var waitFor: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaCommand {
  
  inline def apply(): SchemaCommand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommand]
  }
  
  extension [Self <: SchemaCommand](x: Self) {
    
    inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsNull: Self = StObject.set(x, "args", null)
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirNull: Self = StObject.set(x, "dir", null)
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setEnv(value: js.Array[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvNull: Self = StObject.set(x, "env", null)
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setEnvVarargs(value: String*): Self = StObject.set(x, "env", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setWaitFor(value: js.Array[String]): Self = StObject.set(x, "waitFor", value.asInstanceOf[js.Any])
    
    inline def setWaitForNull: Self = StObject.set(x, "waitFor", null)
    
    inline def setWaitForUndefined: Self = StObject.set(x, "waitFor", js.undefined)
    
    inline def setWaitForVarargs(value: String*): Self = StObject.set(x, "waitFor", js.Array(value*))
  }
}
