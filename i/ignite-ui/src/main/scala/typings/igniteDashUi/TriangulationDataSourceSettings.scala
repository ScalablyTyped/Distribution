package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriangulationDataSourceSettings
  extends /**
	 * Option for TriangulationDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Callback function to call when data binding is complete
  	 */
  var callback: js.UndefOr[js.Function] = js.undefined
  /**
  	 * Object on which to invoke the callback function
  	 */
  var callee: js.UndefOr[js.Any] = js.undefined
  /**
  	 * The unique identifier.
  	 */
  var id: js.UndefOr[String] = js.undefined
  /**
  	 * A Uri specifying the location of the Itf file.
  	 */
  var source: js.UndefOr[String] = js.undefined
  /**
  	 * The TriangulationSource which is typically created after importing the Itf from the Source Uri.
  	 */
  var triangulationSource: js.UndefOr[String] = js.undefined
}

object TriangulationDataSourceSettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for TriangulationDataSourceSettings
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    callback: js.Function = null,
    callee: js.Any = null,
    id: String = null,
    source: String = null,
    triangulationSource: String = null
  ): TriangulationDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (callee != null) __obj.updateDynamic("callee")(callee)
    if (id != null) __obj.updateDynamic("id")(id)
    if (source != null) __obj.updateDynamic("source")(source)
    if (triangulationSource != null) __obj.updateDynamic("triangulationSource")(triangulationSource)
    __obj.asInstanceOf[TriangulationDataSourceSettings]
  }
}

