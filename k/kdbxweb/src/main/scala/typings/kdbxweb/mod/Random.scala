package typings.kdbxweb.mod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Random {
  
  @JSImport("kdbxweb", "Random")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getBytes(len: Double): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getBytes")(len.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
}
