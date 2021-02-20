package typings.luxon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("luxon", "IANAZone")
@js.native
class IANAZone protected () extends Zone {
  def this(ianaString: String) = this()
}
/* static members */
object IANAZone {
  
  @JSImport("luxon", "IANAZone.create")
  @js.native
  def create(name: String): IANAZone = js.native
  
  @JSImport("luxon", "IANAZone.isValidSpecifier")
  @js.native
  def isValidSpecifier(s: String): Boolean = js.native
  
  @JSImport("luxon", "IANAZone.isValidZone")
  @js.native
  def isValidZone(zone: String): Boolean = js.native
  
  @JSImport("luxon", "IANAZone.resetCache")
  @js.native
  def resetCache(): Unit = js.native
}
