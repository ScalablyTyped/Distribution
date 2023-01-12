package typings.hummerEnv

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Request extends StObject {
  
  /**
    * @summary 网络请求头部
    */
  var header: StringDictionary[String | Double]
  
  /**
    * @summary 请求方式（不区分大小写）
    */
  var method: String
  
  /**
    * @summary 网络请求参数
    */
  var param: StringDictionary[String | Double]
  
  /**
    * 发起网络请求
    * @param cb 请求返回触发的回调
    */
  def send(
    cb: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.RequestResponse */ /* response */ Any, 
      Unit
    ]
  ): Unit
  
  /**
    * @summary 超时时间（单位：毫秒）
    */
  var timeout: Double
  
  /**
    * @summary API地址 【必填】
    */
  var url: String
}
object Request {
  
  inline def apply(
    header: StringDictionary[String | Double],
    method: String,
    param: StringDictionary[String | Double],
    send: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.RequestResponse */ /* response */ Any, 
      Unit
    ] => Unit,
    timeout: Double,
    url: String
  ): Request = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], send = js.Any.fromFunction1(send), timeout = timeout.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
    
    inline def setHeader(value: StringDictionary[String | Double]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParam(value: StringDictionary[String | Double]): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    inline def setSend(
      value: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.RequestResponse */ /* response */ Any, 
          Unit
        ] => Unit
    ): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
