package typings.growingIo

import typings.growingIo.growingIoStrings.appDotset
import typings.growingIo.growingIoStrings.clearUserId
import typings.growingIo.growingIoStrings.config
import typings.growingIo.growingIoStrings.evarDotset
import typings.growingIo.growingIoStrings.init
import typings.growingIo.growingIoStrings.pageDotset
import typings.growingIo.growingIoStrings.peopleDotset
import typings.growingIo.growingIoStrings.sendPage
import typings.growingIo.growingIoStrings.setUserId
import typings.growingIo.growingIoStrings.track
import typings.growingIo.growingIoStrings.visitDotset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrowingIO extends js.Object {
  
  /** app.set: 对于应用级变量，也就是 1.x 版本中的 CS2 - CS10, people.set: 用户级变量, page.set: 页面级变量 visit.set: 访问用户级变量, evar.set: 转化变量 */
  def apply(action: appDotset, key: String, value: String): Unit = js.native
  /** app.set: 对于应用级变量，也就是 1.x 版本中的 CS2 - CS10, people.set: 用户级变量, page.set: 页面级变量 visit.set: 访问用户级变量, evar.set: 转化变量 */
  def apply(action: appDotset, variables: GIOObjectVariables): Unit = js.native
  /** clearUserId: 清空用户信息, sendPage: 上报页面数据 */
  def apply(action: clearUserId): Unit = js.native
  /** 配置 */
  def apply(action: config, options: GIOConfigOptions): Unit = js.native
  def apply(action: evarDotset, key: String, value: String): Unit = js.native
  def apply(action: evarDotset, variables: GIOObjectVariables): Unit = js.native
  /** 初始化 */
  def apply(action: init, projectId: String): Unit = js.native
  def apply(action: init, projectId: String, options: GIOInitOptions): Unit = js.native
  def apply(action: pageDotset, key: String, value: String): Unit = js.native
  def apply(action: pageDotset, variables: GIOObjectVariables): Unit = js.native
  def apply(action: peopleDotset, key: String, value: String): Unit = js.native
  def apply(action: peopleDotset, variables: GIOObjectVariables): Unit = js.native
  def apply(action: sendPage): Unit = js.native
  /** 设置用户登录id */
  def apply(action: setUserId, userId: String): Unit = js.native
  /** 自定义埋点 */
  def apply(action: track, eventId: String): Unit = js.native
  def apply(action: track, eventId: String, numberOrVariables: Double): Unit = js.native
  def apply(action: track, eventId: String, numberOrVariables: GIOObjectVariables): Unit = js.native
  /** 自定义埋点 */
  def apply(action: track, eventId: String, number: Double, eventLevelVariables: GIOObjectVariables): Unit = js.native
  def apply(action: visitDotset, key: String, value: String): Unit = js.native
  def apply(action: visitDotset, variables: GIOObjectVariables): Unit = js.native
}
