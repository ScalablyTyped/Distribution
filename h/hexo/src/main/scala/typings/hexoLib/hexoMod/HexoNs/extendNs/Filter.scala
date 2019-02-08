package typings
package hexoLib.hexoMod.HexoNs.extendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends js.Object {
  def exec(`type`: java.lang.String): js.Any = js.native
  def exec(`type`: java.lang.String, data: js.Any): js.Any = js.native
  def exec(`type`: java.lang.String, data: js.Any, options: hexoLib.hexoMod.HexoNs.extendNs.FilterNs.Options): js.Any = js.native
  def execSync(`type`: java.lang.String): js.Any = js.native
  def execSync(`type`: java.lang.String, data: js.Any): js.Any = js.native
  def execSync(`type`: java.lang.String, data: js.Any, options: hexoLib.hexoMod.HexoNs.extendNs.FilterNs.Options): js.Any = js.native
  def register(`type`: java.lang.String, fn: js.Function2[/* data */ js.Any, /* repeated */ js.Any, _]): scala.Unit = js.native
  def register(
    `type`: java.lang.String,
    fn: js.Function2[/* data */ js.Any, /* repeated */ js.Any, _],
    priority: scala.Double
  ): scala.Unit = js.native
  /**
    * Executed after generated files and cache are removed with hexo clean command.
    */
  @JSName("register")
  def register_after_clean(`type`: hexoLib.hexoLibStrings.after_clean, fn: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("register")
  def register_after_clean(`type`: hexoLib.hexoLibStrings.after_clean, fn: js.Function0[scala.Unit], priority: scala.Double): scala.Unit = js.native
  /**
    * Executed after generation finishes.
    */
  @JSName("register")
  def register_after_generate(`type`: hexoLib.hexoLibStrings.after_generate, fn: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("register")
  def register_after_generate(
    `type`: hexoLib.hexoLibStrings.after_generate,
    fn: js.Function0[scala.Unit],
    priority: scala.Double
  ): scala.Unit = js.native
  /**
    * Executed after Hexo is initialized – this will run right after `hexo.init` completes.
    */
  @JSName("register")
  def register_after_init(`type`: hexoLib.hexoLibStrings.after_init, fn: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("register")
  def register_after_init(`type`: hexoLib.hexoLibStrings.after_init, fn: js.Function0[scala.Unit], priority: scala.Double): scala.Unit = js.native
  /**
    * Executed after a post is rendered. Refer to post rendering to learn the execution steps.
    */
  @JSName("register")
  def register_after_post_render(
    `type`: hexoLib.hexoLibStrings.after_post_render,
    fn: js.Function1[/* data */ hexoLib.Anon_ContentKey, hexoLib.Anon_ContentKey | scala.Unit]
  ): scala.Unit = js.native
  @JSName("register")
  def register_after_post_render(
    `type`: hexoLib.hexoLibStrings.after_post_render,
    fn: js.Function1[/* data */ hexoLib.Anon_ContentKey, hexoLib.Anon_ContentKey | scala.Unit],
    priority: scala.Double
  ): scala.Unit = js.native
  /**
    * Executed after rendering finishes. You can see rendering for more info.
    */
  @JSName("register")
  def `register_after_render:html`(
    `type`: hexoLib.hexoLibStrings.`after_render:html`,
    fn: js.Function2[
      /* result */ java.lang.String, 
      /* data */ hexoLib.Anon_Key, 
      java.lang.String | scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("register")
  def `register_after_render:html`(
    `type`: hexoLib.hexoLibStrings.`after_render:html`,
    fn: js.Function2[
      /* result */ java.lang.String, 
      /* data */ hexoLib.Anon_Key, 
      java.lang.String | scala.Unit
    ],
    priority: scala.Double
  ): scala.Unit = js.native
  /**
    * Executed before Hexo is about to exit – this will run right after `hexo.exit` is called.
    */
  @JSName("register")
  def register_before_exit(`type`: hexoLib.hexoLibStrings.before_exit, fn: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("register")
  def register_before_exit(`type`: hexoLib.hexoLibStrings.before_exit, fn: js.Function0[scala.Unit], priority: scala.Double): scala.Unit = js.native
  /**
    * Executed before generation begins.
    */
  @JSName("register")
  def register_before_generate(`type`: hexoLib.hexoLibStrings.before_generate, fn: js.Function1[/* data */ js.Any, _]): scala.Unit = js.native
  @JSName("register")
  def register_before_generate(
    `type`: hexoLib.hexoLibStrings.before_generate,
    fn: js.Function1[/* data */ js.Any, _],
    priority: scala.Double
  ): scala.Unit = js.native
  /**
    * Executed before a post is rendered. Refer to post rendering to learn the execution steps.
    */
  @JSName("register")
  def register_before_post_render(
    `type`: hexoLib.hexoLibStrings.before_post_render,
    fn: js.Function1[/* data */ hexoLib.Anon_ContentKey, hexoLib.Anon_ContentKey | scala.Unit]
  ): scala.Unit = js.native
  @JSName("register")
  def register_before_post_render(
    `type`: hexoLib.hexoLibStrings.before_post_render,
    fn: js.Function1[/* data */ hexoLib.Anon_ContentKey, hexoLib.Anon_ContentKey | scala.Unit],
    priority: scala.Double
  ): scala.Unit = js.native
  /**
    * Executed when creating a post to determine the path of new posts.
    */
  @JSName("register")
  def register_new_post_path(
    `type`: hexoLib.hexoLibStrings.new_post_path,
    fn: js.Function2[
      /* data */ hexoLib.hexoMod.HexoNs.PostNs.Data, 
      /* replace */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("register")
  def register_new_post_path(
    `type`: hexoLib.hexoLibStrings.new_post_path,
    fn: js.Function2[
      /* data */ hexoLib.hexoMod.HexoNs.PostNs.Data, 
      /* replace */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ],
    priority: scala.Double
  ): scala.Unit = js.native
  /**
    * Used to determine the permalink of posts.
    */
  @JSName("register")
  def register_post_permalink(
    `type`: hexoLib.hexoLibStrings.post_permalink,
    fn: js.Function1[/* permalink */ java.lang.String, java.lang.String]
  ): scala.Unit = js.native
  @JSName("register")
  def register_post_permalink(
    `type`: hexoLib.hexoLibStrings.post_permalink,
    fn: js.Function1[/* permalink */ java.lang.String, java.lang.String],
    priority: scala.Double
  ): scala.Unit = js.native
  /**
    * Add middleware to the server. app is a Connect instance.
    */
  @JSName("register")
  def register_server_middleware(
    `type`: hexoLib.hexoLibStrings.server_middleware,
    fn: js.Function1[
      /* app */ connectLib.connectMod.createServerNs.Server, 
      connectLib.connectMod.createServerNs.Server | scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("register")
  def register_server_middleware(
    `type`: hexoLib.hexoLibStrings.server_middleware,
    fn: js.Function1[
      /* app */ connectLib.connectMod.createServerNs.Server, 
      connectLib.connectMod.createServerNs.Server | scala.Unit
    ],
    priority: scala.Double
  ): scala.Unit = js.native
  /**
    * Modify [local variables](https://hexo.io/docs/variables) in templates.
    */
  @JSName("register")
  def register_template_locals(
    `type`: hexoLib.hexoLibStrings.template_locals,
    fn: js.Function1[
      /* locals */ hexoLib.hexoMod.TemplateLocals, 
      hexoLib.hexoMod.TemplateLocals | scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("register")
  def register_template_locals(
    `type`: hexoLib.hexoLibStrings.template_locals,
    fn: js.Function1[
      /* locals */ hexoLib.hexoMod.TemplateLocals, 
      hexoLib.hexoMod.TemplateLocals | scala.Unit
    ],
    priority: scala.Double
  ): scala.Unit = js.native
  def unregister(`type`: java.lang.String, fn: js.Function1[/* repeated */ js.Any, _]): scala.Unit = js.native
}

