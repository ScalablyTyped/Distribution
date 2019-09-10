package typings.kafkaDashNode

import typings.kafkaDashNode.kafkaDashNodeMod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeSynonyms extends js.Object {
  var includeSynonyms: Boolean
  var resources: js.Array[Resource]
}

object Anon_IncludeSynonyms {
  @scala.inline
  def apply(includeSynonyms: Boolean, resources: js.Array[Resource]): Anon_IncludeSynonyms = {
    val __obj = js.Dynamic.literal(includeSynonyms = includeSynonyms, resources = resources)
  
    __obj.asInstanceOf[Anon_IncludeSynonyms]
  }
}

