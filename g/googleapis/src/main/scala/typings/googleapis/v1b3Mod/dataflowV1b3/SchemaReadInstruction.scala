package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instruction that reads records. Takes no inputs, produces one output.
  */
@js.native
trait SchemaReadInstruction extends js.Object {
  /**
    * The source to read from.
    */
  var source: js.UndefOr[SchemaSource] = js.native
}

object SchemaReadInstruction {
  @scala.inline
  def apply(source: SchemaSource = null): SchemaReadInstruction = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReadInstruction]
  }
}

