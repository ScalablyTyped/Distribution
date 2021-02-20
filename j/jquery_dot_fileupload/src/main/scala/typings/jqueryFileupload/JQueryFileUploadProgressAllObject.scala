package typings.jqueryFileupload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryFileUploadProgressAllObject extends StObject {
  
  var bitrate: js.UndefOr[Double] = js.native
  
  var loaded: js.UndefOr[Double] = js.native
  
  var total: js.UndefOr[Double] = js.native
}
object JQueryFileUploadProgressAllObject {
  
  @scala.inline
  def apply(): JQueryFileUploadProgressAllObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryFileUploadProgressAllObject]
  }
  
  @scala.inline
  implicit class JQueryFileUploadProgressAllObjectMutableBuilder[Self <: JQueryFileUploadProgressAllObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitrateUndefined: Self = StObject.set(x, "bitrate", js.undefined)
    
    @scala.inline
    def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
