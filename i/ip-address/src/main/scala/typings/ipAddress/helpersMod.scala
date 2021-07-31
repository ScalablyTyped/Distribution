package typings.ipAddress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("ip-address/dist/lib/v6/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def simpleGroup(addressString: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("simpleGroup")(addressString.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def simpleGroup(addressString: String, offset: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleGroup")(addressString.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def spanAll(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("spanAll")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def spanAll(s: String, offset: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("spanAll")(s.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def spanAllZeroes(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("spanAllZeroes")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def spanLeadingZeroes(address: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("spanLeadingZeroes")(address.asInstanceOf[js.Any]).asInstanceOf[String]
}
