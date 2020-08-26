package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A List describes the look and feel of bullets belonging to paragraphs
  * associated with a list. A paragraph that is part of a list has an implicit
  * reference to that list&#39;s ID.
  */
@js.native
trait SchemaList extends js.Object {
  /**
    * The ID of the list.
    */
  var listId: js.UndefOr[String] = js.native
  /**
    * A map of nesting levels to the properties of bullets at the associated
    * level. A list has at most nine levels of nesting, so the possible values
    * for the keys of this map are 0 through 8, inclusive.
    */
  var nestingLevel: js.UndefOr[StringDictionary[SchemaNestingLevel]] = js.native
}

object SchemaList {
  @scala.inline
  def apply(): SchemaList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaList]
  }
  @scala.inline
  implicit class SchemaListOps[Self <: SchemaList] (val x: Self) extends AnyVal {
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
    def setListId(value: String): Self = this.set("listId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListId: Self = this.set("listId", js.undefined)
    @scala.inline
    def setNestingLevel(value: StringDictionary[SchemaNestingLevel]): Self = this.set("nestingLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNestingLevel: Self = this.set("nestingLevel", js.undefined)
  }
  
}

