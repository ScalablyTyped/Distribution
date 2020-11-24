package typings.hexo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait View extends js.Object {
  
  val path: String = js.native
  
  /**
    * Remove a View
    */
  def render(): js.Promise[String] = js.native
  def render(fn: js.Function2[/* err */ js.Any, /* result */ String, Unit]): js.Promise[_] = js.native
  def render(options: js.UndefOr[scala.Nothing], fn: js.Function2[/* err */ js.Any, /* result */ String, Unit]): js.Promise[String] = js.native
  def render(options: js.Any): js.Promise[String] = js.native
  def render(options: js.Any, fn: js.Function2[/* err */ js.Any, /* result */ String, Unit]): js.Promise[String] = js.native
  
  /**
    * Remove a View synchronously.
    */
  def renderSync(): String = js.native
  def renderSync(options: js.Any): String = js.native
  
  val source: String = js.native
}
