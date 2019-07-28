package typings.jsDashSearch.jsDashSearchMod

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
    val __obj = js.Dynamic.literal($document = $document, $numTokenOccurrences = $numTokenOccurrences)
  
    __obj.asInstanceOf[ITfIdfUidMetadata]
  }
}

