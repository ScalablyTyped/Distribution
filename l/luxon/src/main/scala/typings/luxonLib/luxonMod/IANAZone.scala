package typings
package luxonLib.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("luxon", "IANAZone")
@js.native
class IANAZone protected () extends Zone {
  def this(ianaString: java.lang.String) = this()
}

/* static members */
@JSImport("luxon", "IANAZone")
@js.native
object IANAZone extends js.Object {
  def create(name: java.lang.String): luxonLib.luxonMod.IANAZone = js.native
  def isValidSpecifier(s: java.lang.String): scala.Boolean = js.native
  def isValidZone(zone: java.lang.String): scala.Boolean = js.native
  def resetCache(): scala.Unit = js.native
}

