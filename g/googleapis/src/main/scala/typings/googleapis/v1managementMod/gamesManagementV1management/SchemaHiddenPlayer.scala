package typings.googleapis.v1managementMod.gamesManagementV1management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for the HiddenPlayer resource.
  */
@js.native
trait SchemaHiddenPlayer extends js.Object {
  
  /**
    * The time this player was hidden.
    */
  var hiddenTimeMillis: js.UndefOr[String] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesManagement#hiddenPlayer.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The player information.
    */
  var player: js.UndefOr[SchemaPlayer] = js.native
}
object SchemaHiddenPlayer {
  
  @scala.inline
  def apply(): SchemaHiddenPlayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHiddenPlayer]
  }
  
  @scala.inline
  implicit class SchemaHiddenPlayerOps[Self <: SchemaHiddenPlayer] (val x: Self) extends AnyVal {
    
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
    def setHiddenTimeMillis(value: String): Self = this.set("hiddenTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiddenTimeMillis: Self = this.set("hiddenTimeMillis", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPlayer(value: SchemaPlayer): Self = this.set("player", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlayer: Self = this.set("player", js.undefined)
  }
}
