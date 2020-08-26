package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for data related to individual game categories.
  */
@js.native
trait SchemaCategory extends js.Object {
  /**
    * The category name.
    */
  var category: js.UndefOr[String] = js.native
  /**
    * Experience points earned in this category.
    */
  var experiencePoints: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#category.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaCategory {
  @scala.inline
  def apply(): SchemaCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCategory]
  }
  @scala.inline
  implicit class SchemaCategoryOps[Self <: SchemaCategory] (val x: Self) extends AnyVal {
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setExperiencePoints(value: String): Self = this.set("experiencePoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExperiencePoints: Self = this.set("experiencePoints", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

