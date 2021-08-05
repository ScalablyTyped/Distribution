package typings.instagramPrivateApi.timelineFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineFeedResponseClientGapEnforcerMatrixItem extends StObject {
  
  var list: js.Array[Double]
}
object TimelineFeedResponseClientGapEnforcerMatrixItem {
  
  inline def apply(list: js.Array[Double]): TimelineFeedResponseClientGapEnforcerMatrixItem = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponseClientGapEnforcerMatrixItem]
  }
  
  extension [Self <: TimelineFeedResponseClientGapEnforcerMatrixItem](x: Self) {
    
    inline def setList(value: js.Array[Double]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListVarargs(value: Double*): Self = StObject.set(x, "list", js.Array(value :_*))
  }
}
