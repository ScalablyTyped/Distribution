package typings.ipfsCore.errorsMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.ipfsCore.anon.TypeofAlreadyInitializedE
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlreadyInitializedError extends Error {
  
  var code: String = js.native
}
@JSImport("ipfs-core/dist/src/errors", "AlreadyInitializedError")
@js.native
object AlreadyInitializedError
  extends TopLevel[
      TypeofAlreadyInitializedE with (Instantiable1[/* message */ js.UndefOr[String], AlreadyInitializedError])
    ]
