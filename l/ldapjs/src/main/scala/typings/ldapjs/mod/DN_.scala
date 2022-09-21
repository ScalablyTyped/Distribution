package typings.ldapjs.mod

import typings.ldapjs.mod.dn.DN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ldapjs", "DN")
@js.native
open class DN_ ()
  extends StObject
     with DN {
  def this(rdns: js.Array[typings.ldapjs.mod.dn.RDN]) = this()
}
/* static members */
object DN_ {
  
  @JSImport("ldapjs", "DN")
  @js.native
  val ^ : js.Any = js.native
  
  /** Checks if the given value is a DN */
  inline def isDN(dn: Any): /* is ldapjs.ldapjs.dn.DN */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDN")(dn.asInstanceOf[js.Any]).asInstanceOf[/* is ldapjs.ldapjs.dn.DN */ Boolean]
}
