package typings.libnpmexec

import typings.libnpmexec.anon.Args
import typings.libnpmexec.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(opts: Args): js.Promise[Code] = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Code]]
  
  @JSImport("libnpmexec", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
