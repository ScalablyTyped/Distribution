package typings.layuiSrc.layui

import typings.jquery.JQuery
import typings.layuiSrc.layuiSrcStrings.checkbox
import typings.layuiSrc.layuiSrcStrings.radio
import typings.layuiSrc.layuiSrcStrings.select
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Form extends js.Object {
  
  def getValue(filter: String): js.Any = js.native
  def getValue(filter: String, itemForm: JQuery[HTMLElement]): js.Any = js.native
  
  /**
    *
    * @param event    select|submit
    * @param callback
    */
  def on(event: String, callback: js.Function1[/* data */ LayFormData, _]): Unit = js.native
  
  def render(): js.Any = js.native
  def render(`type`: js.UndefOr[scala.Nothing], filter: String): js.Any = js.native
  def render(`type`: Null, filter: String): js.Any = js.native
  @JSName("render")
  def render_checkbox(`type`: checkbox): js.Any = js.native
  @JSName("render")
  def render_checkbox(`type`: checkbox, filter: String): js.Any = js.native
  @JSName("render")
  def render_radio(`type`: radio): js.Any = js.native
  @JSName("render")
  def render_radio(`type`: radio, filter: String): js.Any = js.native
  @JSName("render")
  def render_select(`type`: select): js.Any = js.native
  @JSName("render")
  def render_select(`type`: select, filter: String): js.Any = js.native
  
  def `val`(filter: String): js.Any = js.native
  def `val`(filter: String, obj: js.Object): js.Any = js.native
  
  def verify(config: js.Object): js.Any = js.native
}
