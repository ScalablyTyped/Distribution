package typings.jweixin.mod

import typings.jweixin.anon.NetworkType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgetNetworkType
  extends StObject
     with BaseParams {
  
  @JSName("success")
  def success_MIgetNetworkType(res: NetworkType): Unit
}
object IgetNetworkType {
  
  inline def apply(success: NetworkType => Unit): IgetNetworkType = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[IgetNetworkType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgetNetworkType] (val x: Self) extends AnyVal {
    
    inline def setSuccess(value: NetworkType => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
