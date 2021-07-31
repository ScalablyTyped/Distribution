package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait subtitleFragProcessedData extends StObject {
  
  var frag: Fragment
  
  var success: Boolean
}
object subtitleFragProcessedData {
  
  @scala.inline
  def apply(frag: Fragment, success: Boolean): subtitleFragProcessedData = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[subtitleFragProcessedData]
  }
  
  @scala.inline
  implicit class subtitleFragProcessedDataMutableBuilder[Self <: subtitleFragProcessedData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
