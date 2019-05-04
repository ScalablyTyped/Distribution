package typings
package atJupyterlabServicesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataExecutioncount extends js.Object {
  var data: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.IMimeBundle
  var execution_count: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.ExecutionCount
  var metadata: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.OutputMetadata
}

object Anon_DataExecutioncount {
  @scala.inline
  def apply(
    data: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.IMimeBundle,
    execution_count: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.ExecutionCount,
    metadata: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.OutputMetadata
  ): Anon_DataExecutioncount = {
    val __obj = js.Dynamic.literal(data = data, execution_count = execution_count.asInstanceOf[js.Any], metadata = metadata)
  
    __obj.asInstanceOf[Anon_DataExecutioncount]
  }
}

