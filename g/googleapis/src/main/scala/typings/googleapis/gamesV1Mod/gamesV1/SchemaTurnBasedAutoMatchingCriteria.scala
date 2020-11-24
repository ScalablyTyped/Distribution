package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for an turn-based auto-match criteria object.
  */
@js.native
trait SchemaTurnBasedAutoMatchingCriteria extends js.Object {
  
  /**
    * A bitmask indicating when auto-matches are valid. When ANDed with other
    * exclusive bitmasks, the result must be zero. Can be used to support
    * exclusive roles within a game.
    */
  var exclusiveBitmask: js.UndefOr[String] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#turnBasedAutoMatchingCriteria.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of players that should be added to the match by
    * auto-matching.
    */
  var maxAutoMatchingPlayers: js.UndefOr[Double] = js.native
  
  /**
    * The minimum number of players that should be added to the match by
    * auto-matching.
    */
  var minAutoMatchingPlayers: js.UndefOr[Double] = js.native
}
object SchemaTurnBasedAutoMatchingCriteria {
  
  @scala.inline
  def apply(): SchemaTurnBasedAutoMatchingCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTurnBasedAutoMatchingCriteria]
  }
  
  @scala.inline
  implicit class SchemaTurnBasedAutoMatchingCriteriaOps[Self <: SchemaTurnBasedAutoMatchingCriteria] (val x: Self) extends AnyVal {
    
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
    def setExclusiveBitmask(value: String): Self = this.set("exclusiveBitmask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusiveBitmask: Self = this.set("exclusiveBitmask", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMaxAutoMatchingPlayers(value: Double): Self = this.set("maxAutoMatchingPlayers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAutoMatchingPlayers: Self = this.set("maxAutoMatchingPlayers", js.undefined)
    
    @scala.inline
    def setMinAutoMatchingPlayers(value: Double): Self = this.set("minAutoMatchingPlayers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinAutoMatchingPlayers: Self = this.set("minAutoMatchingPlayers", js.undefined)
  }
}
