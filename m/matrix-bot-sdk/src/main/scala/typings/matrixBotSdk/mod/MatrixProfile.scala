package typings.matrixBotSdk.mod

import typings.matrixBotSdk.matrixProfileMod.MatrixProfileInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-bot-sdk", "MatrixProfile")
@js.native
open class MatrixProfile protected ()
  extends typings.matrixBotSdk.matrixProfileMod.MatrixProfile {
  /**
    * Creates a new profile representation for a user.
    * @param {string} userId The user ID the profile is for.
    * @param {MatrixProfile} profile The profile itself.
    */
  def this(userId: String, profile: MatrixProfileInfo) = this()
}
