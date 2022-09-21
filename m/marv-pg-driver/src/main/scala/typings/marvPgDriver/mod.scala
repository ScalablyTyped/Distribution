package typings.marvPgDriver

import typings.marv.mod.Driver
import typings.marvPgDriver.anon.Connection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: Connection): Driver = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Driver]
  
  @JSImport("marv-pg-driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
