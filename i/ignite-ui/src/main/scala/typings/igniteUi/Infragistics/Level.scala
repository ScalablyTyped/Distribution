package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Level extends js.Object {
  
  /**
    * Returns the caption of the level used when displaying the name of the level to the user.
    *
    * @param value
    */
  def caption(value: js.Object): String = js.native
  
  /**
    * Returns the distance of the level from the root of the level. Root level is zero (0)
    *
    * @param value
    */
  def depth(value: js.Object): Double = js.native
  
  /**
    * Returns a user-friendly description of the level.
    *
    * @param value
    */
  def description(value: js.Object): String = js.native
  
  /**
    * Returns the unique name of the dimension that contains the level.
    *
    * @param value
    */
  def dimensionUniqueName(value: js.Object): String = js.native
  
  /**
    * Returns the unique name of the hierarchy that contains the level.
    *
    * @param value
    */
  def hierarchyUniqueName(value: js.Object): String = js.native
  
  /**
    * Returns the ID of the attribute that the level is sorted on.
    *
    * @param value
    */
  def levelOrderingProperty(value: js.Object): Double = js.native
  
  /**
    * Returns a value that defines how the level was sourced.
    *
    * @param value
    */
  def levelOrigin(value: js.Object): Double = js.native
  
  /**
    * Returns the count of all members in the level.
    *
    * @param value
    */
  def membersCount(value: js.Object): Double = js.native
  
  /**
    * Returns the name of the level.
    *
    * @param value
    */
  def name(value: js.Object): String = js.native
  
  /**
    * Returns the unique name of the level.
    *
    * @param value
    */
  def uniqueName(value: js.Object): String = js.native
}
object Level {
  
  @scala.inline
  def apply(
    caption: js.Object => String,
    depth: js.Object => Double,
    description: js.Object => String,
    dimensionUniqueName: js.Object => String,
    hierarchyUniqueName: js.Object => String,
    levelOrderingProperty: js.Object => Double,
    levelOrigin: js.Object => Double,
    membersCount: js.Object => Double,
    name: js.Object => String,
    uniqueName: js.Object => String
  ): Level = {
    val __obj = js.Dynamic.literal(caption = js.Any.fromFunction1(caption), depth = js.Any.fromFunction1(depth), description = js.Any.fromFunction1(description), dimensionUniqueName = js.Any.fromFunction1(dimensionUniqueName), hierarchyUniqueName = js.Any.fromFunction1(hierarchyUniqueName), levelOrderingProperty = js.Any.fromFunction1(levelOrderingProperty), levelOrigin = js.Any.fromFunction1(levelOrigin), membersCount = js.Any.fromFunction1(membersCount), name = js.Any.fromFunction1(name), uniqueName = js.Any.fromFunction1(uniqueName))
    __obj.asInstanceOf[Level]
  }
  
  @scala.inline
  implicit class LevelOps[Self <: Level] (val x: Self) extends AnyVal {
    
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
    def setCaption(value: js.Object => String): Self = this.set("caption", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDepth(value: js.Object => Double): Self = this.set("depth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDescription(value: js.Object => String): Self = this.set("description", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDimensionUniqueName(value: js.Object => String): Self = this.set("dimensionUniqueName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHierarchyUniqueName(value: js.Object => String): Self = this.set("hierarchyUniqueName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLevelOrderingProperty(value: js.Object => Double): Self = this.set("levelOrderingProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLevelOrigin(value: js.Object => Double): Self = this.set("levelOrigin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMembersCount(value: js.Object => Double): Self = this.set("membersCount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: js.Object => String): Self = this.set("name", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUniqueName(value: js.Object => String): Self = this.set("uniqueName", js.Any.fromFunction1(value))
  }
}
