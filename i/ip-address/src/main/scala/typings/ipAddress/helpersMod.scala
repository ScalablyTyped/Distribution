package typings.ipAddress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ip-address/dist/lib/v6/helpers", JSImport.Namespace)
@js.native
object helpersMod extends js.Object {
  
  def simpleGroup(addressString: String): js.Array[String] = js.native
  def simpleGroup(addressString: String, offset: Double): js.Array[String] = js.native
  
  def spanAll(s: String): String = js.native
  def spanAll(s: String, offset: Double): String = js.native
  
  def spanAllZeroes(s: String): String = js.native
  
  def spanLeadingZeroes(address: String): String = js.native
}
