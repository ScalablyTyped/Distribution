package typings.gulpDashFilter.gulpDashFilterMod

import typings.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// A transform stream with a .restore object
@js.native
trait Filter extends ReadWriteStream {
  var restore: ReadWriteStream = js.native
}

