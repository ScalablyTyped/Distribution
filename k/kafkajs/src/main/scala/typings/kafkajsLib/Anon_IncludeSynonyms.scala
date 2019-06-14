package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeSynonyms extends js.Object {
  var includeSynonyms: scala.Boolean
  var resources: js.Array[kafkajsLib.kafkajsMod.ResourceConfigQuery]
}

object Anon_IncludeSynonyms {
  @scala.inline
  def apply(includeSynonyms: scala.Boolean, resources: js.Array[kafkajsLib.kafkajsMod.ResourceConfigQuery]): Anon_IncludeSynonyms = {
    val __obj = js.Dynamic.literal(includeSynonyms = includeSynonyms, resources = resources)
  
    __obj.asInstanceOf[Anon_IncludeSynonyms]
  }
}

