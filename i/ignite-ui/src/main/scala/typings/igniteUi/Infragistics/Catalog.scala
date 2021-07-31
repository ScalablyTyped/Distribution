package typings.igniteUi.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Catalog extends StObject {
  
  /**
    * Returns the caption of the catalog used when displaying the name of the catalog to the user.
    *
    * @param value
    */
  def caption(value: js.Object): String
  
  /**
    * Returns the description of the catalog which is a human-readable description of the catalog
    *
    * @param value
    */
  def description(value: js.Object): String
  
  /**
    * Returns the name of the catalog.
    *
    * @param value
    */
  def name(value: js.Object): String
  
  /**
    * Returns the unique name of the catalog.
    *
    * @param value
    */
  def uniqueName(value: js.Object): String
}
object Catalog {
  
  @scala.inline
  def apply(
    caption: js.Object => String,
    description: js.Object => String,
    name: js.Object => String,
    uniqueName: js.Object => String
  ): Catalog = {
    val __obj = js.Dynamic.literal(caption = js.Any.fromFunction1(caption), description = js.Any.fromFunction1(description), name = js.Any.fromFunction1(name), uniqueName = js.Any.fromFunction1(uniqueName))
    __obj.asInstanceOf[Catalog]
  }
  
  @scala.inline
  implicit class CatalogMutableBuilder[Self <: Catalog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaption(value: js.Object => String): Self = StObject.set(x, "caption", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDescription(value: js.Object => String): Self = StObject.set(x, "description", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: js.Object => String): Self = StObject.set(x, "name", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUniqueName(value: js.Object => String): Self = StObject.set(x, "uniqueName", js.Any.fromFunction1(value))
  }
}
