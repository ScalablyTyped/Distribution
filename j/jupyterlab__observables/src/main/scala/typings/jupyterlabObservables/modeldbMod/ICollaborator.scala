package typings.jupyterlabObservables.modeldbMod

import typings.luminoCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICollaborator extends JSONObject {
  /**
    * A color to be used to identify the collaborator in
    * UI elements.
    */
  val color: String
  /**
    * A human-readable display name for a collaborator.
    */
  val displayName: String
  /**
    * A session id, which should be unique to a
    * particular view on a collaborative model.
    */
  val sessionId: String
  /**
    * A human-readable short name for a collaborator, for
    * use in places where the full `displayName` would take
    * too much space.
    */
  val shortName: String
  /**
    * A user id for the collaborator.
    * This might not be unique, if the user has more than
    * one editing session at a time.
    */
  val userId: String
}

object ICollaborator {
  @scala.inline
  def apply(color: String, displayName: String, sessionId: String, shortName: String, userId: String): ICollaborator = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], shortName = shortName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICollaborator]
  }
}

