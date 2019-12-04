package typings.javascriptDashObfuscator.srcInterfacesAnalyzersStackDashTraceDashAnalyzerICalleeDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalleeData extends js.Object {
  var callee: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ESTree.BlockStatement */ js.Any
  var name: String | Double | Null
}

object ICalleeData {
  @scala.inline
  def apply(
    callee: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ESTree.BlockStatement */ js.Any,
    name: String | Double = null
  ): ICalleeData = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalleeData]
  }
}

