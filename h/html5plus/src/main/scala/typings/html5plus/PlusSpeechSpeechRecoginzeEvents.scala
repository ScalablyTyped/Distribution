package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 语音识别事件类型
  * 描述语音过程的触发事件列表，可以通过调用plus.sppech.addEventListener方法进行注册监听。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/speech.html](http://www.html5plus.org/doc/zh_cn/speech.html)
  */
trait PlusSpeechSpeechRecoginzeEvents extends js.Object {
  /**
    * 结束语音识别
    * 调用plus.speech.stopRecognize方法结束语音识别或语音识别完成后自动结束时触发。
    * 	无回调函数参数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/speech.html](http://www.html5plus.org/doc/zh_cn/speech.html)
    */
  var end: js.UndefOr[String] = js.undefined
  /**
    * 语音识别错误
    * 语音识别发生错误时触发。
    * 	回调函数参数event={code:"Number类型，错误编码",message:"String类型，错误描述信息"}。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/speech.html](http://www.html5plus.org/doc/zh_cn/speech.html)
    */
  var error: js.UndefOr[String] = js.undefined
  /**
    * 最终语音识别
    * 返回最终语音识别结果。
    * 	回调函数参数event={result:"String类型，最佳识别结果",results:"String数组类型，所有候选结果"}。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/speech.html](http://www.html5plus.org/doc/zh_cn/speech.html)
    */
  var recognition: js.UndefOr[String] = js.undefined
  /**
    * 临时语音识别结果
    * 返回临时语音识别结果时触发。
    * 	回调函数参数event={partialResult:"String类型，临时识别结果"}。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/speech.html](http://www.html5plus.org/doc/zh_cn/speech.html)
    */
  var recognizing: js.UndefOr[String] = js.undefined
  /**
    * 开始语音识别
    * 调用plus.speech.startRecognize方法开始语音识别时触发。
    * 	无回调函数参数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/speech.html](http://www.html5plus.org/doc/zh_cn/speech.html)
    */
  var start: js.UndefOr[String] = js.undefined
  /**
    * 音量变化
    * 开始语音识别后，麦克风录制到的语音音量变化时触发。
    * 	回调函数参数event={volume:"Number类型，取值范围0-1"}。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/speech.html](http://www.html5plus.org/doc/zh_cn/speech.html)
    */
  var volumeChange: js.UndefOr[String] = js.undefined
}

object PlusSpeechSpeechRecoginzeEvents {
  @scala.inline
  def apply(
    end: String = null,
    error: String = null,
    recognition: String = null,
    recognizing: String = null,
    start: String = null,
    volumeChange: String = null
  ): PlusSpeechSpeechRecoginzeEvents = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end)
    if (error != null) __obj.updateDynamic("error")(error)
    if (recognition != null) __obj.updateDynamic("recognition")(recognition)
    if (recognizing != null) __obj.updateDynamic("recognizing")(recognizing)
    if (start != null) __obj.updateDynamic("start")(start)
    if (volumeChange != null) __obj.updateDynamic("volumeChange")(volumeChange)
    __obj.asInstanceOf[PlusSpeechSpeechRecoginzeEvents]
  }
}

