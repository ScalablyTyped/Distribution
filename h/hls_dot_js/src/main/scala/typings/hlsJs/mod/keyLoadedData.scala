package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait keyLoadedData extends StObject {
  
  var frag: Fragment = js.native
}
object keyLoadedData {
  
  @scala.inline
  def apply(frag: Fragment): keyLoadedData = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any])
    __obj.asInstanceOf[keyLoadedData]
  }
  
  @scala.inline
  implicit class keyLoadedDataMutableBuilder[Self <: keyLoadedData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
  }
}
