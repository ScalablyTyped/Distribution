package typings.ionic.definitionsMod

import typings.ionic.anon.Dir
import typings.node.processMod.global.NodeJS.ProcessEnv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseHookContext extends StObject {
  
  var argv: js.Array[String] = js.native
  
  var env: ProcessEnv = js.native
  
  var project: Dir = js.native
}
object BaseHookContext {
  
  @scala.inline
  def apply(argv: js.Array[String], env: ProcessEnv, project: Dir): BaseHookContext = {
    val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseHookContext]
  }
  
  @scala.inline
  implicit class BaseHookContextMutableBuilder[Self <: BaseHookContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgv(value: js.Array[String]): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgvVarargs(value: String*): Self = StObject.set(x, "argv", js.Array(value :_*))
    
    @scala.inline
    def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject(value: Dir): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
  }
}
