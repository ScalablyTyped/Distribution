package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `Command` is the actual command executed by a worker running an Action.
  * Except as otherwise required, the environment (such as which system
  * libraries or binaries are available, and what filesystems are mounted
  * where) is defined by and specific to the implementation of the remote
  * execution API.
  */
trait SchemaGoogleDevtoolsRemoteexecutionV1testCommand extends StObject {
  
  /**
    * The arguments to the command. The first argument must be the path to the
    * executable, which must be either a relative path, in which case it is
    * evaluated with respect to the input root, or an absolute path.  The
    * working directory will always be the input root.
    */
  var arguments: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The environment variables to set when running the program. The worker may
    * provide its own default environment variables; these defaults can be
    * overridden using this field. Additional variables can also be specified.
    * In order to ensure that equivalent `Command`s always hash to the same
    * value, the environment variables MUST be lexicographically sorted by
    * name. Sorting of strings is done by code point, equivalently, by the
    * UTF-8 bytes.
    */
  var environmentVariables: js.UndefOr[js.Array[SchemaGoogleDevtoolsRemoteexecutionV1testCommandEnvironmentVariable]] = js.undefined
}
object SchemaGoogleDevtoolsRemoteexecutionV1testCommand {
  
  inline def apply(): SchemaGoogleDevtoolsRemoteexecutionV1testCommand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteexecutionV1testCommand]
  }
  
  extension [Self <: SchemaGoogleDevtoolsRemoteexecutionV1testCommand](x: Self) {
    
    inline def setArguments(value: js.Array[String]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    inline def setArgumentsVarargs(value: String*): Self = StObject.set(x, "arguments", js.Array(value :_*))
    
    inline def setEnvironmentVariables(value: js.Array[SchemaGoogleDevtoolsRemoteexecutionV1testCommandEnvironmentVariable]): Self = StObject.set(x, "environmentVariables", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentVariablesUndefined: Self = StObject.set(x, "environmentVariables", js.undefined)
    
    inline def setEnvironmentVariablesVarargs(value: SchemaGoogleDevtoolsRemoteexecutionV1testCommandEnvironmentVariable*): Self = StObject.set(x, "environmentVariables", js.Array(value :_*))
  }
}
