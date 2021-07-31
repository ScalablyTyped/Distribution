package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Audio模块用于提供音频的录制和播放功能，可调用系统的麦克风设备进行录音操作，也可调用系统的扬声器设备播放音频文件。通过plus.audio获取音频管理对象。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/audio.html](http://www.html5plus.org/doc/zh_cn/audio.html)
  */
@js.native
trait PlusAudio extends StObject {
  
  /**
    * 音频播放对象
    * 音频播放对象，用于音频文件的播放。不能通过new方法直接创建，只能通过audio.createPlayer方法创建。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/audio.html](http://www.html5plus.org/doc/zh_cn/audio.html)
    */
  var AudioPlayer: js.UndefOr[PlusAudioAudioPlayer] = js.native
  
  /**
    * 录音对象
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/audio.html](http://www.html5plus.org/doc/zh_cn/audio.html)
    */
  var AudioRecorder: js.UndefOr[PlusAudioAudioRecorder] = js.native
  
  /**
    * 设备听筒音频输出线路
    * 音频输出线路常量，值为1。音频播放时在设备的听筒输出。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/audio.html](http://www.html5plus.org/doc/zh_cn/audio.html)
    */
  var ROUTE_EARPIECE: js.UndefOr[Double] = js.native
  
  /**
    * 设备的扬声器音频输出线路
    * 音频输出线路常量，值为0。音频播放时在设备的扬声器输出。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/audio.html](http://www.html5plus.org/doc/zh_cn/audio.html)
    */
  var ROUTE_SPEAKER: js.UndefOr[Double] = js.native
  
  /**
    * JSON对象，调用麦克风设备进行录音的参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/audio.html](http://www.html5plus.org/doc/zh_cn/audio.html)
    */
  var RecordOptions: js.UndefOr[PlusAudioRecordOptions] = js.native
  
  /**
    * 创建音频播放对象
    * 创建一个音频文件播放对象，用于打开音频文件并播放。
    *     可通过path参数指定要播放的音频文件。创建后返回播放对象，通过Audio.play方法开始播放。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/audio.html](http://www.html5plus.org/doc/zh_cn/audio.html)
    */
  def createPlayer(): PlusAudioAudioPlayer = js.native
  def createPlayer(path: String): PlusAudioAudioPlayer = js.native
  
  /**
    * 获取当前设备的录音对象
    * 获取当前设备的录音对象，进行录音操作，录音对象是设备的独占资源，在同一时间仅可执行一个录音操作，否则可能会导致操作失败。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/audio.html](http://www.html5plus.org/doc/zh_cn/audio.html)
    */
  def getRecorder(): PlusAudioAudioRecorder = js.native
}
