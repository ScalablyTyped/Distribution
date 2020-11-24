package typings.layuiSrc.layui

import typings.layuiSrc.anon.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * https://www.layui.com/doc/modules/laydate.html
  */
@js.native
trait Laydate extends js.Object {
  
  // 获取指定年月的最后一天是 1-31
  def getEndDate(): Double = js.native
  def getEndDate(month: js.UndefOr[scala.Nothing], year: Double): Double = js.native
  def getEndDate(month: Double): Double = js.native
  def getEndDate(month: Double, year: Double): Double = js.native
  
  var path: String = js.native
  
  def render(options: DateOption): Config = js.native
  
  def set(options: DateOption): Unit = js.native
}
