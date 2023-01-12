package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，流应用信息
  * 流应用标识、图标、是否下载完成等信息。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
  */
trait PlusStreamStreamInfo extends StObject {
  
  /**
    * 流应用是否下载完成
    * true表示流应用下载完成，false表示流应用未下载完成。
    *     注意，流应用未下载完成以让可以正常启动运行，启动后会自动下载。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var complete: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 流应用的图标
    * 流应用下载的图标路径（本地路径），如果未下载完成则返回空。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * 流应用标识
    * 流应用唯一字符串标识。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var id: js.UndefOr[String] = js.undefined
}
object PlusStreamStreamInfo {
  
  inline def apply(): PlusStreamStreamInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusStreamStreamInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlusStreamStreamInfo] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
