package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataRemovingEventUIParam extends StObject {
  
  /**
    * Gets a reference to the data.
    */
  var metadata: js.UndefOr[js.Any] = js.undefined
  
  /**
    * A reference to the dragged element.
    */
  var targetElement: js.UndefOr[String] = js.undefined
}
object MetadataRemovingEventUIParam {
  
  @scala.inline
  def apply(): MetadataRemovingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataRemovingEventUIParam]
  }
  
  @scala.inline
  implicit class MetadataRemovingEventUIParamMutableBuilder[Self <: MetadataRemovingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setTargetElement(value: String): Self = StObject.set(x, "targetElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetElementUndefined: Self = StObject.set(x, "targetElement", js.undefined)
  }
}
