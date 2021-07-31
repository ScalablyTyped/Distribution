package typings.hapiHapi.mod

import typings.hapiHapi.anon.Hapi
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
  def register(server: Server_, options: T): Unit | js.Promise[Unit]
  
  /**
    * Allows defining semver requirements for node and hapi.
    * @default Allows all.
    */
  var requirements: js.UndefOr[Hapi] = js.undefined
}
object PluginBase {
  
  @scala.inline
  def apply[T](register: (Server_, T) => Unit | js.Promise[Unit]): PluginBase[T] = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction2(register))
    __obj.asInstanceOf[PluginBase[T]]
  }
  
  @scala.inline
  implicit class PluginBaseMutableBuilder[Self <: PluginBase[?], T] (val x: Self & PluginBase[T]) extends AnyVal {
    
    @scala.inline
    def setDependencies(value: Dependencies): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    @scala.inline
    def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
    
    @scala.inline
    def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    @scala.inline
    def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
    
    @scala.inline
    def setRegister(value: (Server_, T) => Unit | js.Promise[Unit]): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRequirements(value: Hapi): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequirementsUndefined: Self = StObject.set(x, "requirements", js.undefined)
  }
}
