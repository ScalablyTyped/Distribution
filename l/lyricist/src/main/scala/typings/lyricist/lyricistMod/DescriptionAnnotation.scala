package typings.lyricist.lyricistMod

import typings.lyricist.Anon_Apipath
import typings.lyricist.Anon_Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescriptionAnnotation extends js.Object {
  var _type: String
  var annotatable: Anon_Apipath
  var annotations: js.Array[Annotation]
  var annotator_id: Double
  var annotator_login: String
  var api_path: String
  var classification: String
  var fragment: String
  var id: Double
  var is_description: Boolean
  var path: String
  var range: Anon_Content
  var song_id: Double
  var url: String
  var verified_annotator_ids: js.Array[_]
}

object DescriptionAnnotation {
  @scala.inline
  def apply(
    _type: String,
    annotatable: Anon_Apipath,
    annotations: js.Array[Annotation],
    annotator_id: Double,
    annotator_login: String,
    api_path: String,
    classification: String,
    fragment: String,
    id: Double,
    is_description: Boolean,
    path: String,
    range: Anon_Content,
    song_id: Double,
    url: String,
    verified_annotator_ids: js.Array[_]
  ): DescriptionAnnotation = {
    val __obj = js.Dynamic.literal(_type = _type.asInstanceOf[js.Any], annotatable = annotatable.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], annotator_id = annotator_id.asInstanceOf[js.Any], annotator_login = annotator_login.asInstanceOf[js.Any], api_path = api_path.asInstanceOf[js.Any], classification = classification.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_description = is_description.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], song_id = song_id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verified_annotator_ids = verified_annotator_ids.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescriptionAnnotation]
  }
}

