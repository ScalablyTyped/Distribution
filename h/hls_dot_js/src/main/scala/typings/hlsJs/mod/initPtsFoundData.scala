package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait initPtsFoundData extends StObject {
  
  var d: String = js.native
  
  var frag: Fragment = js.native
  
  var initPTS: Double = js.native
}
object initPtsFoundData {
  
  @scala.inline
  def apply(d: String, frag: Fragment, initPTS: Double): initPtsFoundData = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], frag = frag.asInstanceOf[js.Any], initPTS = initPTS.asInstanceOf[js.Any])
    __obj.asInstanceOf[initPtsFoundData]
  }
  
  @scala.inline
  implicit class initPtsFoundDataMutableBuilder[Self <: initPtsFoundData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitPTS(value: Double): Self = StObject.set(x, "initPTS", value.asInstanceOf[js.Any])
  }
}
