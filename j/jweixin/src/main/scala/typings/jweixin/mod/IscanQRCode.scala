package typings.jweixin.mod

import typings.jweixin.anon.ResultStr
import typings.jweixin.jweixinInts.`0`
import typings.jweixin.jweixinInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IscanQRCode
  extends StObject
     with BaseParams {
  
  var needResult: `0` | `1`
  
  // 默认为0，扫描结果由微信处理，1则直接返回扫描结果，
  var scanType: js.Array[typings.jweixin.mod.scanType]
  
  // 可以指定扫二维码还是一维码，默认二者都有
  // 当needResult 为 1 时，扫码返回的结果
  @JSName("success")
  def success_MIscanQRCode(res: ResultStr): Unit
}
object IscanQRCode {
  
  inline def apply(needResult: `0` | `1`, scanType: js.Array[scanType], success: ResultStr => Unit): IscanQRCode = {
    val __obj = js.Dynamic.literal(needResult = needResult.asInstanceOf[js.Any], scanType = scanType.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[IscanQRCode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IscanQRCode] (val x: Self) extends AnyVal {
    
    inline def setNeedResult(value: `0` | `1`): Self = StObject.set(x, "needResult", value.asInstanceOf[js.Any])
    
    inline def setScanType(value: js.Array[scanType]): Self = StObject.set(x, "scanType", value.asInstanceOf[js.Any])
    
    inline def setScanTypeVarargs(value: scanType*): Self = StObject.set(x, "scanType", js.Array(value*))
    
    inline def setSuccess(value: ResultStr => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
