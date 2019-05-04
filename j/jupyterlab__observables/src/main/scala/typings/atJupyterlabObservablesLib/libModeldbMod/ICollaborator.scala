package typings
package atJupyterlabObservablesLib.libModeldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICollaborator
  extends atPhosphorCoreutilsLib.libJsonMod.JSONObject {
  /**
    * A color to be used to identify the collaborator in
    * UI elements.
    */
  val color: java.lang.String
  /**
    * A human-readable display name for a collaborator.
    */
  val displayName: java.lang.String
  /**
    * A session id, which should be unique to a
    * particular view on a collaborative model.
    */
  val sessionId: java.lang.String
  /**
    * A human-readable short name for a collaborator, for
    * use in places where the full `displayName` would take
    * too much space.
    */
  val shortName: java.lang.String
  /**
    * A user id for the collaborator.
    * This might not be unique, if the user has more than
    * one editing session at a time.
    */
  val userId: java.lang.String
}

object ICollaborator {
  @scala.inline
  def apply(
    color: java.lang.String,
    displayName: java.lang.String,
    sessionId: java.lang.String,
    shortName: java.lang.String,
    userId: java.lang.String
  ): ICollaborator = {
    val __obj = js.Dynamic.literal(color = color, displayName = displayName, sessionId = sessionId, shortName = shortName, userId = userId)
  
    __obj.asInstanceOf[ICollaborator]
  }
}

