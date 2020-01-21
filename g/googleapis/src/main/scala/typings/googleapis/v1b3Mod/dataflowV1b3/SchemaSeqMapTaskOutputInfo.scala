package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about an output of a SeqMapTask.
  */
@js.native
trait SchemaSeqMapTaskOutputInfo extends js.Object {
  /**
    * The sink to write the output value to.
    */
  var sink: js.UndefOr[SchemaSink] = js.native
  /**
    * The id of the TupleTag the user code will tag the output value by.
    */
  var tag: js.UndefOr[String] = js.native
}

object SchemaSeqMapTaskOutputInfo {
  @scala.inline
  def apply(sink: SchemaSink = null, tag: String = null): SchemaSeqMapTaskOutputInfo = {
    val __obj = js.Dynamic.literal()
    if (sink != null) __obj.updateDynamic("sink")(sink.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSeqMapTaskOutputInfo]
  }
}

