package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 系统原生界面基类对象
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
  */
trait PlusNativeUINativeUIObj extends StObject {
  
  /**
    * 关闭显示的系统原生界面
    * 调用plus.nativeUI.actionSheet方法创建并显示系统界面后，可通过其close方法将原生界面关闭。
    *     此情况下触发界面关闭回调函数参数的index属性值为-1。
    *     注意：一个系统原生界面只能关闭一次，多次调用将无任何作用。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  def close(): Unit
}
object PlusNativeUINativeUIObj {
  
  @scala.inline
  def apply(close: () => Unit): PlusNativeUINativeUIObj = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
    __obj.asInstanceOf[PlusNativeUINativeUIObj]
  }
  
  @scala.inline
  implicit class PlusNativeUINativeUIObjMutableBuilder[Self <: PlusNativeUINativeUIObj] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
  }
}
