package typings.luxon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("luxon", "IANAZone")
@js.native
class IANAZone protected () extends Zone {
  def this(ianaString: String) = this()
}
/* static members */
object IANAZone {
  
  @JSImport("luxon", "IANAZone")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(name: String): IANAZone = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[IANAZone]
  
  @scala.inline
  def isValidSpecifier(s: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidSpecifier")(s.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isValidZone(zone: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidZone")(zone.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def resetCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetCache")().asInstanceOf[Unit]
}
