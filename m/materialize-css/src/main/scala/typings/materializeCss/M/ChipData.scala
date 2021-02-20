package typings.materializeCss.M

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChipData extends StObject {
  
  /**
    * Chip image
    */
  var img: js.UndefOr[String] = js.native
  
  /**
    * Chip tag
    */
  var tag: String = js.native
}
object ChipData {
  
  @scala.inline
  def apply(tag: String): ChipData = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChipData]
  }
  
  @scala.inline
  implicit class ChipDataMutableBuilder[Self <: ChipData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImg(value: String): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
