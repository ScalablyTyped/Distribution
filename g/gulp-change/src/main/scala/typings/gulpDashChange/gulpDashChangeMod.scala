package typings.gulpDashChange

import typings.eventDashStream.eventDashStreamMod.MapStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-change", JSImport.Namespace)
@js.native
object gulpDashChangeMod extends js.Object {
  def apply(transformer: ChangeFunction): MapStream = js.native
  type Callback = js.Function2[/* err */ js.Any, /* content */ String, js.Any]
  type ChangeFunction = js.Function2[/* content */ String, /* callback */ Callback, String | Unit]
}

