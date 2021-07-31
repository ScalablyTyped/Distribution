package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// interface destroyingData {}
trait keyLoadingData extends StObject {
  
  var frag: Fragment
}
object keyLoadingData {
  
  @scala.inline
  def apply(frag: Fragment): keyLoadingData = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any])
    __obj.asInstanceOf[keyLoadingData]
  }
  
  @scala.inline
  implicit class keyLoadingDataMutableBuilder[Self <: keyLoadingData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
  }
}
