package typings.ipAddress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("ip-address/dist/lib/v6/helpers", "simpleGroup")
  @js.native
  def simpleGroup(addressString: String): js.Array[String] = js.native
  @JSImport("ip-address/dist/lib/v6/helpers", "simpleGroup")
  @js.native
  def simpleGroup(addressString: String, offset: Double): js.Array[String] = js.native
  
  @JSImport("ip-address/dist/lib/v6/helpers", "spanAll")
  @js.native
  def spanAll(s: String): String = js.native
  @JSImport("ip-address/dist/lib/v6/helpers", "spanAll")
  @js.native
  def spanAll(s: String, offset: Double): String = js.native
  
  @JSImport("ip-address/dist/lib/v6/helpers", "spanAllZeroes")
  @js.native
  def spanAllZeroes(s: String): String = js.native
  
  @JSImport("ip-address/dist/lib/v6/helpers", "spanLeadingZeroes")
  @js.native
  def spanLeadingZeroes(address: String): String = js.native
}
