package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridAppendRowsOnDemandMethods extends js.Object {
  /**
  	 * Destroys the append rows on demand widget
  	 */
  def destroy(): scala.Unit
  /**
  	 * Loads the next chunk of data.
  	 */
  def nextChunk(): scala.Unit
}

object IgGridAppendRowsOnDemandMethods {
  @scala.inline
  def apply(destroy: js.Function0[scala.Unit], nextChunk: js.Function0[scala.Unit]): IgGridAppendRowsOnDemandMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("nextChunk")(nextChunk)
    __obj.asInstanceOf[IgGridAppendRowsOnDemandMethods]
  }
}

