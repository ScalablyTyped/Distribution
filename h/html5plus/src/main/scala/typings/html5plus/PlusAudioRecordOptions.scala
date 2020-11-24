package typings.html5plus

import typings.html5plus.html5plusStrings._docSlash
import typings.html5plus.html5plusStrings._documentsSlash
import typings.html5plus.html5plusStrings._downloadsSlash
import typings.html5plus.html5plusStrings._wwwSlash
import typings.html5plus.html5plusStrings.mono
import typings.html5plus.html5plusStrings.stereo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，调用麦克风设备进行录音的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/audio.html](http://www.html5plus.org/doc/zh_cn/audio.html)
  */
@js.native
trait PlusAudioRecordOptions extends js.Object {
  
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
  var channels: js.UndefOr[mono | stereo] = js.native
  
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
  var filename: js.UndefOr[_wwwSlash | _docSlash | _documentsSlash | _downloadsSlash] = js.native
  
  /**
    * 录音文件的格式
    * 需通过supportedFormats属性获取设备支持的录音格式，若设置无效的值，则使用系统默认的录音格式。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/audio.html](http://www.html5plus.org/doc/zh_cn/audio.html)
    */
  var format: js.UndefOr[String] = js.native
  
  /**
    * 录音文件的采样率
    * 需通过supportedSamplerates属性获取设备支持的采样率，若设置无效的值，则使用系统默认的采样率。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/audio.html](http://www.html5plus.org/doc/zh_cn/audio.html)
    */
  var samplerate: js.UndefOr[String] = js.native
}
object PlusAudioRecordOptions {
  
  @scala.inline
  def apply(): PlusAudioRecordOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusAudioRecordOptions]
  }
  
  @scala.inline
  implicit class PlusAudioRecordOptionsOps[Self <: PlusAudioRecordOptions] (val x: Self) extends AnyVal {
    
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
    def setChannels(value: mono | stereo): Self = this.set("channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannels: Self = this.set("channels", js.undefined)
    
    @scala.inline
    def setFilename(value: _wwwSlash | _docSlash | _documentsSlash | _downloadsSlash): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setSamplerate(value: String): Self = this.set("samplerate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSamplerate: Self = this.set("samplerate", js.undefined)
  }
}
