package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetadataRemovedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the data.
    */
  var metadata: js.UndefOr[js.Any] = js.native
}
object MetadataRemovedEventUIParam {
  
  @scala.inline
  def apply(): MetadataRemovedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataRemovedEventUIParam]
  }
  
  @scala.inline
  implicit class MetadataRemovedEventUIParamMutableBuilder[Self <: MetadataRemovedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
