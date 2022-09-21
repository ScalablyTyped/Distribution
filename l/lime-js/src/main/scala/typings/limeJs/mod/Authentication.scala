package typings.limeJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lime-js", "Authentication")
@js.native
open class Authentication () extends StObject {
  
  var scheme: String = js.native
}
object Authentication {
  
  @JSImport("lime-js", "Authentication")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("lime-js", "Authentication.guest")
  @js.native
  def guest: String = js.native
  inline def guest_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("guest")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("lime-js", "Authentication.key")
  @js.native
  def key: String = js.native
  inline def key_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("key")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("lime-js", "Authentication.plain")
  @js.native
  def plain: String = js.native
  inline def plain_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plain")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("lime-js", "Authentication.transport")
  @js.native
  def transport: String = js.native
  inline def transport_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transport")(x.asInstanceOf[js.Any])
}
