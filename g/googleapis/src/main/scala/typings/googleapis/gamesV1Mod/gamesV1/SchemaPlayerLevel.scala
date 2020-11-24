package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for 1P/3P metadata about a user&#39;s level.
  */
@js.native
trait SchemaPlayerLevel extends js.Object {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#playerLevel.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The level for the user.
    */
  var level: js.UndefOr[Double] = js.native
  
  /**
    * The maximum experience points for this level.
    */
  var maxExperiencePoints: js.UndefOr[String] = js.native
  
  /**
    * The minimum experience points for this level.
    */
  var minExperiencePoints: js.UndefOr[String] = js.native
}
object SchemaPlayerLevel {
  
  @scala.inline
  def apply(): SchemaPlayerLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlayerLevel]
  }
  
  @scala.inline
  implicit class SchemaPlayerLevelOps[Self <: SchemaPlayerLevel] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setMaxExperiencePoints(value: String): Self = this.set("maxExperiencePoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxExperiencePoints: Self = this.set("maxExperiencePoints", js.undefined)
    
    @scala.inline
    def setMinExperiencePoints(value: String): Self = this.set("minExperiencePoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinExperiencePoints: Self = this.set("minExperiencePoints", js.undefined)
  }
}
