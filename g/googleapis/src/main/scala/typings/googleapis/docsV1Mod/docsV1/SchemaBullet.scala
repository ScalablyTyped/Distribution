package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the bullet of a paragraph.
  */
@js.native
trait SchemaBullet extends js.Object {
  /**
    * The ID of the list this paragraph belongs to.
    */
  var listId: js.UndefOr[String] = js.native
  /**
    * The nesting level of this paragraph in the list.
    */
  var nestingLevel: js.UndefOr[Double] = js.native
  /**
    * The paragraph specific text style applied to this bullet.
    */
  var textStyle: js.UndefOr[SchemaTextStyle] = js.native
}

object SchemaBullet {
  @scala.inline
  def apply(): SchemaBullet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBullet]
  }
  @scala.inline
  implicit class SchemaBulletOps[Self <: SchemaBullet] (val x: Self) extends AnyVal {
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
    def setNestingLevel(value: Double): Self = this.set("nestingLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNestingLevel: Self = this.set("nestingLevel", js.undefined)
    @scala.inline
    def setTextStyle(value: SchemaTextStyle): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
  }
  
}

