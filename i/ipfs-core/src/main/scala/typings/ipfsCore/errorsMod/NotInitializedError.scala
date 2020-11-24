package typings.ipfsCore.errorsMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.ipfsCore.anon.TypeofNotInitializedError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotInitializedError extends Error {
  
  var code: String = js.native
}
@JSImport("ipfs-core/dist/src/errors", "NotInitializedError")
@js.native
object NotInitializedError
  extends TopLevel[
      TypeofNotInitializedError with (Instantiable1[/* message */ js.UndefOr[String], NotInitializedError])
    ]
