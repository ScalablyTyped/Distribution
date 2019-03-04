package typings
package jointjsLib.jointjsMod.VectorizerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QualifiedAttribute extends js.Object {
  var local: java.lang.String
  var ns: java.lang.String | scala.Null
}

object QualifiedAttribute {
  @scala.inline
  def apply(local: java.lang.String, ns: java.lang.String = null): QualifiedAttribute = {
    val __obj = js.Dynamic.literal(local = local)
    if (ns != null) __obj.updateDynamic("ns")(ns)
    __obj.asInstanceOf[QualifiedAttribute]
  }
}

