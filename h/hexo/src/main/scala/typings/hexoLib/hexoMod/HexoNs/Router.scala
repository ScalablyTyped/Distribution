package typings
package hexoLib.hexoMod.HexoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router extends js.Object {
  /**
    * The `format` method transforms a string to a valid path.
    */
  def format(path: java.lang.String): java.lang.String = js.native
  /**
    * The `get` method returns a `Stream`.
    */
  def get(path: java.lang.String): js.UndefOr[hexoLib.hexoMod.HexoNs.RouterNs.RouteStream] = js.native
  /**
    * Get the List of Routes
    */
  def list(): js.Array[java.lang.String] = js.native
  /**
    * Remove a Path
    */
  def remove(path: java.lang.String): this.type = js.native
  def set(path: java.lang.String, data: hexoDashUtilLib.hexoDashUtilMod.Pattern[scala.Boolean]): this.type = js.native
  def set(path: java.lang.String, data: hexoLib.hexoMod.HexoNs.RouterNs.Data): this.type = js.native
  /**
    * The `set` method takes a string, a `Buffer` or a function.
    */
  def set(path: java.lang.String, data: java.lang.String): this.type = js.native
  def set(path: java.lang.String, data: nodeLib.Buffer): this.type = js.native
}

