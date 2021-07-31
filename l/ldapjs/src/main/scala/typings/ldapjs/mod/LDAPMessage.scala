package typings.ldapjs.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ldapjs", "LDAPMessage")
@js.native
abstract class LDAPMessage () extends StObject {
  
  var controls: js.Array[Control] = js.native
  
  val dn: String = js.native
  
  val id: Double = js.native
  
  /** A plain object with main properties */
  val json: LDAPMessageJsonObject = js.native
  
  var log: js.Any = js.native
  
  var messageID: Double = js.native
  
  def parse(ber: Buffer): Boolean = js.native
  
  var protocolOp: js.UndefOr[String] = js.native
  
  def toBer(): Buffer = js.native
  
  val `type`: String = js.native
}
