package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Push模块管理推送消息功能，可以实现在线、离线的消息推送，通过plus.push可获取推送消息管理对象。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
  */
@js.native
trait PlusPush extends StObject {
  
  /**
    * JSON对象，获取的客户端标识信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var ClientInfo: js.UndefOr[PlusPushClientInfo] = js.native
  
  /**
    * JSON对象，获客户端创建本地消息的参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var MessageOptions: js.UndefOr[PlusPushMessageOptions] = js.native
  
  /**
    * JSON对象，推送消息对象
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var PushMessage: js.UndefOr[PlusPushPushMessage] = js.native
  
  /**
    * 添加推送消息事件监听器
    * 添加推送消息事件监听器，当指定推送事件发出时触发。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  def addEventListener(): Unit = js.native
  def addEventListener(`type`: String): Unit = js.native
  def addEventListener(`type`: String, listener: js.Function1[/* result */ String, Unit]): Unit = js.native
  def addEventListener(`type`: String, listener: js.Function1[/* result */ String, Unit], capture: Boolean): Unit = js.native
  def addEventListener(`type`: String, listener: Unit, capture: Boolean): Unit = js.native
  def addEventListener(`type`: Unit, listener: js.Function1[/* result */ String, Unit]): Unit = js.native
  def addEventListener(`type`: Unit, listener: js.Function1[/* result */ String, Unit], capture: Boolean): Unit = js.native
  def addEventListener(`type`: Unit, listener: Unit, capture: Boolean): Unit = js.native
  
  /**
    * 清空所有推送消息
    * 清空系统消息中心所有的推送消息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  def clear(): Unit = js.native
  
  /**
    * 创建本地消息
    * 在本地直接创建推送消息，并添加到系统消息中心。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  def createMessage(): Unit = js.native
  def createMessage(content: String): Unit = js.native
  def createMessage(content: String, payload: String): Unit = js.native
  def createMessage(content: String, payload: String, options: PlusPushMessageOptions): Unit = js.native
  def createMessage(content: String, payload: Unit, options: PlusPushMessageOptions): Unit = js.native
  def createMessage(content: Unit, payload: String): Unit = js.native
  def createMessage(content: Unit, payload: String, options: PlusPushMessageOptions): Unit = js.native
  def createMessage(content: Unit, payload: Unit, options: PlusPushMessageOptions): Unit = js.native
  
  /**
    * 获取所有推送消息
    * 获取客户端接收到的所有推送消息。
    *     仅包括在系统消息中心显示的推送消息，不包括调用setAutoNotification(false)方法设置不显示推送消息后接收到的消息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  def getAllMessage(): PlusPushPushMessage = js.native
  
  /**
    * 获取客户端推送标识信息
    * 客户端标识信息用于业务服务器下发推送消息时提交给推送服务器的数据，用于说明下发推送消息的接收者（客户端）。需要客户端在第一次运行时提交到业务服务器保存。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  def getClientInfo(): PlusPushClientInfo = js.native
  
  /**
    * 删除推送消息
    * 删除系统消息中心指定的推送消息，可通过getAllMessage方法获取所有的消息后进行操作。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  def remove(): Unit = js.native
  def remove(message: PlusPushPushMessage): Unit = js.native
  
  /**
    * 设置程序是否将消息显示在系统消息中心
    * 默认情况下程序在接收到推送消息后将会在系统消息中心显示，通过此方法可关闭默认行为，接收到推送消息后不在系统消息中心显示，通过addEventListener方法的“receive”事件监听处理接收到的消息。
    *     在这种模式下可通过createMessage方法创建在系统消息中心显示的消息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  def setAutoNotification(): Unit = js.native
  def setAutoNotification(notify: Boolean): Unit = js.native
}
