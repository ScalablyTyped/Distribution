package typings.layuiLayer.layer

import typings.jquery.JQuery
import typings.layuiLayer.anon.PartialCSSStyleDeclaratio
import typings.layuiLayer.layer.callback.Cancel
import typings.layuiLayer.layer.callback.End
import typings.layuiLayer.layer.callback.Prompt
import typings.layuiLayer.layer.callback.Yes
import typings.layuiLayer.layuiLayerNumbers.`0`
import typings.layuiLayer.layuiLayerNumbers.`1`
import typings.layuiLayer.layuiLayerNumbers.`2`
import typings.layuiLayer.layuiLayerStrings.dialog
import typings.layuiLayer.layuiLayerStrings.iframe
import typings.layuiLayer.layuiLayerStrings.loading
import typings.layuiLayer.layuiLayerStrings.page
import typings.layuiLayer.layuiLayerStrings.tips
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layer extends js.Object {
  /**
    * 最新弹出的某个层
    */
  var index: Index = js.native
  /**
    * 版本字符串
    */
  var v: String = js.native
  var zIndex: Double = js.native
  /**
    * 普通信息框
    * @param content
    * @param options
    * @param yes
    */
  def alert(): Index = js.native
  def alert(content: String): Index = js.native
  def alert(content: String, options: Options): Index = js.native
  def alert(content: String, options: Options, yes: Yes): Index = js.native
  def alert(content: String, yes: Yes): Index = js.native
  def alert(options: Options): Index = js.native
  def alert(options: Options, yes: Yes): Index = js.native
  def alert(yes: Yes): Index = js.native
  /**
    * 关闭特定层
    * @param index
    */
  def close(index: Index): Unit = js.native
  /**
    * 关闭所有层
    * @param type
    */
  def closeAll(): Unit = js.native
  @JSName("closeAll")
  def closeAll_dialog(`type`: dialog): Unit = js.native
  @JSName("closeAll")
  def closeAll_iframe(`type`: iframe): Unit = js.native
  @JSName("closeAll")
  def closeAll_loading(`type`: loading): Unit = js.native
  @JSName("closeAll")
  def closeAll_page(`type`: page): Unit = js.native
  @JSName("closeAll")
  def closeAll_tips(`type`: tips): Unit = js.native
  /**
    * 初始化全局配置
    * @param options
    */
  def config(options: ConfigOptions): this.type = js.native
  /**
    * 询问框
    * @param content
    * @param options
    * @param yes
    * @param cancel
    */
  def confirm(): Index = js.native
  def confirm(content: String): Index = js.native
  def confirm(content: String, options: Options): Index = js.native
  def confirm(content: String, options: Options, yes: Yes): Index = js.native
  def confirm(content: String, options: Options, yes: Yes, cancel: Cancel): Index = js.native
  def confirm(content: String, yes: Yes): Index = js.native
  def confirm(content: String, yes: Yes, cancel: Cancel): Index = js.native
  def confirm(options: Options): Index = js.native
  def confirm(options: Options, yes: Yes): Index = js.native
  def confirm(options: Options, yes: Yes, cancel: Cancel): Index = js.native
  def confirm(yes: Yes): Index = js.native
  def confirm(yes: Yes, cancel: Cancel): Index = js.native
  /**
    * 在自定义元素上触发最大化。
    * @param index
    */
  def full(index: Index): Unit = js.native
  /**
    * 获取iframe页的DOM
    * @param selector
    * @param index
    */
  def getChildFrame(selector: String, index: Index): JQuery[HTMLElement] = js.native
  /**
    * 获取特定iframe层的索引
    * @param windowName
    */
  def getFrameIndex(windowName: String): Index = js.native
  /**
    * 指定iframe层自适应
    * @param index
    */
  def iframeAuto(index: Index): Unit = js.native
  /**
    * 重置特定iframe url
    * @param index
    * @param url
    */
  def iframeSrc(index: Index, url: String): Unit = js.native
  /**
    * 加载层
    * @param icon
    * @param options
    */
  def load(): Index = js.native
  @JSName("load")
  def load_0(icon: `0`): Index = js.native
  @JSName("load")
  def load_0(icon: `0`, options: Options): Index = js.native
  @JSName("load")
  def load_1(icon: `1`): Index = js.native
  @JSName("load")
  def load_1(icon: `1`, options: Options): Index = js.native
  @JSName("load")
  def load_2(icon: `2`): Index = js.native
  @JSName("load")
  def load_2(icon: `2`, options: Options): Index = js.native
  /**
    * 在自定义元素上触发最小化。
    * @param index
    */
  def min(index: Index): Unit = js.native
  /**
    * 提示框
    * @param content
    * @param options
    * @param end
    */
  def msg(content: String): Index = js.native
  def msg(content: String, end: End): Index = js.native
  def msg(content: String, options: Options): Index = js.native
  def msg(content: String, options: Options, end: End): Index = js.native
  /**
    * 原始核心方法
    * @param options
    */
  def open(): Index = js.native
  def open(options: Options): Index = js.native
  /**
    * 相册层
    * @param options
    */
  def photos(options: PhotosOptions): Index = js.native
  /**
    * 输入层
    * @param options
    * @param yes
    */
  def prompt(): Index = js.native
  def prompt(options: PromptOptions): Index = js.native
  def prompt(options: PromptOptions, yes: Prompt): Index = js.native
  def prompt(yes: Prompt): Index = js.native
  /**
    * 初始化就绪
    * @param callback
    */
  def ready(callback: js.Function0[Unit]): this.type = js.native
  /**
    * 在自定义元素上触发还原。
    * @param index
    */
  def restore(index: Index): Unit = js.native
  /**
    * 置顶当前窗口
    */
  def setTop(layero: JQuery[HTMLElement]): Unit = js.native
  /**
    * 重新定义层的样式
    * @param index
    * @param cssStyle
    * @description 该方法对loading层和tips层无效。参数index为层的索引，cssStyle允许你传入任意的css属性
    */
  def style(index: Index, cssStyle: PartialCSSStyleDeclaratio): Unit = js.native
  /**
    * tab层
    * @param options
    */
  def tab(options: TabOptions): Index = js.native
  /**
    * tips层
    * @param content
    * @param follow
    * @param options
    */
  def tips(content: String, follow: Selector): Index = js.native
  def tips(content: String, follow: Selector, options: Options): Index = js.native
  def tips(content: String, follow: HTMLElement): Index = js.native
  def tips(content: String, follow: HTMLElement, options: Options): Index = js.native
  /**
    * 改变层的标题
    * @param title
    * @param index
    */
  def title(title: String, index: Index): Unit = js.native
}

