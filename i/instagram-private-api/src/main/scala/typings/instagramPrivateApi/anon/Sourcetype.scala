package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sourcetype extends StObject {
  
  var source_type: String
  
  var upload_id: String
  
  var video: js.UndefOr[Audiomuted] = js.undefined
}
object Sourcetype {
  
  @scala.inline
  def apply(source_type: String, upload_id: String): Sourcetype = {
    val __obj = js.Dynamic.literal(source_type = source_type.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sourcetype]
  }
  
  @scala.inline
  implicit class SourcetypeMutableBuilder[Self <: Sourcetype] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource_type(value: String): Self = StObject.set(x, "source_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpload_id(value: String): Self = StObject.set(x, "upload_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo(value: Audiomuted): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
