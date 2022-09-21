package typings.jpushReactNative

import org.scalablytyped.runtime.StringDictionary
import typings.jpushReactNative.anon.AliascodenumberSequence
import typings.jpushReactNative.anon.AppBadge
import typings.jpushReactNative.anon.AppKey
import typings.jpushReactNative.anon.Badge
import typings.jpushReactNative.anon.Channel
import typings.jpushReactNative.anon.ConnectEnable
import typings.jpushReactNative.anon.Content
import typings.jpushReactNative.anon.ContentExtras
import typings.jpushReactNative.anon.Extras
import typings.jpushReactNative.anon.GeoFenceID
import typings.jpushReactNative.anon.GeoFenceMaxNumber
import typings.jpushReactNative.anon.MessageID
import typings.jpushReactNative.anon.NotificationMaxNumber
import typings.jpushReactNative.anon.PushTimeDays
import typings.jpushReactNative.anon.RegisterID
import typings.jpushReactNative.anon.SilenceTimeEndHour
import typings.jpushReactNative.anon.TagscodenumberSequence
import typings.jpushReactNative.anon.TagtagEnablebooleancodenu
import typings.jpushReactNative.anon.codenumberSequence
import typings.jpushReactNative.anon.mobileNumberstringSequenc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jpush-react-native", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with JPush
  /* static members */
  object default {
    
    @JSImport("jpush-react-native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    //***************************************接口回调***************************************
    //连接状态
    inline def addConnectEventListener(callback: Callback[ConnectEnable]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addConnectEventListener")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 自定义消息事件
      */
    inline def addCustomMessageListener(callback: Callback[ContentExtras]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addCustomMessageListener")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    inline def addLocalNotification(params: Content): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addLocalNotification")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 本地通知事件
      *
      * 注意：应用在存活状态下点击通知不会有跳转行为,应用在被杀死状态下点击通知会启动应用
      */
    inline def addLocalNotificationListener(callback: Callback[Extras]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addLocalNotificationListener")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 手机号码事件
      */
    inline def addMobileNumberListener(callback: Callback[codenumberSequence]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMobileNumberListener")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 通知事件
      *
      * 注意：应用在存活状态下点击通知不会有跳转行为,应用在被杀死状态下点击通知会启动应用
      */
    inline def addNotificationListener(callback: Callback[Badge]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addNotificationListener")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * tag alias事件
      */
    inline def addTagAliasListener(callback: Callback[TagscodenumberSequence | AliascodenumberSequence | TagtagEnablebooleancodenu]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addTagAliasListener")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 新增标签
      *
      * 这个接口是增加逻辑,而不是覆盖逻辑
      */
    inline def addTags(params: Sequence & Tags): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addTags")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 清除所有 JPush 展现的通知（不包括非 JPush SDK 展现的）
      *
      */
    inline def clearAllNotifications(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearAllNotifications")().asInstanceOf[Unit]
    
    /**
      * 移除所有的本地通知
      *
      */
    inline def clearLocalNotifications(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearLocalNotifications")().asInstanceOf[Unit]
    
    /**
      * 删除指定的通知
      * */
    inline def clearNotificationById(params: NotificationId): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearNotificationById")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 删除别名
      */
    inline def deleteAlias(params: Sequence): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteAlias")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 删除指定id的地理围栏
      *
      */
    inline def deleteGeofence(params: GeoFenceID): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteGeofence")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 删除指定标签
      *
      */
    inline def deleteTag(params: Sequence & Tags): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteTag")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 清除所有标签
      */
    inline def deleteTags(params: Sequence): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteTags")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 获取 RegistrationID
      *
      * 调用此 API 来取得应用程序对应的 RegistrationID。
      * 只有当应用程序成功注册到 JPush 的服务器时才返回对应的值,否则返回空字符串
      *
      */
    inline def getRegistrationID(callback: Callback[RegisterID]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegistrationID")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 初始化推送服务
      * {"appKey":"","channel":"dev","production":1}
      * 请在componentDidMount()调用init,否则会影响通知点击事件的回调
      *
      */
    inline def init(params: AppKey): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 开启 CrashLog 上报
      *
      */
    inline def initCrashHandler(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initCrashHandler")().asInstanceOf[Unit]
    
    /**
      * 检查当前应用的通知开关是否开启
      * */
    inline def isNotificationEnabled(callback: Callback[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotificationEnabled")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 用来检查 Push Service 是否已经被停止
      *
      * @platform Android
      */
    inline def isPushStopped(callback: Callback[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isPushStopped")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 查询别名
      */
    inline def queryAlias(params: Sequence): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("queryAlias")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 查询指定 tag 与当前用户绑定的状态
      */
    inline def queryTag(params: Sequence & Tag): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("queryTag")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 查询所有标签
      */
    inline def queryTags(params: Sequence): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("queryTags")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    //移除事件
    inline def removeListener(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 移除指定的本地通知
      *
      * messageID:唯一标识通知消息的ID,可用于移除消息
      */
    inline def removeLocalNotification(params: MessageID): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeLocalNotification")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    inline def requestPermission(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("requestPermission")().asInstanceOf[Unit]
    
    /**
      * 恢复推送服务
      *
      * @platform Android
      */
    inline def resumePush(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resumePush")().asInstanceOf[Unit]
    
    /**
      * 设置别名
      * 需要理解的是,这个接口是覆盖逻辑,而不是增量逻辑。即新的调用会覆盖之前的设置
      */
    inline def setAlias(params: Sequence & Alias): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAlias")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    //***************************************iOS Only***************************************
    /**
      * 设置 Badge
      *
      * @platform iOS
      */
    inline def setBadge(params: AppBadge): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBadge")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 动态配置 channel,优先级比 AndroidManifest 里配置的高
      *
      * @platform Android
      */
    inline def setChannel(params: Channel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setChannel")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    inline def setLatestNotificationNumber(params: NotificationMaxNumber): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLatestNotificationNumber")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 设置调试模式,默认关闭状态
      *
      * 该接口需在 init 接口之前调用,避免出现部分日志没打印的情况
      * @param {boolean} enable
      *
      */
    inline def setLoggerEnable(enable: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLoggerEnable")(enable.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    //***************************************地理围栏***************************************
    /**
      * 设置最多允许保存的地理围栏数量,超过最大限制后,如果继续创建先删除最早创建的地理围栏。
      * 默认数量为10个,允许设置最小1个,最大100个。
      *
      */
    inline def setMaxGeofenceNumber(params: GeoFenceMaxNumber): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMaxGeofenceNumber")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    //***************************************统计***************************************
    /**
      * 设置手机号码。该接口会控制调用频率,频率为 10s 之内最多 3 次
      */
    inline def setMobileNumber(params: mobileNumberstringSequenc): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMobileNumber")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * JPush SDK 开启和关闭省电模式，默认为关闭。
      */
    inline def setPowerSaveMode(enable: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPowerSaveMode")(enable.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    inline def setPushTime(params: PushTimeDays): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPushTime")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 设置通知静默时间
      *
      * 默认情况下用户在收到推送通知时,客户端可能会有震动,响铃等提示。
      * 但用户在睡觉、开会等时间点希望为“免打扰”模式,也是静音时段的概念。
      * 开发者可以调用此 API 来设置静音时段。如果在该时间段内收到消息,则：不会有铃声和震动。
      *
      * @platform Android
      */
    inline def setSilenceTime(params: SilenceTimeEndHour): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSilenceTime")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 停止推送服务
      *
      * @platform Android
      */
    inline def stopPush(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopPush")().asInstanceOf[Unit]
    
    /**
      * 覆盖标签
      *
      * 需要理解的是,这个接口是覆盖逻辑,而不是增量逻辑。即新的调用会覆盖之前的设置
      */
    inline def updateTags(params: Sequence & Tags): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateTags")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  trait Alias extends StObject {
    
    /**
      * 有效的别名组成：字母（区分大小写）、数字、下划线、汉字、特殊字符@!#$&*+=.|
      * 限制：alias 命名长度限制为 40 字节。（判断长度需采用 UTF-8 编码）
      */
    var alias: String
  }
  object Alias {
    
    inline def apply(alias: String): Alias = {
      val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alias]
    }
    
    extension [Self <: Alias](x: Self) {
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    }
  }
  
  type Callback[T] = js.Function1[/* result */ T, Unit]
  
  type Extra = StringDictionary[String]
  
  trait JPush extends StObject
  
  trait NotificationId extends StObject {
    
    /**
      * 通知 ID
      * */
    var notificationId: String
  }
  object NotificationId {
    
    inline def apply(notificationId: String): NotificationId = {
      val __obj = js.Dynamic.literal(notificationId = notificationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationId]
    }
    
    extension [Self <: NotificationId](x: Self) {
      
      inline def setNotificationId(value: String): Self = StObject.set(x, "notificationId", value.asInstanceOf[js.Any])
    }
  }
  
  trait Sequence extends StObject {
    
    /**
      * 请求时传入的序列号,会在回调时原样返回
      */
    var sequence: Double
  }
  object Sequence {
    
    inline def apply(sequence: Double): Sequence = {
      val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sequence]
    }
    
    extension [Self <: Sequence](x: Self) {
      
      inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    }
  }
  
  trait Tag extends StObject {
    
    /**
      * 有效的标签组成：字母（区分大小写）、数字、下划线、汉字、特殊字符@!#$&*+=.|
      * 限制：每个 tag 命名长度限制为 40 字节,最多支持设置 1000 个 tag,且单次操作总长度不得超过 5000 字节
      *（判断长度需采用 UTF-8 编码）单个设备最多支持设置 1000 个 tag。App 全局 tag 数量无限制
      */
    var tag: String
  }
  object Tag {
    
    inline def apply(tag: String): Tag = {
      val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tag]
    }
    
    extension [Self <: Tag](x: Self) {
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  trait Tags extends StObject {
    
    /**
      * 有效的标签组成：字母（区分大小写）、数字、下划线、汉字、特殊字符@!#$&*+=.|
      * 限制：每个 tag 命名长度限制为 40 字节,最多支持设置 1000 个 tag,且单次操作总长度不得超过 5000 字节
      *（判断长度需采用 UTF-8 编码）单个设备最多支持设置 1000 个 tag。App 全局 tag 数量无限制
      */
    var tags: js.Array[String]
  }
  object Tags {
    
    inline def apply(tags: js.Array[String]): Tags = {
      val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tags]
    }
    
    extension [Self <: Tags](x: Self) {
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
}
