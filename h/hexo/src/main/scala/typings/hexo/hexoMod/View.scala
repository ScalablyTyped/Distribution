package typings.hexo.hexoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait View extends js.Object {
  val path: String = js.native
  val source: String = js.native
  /**
    * Remove a View
    */
  def render(): js.Promise[String] = js.native
  def render(fn: js.Function2[/* err */ js.Any, /* result */ String, Unit]): js.Promise[_] = js.native
  def render(options: js.Any): js.Promise[String] = js.native
  def render(options: js.Any, fn: js.Function2[/* err */ js.Any, /* result */ String, Unit]): js.Promise[String] = js.native
  /**
    * Remove a View synchronously.
    */
  def renderSync(): String = js.native
  def renderSync(options: js.Any): String = js.native
}

