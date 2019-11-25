package typings.gulpDashSass

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Duration extends js.Object {
  var duration: Double
  var end: Date
  var entry: String
  var includedFiles: js.Array[String]
  var start: Date
}

object Anon_Duration {
  @scala.inline
  def apply(duration: Double, end: Date, entry: String, includedFiles: js.Array[String], start: Date): Anon_Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], entry = entry.asInstanceOf[js.Any], includedFiles = includedFiles.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Duration]
  }
}

