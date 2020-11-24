package typings.liftoff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchOptions extends js.Object {
  
  var completion: js.UndefOr[String] = js.native
  
  /**
    * Don't search for a config, use the one provided.
    * **Note**: Liftoff will assume the current working directory is the directory containing the config file
    * unless an alternate location is explicitly specified using `cwd`.
    * @default null
    */
  var configPath: js.UndefOr[String] = js.native
  
  /**
    * Change the current working directory for this launch. Relative paths are calculated against `process.cwd()`.
    * @default process.cwd()
    */
  var cwd: js.UndefOr[String] = js.native
  
  /**
    * Allows you to force node or V8 flags during the launch.
    * This is useful if you need to make sure certain flags will always be enabled
    * or if you need to enable flags that don't show up in `opts.v8flags`
    * (as these flags aren't validated against opts.v8flags).
    * @default null
    */
  var forcedFlags: js.UndefOr[
    String | js.Array[String] | (js.Function1[/* env */ LiftoffEnv, String | js.Array[String]])
  ] = js.native
  
  /**
    * A string or array of modules to attempt requiring from the local
    * working directory before invoking the launch callback.
    * @default null
    */
  var require: js.UndefOr[String | js.Array[_]] = js.native
}
object LaunchOptions {
  
  @scala.inline
  def apply(): LaunchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchOptions]
  }
  
  @scala.inline
  implicit class LaunchOptionsOps[Self <: LaunchOptions] (val x: Self) extends AnyVal {
    
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
    def setCompletion(value: String): Self = this.set("completion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletion: Self = this.set("completion", js.undefined)
    
    @scala.inline
    def setConfigPath(value: String): Self = this.set("configPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigPath: Self = this.set("configPath", js.undefined)
    
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    
    @scala.inline
    def setForcedFlagsVarargs(value: String*): Self = this.set("forcedFlags", js.Array(value :_*))
    
    @scala.inline
    def setForcedFlagsFunction1(value: /* env */ LiftoffEnv => String | js.Array[String]): Self = this.set("forcedFlags", js.Any.fromFunction1(value))
    
    @scala.inline
    def setForcedFlags(value: String | js.Array[String] | (js.Function1[/* env */ LiftoffEnv, String | js.Array[String]])): Self = this.set("forcedFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForcedFlags: Self = this.set("forcedFlags", js.undefined)
    
    @scala.inline
    def setRequireVarargs(value: js.Any*): Self = this.set("require", js.Array(value :_*))
    
    @scala.inline
    def setRequire(value: String | js.Array[_]): Self = this.set("require", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequire: Self = this.set("require", js.undefined)
  }
}
