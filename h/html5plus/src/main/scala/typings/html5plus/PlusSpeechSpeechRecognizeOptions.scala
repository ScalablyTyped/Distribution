package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，语音识别参数
  * 控制语音识别引擎内部参数，在JS中为JSON对象，在启动语音识别时使用。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/speech.html](http://www.html5plus.org/doc/zh_cn/speech.html)
  */
trait PlusSpeechSpeechRecognizeOptions extends StObject {
  
  /**
    * 语音识别是否采用持续模式
    * 设置为true表示语音引擎不会根据语音输入自动结束，识别到文本内容将多次调用successCallback函数返回，如果需要结束语音识别则必须调用stopRecognize接口，默认值为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/speech.html](http://www.html5plus.org/doc/zh_cn/speech.html)
    */
  var continue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 语音识别引擎标识
    * 用于兼容多语音识别引擎的浏览器，使用语音识别厂商的产品名称，如未设置或设置不正确则使用运行环境默认的语音识别引擎。
    *     支持以下语音识别引擎：
    *         "baidu"-百度语音识别；
    *         "iFly"-讯飞语音识别。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/speech.html](http://www.html5plus.org/doc/zh_cn/speech.html)
    */
  var engine: js.UndefOr[String] = js.undefined
  
  /**
    * 语音识别引擎的语言
    * 用于定义语音识别引擎的语言，其取值需符合W3C的Language codes规范。
    *     目前讯飞语音支持以下语言：
    *         "zh-cn"-中文，普通话；
    *         "en-us"-英语；
    *         "zh-cantonese"-中文，粤语；
    *         "zh-henanese"-中文，河南话（百度语音识别不支持此语言）。
    *         默认值为"zh-cn"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/speech.html](http://www.html5plus.org/doc/zh_cn/speech.html)
    */
  var lang: js.UndefOr[String] = js.undefined
  
  /**
    * 指定识别结果识别包括多候选结果
    * 用于指定识别结果识别包括多候选结果。如nbest:3，识别返回3个候选结果，默认值为1。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/speech.html](http://www.html5plus.org/doc/zh_cn/speech.html)
    */
  var nbest: js.UndefOr[Double] = js.undefined
  
  /**
    * 语音识别结束事件（已废弃，使用end事件）
    * 事件函数，语音识别结束，在调用stopRecognize方法后触发，或者在引擎内部自动完成语音识别后触发，与onstart事件成对触发。
    *     注：iOS平台未支持
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/speech.html](http://www.html5plus.org/doc/zh_cn/speech.html)
    */
  var onend: js.UndefOr[js.Function1[/* result */ js.Any, Unit]] = js.undefined
  
  /**
    * 语音识别开始事件（已废弃，使用start事件）
    * 事件函数，语音识别开始启动，在调用startRecognize方法后触发，与onend事件成对触发。
    *     注：iOS平台未支持
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/speech.html](http://www.html5plus.org/doc/zh_cn/speech.html)
    */
  var onstart: js.UndefOr[js.Function1[/* result */ js.Any, Unit]] = js.undefined
  
  /**
    * 识别结果中是否包含标点符号
    * true表示识别结果文本中包含标点符号，false表示识别结果文本中不包含标点符号。
    *     默认值为true。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/speech.html](http://www.html5plus.org/doc/zh_cn/speech.html)
    */
  var punctuation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 语音识别超时时间
    * 语音识别超时的时间，单位为ms，默认值为1000（即10秒）。
    *     注：百度语音识别不支持此参数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/speech.html](http://www.html5plus.org/doc/zh_cn/speech.html)
    */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /**
    * 识别时是否显示用户界面
    * 用于指定识别时是否显示用户界面，设置为true表示显示浏览器内置语音识别界面；设置为false表示不显示浏览器内置语音识别界面。默认值为true。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/speech.html](http://www.html5plus.org/doc/zh_cn/speech.html)
    */
  var userInterface: js.UndefOr[Boolean] = js.undefined
}
object PlusSpeechSpeechRecognizeOptions {
  
  inline def apply(): PlusSpeechSpeechRecognizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusSpeechSpeechRecognizeOptions]
  }
  
  extension [Self <: PlusSpeechSpeechRecognizeOptions](x: Self) {
    
    inline def setContinue(value: Boolean): Self = StObject.set(x, "continue", value.asInstanceOf[js.Any])
    
    inline def setContinueUndefined: Self = StObject.set(x, "continue", js.undefined)
    
    inline def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    inline def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setNbest(value: Double): Self = StObject.set(x, "nbest", value.asInstanceOf[js.Any])
    
    inline def setNbestUndefined: Self = StObject.set(x, "nbest", js.undefined)
    
    inline def setOnend(value: /* result */ js.Any => Unit): Self = StObject.set(x, "onend", js.Any.fromFunction1(value))
    
    inline def setOnendUndefined: Self = StObject.set(x, "onend", js.undefined)
    
    inline def setOnstart(value: /* result */ js.Any => Unit): Self = StObject.set(x, "onstart", js.Any.fromFunction1(value))
    
    inline def setOnstartUndefined: Self = StObject.set(x, "onstart", js.undefined)
    
    inline def setPunctuation(value: Boolean): Self = StObject.set(x, "punctuation", value.asInstanceOf[js.Any])
    
    inline def setPunctuationUndefined: Self = StObject.set(x, "punctuation", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUserInterface(value: Boolean): Self = StObject.set(x, "userInterface", value.asInstanceOf[js.Any])
    
    inline def setUserInterfaceUndefined: Self = StObject.set(x, "userInterface", js.undefined)
  }
}
