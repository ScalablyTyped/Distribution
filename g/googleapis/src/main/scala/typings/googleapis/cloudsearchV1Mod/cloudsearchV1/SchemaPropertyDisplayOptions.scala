package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The display options for a property.
  */
@js.native
trait SchemaPropertyDisplayOptions extends js.Object {
  /**
    * The user friendly label for the property that will be used if the
    * property is specified to be displayed in ObjectDisplayOptions. If given,
    * the display label will be shown in front of the property values when the
    * property is part of the object display options. For example, if the
    * property value is &#39;1&#39;, the value by itself may not be useful
    * context for the user. If the display name given was &#39;priority&#39;,
    * then the user will see &#39;priority : 1&#39; in the search results which
    * provides clear conext to search users. This is OPTIONAL; if not given,
    * only the property values will be displayed. The maximum length is 32
    * characters.
    */
  var displayLabel: js.UndefOr[String] = js.native
}

object SchemaPropertyDisplayOptions {
  @scala.inline
  def apply(): SchemaPropertyDisplayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPropertyDisplayOptions]
  }
  @scala.inline
  implicit class SchemaPropertyDisplayOptionsOps[Self <: SchemaPropertyDisplayOptions] (val x: Self) extends AnyVal {
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
    def setDisplayLabel(value: String): Self = this.set("displayLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayLabel: Self = this.set("displayLabel", js.undefined)
  }
  
}

