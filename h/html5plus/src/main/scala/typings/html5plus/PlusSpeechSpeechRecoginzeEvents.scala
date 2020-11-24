package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 语音识别事件类型
  * 描述语音过程的触发事件列表，可以通过调用plus.sppech.addEventListener方法进行注册监听。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/speech.html](http://www.html5plus.org/doc/zh_cn/speech.html)
  */
@js.native
trait PlusSpeechSpeechRecoginzeEvents extends js.Object {
  
  /**
    * 结束语音识别
    * 调用plus.speech.stopRecognize方法结束语音识别或语音识别完成后自动结束时触发。
    *     无回调函数参数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/speech.html](http://www.html5plus.org/doc/zh_cn/speech.html)
    */
  var end: js.UndefOr[String] = js.native
  
  /**
    * 语音识别错误
    * 语音识别发生错误时触发。
    *     回调函数参数event={code:"Number类型，错误编码",message:"String类型，错误描述信息"}。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/speech.html](http://www.html5plus.org/doc/zh_cn/speech.html)
    */
  var error: js.UndefOr[String] = js.native
  
  /**
    * 最终语音识别
    * 返回最终语音识别结果。
    *     回调函数参数event={result:"String类型，最佳识别结果",results:"String数组类型，所有候选结果"}。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/speech.html](http://www.html5plus.org/doc/zh_cn/speech.html)
    */
  var recognition: js.UndefOr[String] = js.native
  
  /**
    * 临时语音识别结果
    * 返回临时语音识别结果时触发。
    *     回调函数参数event={partialResult:"String类型，临时识别结果"}。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/speech.html](http://www.html5plus.org/doc/zh_cn/speech.html)
    */
  var recognizing: js.UndefOr[String] = js.native
  
  /**
    * 开始语音识别
    * 调用plus.speech.startRecognize方法开始语音识别时触发。
    *     无回调函数参数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/speech.html](http://www.html5plus.org/doc/zh_cn/speech.html)
    */
  var start: js.UndefOr[String] = js.native
  
  /**
    * 音量变化
    * 开始语音识别后，麦克风录制到的语音音量变化时触发。
    *     回调函数参数event={volume:"Number类型，取值范围0-1"}。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/speech.html](http://www.html5plus.org/doc/zh_cn/speech.html)
    */
  var volumeChange: js.UndefOr[String] = js.native
}
object PlusSpeechSpeechRecoginzeEvents {
  
  @scala.inline
  def apply(): PlusSpeechSpeechRecoginzeEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusSpeechSpeechRecoginzeEvents]
  }
  
  @scala.inline
  implicit class PlusSpeechSpeechRecoginzeEventsOps[Self <: PlusSpeechSpeechRecoginzeEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnd(value: String): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setRecognition(value: String): Self = this.set("recognition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecognition: Self = this.set("recognition", js.undefined)
    
    @scala.inline
    def setRecognizing(value: String): Self = this.set("recognizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecognizing: Self = this.set("recognizing", js.undefined)
    
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setVolumeChange(value: String): Self = this.set("volumeChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeChange: Self = this.set("volumeChange", js.undefined)
  }
}
