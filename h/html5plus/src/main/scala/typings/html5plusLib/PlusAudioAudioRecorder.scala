package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 录音对象
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/audio.html](http://www.html5plus.org/doc/zh_cn/audio.html)
  */
@js.native
trait PlusAudioAudioRecorder extends js.Object {
  /**
    * 数组，设备录音支持的文件格式
    * 属性类型为Array(String)，若不支持此属性则返回空数组对象。支持的录音文件的格式，字符串格式为文件格式后缀名，如"mp3"、"aac"、"wav"等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/audio.html](http://www.html5plus.org/doc/zh_cn/audio.html)
    */
  var supportedFormats: js.UndefOr[java.lang.String] = js.native
  /**
    * 数组，设备录音支持的采用率
    * 属性类型为Array(String)，若不支持此属性则返回空数组对象。支持的录音采样率，字符串格式为“采样频率”，如“8000”；其单位为Hz。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/audio.html](http://www.html5plus.org/doc/zh_cn/audio.html)
    */
  var supportedSamplerates: js.UndefOr[java.lang.String] = js.native
  /**
    * 调用设备麦克风进行录音操作
    * 调用设备麦克风开始录音操作，录音完成需调用stop方法停止。录音完成后将通过successCB回调返回录音后的文件数据。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/audio.html](http://www.html5plus.org/doc/zh_cn/audio.html)
    */
  def record(): scala.Unit = js.native
  def record(option: PlusAudioRecordOptions): scala.Unit = js.native
  def record(option: PlusAudioRecordOptions, successCB: js.Function1[/* result */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def record(
    option: PlusAudioRecordOptions,
    successCB: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCB: js.Function1[/* result */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
    * 结束录音操作
    * 结束录音操作，通知设备完成录音操作。录音完成后将调用record方法中传入的successCB回调返回录音文件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/audio.html](http://www.html5plus.org/doc/zh_cn/audio.html)
    */
  def stop(): scala.Unit = js.native
}

