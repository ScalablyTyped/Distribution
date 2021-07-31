package typings.igniteUi.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeasureGroup extends StObject {
  
  /**
    * Returns the caption of the measure group used when displaying the name of the measure group to the user.
    *
    * @param value
    */
  def caption(value: js.Object): String
  
  /**
    * Returns the name of the catalog to which this measure group belongs.
    *
    * @param value
    */
  def catalogName(value: js.Object): String
  
  /**
    * Returns the name of the cube to which this measure group belongs
    *
    * @param value
    */
  def cubeName(value: js.Object): String
  
  /**
    * Returns a user-friendly description of the measure group.
    *
    * @param value
    */
  def description(value: js.Object): String
  
  /**
    * Returns the name of the measure group.
    *
    * @param value
    */
  def name(value: js.Object): String
}
object MeasureGroup {
  
  @scala.inline
  def apply(
    caption: js.Object => String,
    catalogName: js.Object => String,
    cubeName: js.Object => String,
    description: js.Object => String,
    name: js.Object => String
  ): MeasureGroup = {
    val __obj = js.Dynamic.literal(caption = js.Any.fromFunction1(caption), catalogName = js.Any.fromFunction1(catalogName), cubeName = js.Any.fromFunction1(cubeName), description = js.Any.fromFunction1(description), name = js.Any.fromFunction1(name))
    __obj.asInstanceOf[MeasureGroup]
  }
  
  @scala.inline
  implicit class MeasureGroupMutableBuilder[Self <: MeasureGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaption(value: js.Object => String): Self = StObject.set(x, "caption", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCatalogName(value: js.Object => String): Self = StObject.set(x, "catalogName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCubeName(value: js.Object => String): Self = StObject.set(x, "cubeName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDescription(value: js.Object => String): Self = StObject.set(x, "description", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: js.Object => String): Self = StObject.set(x, "name", js.Any.fromFunction1(value))
  }
}
