package typings.materializecssMaterialize.M

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChipData extends StObject {
  
  /**
    * Chip image
    */
  var img: js.UndefOr[String] = js.undefined
  
  /**
    * Chip tag
    */
  var tag: String
}
object ChipData {
  
  inline def apply(tag: String): ChipData = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChipData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChipData] (val x: Self) extends AnyVal {
    
    inline def setImg(value: String): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
    
    inline def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
