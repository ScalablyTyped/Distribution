package typings.loggly.logglyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogglyInstance extends js.Object {
  def log(message: js.Any): this.type = js.native
  def log(message: js.Any, callback: js.Function2[/* err */ js.Any, /* results */ js.Any, Unit]): this.type = js.native
  def log(message: js.Any, tags: js.Array[String]): this.type = js.native
  def log(
    message: js.Any,
    tags: js.Array[String],
    callback: js.Function2[/* err */ js.Any, /* results */ js.Any, Unit]
  ): this.type = js.native
  def search(options: SearchOptions): Search = js.native
  def search(
    options: SearchOptions,
    callback: js.Function2[/* err */ js.Any, /* results */ SearchResults, Unit]
  ): Search = js.native
  def search(query: String): Search = js.native
  def search(query: String, callback: js.Function2[/* err */ js.Any, /* results */ SearchResults, Unit]): Search = js.native
}

