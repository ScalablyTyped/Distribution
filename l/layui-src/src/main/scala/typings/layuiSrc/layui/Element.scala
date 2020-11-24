package typings.layuiSrc.layui

import typings.layuiSrc.layuiSrcStrings.breadcrumb
import typings.layuiSrc.layuiSrcStrings.collapse
import typings.layuiSrc.layuiSrcStrings.nav
import typings.layuiSrc.layuiSrcStrings.progress
import typings.layuiSrc.layuiSrcStrings.tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Element extends js.Object {
  
  def init(): Unit = js.native
  def init(`type`: js.UndefOr[scala.Nothing], filter: String): Unit = js.native
  @JSName("init")
  def init_breadcrumb(`type`: breadcrumb): Unit = js.native
  @JSName("init")
  def init_breadcrumb(`type`: breadcrumb, filter: String): Unit = js.native
  @JSName("init")
  def init_collapse(`type`: collapse): Unit = js.native
  @JSName("init")
  def init_collapse(`type`: collapse, filter: String): Unit = js.native
  @JSName("init")
  def init_nav(`type`: nav): Unit = js.native
  @JSName("init")
  def init_nav(`type`: nav, filter: String): Unit = js.native
  @JSName("init")
  def init_progress(`type`: progress): Unit = js.native
  @JSName("init")
  def init_progress(`type`: progress, filter: String): Unit = js.native
  @JSName("init")
  def init_tab(`type`: tab): Unit = js.native
  @JSName("init")
  def init_tab(`type`: tab, filter: String): Unit = js.native
  
  // set(options: object): object;  很少用
  def on(filter: String, callback: js.ThisFunction1[/* this */ js.Any, /* data */ js.Any, _]): Unit = js.native
  
  def progress(filter: String, percent: String): Unit = js.native
  
  // Element.prototype.render = Element.prototype.init;
  // 当type不能识别时，layui会遍历渲染"tab""nav"|"breadcrumb"|"progress"|"collapse" 全部；
  def render(): Unit = js.native
  def render(`type`: js.UndefOr[scala.Nothing], filter: String): Unit = js.native
  @JSName("render")
  def render_breadcrumb(`type`: breadcrumb): Unit = js.native
  @JSName("render")
  def render_breadcrumb(`type`: breadcrumb, filter: String): Unit = js.native
  @JSName("render")
  def render_collapse(`type`: collapse): Unit = js.native
  @JSName("render")
  def render_collapse(`type`: collapse, filter: String): Unit = js.native
  @JSName("render")
  def render_nav(`type`: nav): Unit = js.native
  @JSName("render")
  def render_nav(`type`: nav, filter: String): Unit = js.native
  @JSName("render")
  def render_progress(`type`: progress): Unit = js.native
  @JSName("render")
  def render_progress(`type`: progress, filter: String): Unit = js.native
  @JSName("render")
  def render_tab(`type`: tab): Unit = js.native
  @JSName("render")
  def render_tab(`type`: tab, filter: String): Unit = js.native
  
  def tab(option: TabElement): Unit = js.native
  
  def tabAdd(filter: String, options: TabOption): Unit = js.native
  
  def tabChange(filter: String, layid: String): Unit = js.native
  
  def tabDelete(filter: String, layid: String): Unit = js.native
}
