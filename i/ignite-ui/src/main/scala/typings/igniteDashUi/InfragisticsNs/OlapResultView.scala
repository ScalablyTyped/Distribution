package typings.igniteDashUi.InfragisticsNs

import typings.igniteDashUi.OlapResultViewOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Infragistics.OlapResultView")
@js.native
class OlapResultView protected () extends js.Object {
  def this(options: OlapResultViewOptions) = this()
  /**
  	 * Creates a new $.ig.OlapResultView object with result object having the same structure as the original one and new visibleResult where the tuples which appear as children under specified tuple and member index are no longer present.
  	 *
  	 * @param axisName
  	 * @param tupleIndex
  	 * @param memberIndex
  	 */
  def collapseTupleMember(axisName: js.Object, tupleIndex: js.Object, memberIndex: js.Object): js.Object = js.native
  /**
  	 * Creates a $.ig.OlapResultView view object with result object having the same structure as the original one and new visibleResult where the tuples which appear as children under specified tuple and member index are accessible as part of the visibleResult.
  	 *
  	 * @param axisName
  	 * @param tupleIndex
  	 * @param memberIndex
  	 */
  def expandTupleMember(axisName: js.Object, tupleIndex: js.Object, memberIndex: js.Object): js.Object = js.native
  /**
  	 * Creates a new $.ig.OlapResultView object as the axis specified by axisName of the original result object is extended with the tuples of the same axis found into supplied partialResult object.
  	 *
  	 * @param partialResult
  	 * @param axisName
  	 */
  def extend(partialResult: js.Object, axisName: js.Object): js.Object = js.native
}

