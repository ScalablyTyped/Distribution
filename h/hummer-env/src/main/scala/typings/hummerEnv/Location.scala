package typings.hummerEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Location extends StObject {
  
  /**
    * 获取上一次缓存的位置信息
    * @param cb 位置信息回调, (locationInfo : LocationInfo) => void
    */
  def getLastLocation(
    cb: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.LocationInfo */ /* locationInfo */ Any, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * 定位时遇到的错误信息
    * @param cb 错误回调, (errCode:number, errMsg:string) => void;
    */
  def onError(cb: js.Function2[/* errCode */ Double, /* errMsg */ String, Unit]): Unit = js.native
  
  /**
    * 开启位置定位
    * @param cb 位置信息回调, (locationInfo : LocationInfo) => void
    * @param intervalTime 位置变化的时间间隔（单位：毫秒），默认60000毫秒
    * @param intervalDistance 位置变化的距离改变范围（单位：米），默认0米
    */
  def startLocation(
    cb: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.LocationInfo */ /* locationInfo */ Any, 
      Unit
    ]
  ): Unit = js.native
  def startLocation(
    cb: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.LocationInfo */ /* locationInfo */ Any, 
      Unit
    ],
    intervalTime: Double
  ): Unit = js.native
  def startLocation(
    cb: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.LocationInfo */ /* locationInfo */ Any, 
      Unit
    ],
    intervalTime: Double,
    intervalDistance: Double
  ): Unit = js.native
  def startLocation(
    cb: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.LocationInfo */ /* locationInfo */ Any, 
      Unit
    ],
    intervalTime: Unit,
    intervalDistance: Double
  ): Unit = js.native
  
  /**
    * 停止位置定位
    */
  def stopLocation(): Unit = js.native
}
