package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Speech模块管理语音输入功能，提供语音识别功能，可支持用户通过麦克风设备进行语音输入内容。通过plus.speech可获取语音输入管理对象。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/speech.html](http://www.html5plus.org/doc/zh_cn/speech.html)
  */
@js.native
trait PlusSpeech extends js.Object {
  /**
    * 语音识别事件类型
    * 描述语音过程的触发事件列表，可以通过调用plus.sppech.addEventListener方法进行注册监听。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/speech.html](http://www.html5plus.org/doc/zh_cn/speech.html)
    */
  var SpeechRecoginzeEvents: js.UndefOr[PlusSpeechSpeechRecoginzeEvents] = js.native
  /**
    * JSON对象，语音识别参数
    * 控制语音识别引擎内部参数，在JS中为JSON对象，在启动语音识别时使用。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/speech.html](http://www.html5plus.org/doc/zh_cn/speech.html)
    */
  var SpeechRecognizeOptions: js.UndefOr[PlusSpeechSpeechRecognizeOptions] = js.native
  /**
    * 监听语音识别事件
    * 向语音识别模块添加事件监听器，当指定的事件发生时，将触发listener函数的执行。 
    *     可多次调用此方法添加多个监听器，当监听的事件发生时，将按照添加的先后顺序触发执行。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/speech.html](http://www.html5plus.org/doc/zh_cn/speech.html)
    */
  def addEventListener(): Unit = js.native
  def addEventListener(event: PlusSpeechSpeechRecoginzeEvents): Unit = js.native
  def addEventListener(event: PlusSpeechSpeechRecoginzeEvents, listener: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def addEventListener(
    event: PlusSpeechSpeechRecoginzeEvents,
    listener: js.Function1[/* result */ js.Any, Unit],
    capture: Boolean
  ): Unit = js.native
  /**
    * 启动语音识别
    * 启动语音识别时调用，当语音识别成功后通过successCallback回调返回识别出文本内容，调用语音识别失败则通过errorCallback回调返回。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/speech.html](http://www.html5plus.org/doc/zh_cn/speech.html)
    */
  def startRecognize(): Unit = js.native
  def startRecognize(options: PlusSpeechSpeechRecognizeOptions): Unit = js.native
  def startRecognize(options: PlusSpeechSpeechRecognizeOptions, successCB: js.Function1[/* result */ String, Unit]): Unit = js.native
  def startRecognize(
    options: PlusSpeechSpeechRecognizeOptions,
    successCB: js.Function1[/* result */ String, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  /**
    * 停止语音识别
    * 当语音识别完成时或用户取消语音识别时调用，调用此方法将导致errorCallback回调函数的调用。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/speech.html](http://www.html5plus.org/doc/zh_cn/speech.html)
    */
  def stopRecognize(): Unit = js.native
}

