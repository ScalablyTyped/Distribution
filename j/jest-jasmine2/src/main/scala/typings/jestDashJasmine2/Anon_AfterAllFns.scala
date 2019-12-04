package typings.jestDashJasmine2

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AfterAllFns extends js.Object {
  var afterAllFns: js.Array[_]
  var beforeAllFns: js.Array[_]
  var children: js.UndefOr[
    js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias jest-jasmine2.jest-jasmine2/build/treeProcessor.TreeNode */ js.Object
    ]
  ] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var id: String
  def execute(onComplete: js.Function0[Unit], enabled: Boolean): Unit
  def onException(error: Error): Unit
  def sharedUserContext(): js.Any
}

object Anon_AfterAllFns {
  @scala.inline
  def apply(
    afterAllFns: js.Array[_],
    beforeAllFns: js.Array[_],
    execute: (js.Function0[Unit], Boolean) => Unit,
    id: String,
    onException: Error => Unit,
    sharedUserContext: () => js.Any,
    children: js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias jest-jasmine2.jest-jasmine2/build/treeProcessor.TreeNode */ js.Object
    ] = null,
    disabled: js.UndefOr[Boolean] = js.undefined
  ): Anon_AfterAllFns = {
    val __obj = js.Dynamic.literal(afterAllFns = afterAllFns.asInstanceOf[js.Any], beforeAllFns = beforeAllFns.asInstanceOf[js.Any], execute = js.Any.fromFunction2(execute), id = id.asInstanceOf[js.Any], onException = js.Any.fromFunction1(onException), sharedUserContext = js.Any.fromFunction0(sharedUserContext))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AfterAllFns]
  }
}

