package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Screenshot extends StObject {
  
  /** [Output Only] The Base64-encoded screenshot data. */
  var contents: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Type of the resource. Always compute#screenshot for the screenshots. */
  var kind: js.UndefOr[String] = js.undefined
}
object Screenshot {
  
  @scala.inline
  def apply(): Screenshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Screenshot]
  }
  
  @scala.inline
  implicit class ScreenshotMutableBuilder[Self <: Screenshot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
