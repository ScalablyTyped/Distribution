package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Command describes a step performed as part of the build pipeline.
  */
trait SchemaCommand extends StObject {
  
  /**
    * Command-line arguments used when executing this Command.
    */
  var args: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Working directory (relative to project source root) used when running
    * this Command.
    */
  var dir: js.UndefOr[String] = js.undefined
  
  /**
    * Environment variables set before running this Command.
    */
  var env: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional unique identifier for this Command, used in wait_for to
    * reference this Command as a dependency.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the command, as presented on the command line, or if the command
    * is packaged as a Docker container, as presented to `docker pull`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The ID(s) of the Command(s) that this Command depends on.
    */
  var waitFor: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaCommand {
  
  inline def apply(): SchemaCommand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommand]
  }
  
  extension [Self <: SchemaCommand](x: Self) {
    
    inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setEnv(value: js.Array[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setEnvVarargs(value: String*): Self = StObject.set(x, "env", js.Array(value :_*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setWaitFor(value: js.Array[String]): Self = StObject.set(x, "waitFor", value.asInstanceOf[js.Any])
    
    inline def setWaitForUndefined: Self = StObject.set(x, "waitFor", js.undefined)
    
    inline def setWaitForVarargs(value: String*): Self = StObject.set(x, "waitFor", js.Array(value :_*))
  }
}
