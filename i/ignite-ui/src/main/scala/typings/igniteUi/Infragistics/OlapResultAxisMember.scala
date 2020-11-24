package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OlapResultAxisMember extends js.Object {
  
  /**
    * Returns the caption of the axis member used when displaying the name of the axis member to the user.
    *
    * @param value
    */
  def caption(value: js.Object): String = js.native
  
  /**
    * Returns the count of children members this member has.
    *
    * @param value
    */
  def childCount(value: js.Object): Double = js.native
  
  /**
    * A bitmap of the information projected by childCount, drilledDown and parentSameAsPrev properties.
    *
    * @param value
    */
  def displayInfo(value: js.Object): Double = js.native
  
  /**
    * Returns a value that indicates whether at least one child of this member appears on the axis, immediately following all occurrences of that member. This can be used by applications to display a "+" or a "-" next to the member.
    *
    * @param value
    */
  def drilledDown(value: js.Object): Boolean = js.native
  
  /**
    * Returns the unique name of the hierarchy that contains the level.
    *
    * @param value
    */
  def hierarchyUniqueName(value: js.Object): String = js.native
  
  /**
    * Returns the distance of member parent level from the root of the level. Root level is zero (0)
    *
    * @param value
    */
  def levelNumber(value: js.Object): Double = js.native
  
  /**
    * Returns the unique name of the level this member belongs to.
    *
    * @param value
    */
  def levelUniqueName(value: js.Object): String = js.native
  
  /**
    * Returns a value that indicates whether the parent of this member is the same as the parent of the member preceding all occurrences of the current member.
    *
    * @param value
    */
  def parentSameAsPrev(value: js.Object): Boolean = js.native
  
  /**
    * Returns a key value map of the members' properties. By default only 'PARENT_UNIQUE_NAME' and 'CHILDREN_CARDINALITY' properties are available.
    *
    * @param value
    */
  def properties(value: js.Object): js.Object = js.native
  
  /**
    * Returns the unique name of the axis member.
    *
    * @param value
    */
  def uniqueName(value: js.Object): String = js.native
}
object OlapResultAxisMember {
  
  @scala.inline
  def apply(
    caption: js.Object => String,
    childCount: js.Object => Double,
    displayInfo: js.Object => Double,
    drilledDown: js.Object => Boolean,
    hierarchyUniqueName: js.Object => String,
    levelNumber: js.Object => Double,
    levelUniqueName: js.Object => String,
    parentSameAsPrev: js.Object => Boolean,
    properties: js.Object => js.Object,
    uniqueName: js.Object => String
  ): OlapResultAxisMember = {
    val __obj = js.Dynamic.literal(caption = js.Any.fromFunction1(caption), childCount = js.Any.fromFunction1(childCount), displayInfo = js.Any.fromFunction1(displayInfo), drilledDown = js.Any.fromFunction1(drilledDown), hierarchyUniqueName = js.Any.fromFunction1(hierarchyUniqueName), levelNumber = js.Any.fromFunction1(levelNumber), levelUniqueName = js.Any.fromFunction1(levelUniqueName), parentSameAsPrev = js.Any.fromFunction1(parentSameAsPrev), properties = js.Any.fromFunction1(properties), uniqueName = js.Any.fromFunction1(uniqueName))
    __obj.asInstanceOf[OlapResultAxisMember]
  }
  
  @scala.inline
  implicit class OlapResultAxisMemberOps[Self <: OlapResultAxisMember] (val x: Self) extends AnyVal {
    
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
    def setChildCount(value: js.Object => Double): Self = this.set("childCount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisplayInfo(value: js.Object => Double): Self = this.set("displayInfo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDrilledDown(value: js.Object => Boolean): Self = this.set("drilledDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHierarchyUniqueName(value: js.Object => String): Self = this.set("hierarchyUniqueName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLevelNumber(value: js.Object => Double): Self = this.set("levelNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLevelUniqueName(value: js.Object => String): Self = this.set("levelUniqueName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParentSameAsPrev(value: js.Object => Boolean): Self = this.set("parentSameAsPrev", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProperties(value: js.Object => js.Object): Self = this.set("properties", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUniqueName(value: js.Object => String): Self = this.set("uniqueName", js.Any.fromFunction1(value))
  }
}
