package typings.hapi.mod

import typings.hapi.anon.Hapi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginBase[T] extends StObject {
  
  /** (optional) a string or an array of strings indicating a plugin dependency. Same as setting dependencies via server.dependency(). */
  var dependencies: js.UndefOr[Dependencies] = js.undefined
  
  /** (optional) if true, allows the plugin to be registered multiple times with the same server. Defaults to false. */
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  /** once - (optional) if true, will only register the plugin once per server. If set, overrides the once option passed to server.register(). Defaults to no override. */
  var once: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (required) the registration function with the signature async function(server, options) where:
    * * server - the server object with a plugin-specific server.realm.
    * * options - any options passed to the plugin during registration via server.register().
    */
  def register(server: Server, options: T): Unit | js.Promise[Unit]
  
  /**
    * Allows defining semver requirements for node and hapi.
    * @default Allows all.
    */
  var requirements: js.UndefOr[Hapi] = js.undefined
}
object PluginBase {
  
  inline def apply[T](register: (Server, T) => Unit | js.Promise[Unit]): PluginBase[T] = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction2(register))
    __obj.asInstanceOf[PluginBase[T]]
  }
  
  extension [Self <: PluginBase[?], T](x: Self & PluginBase[T]) {
    
    inline def setDependencies(value: Dependencies): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    
    inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
    
    inline def setRegister(value: (Server, T) => Unit | js.Promise[Unit]): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
    
    inline def setRequirements(value: Hapi): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
    
    inline def setRequirementsUndefined: Self = StObject.set(x, "requirements", js.undefined)
  }
}
