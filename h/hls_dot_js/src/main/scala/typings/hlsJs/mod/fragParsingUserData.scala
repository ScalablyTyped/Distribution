package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait fragParsingUserData extends StObject {
  
  var frag: Fragment = js.native
  
  var id: String = js.native
  
  var samples: js.Array[_] = js.native
}
object fragParsingUserData {
  
  @scala.inline
  def apply(frag: Fragment, id: String, samples: js.Array[_]): fragParsingUserData = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], samples = samples.asInstanceOf[js.Any])
    __obj.asInstanceOf[fragParsingUserData]
  }
  
  @scala.inline
  implicit class fragParsingUserDataMutableBuilder[Self <: fragParsingUserData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamples(value: js.Array[_]): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplesVarargs(value: js.Any*): Self = StObject.set(x, "samples", js.Array(value :_*))
  }
}
