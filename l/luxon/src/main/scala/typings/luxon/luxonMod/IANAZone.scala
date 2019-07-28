package typings.luxon.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("luxon", "IANAZone")
@js.native
class IANAZone protected () extends Zone {
  def this(ianaString: String) = this()
}

/* static members */
@JSImport("luxon", "IANAZone")
@js.native
object IANAZone extends js.Object {
  def create(name: String): IANAZone = js.native
  def isValidSpecifier(s: String): Boolean = js.native
  def isValidZone(zone: String): Boolean = js.native
  def resetCache(): Unit = js.native
}

