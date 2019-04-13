package typings
package lyricistLib.lyricistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescriptionAnnotation extends js.Object {
  var _type: java.lang.String
  var annotatable: lyricistLib.Anon_Apipath
  var annotations: js.Array[Annotation]
  var annotator_id: scala.Double
  var annotator_login: java.lang.String
  var api_path: java.lang.String
  var classification: java.lang.String
  var fragment: java.lang.String
  var id: scala.Double
  var is_description: scala.Boolean
  var path: java.lang.String
  var range: lyricistLib.Anon_Content
  var song_id: scala.Double
  var url: java.lang.String
  var verified_annotator_ids: js.Array[_]
}

object DescriptionAnnotation {
  @scala.inline
  def apply(
    _type: java.lang.String,
    annotatable: lyricistLib.Anon_Apipath,
    annotations: js.Array[Annotation],
    annotator_id: scala.Double,
    annotator_login: java.lang.String,
    api_path: java.lang.String,
    classification: java.lang.String,
    fragment: java.lang.String,
    id: scala.Double,
    is_description: scala.Boolean,
    path: java.lang.String,
    range: lyricistLib.Anon_Content,
    song_id: scala.Double,
    url: java.lang.String,
    verified_annotator_ids: js.Array[_]
  ): DescriptionAnnotation = {
    val __obj = js.Dynamic.literal(_type = _type, annotatable = annotatable, annotations = annotations, annotator_id = annotator_id, annotator_login = annotator_login, api_path = api_path, classification = classification, fragment = fragment, id = id, is_description = is_description, path = path, range = range, song_id = song_id, url = url, verified_annotator_ids = verified_annotator_ids)
  
    __obj.asInstanceOf[DescriptionAnnotation]
  }
}

