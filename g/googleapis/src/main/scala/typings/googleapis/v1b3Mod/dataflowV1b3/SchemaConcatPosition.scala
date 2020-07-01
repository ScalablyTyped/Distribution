package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A position that encapsulates an inner position and an index for the inner
  * position. A ConcatPosition can be used by a reader of a source that
  * encapsulates a set of other sources.
  */
@js.native
trait SchemaConcatPosition extends js.Object {
  /**
    * Index of the inner source.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * Position within the inner source.
    */
  var position: js.UndefOr[SchemaPosition] = js.native
}

object SchemaConcatPosition {
  @scala.inline
  def apply(index: js.UndefOr[Double] = js.undefined, position: SchemaPosition = null): SchemaConcatPosition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaConcatPosition]
  }
}

