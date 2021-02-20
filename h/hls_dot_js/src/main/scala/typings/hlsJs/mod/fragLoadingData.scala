package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait fragLoadingData extends StObject {
  
  var frag: Fragment = js.native
}
object fragLoadingData {
  
  @scala.inline
  def apply(frag: Fragment): fragLoadingData = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any])
    __obj.asInstanceOf[fragLoadingData]
  }
  
  @scala.inline
  implicit class fragLoadingDataMutableBuilder[Self <: fragLoadingData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
  }
}
