package typings.igniteUi.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Level extends StObject {
  
  /**
    * Returns the caption of the level used when displaying the name of the level to the user.
    *
    * @param value
    */
  def caption(value: js.Object): String
  
  /**
    * Returns the distance of the level from the root of the level. Root level is zero (0)
    *
    * @param value
    */
  def depth(value: js.Object): Double
  
  /**
    * Returns a user-friendly description of the level.
    *
    * @param value
    */
  def description(value: js.Object): String
  
  /**
    * Returns the unique name of the dimension that contains the level.
    *
    * @param value
    */
  def dimensionUniqueName(value: js.Object): String
  
  /**
    * Returns the unique name of the hierarchy that contains the level.
    *
    * @param value
    */
  def hierarchyUniqueName(value: js.Object): String
  
  /**
    * Returns the ID of the attribute that the level is sorted on.
    *
    * @param value
    */
  def levelOrderingProperty(value: js.Object): Double
  
  /**
    * Returns a value that defines how the level was sourced.
    *
    * @param value
    */
  def levelOrigin(value: js.Object): Double
  
  /**
    * Returns the count of all members in the level.
    *
    * @param value
    */
  def membersCount(value: js.Object): Double
  
  /**
    * Returns the name of the level.
    *
    * @param value
    */
  def name(value: js.Object): String
  
  /**
    * Returns the unique name of the level.
    *
    * @param value
    */
  def uniqueName(value: js.Object): String
}
object Level {
  
  inline def apply(
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
  
  extension [Self <: Level](x: Self) {
    
    inline def setCaption(value: js.Object => String): Self = StObject.set(x, "caption", js.Any.fromFunction1(value))
    
    inline def setDepth(value: js.Object => Double): Self = StObject.set(x, "depth", js.Any.fromFunction1(value))
    
    inline def setDescription(value: js.Object => String): Self = StObject.set(x, "description", js.Any.fromFunction1(value))
    
    inline def setDimensionUniqueName(value: js.Object => String): Self = StObject.set(x, "dimensionUniqueName", js.Any.fromFunction1(value))
    
    inline def setHierarchyUniqueName(value: js.Object => String): Self = StObject.set(x, "hierarchyUniqueName", js.Any.fromFunction1(value))
    
    inline def setLevelOrderingProperty(value: js.Object => Double): Self = StObject.set(x, "levelOrderingProperty", js.Any.fromFunction1(value))
    
    inline def setLevelOrigin(value: js.Object => Double): Self = StObject.set(x, "levelOrigin", js.Any.fromFunction1(value))
    
    inline def setMembersCount(value: js.Object => Double): Self = StObject.set(x, "membersCount", js.Any.fromFunction1(value))
    
    inline def setName(value: js.Object => String): Self = StObject.set(x, "name", js.Any.fromFunction1(value))
    
    inline def setUniqueName(value: js.Object => String): Self = StObject.set(x, "uniqueName", js.Any.fromFunction1(value))
  }
}
