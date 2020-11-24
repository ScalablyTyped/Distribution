package typings.ipfsCore.errorsMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.ipfsCore.anon.TypeofNotEnabledError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotEnabledError extends Error {
  
  var code: String = js.native
}
@JSImport("ipfs-core/dist/src/errors", "NotEnabledError")
@js.native
object NotEnabledError
  extends TopLevel[
      TypeofNotEnabledError with (Instantiable1[/* message */ js.UndefOr[String], NotEnabledError])
    ]
