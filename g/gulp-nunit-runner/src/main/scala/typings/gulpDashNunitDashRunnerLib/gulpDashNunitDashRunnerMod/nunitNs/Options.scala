package typings
package gulpDashNunitDashRunnerLib.gulpDashNunitDashRunnerMod.nunitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  // The NUnit bin folder or the full path of the console runner.
  // If not specified the NUnit bin folder must be in the `PATH`.
  var executable: js.UndefOr[java.lang.String] = js.undefined
   // true|false
  // The options below map directly to the NUnit console runner. See here
  // for more info: http://www.nunit.org/index.php?p=consoleCommandLine&r=2.6.3
  var options: js.UndefOr[ConsoleRunnerOptions] = js.undefined
   // 'c:/Program Files/NUnit/bin'
  // [2.x] If the full path of the console runner is not specified this determines
  // what version of the console runner is used. Defaults to anycpu.
  // NOTE: This has been superseded by the 'x86' option below in 3.x.
  // http://www.nunit.org/index.php?p=nunit-console&r=2.6.3
  var platform: js.UndefOr[java.lang.String] = js.undefined
   // 'anycpu|x86'
  // [2.x] Output TeamCity service messages.
  // NOTE: This has been superseded by the 'teamcity' option below in 3.x.
  // https://confluence.jetbrains.com/display/TCD8/Build+Script+Interaction+with+TeamCity
  var teamcity: js.UndefOr[scala.Boolean] = js.undefined
}

