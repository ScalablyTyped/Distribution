package typings.kafkajs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Metadata extends js.Object {
  var metadata: Buffer
  var name: String
}

object Anon_Metadata {
  @scala.inline
  def apply(metadata: Buffer, name: String): Anon_Metadata = {
    val __obj = js.Dynamic.literal(metadata = metadata, name = name)
  
    __obj.asInstanceOf[Anon_Metadata]
  }
}

