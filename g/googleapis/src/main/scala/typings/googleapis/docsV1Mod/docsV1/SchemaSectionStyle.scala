package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The styling that applies to a section.
  */
@js.native
trait SchemaSectionStyle extends js.Object {
  /**
    * The section&#39;s columns properties.  If empty, the section contains one
    * column with the default properties in the Docs editor.
    */
  var columnProperties: js.UndefOr[js.Array[SchemaSectionColumnProperties]] = js.native
  /**
    * The style of column separators.  This style can be set even when there is
    * one column in the section.
    */
  var columnSeparatorStyle: js.UndefOr[String] = js.native
  /**
    * The content direction of this section. If unset, the value defaults to
    * LEFT_TO_RIGHT.
    */
  var contentDirection: js.UndefOr[String] = js.native
}

object SchemaSectionStyle {
  @scala.inline
  def apply(): SchemaSectionStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSectionStyle]
  }
  @scala.inline
  implicit class SchemaSectionStyleOps[Self <: SchemaSectionStyle] (val x: Self) extends AnyVal {
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
    def setColumnPropertiesVarargs(value: SchemaSectionColumnProperties*): Self = this.set("columnProperties", js.Array(value :_*))
    @scala.inline
    def setColumnProperties(value: js.Array[SchemaSectionColumnProperties]): Self = this.set("columnProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnProperties: Self = this.set("columnProperties", js.undefined)
    @scala.inline
    def setColumnSeparatorStyle(value: String): Self = this.set("columnSeparatorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnSeparatorStyle: Self = this.set("columnSeparatorStyle", js.undefined)
    @scala.inline
    def setContentDirection(value: String): Self = this.set("contentDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentDirection: Self = this.set("contentDirection", js.undefined)
  }
  
}

