package typings.gulpHelp.mod

import typings.gulp.mod.DestMethod
import typings.gulp.mod.SrcMethod
import typings.gulp.mod.WatchMethod
import typings.orchestrator.mod.Orchestrator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GulpHelp extends Orchestrator {
  var dest: DestMethod = js.native
  var src: SrcMethod = js.native
  var task: TaskMethod = js.native
  var watch: WatchMethod = js.native
}

