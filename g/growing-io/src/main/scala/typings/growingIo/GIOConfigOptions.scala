package typings.growingIo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GIOConfigOptions extends StObject {
  
  /** 是否采集数据 */
  var dataCollect: js.UndefOr[Boolean] = js.undefined
  
  /** 是否检测hash变化 */
  var hashtag: js.UndefOr[Boolean] = js.undefined
}
object GIOConfigOptions {
  
  inline def apply(): GIOConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GIOConfigOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GIOConfigOptions] (val x: Self) extends AnyVal {
    
    inline def setDataCollect(value: Boolean): Self = StObject.set(x, "dataCollect", value.asInstanceOf[js.Any])
    
    inline def setDataCollectUndefined: Self = StObject.set(x, "dataCollect", js.undefined)
    
    inline def setHashtag(value: Boolean): Self = StObject.set(x, "hashtag", value.asInstanceOf[js.Any])
    
    inline def setHashtagUndefined: Self = StObject.set(x, "hashtag", js.undefined)
  }
}
