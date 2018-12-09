package typings
package gulpDashProtractorLib.gulpDashProtractorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGulpProtractor extends js.Object {
  @JSName("webdriver_standalone")
  var webdriver_standalone_Original: gulpLib.gulpMod.GulpClientNs.TaskCallback = js.native
  @JSName("webdriver_update")
  var webdriver_update_Original: gulpLib.gulpMod.GulpClientNs.TaskCallback = js.native
  def getProtractorDir(): java.lang.String = js.native
  def protractor(): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def protractor(options: IOptions): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def webdriver_standalone(done: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit]): scala.Unit | nodeLib.streamMod.Duplex | nodeLib.NodeJSNs.Process | js.Promise[scala.Nothing] | js.Any = js.native
  def webdriver_update(done: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit]): scala.Unit | nodeLib.streamMod.Duplex | nodeLib.NodeJSNs.Process | js.Promise[scala.Nothing] | js.Any = js.native
}

