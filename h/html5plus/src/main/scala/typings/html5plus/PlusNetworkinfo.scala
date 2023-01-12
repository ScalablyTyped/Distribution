package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * networkinfo模块用于获取网络信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
  */
trait PlusNetworkinfo extends StObject {
  
  /**
    * 蜂窝移动2G网络
    * 网络状态常量，当前设备连接到蜂窝移动2G网络，固定值为4。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var CONNECTION_CELL2G: js.UndefOr[Double] = js.undefined
  
  /**
    * 蜂窝移动3G网络
    * 网络状态常量，当前设备连接到蜂窝移动3G网络，固定值为5。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var CONNECTION_CELL3G: js.UndefOr[Double] = js.undefined
  
  /**
    * 蜂窝移动4G网络
    * 网络状态常量，当前设备连接到蜂窝移动4G网络，固定值为6。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var CONNECTION_CELL4G: js.UndefOr[Double] = js.undefined
  
  /**
    * 有线网络
    * 网络状态常量，当前设备连接到有线网络，固定值为2。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var CONNECTION_ETHERNET: js.UndefOr[Double] = js.undefined
  
  /**
    * 未连接网络
    * 网络状态常量，当前设备网络未连接网络，固定值为1。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var CONNECTION_NONE: js.UndefOr[Double] = js.undefined
  
  /**
    * 网络连接状态未知
    * 网络状态常量，表示当前设备网络状态未知，固定值为0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var CONNECTION_UNKNOW: js.UndefOr[Double] = js.undefined
  
  /**
    * 无线WIFI网络
    * 网络状态常量，当前设备连接到无线WIFI网络，固定值为3。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var CONNECTION_WIFI: js.UndefOr[Double] = js.undefined
  
  /**
    * 获取设备当前连接的网络类型
    * 获取当前设备连接的网络类型，返回值为网络类型常量，可取值CONNECTION_*常量。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  def getCurrentType(): Double
}
object PlusNetworkinfo {
  
  inline def apply(getCurrentType: () => Double): PlusNetworkinfo = {
    val __obj = js.Dynamic.literal(getCurrentType = js.Any.fromFunction0(getCurrentType))
    __obj.asInstanceOf[PlusNetworkinfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlusNetworkinfo] (val x: Self) extends AnyVal {
    
    inline def setCONNECTION_CELL2G(value: Double): Self = StObject.set(x, "CONNECTION_CELL2G", value.asInstanceOf[js.Any])
    
    inline def setCONNECTION_CELL2GUndefined: Self = StObject.set(x, "CONNECTION_CELL2G", js.undefined)
    
    inline def setCONNECTION_CELL3G(value: Double): Self = StObject.set(x, "CONNECTION_CELL3G", value.asInstanceOf[js.Any])
    
    inline def setCONNECTION_CELL3GUndefined: Self = StObject.set(x, "CONNECTION_CELL3G", js.undefined)
    
    inline def setCONNECTION_CELL4G(value: Double): Self = StObject.set(x, "CONNECTION_CELL4G", value.asInstanceOf[js.Any])
    
    inline def setCONNECTION_CELL4GUndefined: Self = StObject.set(x, "CONNECTION_CELL4G", js.undefined)
    
    inline def setCONNECTION_ETHERNET(value: Double): Self = StObject.set(x, "CONNECTION_ETHERNET", value.asInstanceOf[js.Any])
    
    inline def setCONNECTION_ETHERNETUndefined: Self = StObject.set(x, "CONNECTION_ETHERNET", js.undefined)
    
    inline def setCONNECTION_NONE(value: Double): Self = StObject.set(x, "CONNECTION_NONE", value.asInstanceOf[js.Any])
    
    inline def setCONNECTION_NONEUndefined: Self = StObject.set(x, "CONNECTION_NONE", js.undefined)
    
    inline def setCONNECTION_UNKNOW(value: Double): Self = StObject.set(x, "CONNECTION_UNKNOW", value.asInstanceOf[js.Any])
    
    inline def setCONNECTION_UNKNOWUndefined: Self = StObject.set(x, "CONNECTION_UNKNOW", js.undefined)
    
    inline def setCONNECTION_WIFI(value: Double): Self = StObject.set(x, "CONNECTION_WIFI", value.asInstanceOf[js.Any])
    
    inline def setCONNECTION_WIFIUndefined: Self = StObject.set(x, "CONNECTION_WIFI", js.undefined)
    
    inline def setGetCurrentType(value: () => Double): Self = StObject.set(x, "getCurrentType", js.Any.fromFunction0(value))
  }
}
