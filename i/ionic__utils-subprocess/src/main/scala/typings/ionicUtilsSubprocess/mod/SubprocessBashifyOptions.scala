package typings.ionicUtilsSubprocess.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubprocessBashifyOptions extends js.Object {
  
  /**
    * Mask file path to first argument.
    *
    * The first argument to subprocesses is the program name or path, e.g.
    * `/path/to/bin/my-program`. If `true`, `bashify()` will return the program
    * name without a file path, e.g. `my-program`.
    *
    * The default is `true`.
    */
  var maskArgv0: js.UndefOr[Boolean] = js.native
  
  /**
    * Mask file path to second argument.
    *
    * In some subprocesses, the second argument is a script file to run, e.g.
    * `node ./scripts/post-install`. If `true`, `bashify()` will return the
    * script name without a file path, e.g. `node post-install`.
    *
    * The default is `false`.
    */
  var maskArgv1: js.UndefOr[Boolean] = js.native
  
  /**
    * Remove the first argument from output.
    *
    * Useful to make a command such as `node ./scripts/post-install` appear as
    * simply `post-install`.
    *
    * The default is `false`.
    */
  var shiftArgv0: js.UndefOr[Boolean] = js.native
}
object SubprocessBashifyOptions {
  
  @scala.inline
  def apply(): SubprocessBashifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubprocessBashifyOptions]
  }
  
  @scala.inline
  implicit class SubprocessBashifyOptionsOps[Self <: SubprocessBashifyOptions] (val x: Self) extends AnyVal {
    
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
    def setMaskArgv0(value: Boolean): Self = this.set("maskArgv0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskArgv0: Self = this.set("maskArgv0", js.undefined)
    
    @scala.inline
    def setMaskArgv1(value: Boolean): Self = this.set("maskArgv1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskArgv1: Self = this.set("maskArgv1", js.undefined)
    
    @scala.inline
    def setShiftArgv0(value: Boolean): Self = this.set("shiftArgv0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShiftArgv0: Self = this.set("shiftArgv0", js.undefined)
  }
}
