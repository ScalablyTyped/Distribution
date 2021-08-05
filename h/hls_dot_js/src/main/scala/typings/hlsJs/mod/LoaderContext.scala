package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoaderContext extends StObject {
  
  /**
    * fragment object
    */
  var frag: Fragment
  
  /**
    * level id
    */
  var level: Double
  
  /**
    * true if onProgress should report partial chunk of loaded content
    */
  var progressData: js.UndefOr[Boolean] = js.undefined
  
  /**
    * end byte range offset
    */
  var rangeEnd: js.UndefOr[Double] = js.undefined
  
  /**
    * start byte range offset
    */
  var rangeStart: js.UndefOr[Double] = js.undefined
  
  /**
    * loader response type (arraybuffer or default response type for playlist)
    */
  var responseType: String
  
  /**
    * request type
    * - level, manifest
    */
  var `type`: String
  
  /**
    * target URL
    */
  var url: String
}
object LoaderContext {
  
  inline def apply(frag: Fragment, level: Double, responseType: String, `type`: String, url: String): LoaderContext = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderContext]
  }
  
  extension [Self <: LoaderContext](x: Self) {
    
    inline def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setProgressData(value: Boolean): Self = StObject.set(x, "progressData", value.asInstanceOf[js.Any])
    
    inline def setProgressDataUndefined: Self = StObject.set(x, "progressData", js.undefined)
    
    inline def setRangeEnd(value: Double): Self = StObject.set(x, "rangeEnd", value.asInstanceOf[js.Any])
    
    inline def setRangeEndUndefined: Self = StObject.set(x, "rangeEnd", js.undefined)
    
    inline def setRangeStart(value: Double): Self = StObject.set(x, "rangeStart", value.asInstanceOf[js.Any])
    
    inline def setRangeStartUndefined: Self = StObject.set(x, "rangeStart", js.undefined)
    
    inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
