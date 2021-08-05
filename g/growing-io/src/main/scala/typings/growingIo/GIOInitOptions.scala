package typings.growingIo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GIOInitOptions extends StObject {
  
  /** 配置imp类型的数据关闭发送 */
  var imp: js.UndefOr[Boolean] = js.undefined
}
object GIOInitOptions {
  
  inline def apply(): GIOInitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GIOInitOptions]
  }
  
  extension [Self <: GIOInitOptions](x: Self) {
    
    inline def setImp(value: Boolean): Self = StObject.set(x, "imp", value.asInstanceOf[js.Any])
    
    inline def setImpUndefined: Self = StObject.set(x, "imp", js.undefined)
  }
}
