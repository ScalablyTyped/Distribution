package typings
package gulpDashProtractorLib.gulpDashProtractorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGulpProtractor extends js.Object {
  var webdriver_standalone: gulpLib.gulpMod.GulpClientNs.TaskCallback = js.native
  var webdriver_update: gulpLib.gulpMod.GulpClientNs.TaskCallback = js.native
  def getProtractorDir(): java.lang.String = js.native
  def protractor(): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def protractor(options: IOptions): nodeLib.NodeJSNs.ReadWriteStream = js.native
}

