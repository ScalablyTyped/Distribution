package typings.jsSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITfIdfTokenMetadata extends js.Object {
  @JSName("$numDocumentOccurrences")
  var $numDocumentOccurrences: Double
  @JSName("$totalNumOccurrences")
  var $totalNumOccurrences: Double
  @JSName("$uidMap")
  var $uidMap: ITfIdfUidMap
}

object ITfIdfTokenMetadata {
  @scala.inline
  def apply($numDocumentOccurrences: Double, $totalNumOccurrences: Double, $uidMap: ITfIdfUidMap): ITfIdfTokenMetadata = {
    val __obj = js.Dynamic.literal($numDocumentOccurrences = $numDocumentOccurrences.asInstanceOf[js.Any], $totalNumOccurrences = $totalNumOccurrences.asInstanceOf[js.Any], $uidMap = $uidMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITfIdfTokenMetadata]
  }
}

