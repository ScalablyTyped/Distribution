package typings.ionic.definitionsMod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageResourceTransformResult extends StObject {
  
  var error: js.UndefOr[Error] = js.native
  
  var resource: ImageResource = js.native
  
  var tmpDest: String = js.native
}
object ImageResourceTransformResult {
  
  @scala.inline
  def apply(resource: ImageResource, tmpDest: String): ImageResourceTransformResult = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any], tmpDest = tmpDest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageResourceTransformResult]
  }
  
  @scala.inline
  implicit class ImageResourceTransformResultMutableBuilder[Self <: ImageResourceTransformResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setResource(value: ImageResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTmpDest(value: String): Self = StObject.set(x, "tmpDest", value.asInstanceOf[js.Any])
  }
}
