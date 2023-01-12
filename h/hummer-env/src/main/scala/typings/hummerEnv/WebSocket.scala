package typings.hummerEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebSocket extends StObject {
  
  /**
    * @summary 链接关闭时的回调
    * @param cb 回调函数, 回调参数 event: {code:错误码(number), reason: 错误原因(string)}
    */
  def onclose(
    cb: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.WebSocketCloseEvent */ /* ev */ Any, 
      Unit
    ]
  ): Unit
  
  /**
    * @summary 链接出错时的回调
    * @param cb 回调函数
    */
  def onerror(cb: js.Function0[Unit]): Unit
  
  /**
    * @summary 接收消息的回调
    * @param cb 回调函数 , 回调参数 event : {data: 消息文本(string)}
    */
  def onmessage(
    cb: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.WebSocketMessageEvent */ /* ev */ Any, 
      Unit
    ]
  ): Unit
  
  /**
    * @summary 链接连上时的回调
    * @param cb 回调函数
    */
  def onopen(cb: js.Function0[Unit]): Unit
}
object WebSocket {
  
  inline def apply(
    onclose: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.WebSocketCloseEvent */ /* ev */ Any, 
      Unit
    ] => Unit,
    onerror: js.Function0[Unit] => Unit,
    onmessage: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.WebSocketMessageEvent */ /* ev */ Any, 
      Unit
    ] => Unit,
    onopen: js.Function0[Unit] => Unit
  ): WebSocket = {
    val __obj = js.Dynamic.literal(onclose = js.Any.fromFunction1(onclose), onerror = js.Any.fromFunction1(onerror), onmessage = js.Any.fromFunction1(onmessage), onopen = js.Any.fromFunction1(onopen))
    __obj.asInstanceOf[WebSocket]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebSocket] (val x: Self) extends AnyVal {
    
    inline def setOnclose(
      value: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.WebSocketCloseEvent */ /* ev */ Any, 
          Unit
        ] => Unit
    ): Self = StObject.set(x, "onclose", js.Any.fromFunction1(value))
    
    inline def setOnerror(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onerror", js.Any.fromFunction1(value))
    
    inline def setOnmessage(
      value: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.WebSocketMessageEvent */ /* ev */ Any, 
          Unit
        ] => Unit
    ): Self = StObject.set(x, "onmessage", js.Any.fromFunction1(value))
    
    inline def setOnopen(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onopen", js.Any.fromFunction1(value))
  }
}
