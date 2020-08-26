package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * iOS configuration that can be selected at the time a test is run.
  */
@js.native
trait SchemaIosRuntimeConfiguration extends js.Object {
  /**
    * The set of available locales.
    */
  var locales: js.UndefOr[js.Array[SchemaLocale]] = js.native
  /**
    * The set of available orientations.
    */
  var orientations: js.UndefOr[js.Array[SchemaOrientation]] = js.native
}

object SchemaIosRuntimeConfiguration {
  @scala.inline
  def apply(): SchemaIosRuntimeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIosRuntimeConfiguration]
  }
  @scala.inline
  implicit class SchemaIosRuntimeConfigurationOps[Self <: SchemaIosRuntimeConfiguration] (val x: Self) extends AnyVal {
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
    def setLocalesVarargs(value: SchemaLocale*): Self = this.set("locales", js.Array(value :_*))
    @scala.inline
    def setLocales(value: js.Array[SchemaLocale]): Self = this.set("locales", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocales: Self = this.set("locales", js.undefined)
    @scala.inline
    def setOrientationsVarargs(value: SchemaOrientation*): Self = this.set("orientations", js.Array(value :_*))
    @scala.inline
    def setOrientations(value: js.Array[SchemaOrientation]): Self = this.set("orientations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientations: Self = this.set("orientations", js.undefined)
  }
  
}

