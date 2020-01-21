package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Android configuration that can be selected at the time a test is run.
  */
@js.native
trait SchemaAndroidRuntimeConfiguration extends js.Object {
  /**
    * The set of available locales.
    */
  var locales: js.UndefOr[js.Array[SchemaLocale]] = js.native
  /**
    * The set of available orientations.
    */
  var orientations: js.UndefOr[js.Array[SchemaOrientation]] = js.native
}

object SchemaAndroidRuntimeConfiguration {
  @scala.inline
  def apply(locales: js.Array[SchemaLocale] = null, orientations: js.Array[SchemaOrientation] = null): SchemaAndroidRuntimeConfiguration = {
    val __obj = js.Dynamic.literal()
    if (locales != null) __obj.updateDynamic("locales")(locales.asInstanceOf[js.Any])
    if (orientations != null) __obj.updateDynamic("orientations")(orientations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAndroidRuntimeConfiguration]
  }
}

