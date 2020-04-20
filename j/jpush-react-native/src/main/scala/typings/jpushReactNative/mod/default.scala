package typings.jpushReactNative.mod

import typings.jpushReactNative.AnonAppBadge
import typings.jpushReactNative.AnonBadge
import typings.jpushReactNative.AnonChannel
import typings.jpushReactNative.AnonCode
import typings.jpushReactNative.AnonConnectEnable
import typings.jpushReactNative.AnonContent
import typings.jpushReactNative.AnonContentExtras
import typings.jpushReactNative.AnonExtras
import typings.jpushReactNative.AnonGeoFenceID
import typings.jpushReactNative.AnonGeoFenceMaxNumber
import typings.jpushReactNative.AnonMessageID
import typings.jpushReactNative.AnonNotificationMaxNumber
import typings.jpushReactNative.AnonPushTimeDays
import typings.jpushReactNative.AnonRegisterID
import typings.jpushReactNative.AnonSilenceTimeEndHour
import typings.jpushReactNative.TagtagEnableboolean
import typings.jpushReactNative.codenumberSequence
import typings.jpushReactNative.mobileNumberstringSequenc
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
  //***************************************接口回调***************************************
  //连接状态
  def addConnectEventListener(callback: Callback[AnonConnectEnable]): Unit = js.native
  /**
    * 自定义消息事件
    */
  def addCustomMessagegListener(callback: Callback[AnonContentExtras]): Unit = js.native
  //***************************************本地通知***************************************
  /**
    * 添加一个本地通知
    *
    * messageID:唯一标识通知消息的ID,可用于移除消息
    *
    * title:对应“通知标题”字段
    *
    * content:对应“通知内容”字段
    *
    * extras:对应“附加内容”字段
    *
    */
  def addLocalNotification(params: AnonContent): Unit = js.native
  /**
    * 本地通知事件
    *
    * 注意：应用在存活状态下点击通知不会有跳转行为,应用在被杀死状态下点击通知会启动应用
    */
  def addLocalNotificationListener(callback: Callback[AnonExtras]): Unit = js.native
  /**
    * 手机号码事件
    */
  def addMobileNumberListener(callback: Callback[codenumberSequence]): Unit = js.native
  /**
    * 通知事件
    *
    * 注意：应用在存活状态下点击通知不会有跳转行为,应用在被杀死状态下点击通知会启动应用
    */
  def addNotificationListener(callback: Callback[AnonBadge]): Unit = js.native
  /**
    * tag alias事件
    */
  def addTagAliasListener(callback: Callback[AnonCode with Sequence with (Tags | Alias | TagtagEnableboolean)]): Unit = js.native
  /**
    * 新增标签
    *
    * 这个接口是增加逻辑,而不是覆盖逻辑
    */
  def addTags(params: Sequence with Tags): Unit = js.native
  /**
    * 清除所有 JPush 展现的通知（不包括非 JPush SDK 展现的）
    *
    */
  def clearAllNotifications(): Unit = js.native
  /**
    * 移除所有的本地通知
    *
    */
  def clearLocalNotifications(): Unit = js.native
  /**
    * 删除指定的通知
    * */
  def clearNotificationById(params: NotificationId): Unit = js.native
  /**
    * 删除别名
    */
  def deleteAlias(params: Sequence): Unit = js.native
  /**
    * 删除指定id的地理围栏
    *
    */
  def deleteGeofence(params: AnonGeoFenceID): Unit = js.native
  /**
    * 删除指定标签
    *
    */
  def deleteTag(params: Sequence with Tags): Unit = js.native
  /**
    * 清除所有标签
    */
  def deleteTags(params: Sequence): Unit = js.native
  /**
    * 获取 RegistrationID
    *
    * 调用此 API 来取得应用程序对应的 RegistrationID。
    * 只有当应用程序成功注册到 JPush 的服务器时才返回对应的值,否则返回空字符串
    *
    */
  def getRegistrationID(callback: Callback[AnonRegisterID]): Unit = js.native
  /**
    * 初始化推送服务
    *
    * 请在componentDidMount()调用init,否则会影响通知点击事件的回调
    *
    */
  def init(): Unit = js.native
  /**
    * 开启 CrashLog 上报
    *
    */
  def initCrashHandler(): Unit = js.native
  /**
    * 检查当前应用的通知开关是否开启
    * */
  def isNotificationEnabled(callback: Callback[Boolean]): Unit = js.native
  /**
    * 用来检查 Push Service 是否已经被停止
    *
    * @platform Android
    */
  def isPushStopped(callback: Callback[Boolean]): Unit = js.native
  /**
    * 查询别名
    */
  def queryAlias(params: Sequence): Unit = js.native
  /**
    * 查询指定 tag 与当前用户绑定的状态
    */
  def queryTag(params: Sequence with Tag): Unit = js.native
  /**
    * 查询所有标签
    */
  def queryTags(params: Sequence): Unit = js.native
  //移除事件
  def removeListener(callback: js.Function): Unit = js.native
  /**
    * 移除指定的本地通知
    *
    * messageID:唯一标识通知消息的ID,可用于移除消息
    */
  def removeLocalNotification(params: AnonMessageID): Unit = js.native
  //***************************************Android Only***************************************
  /**
    * 在 Android 6.0 及以上的系统上,需要去请求一些用到的权限.
    * JPush SDK 用到的一些需要请求如下权限,因为需要这些权限使统计更加精准,功能更加丰富,建议开发者调用
    * "android.permission.READ_PHONE_STATE"
    * "android.permission.ACCESS_FINE_LOCATION"
    * "android.permission.READ_EXTERNAL_STORAGE"
    * "android.permission.WRITE_EXTERNAL_STORAGE"
    *
    * @platform Android
    */
  def requestPermission(): Unit = js.native
  /**
    * 恢复推送服务
    *
    * @platform Android
    */
  def resumePush(): Unit = js.native
  /**
    * 设置别名
    * 需要理解的是,这个接口是覆盖逻辑,而不是增量逻辑。即新的调用会覆盖之前的设置
    */
  def setAlias(params: Sequence with Alias): Unit = js.native
  //***************************************iOS Only***************************************
  /**
    * 设置 Badge
    *
    * @platform iOS
    */
  def setBadge(params: AnonAppBadge): Unit = js.native
  /**
    * 动态配置 channel,优先级比 AndroidManifest 里配置的高
    *
    * @platform Android
    */
  def setChannel(params: AnonChannel): Unit = js.native
  /**
    * 设置保留最近通知条数
    *
    * 通过极光推送,推送了很多通知到客户端时,如果用户不去处理,就会有很多保留在那里。
    * 调用此 API 可以限制保留的通知条数,默认为保留最近 5 条通知。
    *
    * 仅对通知有效。所谓保留最近的,意思是,如果有新的通知到达,之前列表里最老的那条会被移除。
    * 例如,设置为保留最近 5 条通知。假设已经有 5 条显示在通知栏,当第 6 条到达时,第 1 条将会被移除。
    *
    * @platform Android
    */
  def setLatestNotificationNumber(params: AnonNotificationMaxNumber): Unit = js.native
  /**
    * 设置调试模式,默认关闭状态
    *
    * 该接口需在 init 接口之前调用,避免出现部分日志没打印的情况
    * @param {boolean} enable
    *
    */
  def setLoggerEnable(enable: Boolean): Unit = js.native
  //***************************************地理围栏***************************************
  /**
    * 设置最多允许保存的地理围栏数量,超过最大限制后,如果继续创建先删除最早创建的地理围栏。
    * 默认数量为10个,允许设置最小1个,最大100个。
    *
    */
  def setMaxGeofenceNumber(params: AnonGeoFenceMaxNumber): Unit = js.native
  //***************************************统计***************************************
  /**
    * 设置手机号码。该接口会控制调用频率,频率为 10s 之内最多 3 次
    */
  def setMobileNumber(params: mobileNumberstringSequenc): Unit = js.native
  /**
    * JPush SDK 开启和关闭省电模式，默认为关闭。
    */
  def setPowerSaveMode(enable: Boolean): Unit = js.native
  /**
    * 设置允许推送时间
    *
    * 默认情况下用户在任何时间都允许推送。即任何时候有推送下来,客户端都会收到,并展示。
    * 开发者可以调用此 API 来设置允许推送的时间。
    * 如果不在该时间段内收到消息,SDK 的处理是：推送到的通知会被扔掉。
    *
    * 这是一个纯粹客户端的实现,所以与客户端时间是否准确、时区等这些,都没有关系。
    * 而且该接口仅对通知有效,自定义消息不受影响。
    *
    * @platform Android
    */
  def setPushTime(params: AnonPushTimeDays): Unit = js.native
  /**
    * 设置通知静默时间
    *
    * 默认情况下用户在收到推送通知时,客户端可能会有震动,响铃等提示。
    * 但用户在睡觉、开会等时间点希望为“免打扰”模式,也是静音时段的概念。
    * 开发者可以调用此 API 来设置静音时段。如果在该时间段内收到消息,则：不会有铃声和震动。
    *
    * @platform Android
    */
  def setSilenceTime(params: AnonSilenceTimeEndHour): Unit = js.native
  /**
    * 停止推送服务
    *
    * @platform Android
    */
  def stopPush(): Unit = js.native
  /**
    * 覆盖标签
    *
    * 需要理解的是,这个接口是覆盖逻辑,而不是增量逻辑。即新的调用会覆盖之前的设置
    */
  def updateTags(params: Sequence with Tags): Unit = js.native
}

