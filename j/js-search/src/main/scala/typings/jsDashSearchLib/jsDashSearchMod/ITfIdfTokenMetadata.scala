package typings
package jsDashSearchLib.jsDashSearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITfIdfTokenMetadata extends js.Object {
  @JSName("$numDocumentOccurrences")
  var $numDocumentOccurrences: scala.Double
  @JSName("$totalNumOccurrences")
  var $totalNumOccurrences: scala.Double
  @JSName("$uidMap")
  var $uidMap: ITfIdfUidMap
}

object ITfIdfTokenMetadata {
  @scala.inline
  def apply($numDocumentOccurrences: scala.Double, $totalNumOccurrences: scala.Double, $uidMap: ITfIdfUidMap): ITfIdfTokenMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$numDocumentOccurrences")($numDocumentOccurrences)
    __obj.updateDynamic("$totalNumOccurrences")($totalNumOccurrences)
    __obj.updateDynamic("$uidMap")($uidMap)
    __obj.asInstanceOf[ITfIdfTokenMetadata]
  }
}

