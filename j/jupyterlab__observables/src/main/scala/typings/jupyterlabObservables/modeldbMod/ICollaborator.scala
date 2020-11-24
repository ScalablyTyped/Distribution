package typings.jupyterlabObservables.modeldbMod

import typings.luminoCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICollaborator extends JSONObject {
  
  /**
    * A color to be used to identify the collaborator in
    * UI elements.
    */
  val color: String = js.native
  
  /**
    * A human-readable display name for a collaborator.
    */
  val displayName: String = js.native
  
  /**
    * A session id, which should be unique to a
    * particular view on a collaborative model.
    */
  val sessionId: String = js.native
  
  /**
    * A human-readable short name for a collaborator, for
    * use in places where the full `displayName` would take
    * too much space.
    */
  val shortName: String = js.native
  
  /**
    * A user id for the collaborator.
    * This might not be unique, if the user has more than
    * one editing session at a time.
    */
  val userId: String = js.native
}
object ICollaborator {
  
  @scala.inline
  def apply(color: String, displayName: String, sessionId: String, shortName: String, userId: String): ICollaborator = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], shortName = shortName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICollaborator]
  }
  
  @scala.inline
  implicit class ICollaboratorOps[Self <: ICollaborator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionId(value: String): Self = this.set("sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortName(value: String): Self = this.set("shortName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
  }
}
