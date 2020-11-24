package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeasureGroup extends js.Object {
  
  /**
    * Returns the caption of the measure group used when displaying the name of the measure group to the user.
    *
    * @param value
    */
  def caption(value: js.Object): String = js.native
  
  /**
    * Returns the name of the catalog to which this measure group belongs.
    *
    * @param value
    */
  def catalogName(value: js.Object): String = js.native
  
  /**
    * Returns the name of the cube to which this measure group belongs
    *
    * @param value
    */
  def cubeName(value: js.Object): String = js.native
  
  /**
    * Returns a user-friendly description of the measure group.
    *
    * @param value
    */
  def description(value: js.Object): String = js.native
  
  /**
    * Returns the name of the measure group.
    *
    * @param value
    */
  def name(value: js.Object): String = js.native
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
  implicit class MeasureGroupOps[Self <: MeasureGroup] (val x: Self) extends AnyVal {
    
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
    def setCatalogName(value: js.Object => String): Self = this.set("catalogName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCubeName(value: js.Object => String): Self = this.set("cubeName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDescription(value: js.Object => String): Self = this.set("description", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: js.Object => String): Self = this.set("name", js.Any.fromFunction1(value))
  }
}
