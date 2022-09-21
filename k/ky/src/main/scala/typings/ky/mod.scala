package typings.ky

import org.scalablytyped.runtime.Shortcut
import typings.ky.optionsMod.NormalizedOptions
import typings.ky.typesKyMod.KyInstance
import typings.std.Request
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("ky", JSImport.Default)
  @js.native
  val default: KyInstance = js.native
  
  @JSImport("ky", "HTTPError")
  @js.native
  open class HTTPError protected ()
    extends typings.ky.httperrorMod.HTTPError {
    def this(response: Response, request: Request, options: NormalizedOptions) = this()
  }
  
  @JSImport("ky", "TimeoutError")
  @js.native
  open class TimeoutError protected ()
    extends typings.ky.timeoutErrorMod.TimeoutError {
    def this(request: Request) = this()
  }
  
  type _To = KyInstance
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: KyInstance = default
}
