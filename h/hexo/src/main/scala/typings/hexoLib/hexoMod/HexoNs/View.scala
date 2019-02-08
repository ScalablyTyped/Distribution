package typings
package hexoLib.hexoMod.HexoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait View extends js.Object {
  val path: java.lang.String = js.native
  val source: java.lang.String = js.native
  /**
    * Remove a View
    */
  def render(): js.Promise[java.lang.String] = js.native
  def render(fn: js.Function2[/* err */ js.Any, /* result */ java.lang.String, scala.Unit]): js.Promise[_] = js.native
  def render(options: js.Any): js.Promise[java.lang.String] = js.native
  def render(options: js.Any, fn: js.Function2[/* err */ js.Any, /* result */ java.lang.String, scala.Unit]): js.Promise[java.lang.String] = js.native
  /**
    * Remove a View synchronously.
    */
  def renderSync(): java.lang.String = js.native
  def renderSync(options: js.Any): java.lang.String = js.native
}

