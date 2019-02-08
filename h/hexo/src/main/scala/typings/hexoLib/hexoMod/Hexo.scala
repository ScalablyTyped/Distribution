package typings
package hexoLib.hexoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hexo
  extends nodeLib.eventsMod.namespaced {
  val base_dir: java.lang.String = js.native
  /**
    * Site settings in `_config.yml`
    */
  val config: HexoConfig = js.native
  val config_path: java.lang.String = js.native
  val env: hexoLib.Anon_Args = js.native
  val extend: hexoLib.Anon_Console = js.native
  /**
    * Local variables are used for template rendering, which is the `site` variable in templates.
    * https://hexo.io/api/locals
    */
  val locals: hexoLib.hexoMod.HexoNs.Locals = js.native
  /**
    * Logger object
    * https://www.npmjs.com/package/bunyan
    */
  val log: bunyanLib.bunyanMod.namespaced = js.native
  val plugin_dir: java.lang.String = js.native
  val post: hexoLib.hexoMod.HexoNs.Post = js.native
  /**
    * Public folder. Where the static site will be generated
    */
  val public_dir: java.lang.String = js.native
  val render: hexoLib.hexoMod.HexoNs.Render = js.native
  val route: hexoLib.hexoMod.HexoNs.Router = js.native
  val scaffold: hexoLib.hexoMod.HexoNs.Scaffold = js.native
  val scaffold_dir: java.lang.String = js.native
  val script_dir: java.lang.String = js.native
  val source: hexoLib.hexoMod.HexoNs.Box = js.native
  /**
    * Source folder. Where your content is stored
    */
  val source_dir: java.lang.String = js.native
  val theme: hexoLib.hexoMod.HexoNs.Theme = js.native
  val theme_dir: java.lang.String = js.native
  val theme_script_dir: java.lang.String = js.native
  /**
    * Any console command can be called explicitly using the call method on the Hexo instance.
    */
  def call(name: java.lang.String): js.Promise[_] = js.native
  def call(name: java.lang.String, args: js.Any): js.Promise[_] = js.native
  def call(
    name: java.lang.String,
    args: js.Any,
    fn: js.Function2[/* err */ js.Any, /* value */ js.Any, scala.Unit]
  ): js.Promise[_] = js.native
  def call(name: java.lang.String, fn: js.Function2[/* err */ js.Any, /* value */ js.Any, scala.Unit]): js.Promise[_] = js.native
  /**
    * You should call the `exit` method upon successful or unsuccessful completion of a console command.
    * This allows Hexo to exit gracefully and finish up important things such as saving the database.
    */
  def exit(): js.Promise[scala.Unit] = js.native
  def exit(err: js.Any): js.Promise[scala.Unit] = js.native
  /**
    * Load configuration and plugins.
    */
  def init(): js.Promise[scala.Unit] = js.native
  /**
    * Loading all files in the `source` folder as well as the theme data.
    */
  def load(): js.Promise[_] = js.native
  def load(fn: js.Function2[/* err */ js.Any, /* value */ js.Any, scala.Unit]): js.Promise[_] = js.native
  /**
    * Emitted after processing finishes. This event returns a path representing the root directory of the box.
    */
  def on(
    ev: hexoLib.hexoLibStrings.processAfter,
    fn: js.Function2[
      /* type */ hexoLib.hexoLibStrings.create | hexoLib.hexoLibStrings.update | hexoLib.hexoLibStrings.skip | hexoLib.hexoLibStrings.delete, 
      /* path */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Emitted before processing begins. This event returns a path representing the root directory of the box.
    */
  def on(
    ev: hexoLib.hexoLibStrings.processBefore,
    fn: js.Function2[
      /* type */ hexoLib.hexoLibStrings.create | hexoLib.hexoLibStrings.update | hexoLib.hexoLibStrings.skip | hexoLib.hexoLibStrings.delete, 
      /* path */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Emitted after deployment finishes.
    */
  @JSName("on")
  def on_deployAfter(ev: hexoLib.hexoLibStrings.deployAfter, fn: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Emitted before deployment begins.
    */
  @JSName("on")
  def on_deployBefore(ev: hexoLib.hexoLibStrings.deployBefore, fn: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Emitted before Hexo exits.
    */
  @JSName("on")
  def on_exit(ev: hexoLib.hexoLibStrings.exit, fn: js.Function1[/* err */ js.Any, scala.Unit]): this.type = js.native
  /**
    * Emitted after generation finishes.
    */
  @JSName("on")
  def on_generateAfter(ev: hexoLib.hexoLibStrings.generateAfter, fn: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Emitted before generation begins.
    */
  @JSName("on")
  def on_generateBefore(ev: hexoLib.hexoLibStrings.generateBefore, fn: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Emitted after a new post has been created. This event returns the post data:
    */
  @JSName("on")
  def on_new(ev: hexoLib.hexoLibStrings.`new`, fn: js.Function1[/* post */ hexoLib.Anon_Content, scala.Unit]): this.type = js.native
  /**
    * Emitted after initialization finishes.
    */
  @JSName("on")
  def on_ready(ev: hexoLib.hexoLibStrings.ready, fn: js.Function0[scala.Unit]): this.type = js.native
  def unwatch(): scala.Unit = js.native
  /**
    * The same things `load` does, but will also start watching for file changes continuously.
    */
  def watch(): js.Promise[_] = js.native
  def watch(fn: js.Function2[/* err */ js.Any, /* value */ js.Any, scala.Unit]): js.Promise[_] = js.native
}

