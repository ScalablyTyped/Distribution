package typings.growingIo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GIOConfigOptions extends StObject {
  
  /** 是否采集数据 */
  var dataCollect: js.UndefOr[Boolean] = js.native
  
  /** 是否检测hash变化 */
  var hashtag: js.UndefOr[Boolean] = js.native
}
object GIOConfigOptions {
  
  @scala.inline
  def apply(): GIOConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GIOConfigOptions]
  }
  
  @scala.inline
  implicit class GIOConfigOptionsMutableBuilder[Self <: GIOConfigOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataCollect(value: Boolean): Self = StObject.set(x, "dataCollect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataCollectUndefined: Self = StObject.set(x, "dataCollect", js.undefined)
    
    @scala.inline
    def setHashtag(value: Boolean): Self = StObject.set(x, "hashtag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashtagUndefined: Self = StObject.set(x, "hashtag", js.undefined)
  }
}
