package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Metadata extends js.Object {
  var metadata: nodeLib.Buffer
  var name: java.lang.String
}

object Anon_Metadata {
  @scala.inline
  def apply(metadata: nodeLib.Buffer, name: java.lang.String): Anon_Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("metadata")(metadata)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Metadata]
  }
}

