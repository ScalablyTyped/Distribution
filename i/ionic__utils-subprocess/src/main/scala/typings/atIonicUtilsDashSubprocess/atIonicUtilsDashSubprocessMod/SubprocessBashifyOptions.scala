package typings.atIonicUtilsDashSubprocess.atIonicUtilsDashSubprocessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var maskArgv0: js.UndefOr[Boolean] = js.undefined
  /**
    * Mask file path to second argument.
    *
    * In some subprocesses, the second argument is a script file to run, e.g.
    * `node ./scripts/post-install`. If `true`, `bashify()` will return the
    * script name without a file path, e.g. `node post-install`.
    *
    * The default is `false`.
    */
  var maskArgv1: js.UndefOr[Boolean] = js.undefined
  /**
    * Remove the first argument from output.
    *
    * Useful to make a command such as `node ./scripts/post-install` appear as
    * simply `post-install`.
    *
    * The default is `false`.
    */
  var shiftArgv0: js.UndefOr[Boolean] = js.undefined
}

object SubprocessBashifyOptions {
  @scala.inline
  def apply(
    maskArgv0: js.UndefOr[Boolean] = js.undefined,
    maskArgv1: js.UndefOr[Boolean] = js.undefined,
    shiftArgv0: js.UndefOr[Boolean] = js.undefined
  ): SubprocessBashifyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maskArgv0)) __obj.updateDynamic("maskArgv0")(maskArgv0)
    if (!js.isUndefined(maskArgv1)) __obj.updateDynamic("maskArgv1")(maskArgv1)
    if (!js.isUndefined(shiftArgv0)) __obj.updateDynamic("shiftArgv0")(shiftArgv0)
    __obj.asInstanceOf[SubprocessBashifyOptions]
  }
}

