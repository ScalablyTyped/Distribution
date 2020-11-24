package typings.ipfsCore.errorsMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.ipfsCore.anon.TypeofNotStartedError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotStartedError extends Error {
  
  var code: String = js.native
}
@JSImport("ipfs-core/dist/src/errors", "NotStartedError")
@js.native
object NotStartedError
  extends TopLevel[
      TypeofNotStartedError with (Instantiable1[/* message */ js.UndefOr[String], NotStartedError])
    ]
