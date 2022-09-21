package typings.igniteUi.global.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Infragistics.OlapResultAxisMember")
@js.native
open class OlapResultAxisMember ()
  extends StObject
     with typings.igniteUi.Infragistics.OlapResultAxisMember {
  
  /**
    * Returns the caption of the axis member used when displaying the name of the axis member to the user.
    *
    * @param value
    */
  /* CompleteClass */
  override def caption(value: js.Object): String = js.native
  
  /**
    * Returns the count of children members this member has.
    *
    * @param value
    */
  /* CompleteClass */
  override def childCount(value: js.Object): Double = js.native
  
  /**
    * A bitmap of the information projected by childCount, drilledDown and parentSameAsPrev properties.
    *
    * @param value
    */
  /* CompleteClass */
  override def displayInfo(value: js.Object): Double = js.native
  
  /**
    * Returns a value that indicates whether at least one child of this member appears on the axis, immediately following all occurrences of that member. This can be used by applications to display a "+" or a "-" next to the member.
    *
    * @param value
    */
  /* CompleteClass */
  override def drilledDown(value: js.Object): Boolean = js.native
  
  /**
    * Returns the unique name of the hierarchy that contains the level.
    *
    * @param value
    */
  /* CompleteClass */
  override def hierarchyUniqueName(value: js.Object): String = js.native
  
  /**
    * Returns the distance of member parent level from the root of the level. Root level is zero (0)
    *
    * @param value
    */
  /* CompleteClass */
  override def levelNumber(value: js.Object): Double = js.native
  
  /**
    * Returns the unique name of the level this member belongs to.
    *
    * @param value
    */
  /* CompleteClass */
  override def levelUniqueName(value: js.Object): String = js.native
  
  /**
    * Returns a value that indicates whether the parent of this member is the same as the parent of the member preceding all occurrences of the current member.
    *
    * @param value
    */
  /* CompleteClass */
  override def parentSameAsPrev(value: js.Object): Boolean = js.native
  
  /**
    * Returns a key value map of the members' properties. By default only 'PARENT_UNIQUE_NAME' and 'CHILDREN_CARDINALITY' properties are available.
    *
    * @param value
    */
  /* CompleteClass */
  override def properties(value: js.Object): js.Object = js.native
  
  /**
    * Returns the unique name of the axis member.
    *
    * @param value
    */
  /* CompleteClass */
  override def uniqueName(value: js.Object): String = js.native
}
