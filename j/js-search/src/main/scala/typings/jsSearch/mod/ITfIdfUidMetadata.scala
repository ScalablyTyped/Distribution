package typings.jsSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITfIdfUidMetadata extends js.Object {
  @JSName("$document")
  var $document: js.Object
  @JSName("$numTokenOccurrences")
  var $numTokenOccurrences: Double
}

object ITfIdfUidMetadata {
  @scala.inline
  def apply($document: js.Object, $numTokenOccurrences: Double): ITfIdfUidMetadata = {
    val __obj = js.Dynamic.literal($document = $document.asInstanceOf[js.Any], $numTokenOccurrences = $numTokenOccurrences.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITfIdfUidMetadata]
  }
}

