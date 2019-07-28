package typings.jointjs.jointjsMod.VectorizerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QualifiedAttribute extends js.Object {
  var local: String
  var ns: String | Null
}

object QualifiedAttribute {
  @scala.inline
  def apply(local: String, ns: String = null): QualifiedAttribute = {
    val __obj = js.Dynamic.literal(local = local)
    if (ns != null) __obj.updateDynamic("ns")(ns)
    __obj.asInstanceOf[QualifiedAttribute]
  }
}

