package typings.html5plus

import typings.html5plus.html5plusStrings._docSlash
import typings.html5plus.html5plusStrings._documentsSlash
import typings.html5plus.html5plusStrings._downloadsSlash
import typings.html5plus.html5plusStrings._wwwSlash
import typings.html5plus.html5plusStrings.mono
import typings.html5plus.html5plusStrings.stereo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，调用麦克风设备进行录音的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/audio.html](http://www.html5plus.org/doc/zh_cn/audio.html)
  */
trait PlusAudioRecordOptions extends StObject {
  
  /**
    * 录音声道
    * 可取值：
    *         "mono" - 单声道录音；
    *         "stereo" - 立体声道录音。
    *     默认值为"mono"。
    * - mono: 单声道录音
    * - stereo: 立体声录音
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/audio.html](http://www.html5plus.org/doc/zh_cn/audio.html)
    */
  var channels: js.UndefOr[mono | stereo] = js.undefined
  
  /**
    * 保存录音文件的路径
    * 可设置具体文件名，也可只设置路径，如果以“/”结尾则表明是路径，文件名由录音程序自动生成。
    *     如未设置则使用默认目录生成随机文件名称，默认目录为应用%APPID%下的documents目录。
    * - _www/: 应用资源目录
    * - _doc/: 应用私有文档目录
    * - _documents/: 共享文档目录
    * - _downloads/: 共享下载目录
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/audio.html](http://www.html5plus.org/doc/zh_cn/audio.html)
    */
  var filename: js.UndefOr[_wwwSlash | _docSlash | _documentsSlash | _downloadsSlash] = js.undefined
  
  /**
    * 录音文件的格式
    * 需通过supportedFormats属性获取设备支持的录音格式，若设置无效的值，则使用系统默认的录音格式。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/audio.html](http://www.html5plus.org/doc/zh_cn/audio.html)
    */
  var format: js.UndefOr[String] = js.undefined
  
  /**
    * 录音文件的采样率
    * 需通过supportedSamplerates属性获取设备支持的采样率，若设置无效的值，则使用系统默认的采样率。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/audio.html](http://www.html5plus.org/doc/zh_cn/audio.html)
    */
  var samplerate: js.UndefOr[String] = js.undefined
}
object PlusAudioRecordOptions {
  
  inline def apply(): PlusAudioRecordOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusAudioRecordOptions]
  }
  
  extension [Self <: PlusAudioRecordOptions](x: Self) {
    
    inline def setChannels(value: mono | stereo): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    inline def setFilename(value: _wwwSlash | _docSlash | _documentsSlash | _downloadsSlash): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setSamplerate(value: String): Self = StObject.set(x, "samplerate", value.asInstanceOf[js.Any])
    
    inline def setSamplerateUndefined: Self = StObject.set(x, "samplerate", js.undefined)
  }
}
