package typings.javascriptDashObfuscator.srcInterfacesAnalyzersStackDashTraceDashAnalyzerIStackTraceDataMod

import typings.javascriptDashObfuscator.srcInterfacesAnalyzersStackDashTraceDashAnalyzerICalleeDataMod.ICalleeData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStackTraceData extends ICalleeData {
  var stackTrace: js.Array[IStackTraceData]
}

object IStackTraceData {
  @scala.inline
  def apply(
    callee: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ESTree.BlockStatement */ js.Any,
    stackTrace: js.Array[IStackTraceData],
    name: String | Double = null
  ): IStackTraceData = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any], stackTrace = stackTrace.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStackTraceData]
  }
}

