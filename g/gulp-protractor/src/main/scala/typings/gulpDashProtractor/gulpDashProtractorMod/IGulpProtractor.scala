package typings.gulpDashProtractor.gulpDashProtractorMod

import typings.gulp.gulpMod.TaskCallback
import typings.node.NodeJSNs.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGulpProtractor extends js.Object {
  var webdriver_standalone: TaskCallback = js.native
  var webdriver_update: TaskCallback = js.native
  def getProtractorDir(): String = js.native
  def protractor(): ReadWriteStream = js.native
  def protractor(options: IOptions): ReadWriteStream = js.native
}

