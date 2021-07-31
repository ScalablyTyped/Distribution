package typings.knockstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockstrapModalDefaultsFooterData extends StObject {
  
  var closeLabel: String
  
  var primaryLabel: String
}
object KnockstrapModalDefaultsFooterData {
  
  @scala.inline
  def apply(closeLabel: String, primaryLabel: String): KnockstrapModalDefaultsFooterData = {
    val __obj = js.Dynamic.literal(closeLabel = closeLabel.asInstanceOf[js.Any], primaryLabel = primaryLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockstrapModalDefaultsFooterData]
  }
  
  @scala.inline
  implicit class KnockstrapModalDefaultsFooterDataMutableBuilder[Self <: KnockstrapModalDefaultsFooterData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloseLabel(value: String): Self = StObject.set(x, "closeLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryLabel(value: String): Self = StObject.set(x, "primaryLabel", value.asInstanceOf[js.Any])
  }
}
