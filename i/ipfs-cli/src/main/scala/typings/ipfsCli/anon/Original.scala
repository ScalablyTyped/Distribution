package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Original extends StObject {
  
  var original: js.Any
  
  var updated: js.Any
}
object Original {
  
  @scala.inline
  def apply(original: js.Any, updated: js.Any): Original = {
    val __obj = js.Dynamic.literal(original = original.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Original]
  }
  
  @scala.inline
  implicit class OriginalMutableBuilder[Self <: Original] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginal(value: js.Any): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated(value: js.Any): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
  }
}
