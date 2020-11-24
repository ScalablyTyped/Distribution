package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Statistic模块管理统计功能，用于提供应用内统计的能力，支持统计和分析用户属性和用户行为数据。通过plus.statistic可获取统计管理对象。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/statistic.html](http://www.html5plus.org/doc/zh_cn/statistic.html)
  */
@js.native
trait PlusStatistic extends js.Object {
  
  /**
    * 精确持续事件
    * 精确时长的持续事件统计，触发的事件必须要先在统计网站上注册事件ID。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/statistic.html](http://www.html5plus.org/doc/zh_cn/statistic.html)
    */
  def eventDuration(): Unit = js.native
  def eventDuration(id: js.UndefOr[scala.Nothing], duration: js.UndefOr[scala.Nothing], value: js.Any): Unit = js.native
  def eventDuration(id: js.UndefOr[scala.Nothing], duration: Double): Unit = js.native
  def eventDuration(id: js.UndefOr[scala.Nothing], duration: Double, value: js.Any): Unit = js.native
  def eventDuration(id: String): Unit = js.native
  def eventDuration(id: String, duration: js.UndefOr[scala.Nothing], value: js.Any): Unit = js.native
  def eventDuration(id: String, duration: Double): Unit = js.native
  def eventDuration(id: String, duration: Double, value: js.Any): Unit = js.native
  
  /**
    * 结束持续事件（过期API，不推荐使用）
    * 结束指定的持续事件统计，需先调用eventStart方法开始持续事件统计，触发的事件必须要先在统计网站上注册事件ID。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/statistic.html](http://www.html5plus.org/doc/zh_cn/statistic.html)
    */
  def eventEnd(): Unit = js.native
  def eventEnd(id: js.UndefOr[scala.Nothing], label: String): Unit = js.native
  def eventEnd(id: String): Unit = js.native
  def eventEnd(id: String, label: String): Unit = js.native
  
  /**
    * 开始持续事件（过期API，不推荐使用）
    * 开始指定的持续事件统计，当事件结束时调用eventEnd方法，，触发的事件必须要先在统计网站上注册事件ID。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/statistic.html](http://www.html5plus.org/doc/zh_cn/statistic.html)
    */
  def eventStart(): Unit = js.native
  def eventStart(id: js.UndefOr[scala.Nothing], value: String): Unit = js.native
  def eventStart(id: String): Unit = js.native
  def eventStart(id: String, value: String): Unit = js.native
  
  /**
    * 触发事件
    * 触发指定的统计事件，触发的事件必须要先在统计网站上注册事件ID。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/statistic.html](http://www.html5plus.org/doc/zh_cn/statistic.html)
    */
  def eventTrig(): Unit = js.native
  def eventTrig(id: js.UndefOr[scala.Nothing], value: js.Any): Unit = js.native
  def eventTrig(id: String): Unit = js.native
  def eventTrig(id: String, value: js.Any): Unit = js.native
}
