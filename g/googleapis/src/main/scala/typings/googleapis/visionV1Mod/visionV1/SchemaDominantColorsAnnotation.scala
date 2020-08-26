package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Set of dominant colors and their corresponding scores.
  */
@js.native
trait SchemaDominantColorsAnnotation extends js.Object {
  /**
    * RGB color values with their score and pixel fraction.
    */
  var colors: js.UndefOr[js.Array[SchemaColorInfo]] = js.native
}

object SchemaDominantColorsAnnotation {
  @scala.inline
  def apply(): SchemaDominantColorsAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDominantColorsAnnotation]
  }
  @scala.inline
  implicit class SchemaDominantColorsAnnotationOps[Self <: SchemaDominantColorsAnnotation] (val x: Self) extends AnyVal {
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
    def setColorsVarargs(value: SchemaColorInfo*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(value: js.Array[SchemaColorInfo]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
  }
  
}

