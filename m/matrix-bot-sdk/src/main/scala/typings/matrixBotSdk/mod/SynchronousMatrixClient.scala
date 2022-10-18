package typings.matrixBotSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("matrix-bot-sdk", "SynchronousMatrixClient")
@js.native
open class SynchronousMatrixClient protected ()
  extends typings.matrixBotSdk.libSynchronousMatrixClientMod.SynchronousMatrixClient {
  /**
    * Creates a new SynchronousMatrixClient. Note that this accepts a MatrixClient, though
    * much of the class's properties are not brought over. Always convert your MatrixClient
    * instance to a SynchronousMatrixClient as soon as possible to avoid diversion in which
    * properties are proxied over.
    * @param {MatrixClient} baseClient The client to wrap.
    */
  /* protected */ def this(baseClient: typings.matrixBotSdk.libMatrixClientMod.MatrixClient) = this()
}
