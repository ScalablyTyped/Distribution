package typings.googlemaps.google.maps.places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryAutocompletePrediction extends js.Object {
  var description: String = js.native
  var id: js.UndefOr[String] = js.native
  var matched_substrings: js.Array[PredictionSubstring] = js.native
  var place_id: String = js.native
  var terms: js.Array[PredictionTerm] = js.native
}

object QueryAutocompletePrediction {
  @scala.inline
  def apply(
    description: String,
    matched_substrings: js.Array[PredictionSubstring],
    place_id: String,
    terms: js.Array[PredictionTerm]
  ): QueryAutocompletePrediction = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], matched_substrings = matched_substrings.asInstanceOf[js.Any], place_id = place_id.asInstanceOf[js.Any], terms = terms.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAutocompletePrediction]
  }
  @scala.inline
  implicit class QueryAutocompletePredictionOps[Self <: QueryAutocompletePrediction] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatched_substringsVarargs(value: PredictionSubstring*): Self = this.set("matched_substrings", js.Array(value :_*))
    @scala.inline
    def setMatched_substrings(value: js.Array[PredictionSubstring]): Self = this.set("matched_substrings", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlace_id(value: String): Self = this.set("place_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setTermsVarargs(value: PredictionTerm*): Self = this.set("terms", js.Array(value :_*))
    @scala.inline
    def setTerms(value: js.Array[PredictionTerm]): Self = this.set("terms", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

