package typings.jpushDashReactDashNative.jpushDashReactDashNativeMod

import typings.jpushDashReactDashNative.Anon_Alias
import typings.jpushDashReactDashNative.Anon_IsBind
import typings.jpushDashReactDashNative.Anon_Tags
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jpush-react-native", JSImport.Default)
@js.native
class default () extends JPush

/* static members */
@JSImport("jpush-react-native", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * 监听：连接状态变更
    */
  def addConnectionChangeListener(cb: JSuccessCallback[Boolean]): Unit = js.native
  /**
    * Android Only
    *
    * If device register succeed, the server will return registrationId
    */
  def addGetRegistrationIdListener(cb: JSuccessCallback[String]): Unit = js.native
  /**
    * iOS Only
    */
  def addOpenNotificationLaunchAppListener(cb: JSuccessCallback[String]): Unit = js.native
  /**
    * Android Only
    */
  def addReceiveCustomMsgListener(cb: JSuccessCallback[_]): Unit = js.native
  /**
    * 监听：接收推送事件
    */
  def addReceiveNotificationListener(cb: JSuccessCallback[_]): Unit = js.native
  /**
    * 监听：点击推送事件
    */
  def addReceiveOpenNotificationListener(cb: JSuccessCallback[_]): Unit = js.native
  /**
    * 在原有 tags 的基础上添加 tags
    */
  def addTags(tags: js.Array[String], callback: JFailCallback | JSuccessCallback[Anon_Tags]): Unit = js.native
  /**
    * iOS Only
    *
    * 监听：应用连接已登录
    */
  def addnetworkDidLoginListener(cb: JSuccessCallback[String]): Unit = js.native
  /**
    * 检查当前设备是否绑定该 tag
    */
  def checkTagBindState(tags: String, callback: JFailCallback | JSuccessCallback[Anon_IsBind]): Unit = js.native
  /**
    * 清空所有 tags
    */
  def cleanTags(callback: JFailCallback | JSuccessCallback[Anon_Tags]): Unit = js.native
  def clearAllNotifications(): Unit = js.native
  /**
    * Android Only
    */
  def clearNotificationById(id: String): Unit = js.native
  /**
    * 删除原有 alias
    */
  def deleteAlias(callback: JFailCallback | JSuccessCallback[Anon_Alias]): Unit = js.native
  /**
    * 删除指定的 tags
    */
  def deleteTags(tags: js.Array[String], callback: JFailCallback | JSuccessCallback[Anon_Tags]): Unit = js.native
  /**
    * Android Only
    */
  def finishActivity(): Unit = js.native
  /**
    * 获取当前设备 alias
    */
  def getAlias(callback: JFailCallback | JSuccessCallback[Anon_Alias]): Unit = js.native
  /**
    * 获取所有已有标签
    */
  def getAllTags(callback: JFailCallback | JSuccessCallback[Anon_Tags]): Unit = js.native
  /**
    * iOS Only
    */
  def getAppkeyWithcallback(cb: JSuccessCallback[String]): Unit = js.native
  /**
    * iOS Only
    */
  def getBadge(cb: JSuccessCallback[Double]): Unit = js.native
  /**
    * 获取当前连接状态
    * 如果连接状态变更为已连接返回 true
    * 如果连接状态变更为断开连接连接返回 false
    */
  def getConnectionState(cb: JResultCallback[Boolean]): Unit = js.native
  /**
    * Android Only
    */
  def getInfo(cb: js.Function1[/* infoMap */ JInfoMap, Unit]): Unit = js.native
  /**
    * iOS Onlylalala
    */
  def getLaunchAppNotification(cb: JSuccessCallback[String]): Unit = js.native
  /**
    * 获取 RegistrationId
    */
  def getRegistrationID(cb: JSuccessCallback[Double]): Unit = js.native
  /**
    * iOS Only
    * 获取应用是否有推送权限
    */
  def hasPermission(cb: JResultCallback[Boolean]): Unit = js.native
  /**
    * 初始化JPush 必须先初始化才能执行其他操作
    */
  def initPush(): Unit = js.native
  /**
    * Android Only
    */
  def jumpToPushActivity(activityName: String): Unit = js.native
  /**
    * Android Only
    */
  def notifyJSDidLoad(cb: JResultCallback[Double]): Unit = js.native
  /**
    * 监听：连接状态变更
    */
  def removeConnectionChangeListener(cb: JSuccessCallback[Boolean]): Unit = js.native
  /**
    * Android Only
    */
  def removeGetRegistrationIdListener(cb: JSuccessCallback[js.UndefOr[scala.Nothing]]): Unit = js.native
  /**
    * iOS Only
    */
  def removeOpenNotificationLaunchAppEventListener(cb: JSuccessCallback[js.UndefOr[scala.Nothing]]): Unit = js.native
  /**
    * Android Only
    */
  def removeReceiveCustomMsgListener(cb: JSuccessCallback[_]): Unit = js.native
  /**
    * 取消监听：接收推送事件
    */
  def removeReceiveNotificationListener(cb: JSuccessCallback[js.UndefOr[scala.Nothing]]): Unit = js.native
  /**
    * 取消监听：点击推送事件
    */
  def removeReceiveOpenNotificationListener(cb: JSuccessCallback[js.UndefOr[scala.Nothing]]): Unit = js.native
  /**
    * iOS Only
    *
    * 取消监听：应用连接已登录
    */
  def removenetworkDidLoginListener(cb: JSuccessCallback[js.UndefOr[scala.Nothing]]): Unit = js.native
  def resumePush(): Unit = js.native
  /**
  	 * @param {Object} notification = {
  	 	  'buildId': Number     // 设置通知样式，1 为基础样式，2 为自定义样式。自定义样式需要先调用 setStyleCustom 接口设置自定义样式。(Android Only)
  	 *    'id': Number    		// 通知的 id, 可用于取消通知
  	 *    'title': String 		// 通知标题
  	 *    'content': String  	// 通知内容
  	 *	  'extra': Object       // extra 字段
  	 *    'fireTime': Number    // 通知触发时间的时间戳（毫秒）
  	 * 	  'badge': Number       // 本地推送触发后应用角标的 badge 值  （iOS Only）
  	 *    'soundName': String   // 指定推送的音频文件 （iOS Only）
    *    'subtitle': String    // 子标题 （iOS10+ Only）
  	 *  }
  	 */
  def sendLocalNotification(notification: LocalNotificationOptions): Unit = js.native
  /**
    * 重置 alias
    */
  def setAlias(alias: String, callback: JFailCallback | JSuccessCallback[Anon_Alias]): Unit = js.native
  /**
    * iOS Only
    * 设置应用 Badge（小红点）
    */
  def setBadge(badge: Double, callback: JSuccessCallback[js.Array[Double]]): Unit = js.native
  /**
    * Android Only
    */
  def setGeofenceInterval(interval: Double): Unit = js.native
  /**
    * Android Only
    */
  def setLatestNotificationNumber(maxNumber: Double): Unit = js.native
  /**
    * iOS Only
    * 设置本地推送
    * @param {Date} date  触发本地推送的时间
    * @param {String} textContain 推送消息体内容
    * @param {Int} badge  本地推送触发后 应用 Badge（小红点）显示的数字
    * @param {String} alertAction 弹框的按钮显示的内容（IOS 8默认为"打开", 其他默认为"启动"）
    * @param {String} notificationKey  本地推送标示符
    * @param {Object} userInfo 推送的附加字段 选填
    * @param {String} soundName 自定义通知声音，设置为 null 为默认声音
    */
  def setLocalNotification(date: Date, alertBody: String): Unit = js.native
  def setLocalNotification(date: Date, alertBody: String, badge: Double): Unit = js.native
  def setLocalNotification(date: Date, alertBody: String, badge: Double, alertAction: String): Unit = js.native
  def setLocalNotification(date: Date, alertBody: String, badge: Double, alertAction: String, notificationKey: String): Unit = js.native
  def setLocalNotification(
    date: Date,
    alertBody: String,
    badge: Double,
    alertAction: String,
    notificationKey: String,
    userInfo: js.Any
  ): Unit = js.native
  def setLocalNotification(
    date: Date,
    alertBody: String,
    badge: Double,
    alertAction: String,
    notificationKey: String,
    userInfo: js.Any,
    soundName: String
  ): Unit = js.native
  /**
    * Android Only
    */
  def setMaxGeofenceNumber(maxNumber: Double): Unit = js.native
  /**
    * Android Only
    * @param {object} config = {"days": Array, "startHour": Number, "endHour": Number}
    * // 例如：{days: [0, 6], startHour: 8, endHour: 23} 表示星期天和星期六的上午 8 点到晚上 11 点都可以推送
    */
  def setPushTime(config: js.Object): Unit = js.native
  /**
    * Android Only
    * @param {object} config = {"startTime": String, "endTime": String}  // 例如：{startTime: "20:30", endTime: "8:30"}
    */
  def setSilenceTime(config: js.Object): Unit = js.native
  /**
    * Android Only
    */
  def setStyleBasic(): Unit = js.native
  /**
    * Android Only
    */
  def setStyleCustom(): Unit = js.native
  /**
    * 重新设置 Tag
    */
  def setTags(tags: js.Array[String], callback: JFailCallback | JSuccessCallback[Anon_Tags]): Unit = js.native
  /**
    * iOS Only
    * 初始化 JPush SDK 代码,
    * NOTE: 如果已经在原生 SDK 中添加初始化代码则无需再调用 （通过脚本配置，会自动在原生中添加初始化，无需额外调用）
    */
  def setupPush(): Unit = js.native
  def stopPush(): Unit = js.native
}

