package typings.lyricist.mod

import typings.lyricist.anon.Apipath
import typings.lyricist.anon.Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescriptionAnnotation extends js.Object {
  
  var _type: String = js.native
  
  var annotatable: Apipath = js.native
  
  var annotations: js.Array[Annotation] = js.native
  
  var annotator_id: Double = js.native
  
  var annotator_login: String = js.native
  
  var api_path: String = js.native
  
  var classification: String = js.native
  
  var fragment: String = js.native
  
  var id: Double = js.native
  
  var is_description: Boolean = js.native
  
  var path: String = js.native
  
  var range: Content = js.native
  
  var song_id: Double = js.native
  
  var url: String = js.native
  
  var verified_annotator_ids: js.Array[_] = js.native
}
object DescriptionAnnotation {
  
  @scala.inline
  def apply(
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
    verified_annotator_ids: js.Array[_]
  ): DescriptionAnnotation = {
    val __obj = js.Dynamic.literal(_type = _type.asInstanceOf[js.Any], annotatable = annotatable.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], annotator_id = annotator_id.asInstanceOf[js.Any], annotator_login = annotator_login.asInstanceOf[js.Any], api_path = api_path.asInstanceOf[js.Any], classification = classification.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_description = is_description.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], song_id = song_id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verified_annotator_ids = verified_annotator_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionAnnotation]
  }
  
  @scala.inline
  implicit class DescriptionAnnotationOps[Self <: DescriptionAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_type(value: String): Self = this.set("_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotatable(value: Apipath): Self = this.set("annotatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationsVarargs(value: Annotation*): Self = this.set("annotations", js.Array(value :_*))
    
    @scala.inline
    def setAnnotations(value: js.Array[Annotation]): Self = this.set("annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotator_id(value: Double): Self = this.set("annotator_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotator_login(value: String): Self = this.set("annotator_login", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApi_path(value: String): Self = this.set("api_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassification(value: String): Self = this.set("classification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragment(value: String): Self = this.set("fragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_description(value: Boolean): Self = this.set("is_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Content): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSong_id(value: Double): Self = this.set("song_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerified_annotator_idsVarargs(value: js.Any*): Self = this.set("verified_annotator_ids", js.Array(value :_*))
    
    @scala.inline
    def setVerified_annotator_ids(value: js.Array[_]): Self = this.set("verified_annotator_ids", value.asInstanceOf[js.Any])
  }
}
