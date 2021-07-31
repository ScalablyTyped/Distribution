package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Video Format List Response
  */
trait SchemaVideoFormatsListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#videoFormatsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Video format collection.
    */
  var videoFormats: js.UndefOr[js.Array[SchemaVideoFormat]] = js.undefined
}
object SchemaVideoFormatsListResponse {
  
  @scala.inline
  def apply(): SchemaVideoFormatsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoFormatsListResponse]
  }
  
  @scala.inline
  implicit class SchemaVideoFormatsListResponseMutableBuilder[Self <: SchemaVideoFormatsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setVideoFormats(value: js.Array[SchemaVideoFormat]): Self = StObject.set(x, "videoFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoFormatsUndefined: Self = StObject.set(x, "videoFormats", js.undefined)
    
    @scala.inline
    def setVideoFormatsVarargs(value: SchemaVideoFormat*): Self = StObject.set(x, "videoFormats", js.Array(value :_*))
  }
}
