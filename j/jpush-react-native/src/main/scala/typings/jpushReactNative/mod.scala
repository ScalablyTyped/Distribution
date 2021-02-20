package typings.jpushReactNative

import org.scalablytyped.runtime.StringDictionary
import typings.jpushReactNative.anon.AppBadge
import typings.jpushReactNative.anon.Badge
import typings.jpushReactNative.anon.Channel
import typings.jpushReactNative.anon.Code
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
import typings.jpushReactNative.anon.TagtagEnableboolean
import typings.jpushReactNative.anon.codenumberSequence
import typings.jpushReactNative.anon.mobileNumberstringSequenc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jpush-react-native", JSImport.Default)
  @js.native
  class default () extends JPush
  /* static members */
  object default {
    
    //***************************************接口回调***************************************
    //连接状态
    @JSImport("jpush-react-native", "default.addConnectEventListener")
    @js.native
    def addConnectEventListener(callback: Callback[ConnectEnable]): Unit = js.native
    
    /**
      * 自定义消息事件
      */
    @JSImport("jpush-react-native", "default.addCustomMessagegListener")
    @js.native
    def addCustomMessagegListener(callback: Callback[ContentExtras]): Unit = js.native
    
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
    @JSImport("jpush-react-native", "default.addLocalNotification")
    @js.native
    def addLocalNotification(params: Content): Unit = js.native
    
    /**
      * 本地通知事件
      *
      * 注意：应用在存活状态下点击通知不会有跳转行为,应用在被杀死状态下点击通知会启动应用
      */
    @JSImport("jpush-react-native", "default.addLocalNotificationListener")
    @js.native
    def addLocalNotificationListener(callback: Callback[Extras]): Unit = js.native
    
    /**
      * 手机号码事件
      */
    @JSImport("jpush-react-native", "default.addMobileNumberListener")
    @js.native
    def addMobileNumberListener(callback: Callback[codenumberSequence]): Unit = js.native
    
    /**
      * 通知事件
      *
      * 注意：应用在存活状态下点击通知不会有跳转行为,应用在被杀死状态下点击通知会启动应用
      */
    @JSImport("jpush-react-native", "default.addNotificationListener")
    @js.native
    def addNotificationListener(callback: Callback[Badge]): Unit = js.native
    
    /**
      * tag alias事件
      */
    @JSImport("jpush-react-native", "default.addTagAliasListener")
    @js.native
    def addTagAliasListener(callback: Callback[Code with Sequence with (Tags | Alias | TagtagEnableboolean)]): Unit = js.native
    
    /**
      * 新增标签
      *
      * 这个接口是增加逻辑,而不是覆盖逻辑
      */
    @JSImport("jpush-react-native", "default.addTags")
    @js.native
    def addTags(params: Sequence with Tags): Unit = js.native
    
    /**
      * 清除所有 JPush 展现的通知（不包括非 JPush SDK 展现的）
      *
      */
    @JSImport("jpush-react-native", "default.clearAllNotifications")
    @js.native
    def clearAllNotifications(): Unit = js.native
    
    /**
      * 移除所有的本地通知
      *
      */
    @JSImport("jpush-react-native", "default.clearLocalNotifications")
    @js.native
    def clearLocalNotifications(): Unit = js.native
    
    /**
      * 删除指定的通知
      * */
    @JSImport("jpush-react-native", "default.clearNotificationById")
    @js.native
    def clearNotificationById(params: NotificationId): Unit = js.native
    
    /**
      * 删除别名
      */
    @JSImport("jpush-react-native", "default.deleteAlias")
    @js.native
    def deleteAlias(params: Sequence): Unit = js.native
    
    /**
      * 删除指定id的地理围栏
      *
      */
    @JSImport("jpush-react-native", "default.deleteGeofence")
    @js.native
    def deleteGeofence(params: GeoFenceID): Unit = js.native
    
    /**
      * 删除指定标签
      *
      */
    @JSImport("jpush-react-native", "default.deleteTag")
    @js.native
    def deleteTag(params: Sequence with Tags): Unit = js.native
    
    /**
      * 清除所有标签
      */
    @JSImport("jpush-react-native", "default.deleteTags")
    @js.native
    def deleteTags(params: Sequence): Unit = js.native
    
    /**
      * 获取 RegistrationID
      *
      * 调用此 API 来取得应用程序对应的 RegistrationID。
      * 只有当应用程序成功注册到 JPush 的服务器时才返回对应的值,否则返回空字符串
      *
      */
    @JSImport("jpush-react-native", "default.getRegistrationID")
    @js.native
    def getRegistrationID(callback: Callback[RegisterID]): Unit = js.native
    
    /**
      * 初始化推送服务
      *
      * 请在componentDidMount()调用init,否则会影响通知点击事件的回调
      *
      */
    @JSImport("jpush-react-native", "default.init")
    @js.native
    def init(): Unit = js.native
    
    /**
      * 开启 CrashLog 上报
      *
      */
    @JSImport("jpush-react-native", "default.initCrashHandler")
    @js.native
    def initCrashHandler(): Unit = js.native
    
    /**
      * 检查当前应用的通知开关是否开启
      * */
    @JSImport("jpush-react-native", "default.isNotificationEnabled")
    @js.native
    def isNotificationEnabled(callback: Callback[Boolean]): Unit = js.native
    
    /**
      * 用来检查 Push Service 是否已经被停止
      *
      * @platform Android
      */
    @JSImport("jpush-react-native", "default.isPushStopped")
    @js.native
    def isPushStopped(callback: Callback[Boolean]): Unit = js.native
    
    /**
      * 查询别名
      */
    @JSImport("jpush-react-native", "default.queryAlias")
    @js.native
    def queryAlias(params: Sequence): Unit = js.native
    
    /**
      * 查询指定 tag 与当前用户绑定的状态
      */
    @JSImport("jpush-react-native", "default.queryTag")
    @js.native
    def queryTag(params: Sequence with Tag): Unit = js.native
    
    /**
      * 查询所有标签
      */
    @JSImport("jpush-react-native", "default.queryTags")
    @js.native
    def queryTags(params: Sequence): Unit = js.native
    
    //移除事件
    @JSImport("jpush-react-native", "default.removeListener")
    @js.native
    def removeListener(callback: js.Function): Unit = js.native
    
    /**
      * 移除指定的本地通知
      *
      * messageID:唯一标识通知消息的ID,可用于移除消息
      */
    @JSImport("jpush-react-native", "default.removeLocalNotification")
    @js.native
    def removeLocalNotification(params: MessageID): Unit = js.native
    
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
    @JSImport("jpush-react-native", "default.requestPermission")
    @js.native
    def requestPermission(): Unit = js.native
    
    /**
      * 恢复推送服务
      *
      * @platform Android
      */
    @JSImport("jpush-react-native", "default.resumePush")
    @js.native
    def resumePush(): Unit = js.native
    
    /**
      * 设置别名
      * 需要理解的是,这个接口是覆盖逻辑,而不是增量逻辑。即新的调用会覆盖之前的设置
      */
    @JSImport("jpush-react-native", "default.setAlias")
    @js.native
    def setAlias(params: Sequence with Alias): Unit = js.native
    
    //***************************************iOS Only***************************************
    /**
      * 设置 Badge
      *
      * @platform iOS
      */
    @JSImport("jpush-react-native", "default.setBadge")
    @js.native
    def setBadge(params: AppBadge): Unit = js.native
    
    /**
      * 动态配置 channel,优先级比 AndroidManifest 里配置的高
      *
      * @platform Android
      */
    @JSImport("jpush-react-native", "default.setChannel")
    @js.native
    def setChannel(params: Channel): Unit = js.native
    
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
    @JSImport("jpush-react-native", "default.setLatestNotificationNumber")
    @js.native
    def setLatestNotificationNumber(params: NotificationMaxNumber): Unit = js.native
    
    /**
      * 设置调试模式,默认关闭状态
      *
      * 该接口需在 init 接口之前调用,避免出现部分日志没打印的情况
      * @param {boolean} enable
      *
      */
    @JSImport("jpush-react-native", "default.setLoggerEnable")
    @js.native
    def setLoggerEnable(enable: Boolean): Unit = js.native
    
    //***************************************地理围栏***************************************
    /**
      * 设置最多允许保存的地理围栏数量,超过最大限制后,如果继续创建先删除最早创建的地理围栏。
      * 默认数量为10个,允许设置最小1个,最大100个。
      *
      */
    @JSImport("jpush-react-native", "default.setMaxGeofenceNumber")
    @js.native
    def setMaxGeofenceNumber(params: GeoFenceMaxNumber): Unit = js.native
    
    //***************************************统计***************************************
    /**
      * 设置手机号码。该接口会控制调用频率,频率为 10s 之内最多 3 次
      */
    @JSImport("jpush-react-native", "default.setMobileNumber")
    @js.native
    def setMobileNumber(params: mobileNumberstringSequenc): Unit = js.native
    
    /**
      * JPush SDK 开启和关闭省电模式，默认为关闭。
      */
    @JSImport("jpush-react-native", "default.setPowerSaveMode")
    @js.native
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
    @JSImport("jpush-react-native", "default.setPushTime")
    @js.native
    def setPushTime(params: PushTimeDays): Unit = js.native
    
    /**
      * 设置通知静默时间
      *
      * 默认情况下用户在收到推送通知时,客户端可能会有震动,响铃等提示。
      * 但用户在睡觉、开会等时间点希望为“免打扰”模式,也是静音时段的概念。
      * 开发者可以调用此 API 来设置静音时段。如果在该时间段内收到消息,则：不会有铃声和震动。
      *
      * @platform Android
      */
    @JSImport("jpush-react-native", "default.setSilenceTime")
    @js.native
    def setSilenceTime(params: SilenceTimeEndHour): Unit = js.native
    
    /**
      * 停止推送服务
      *
      * @platform Android
      */
    @JSImport("jpush-react-native", "default.stopPush")
    @js.native
    def stopPush(): Unit = js.native
    
    /**
      * 覆盖标签
      *
      * 需要理解的是,这个接口是覆盖逻辑,而不是增量逻辑。即新的调用会覆盖之前的设置
      */
    @JSImport("jpush-react-native", "default.updateTags")
    @js.native
    def updateTags(params: Sequence with Tags): Unit = js.native
  }
  
  @js.native
  trait Alias extends StObject {
    
    /**
      * 有效的别名组成：字母（区分大小写）、数字、下划线、汉字、特殊字符@!#$&*+=.|
      * 限制：alias 命名长度限制为 40 字节。（判断长度需采用 UTF-8 编码）
      */
    var alias: String = js.native
  }
  object Alias {
    
    @scala.inline
    def apply(alias: String): Alias = {
      val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alias]
    }
    
    @scala.inline
    implicit class AliasMutableBuilder[Self <: Alias] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    }
  }
  
  type Callback[T] = js.Function1[/* result */ T, Unit]
  
  type Extra = StringDictionary[String]
  
  @js.native
  trait JPush extends StObject
  
  @js.native
  trait NotificationId extends StObject {
    
    /**
      * 通知 ID
      * */
    var notificationId: String = js.native
  }
  object NotificationId {
    
    @scala.inline
    def apply(notificationId: String): NotificationId = {
      val __obj = js.Dynamic.literal(notificationId = notificationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationId]
    }
    
    @scala.inline
    implicit class NotificationIdMutableBuilder[Self <: NotificationId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNotificationId(value: String): Self = StObject.set(x, "notificationId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Sequence extends StObject {
    
    /**
      * 请求时传入的序列号,会在回调时原样返回
      */
    var sequence: Double = js.native
  }
  object Sequence {
    
    @scala.inline
    def apply(sequence: Double): Sequence = {
      val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sequence]
    }
    
    @scala.inline
    implicit class SequenceMutableBuilder[Self <: Sequence] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Tag extends StObject {
    
    /**
      * 有效的标签组成：字母（区分大小写）、数字、下划线、汉字、特殊字符@!#$&*+=.|
      * 限制：每个 tag 命名长度限制为 40 字节,最多支持设置 1000 个 tag,且单次操作总长度不得超过 5000 字节
      *（判断长度需采用 UTF-8 编码）单个设备最多支持设置 1000 个 tag。App 全局 tag 数量无限制
      */
    var tag: String = js.native
  }
  object Tag {
    
    @scala.inline
    def apply(tag: String): Tag = {
      val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tag]
    }
    
    @scala.inline
    implicit class TagMutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Tags extends StObject {
    
    /**
      * 有效的标签组成：字母（区分大小写）、数字、下划线、汉字、特殊字符@!#$&*+=.|
      * 限制：每个 tag 命名长度限制为 40 字节,最多支持设置 1000 个 tag,且单次操作总长度不得超过 5000 字节
      *（判断长度需采用 UTF-8 编码）单个设备最多支持设置 1000 个 tag。App 全局 tag 数量无限制
      */
    var tags: js.Array[String] = js.native
  }
  object Tags {
    
    @scala.inline
    def apply(tags: js.Array[String]): Tags = {
      val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tags]
    }
    
    @scala.inline
    implicit class TagsMutableBuilder[Self <: Tags] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
}
