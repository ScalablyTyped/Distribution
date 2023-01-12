package typings.html5plus

import typings.html5plus.html5plusStrings.none
import typings.html5plus.html5plusStrings.system
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，获客户端创建本地消息的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
  */
trait PlusPushMessageOptions extends StObject {
  
  /**
    * 要启动流应用的appid
    * 默认值为当前流应用的appid。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var appid: js.UndefOr[String] = js.undefined
  
  /**
    * 是否覆盖上一次提示的消息
    * 可取值true或false，true为覆盖，false不覆盖，默认为permission中设置的cover值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var cover: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 提示消息延迟显示的时间
    * 当设备接收到推送消息后，可不立即显示，而是延迟一段时间显示，延迟时间单位为s，默认为0s，立即显示。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var delay: js.UndefOr[Double] = js.undefined
  
  /**
    * 推送消息的图标
    * 本地图片地址，相对路径 - 相对于当前页面的host位置，如"a.jpg"，注意当前页面为网络地址则不支持； 绝对路径 - 系统绝对路径，如Android平台"/sdcard/logo.png"，此类路径通常通过其它5+ API获取的； 扩展相对路径URL(RelativeURL) - 以"_"开头的相对路径，如"_www/a.jpg"； 本地路径URL - 以“file://”开头，后面跟随系统绝对路径。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * 推送消息的提示音
    * 显示消息时的播放的提示音，可取值：
    *     “system”-表示使用系统通知提示音；
    *     “none”-表示不使用提示音；
    *     默认值为“system”。
    * - system: 使用系统通知提示音
    * - none: 不使用提示音
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var sound: js.UndefOr[system | none] = js.undefined
  
  /**
    * 推送消息的标题
    * 在系统消息中心显示的通知消息标题，默认值为程序的名称。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * 消息上显示的提示时间
    * 默认为当前时间，如果延迟显示则使用延时后显示消息的时间。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var when: js.UndefOr[js.Date] = js.undefined
}
object PlusPushMessageOptions {
  
  inline def apply(): PlusPushMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusPushMessageOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlusPushMessageOptions] (val x: Self) extends AnyVal {
    
    inline def setAppid(value: String): Self = StObject.set(x, "appid", value.asInstanceOf[js.Any])
    
    inline def setAppidUndefined: Self = StObject.set(x, "appid", js.undefined)
    
    inline def setCover(value: Boolean): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
    
    inline def setCoverUndefined: Self = StObject.set(x, "cover", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setSound(value: system | none): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
    
    inline def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setWhen(value: js.Date): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
    
    inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
  }
}
