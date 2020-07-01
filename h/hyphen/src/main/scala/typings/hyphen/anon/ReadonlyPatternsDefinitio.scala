package typings.hyphen.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<hyphen.hyphen.PatternsDefinition> */
trait ReadonlyPatternsDefinitio extends js.Object {
  val exceptions: js.Array[String]
  val patterns: js.Array[String]
}

object ReadonlyPatternsDefinitio {
  @scala.inline
  def apply(exceptions: js.Array[String], patterns: js.Array[String]): ReadonlyPatternsDefinitio = {
    val __obj = js.Dynamic.literal(exceptions = exceptions.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyPatternsDefinitio]
  }
}

