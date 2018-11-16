package typings
package logglyLib.logglyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogglyInstance extends js.Object {
  def log(message: js.Any): this.type = js.native
  def log(message: js.Any, callback: js.Function2[/* err */ js.Any, /* results */ js.Any, scala.Unit]): this.type = js.native
  def log(message: js.Any, tags: js.Array[java.lang.String]): this.type = js.native
  def log(
    message: js.Any,
    tags: js.Array[java.lang.String],
    callback: js.Function2[/* err */ js.Any, /* results */ js.Any, scala.Unit]
  ): this.type = js.native
  def search(options: SearchOptions): Search = js.native
  def search(
    options: SearchOptions,
    callback: js.Function2[/* err */ js.Any, /* results */ SearchResults, scala.Unit]
  ): Search = js.native
  def search(query: java.lang.String): Search = js.native
  def search(
    query: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* results */ SearchResults, scala.Unit]
  ): Search = js.native
}

