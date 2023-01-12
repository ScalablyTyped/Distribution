package typings.jweixin.mod

import typings.jweixin.anon.LocalData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgetLocalImgData
  extends StObject
     with BaseParams {
  
  var localId: String
  
  // 图片的localID
  // localData是图片的base64数据，可以用img标签显示
  @JSName("success")
  def success_MIgetLocalImgData(res: LocalData): Unit
}
object IgetLocalImgData {
  
  inline def apply(localId: String, success: LocalData => Unit): IgetLocalImgData = {
    val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[IgetLocalImgData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgetLocalImgData] (val x: Self) extends AnyVal {
    
    inline def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: LocalData => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
