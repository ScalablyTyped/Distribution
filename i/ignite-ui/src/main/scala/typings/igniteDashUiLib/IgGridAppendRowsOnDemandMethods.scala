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
  def apply(destroy: () => scala.Unit, nextChunk: () => scala.Unit): IgGridAppendRowsOnDemandMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), nextChunk = js.Any.fromFunction0(nextChunk))
  
    __obj.asInstanceOf[IgGridAppendRowsOnDemandMethods]
  }
}

