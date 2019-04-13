package typings
package atHapiVisionLib.atHapiVisionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnginesConfiguration extends js.Object {
  /** defines the default filename extension to append to template names when multiple engines are configured and no explicit extension is provided for a given template. No default value. */
  var defaultExtension: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Required object where each key is a file extension (e.g. 'html', 'hbr'), mapped to the npm module used for rendering the templates.
    * Alternatively, the extension can be mapped to an object
    */
  var engines: org.scalablytyped.runtime.StringDictionary[NpmModule] | ServerViewsEnginesOptions
}

object EnginesConfiguration {
  @scala.inline
  def apply(
    engines: org.scalablytyped.runtime.StringDictionary[NpmModule] | ServerViewsEnginesOptions,
    defaultExtension: java.lang.String = null
  ): EnginesConfiguration = {
    val __obj = js.Dynamic.literal(engines = engines.asInstanceOf[js.Any])
    if (defaultExtension != null) __obj.updateDynamic("defaultExtension")(defaultExtension)
    __obj.asInstanceOf[EnginesConfiguration]
  }
}

