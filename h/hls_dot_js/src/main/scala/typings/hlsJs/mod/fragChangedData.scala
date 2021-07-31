package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait fragChangedData extends StObject {
  
  var frag: Fragment
  
  var id: String
}
object fragChangedData {
  
  @scala.inline
  def apply(frag: Fragment, id: String): fragChangedData = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[fragChangedData]
  }
  
  @scala.inline
  implicit class fragChangedDataMutableBuilder[Self <: fragChangedData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
