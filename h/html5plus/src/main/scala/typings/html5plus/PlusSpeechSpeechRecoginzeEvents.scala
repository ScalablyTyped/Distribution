package typings.html5plus

import org.scalablytyped.runtime.StObject
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
trait PlusSpeechSpeechRecoginzeEvents extends StObject {
  
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
  implicit class PlusSpeechSpeechRecoginzeEventsMutableBuilder[Self <: PlusSpeechSpeechRecoginzeEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setRecognition(value: String): Self = StObject.set(x, "recognition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecognitionUndefined: Self = StObject.set(x, "recognition", js.undefined)
    
    @scala.inline
    def setRecognizing(value: String): Self = StObject.set(x, "recognizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecognizingUndefined: Self = StObject.set(x, "recognizing", js.undefined)
    
    @scala.inline
    def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setVolumeChange(value: String): Self = StObject.set(x, "volumeChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeChangeUndefined: Self = StObject.set(x, "volumeChange", js.undefined)
  }
}
