package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The original conversion that was inserted or updated and whether there were
  * any errors.
  */
@js.native
trait SchemaConversionStatus extends js.Object {
  /**
    * The original conversion that was inserted or updated.
    */
  var conversion: js.UndefOr[SchemaConversion] = js.native
  /**
    * A list of errors related to this conversion.
    */
  var errors: js.UndefOr[js.Array[SchemaConversionError]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#conversionStatus&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaConversionStatus {
  @scala.inline
  def apply(): SchemaConversionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConversionStatus]
  }
  @scala.inline
  implicit class SchemaConversionStatusOps[Self <: SchemaConversionStatus] (val x: Self) extends AnyVal {
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
    def setConversion(value: SchemaConversion): Self = this.set("conversion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConversion: Self = this.set("conversion", js.undefined)
    @scala.inline
    def setErrorsVarargs(value: SchemaConversionError*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[SchemaConversionError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

