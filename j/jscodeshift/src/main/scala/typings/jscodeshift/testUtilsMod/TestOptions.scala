package typings.jscodeshift.testUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestOptions extends js.Object {
  var parser: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify recast.Parser */ js.Any) | String
  ] = js.undefined
}

object TestOptions {
  @scala.inline
  def apply(
    parser: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify recast.Parser */ js.Any) | String = null
  ): TestOptions = {
    val __obj = js.Dynamic.literal()
    if (parser != null) __obj.updateDynamic("parser")(parser.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestOptions]
  }
}

