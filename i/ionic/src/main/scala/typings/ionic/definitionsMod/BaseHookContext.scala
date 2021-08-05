package typings.ionic.definitionsMod

import typings.ionic.anon.Dir
import typings.node.processMod.global.NodeJS.ProcessEnv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseHookContext extends StObject {
  
  var argv: js.Array[String]
  
  var env: ProcessEnv
  
  var project: Dir
}
object BaseHookContext {
  
  inline def apply(argv: js.Array[String], env: ProcessEnv, project: Dir): BaseHookContext = {
    val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseHookContext]
  }
  
  extension [Self <: BaseHookContext](x: Self) {
    
    inline def setArgv(value: js.Array[String]): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
    
    inline def setArgvVarargs(value: String*): Self = StObject.set(x, "argv", js.Array(value :_*))
    
    inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setProject(value: Dir): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
  }
}
