package typings.jweixin.mod

import typings.jweixin.anon.Accuracy
import typings.jweixin.jweixinStrings.gcj02
import typings.jweixin.jweixinStrings.wgs84
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgetLocation
  extends StObject
     with BaseParams {
  
  // 默认为wgs84的gps坐标，如果要返回直接给openLocation用的火星坐标，可传入'gcj02'
  @JSName("success")
  def success_MIgetLocation(res: Accuracy): Unit
  
  var `type`: wgs84 | gcj02
}
object IgetLocation {
  
  @scala.inline
  def apply(success: Accuracy => Unit, `type`: wgs84 | gcj02): IgetLocation = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgetLocation]
  }
  
  @scala.inline
  implicit class IgetLocationMutableBuilder[Self <: IgetLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: Accuracy => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: wgs84 | gcj02): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
