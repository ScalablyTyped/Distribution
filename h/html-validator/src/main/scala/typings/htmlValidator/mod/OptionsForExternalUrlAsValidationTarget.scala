package typings.htmlValidator.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsForExternalUrlAsValidationTarget
  extends StObject
     with BasicOptions {
  
  var url: String
}
object OptionsForExternalUrlAsValidationTarget {
  
  @scala.inline
  def apply(url: String): OptionsForExternalUrlAsValidationTarget = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsForExternalUrlAsValidationTarget]
  }
  
  @scala.inline
  implicit class OptionsForExternalUrlAsValidationTargetMutableBuilder[Self <: OptionsForExternalUrlAsValidationTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
