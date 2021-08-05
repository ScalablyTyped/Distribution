package typings.lyricist.mod

import typings.lyricist.anon.Apipath
import typings.lyricist.anon.Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescriptionAnnotation extends StObject {
  
  var _type: String
  
  var annotatable: Apipath
  
  var annotations: js.Array[Annotation]
  
  var annotator_id: Double
  
  var annotator_login: String
  
  var api_path: String
  
  var classification: String
  
  var fragment: String
  
  var id: Double
  
  var is_description: Boolean
  
  var path: String
  
  var range: Content
  
  var song_id: Double
  
  var url: String
  
  var verified_annotator_ids: js.Array[js.Any]
}
object DescriptionAnnotation {
  
  inline def apply(
    _type: String,
    annotatable: Apipath,
    annotations: js.Array[Annotation],
    annotator_id: Double,
    annotator_login: String,
    api_path: String,
    classification: String,
    fragment: String,
    id: Double,
    is_description: Boolean,
    path: String,
    range: Content,
    song_id: Double,
    url: String,
    verified_annotator_ids: js.Array[js.Any]
  ): DescriptionAnnotation = {
    val __obj = js.Dynamic.literal(_type = _type.asInstanceOf[js.Any], annotatable = annotatable.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], annotator_id = annotator_id.asInstanceOf[js.Any], annotator_login = annotator_login.asInstanceOf[js.Any], api_path = api_path.asInstanceOf[js.Any], classification = classification.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_description = is_description.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], song_id = song_id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verified_annotator_ids = verified_annotator_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionAnnotation]
  }
  
  extension [Self <: DescriptionAnnotation](x: Self) {
    
    inline def setAnnotatable(value: Apipath): Self = StObject.set(x, "annotatable", value.asInstanceOf[js.Any])
    
    inline def setAnnotations(value: js.Array[Annotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsVarargs(value: Annotation*): Self = StObject.set(x, "annotations", js.Array(value :_*))
    
    inline def setAnnotator_id(value: Double): Self = StObject.set(x, "annotator_id", value.asInstanceOf[js.Any])
    
    inline def setAnnotator_login(value: String): Self = StObject.set(x, "annotator_login", value.asInstanceOf[js.Any])
    
    inline def setApi_path(value: String): Self = StObject.set(x, "api_path", value.asInstanceOf[js.Any])
    
    inline def setClassification(value: String): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIs_description(value: Boolean): Self = StObject.set(x, "is_description", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Content): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setSong_id(value: Double): Self = StObject.set(x, "song_id", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVerified_annotator_ids(value: js.Array[js.Any]): Self = StObject.set(x, "verified_annotator_ids", value.asInstanceOf[js.Any])
    
    inline def setVerified_annotator_idsVarargs(value: js.Any*): Self = StObject.set(x, "verified_annotator_ids", js.Array(value :_*))
    
    inline def set_type(value: String): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
  }
}
