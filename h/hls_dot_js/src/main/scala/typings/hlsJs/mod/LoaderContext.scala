package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoaderContext extends StObject {
  
  /**
    * fragment object
    */
  var frag: Fragment = js.native
  
  /**
    * level id
    */
  var level: Double = js.native
  
  /**
    * true if onProgress should report partial chunk of loaded content
    */
  var progressData: js.UndefOr[Boolean] = js.native
  
  /**
    * end byte range offset
    */
  var rangeEnd: js.UndefOr[Double] = js.native
  
  /**
    * start byte range offset
    */
  var rangeStart: js.UndefOr[Double] = js.native
  
  /**
    * loader response type (arraybuffer or default response type for playlist)
    */
  var responseType: String = js.native
  
  /**
    * request type
    * - level, manifest
    */
  var `type`: String = js.native
  
  /**
    * target URL
    */
  var url: String = js.native
}
object LoaderContext {
  
  @scala.inline
  def apply(frag: Fragment, level: Double, responseType: String, `type`: String, url: String): LoaderContext = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderContext]
  }
  
  @scala.inline
  implicit class LoaderContextMutableBuilder[Self <: LoaderContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressData(value: Boolean): Self = StObject.set(x, "progressData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressDataUndefined: Self = StObject.set(x, "progressData", js.undefined)
    
    @scala.inline
    def setRangeEnd(value: Double): Self = StObject.set(x, "rangeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeEndUndefined: Self = StObject.set(x, "rangeEnd", js.undefined)
    
    @scala.inline
    def setRangeStart(value: Double): Self = StObject.set(x, "rangeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeStartUndefined: Self = StObject.set(x, "rangeStart", js.undefined)
    
    @scala.inline
    def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
