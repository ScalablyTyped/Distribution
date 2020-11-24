package typings.loggly.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogglyInstance extends js.Object {
  
  def log(message: js.Any): this.type = js.native
  def log(message: js.Any, callback: js.Function2[/* err */ js.Any, /* results */ js.Any, Unit]): this.type = js.native
  def log(
    message: js.Any,
    tags: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* results */ js.Any, Unit]
  ): this.type = js.native
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
