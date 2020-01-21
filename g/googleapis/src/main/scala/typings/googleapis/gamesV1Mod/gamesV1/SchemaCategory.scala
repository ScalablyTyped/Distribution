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
  def apply(category: String = null, experiencePoints: String = null, kind: String = null): SchemaCategory = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (experiencePoints != null) __obj.updateDynamic("experiencePoints")(experiencePoints.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCategory]
  }
}

