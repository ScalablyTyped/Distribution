package typings.koaPug.mod

import org.scalablytyped.runtime.StringDictionary
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-pug", "KoaPug")
@js.native
class KoaPug () extends js.Object {
  def this(options: PugOptions) = this()
  /**
    * Compile .pug file
    * @param tpl The path of template file
    * @param locals Variables and helpers that passed to Pug compiler
    * @param compileOptions
    */
  var compileFile: js.Any = js.native
  /**
    * Compile a Pug template string
    * @param tpl Template string or the path of template file
    */
  var compileString: js.Any = js.native
  var defaultLocals: js.Any = js.native
  var defaultOptions: js.Any = js.native
  var helpers: StringDictionary[js.Function1[/* repeated */ js.Any, _]] = js.native
  var locals: StringDictionary[js.Any] = js.native
  var noCache: Boolean = js.native
  var options: js.UndefOr[PugOptions] = js.native
  var viewPath: String = js.native
  /**
    * Render Pug tamplate
    * @param tpl Template string or the path of template file
    * @param locals Variables and helpers that passed to Pug compiler
    * @param options
    */
  def render(tpl: String): js.Promise[String] = js.native
  def render(tpl: String, locals: js.UndefOr[scala.Nothing], options: RenderOptions): js.Promise[String] = js.native
  def render(tpl: String, locals: js.Any): js.Promise[String] = js.native
  def render(tpl: String, locals: js.Any, options: RenderOptions): js.Promise[String] = js.native
  /**
    * Bind render function to Koa context
    * @param app Koa instance
    */
  def use(app: ^[DefaultState, DefaultContext]): Unit = js.native
}

