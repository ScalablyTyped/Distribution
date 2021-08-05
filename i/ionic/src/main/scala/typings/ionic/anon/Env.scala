package typings.ionic.anon

import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.IonicEnvironment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Env extends StObject {
  
  var env: IonicEnvironment
  
  var project: js.UndefOr[IProject] = js.undefined
}
object Env {
  
  inline def apply(env: IonicEnvironment): Env = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any])
    __obj.asInstanceOf[Env]
  }
  
  extension [Self <: Env](x: Self) {
    
    inline def setEnv(value: IonicEnvironment): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setProject(value: IProject): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
