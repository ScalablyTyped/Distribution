package typings.matrixBotSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-bot-sdk", "ProfileCache")
@js.native
open class ProfileCache protected ()
  extends typings.matrixBotSdk.libHelpersProfileCacheMod.ProfileCache {
  /**
    * Creates a new profile cache.
    * @param {number} maxEntries The maximum number of entries to cache.
    * @param {number} maxAgeMs The maximum age of an entry in milliseconds.
    * @param {MatrixClient} client The client to use to get profile updates.
    */
  def this(maxEntries: Double, maxAgeMs: Double, client: MatrixClient) = this()
}
