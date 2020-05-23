package typings.jestJasmine2.treeProcessorMod

import typings.jestJasmine2.suiteMod.Suite
import typings.jestJasmine2.suiteMod.SuiteResult
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  afterAllFns  :std.Array<any>,   beforeAllFns  :std.Array<any>,   disabled ? :boolean, execute (onComplete : (): void, enabled : boolean): void,   id  :string, onException (error : std.Error): void, sharedUserContext (): any,   children ? :std.Array<jest-jasmine2.jest-jasmine2/build/treeProcessor.TreeNode>} & std.Pick<jest-jasmine2.jest-jasmine2/build/jasmine/Suite.default, 'getResult' | 'parentSuite' | 'result'> */
trait TreeNode extends js.Object {
  var afterAllFns: js.Array[_]
  var beforeAllFns: js.Array[_]
  var children: js.UndefOr[js.Array[TreeNode]] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var getResult: js.Function0[SuiteResult]
  var id: String
  var parentSuite: js.UndefOr[Suite] = js.undefined
  var result: SuiteResult
  def execute(onComplete: js.Function0[Unit], enabled: Boolean): Unit
  def onException(error: Error): Unit
  def sharedUserContext(): js.Any
}

object TreeNode {
  @scala.inline
  def apply(
    afterAllFns: js.Array[_],
    beforeAllFns: js.Array[_],
    execute: (js.Function0[Unit], Boolean) => Unit,
    getResult: () => SuiteResult,
    id: String,
    onException: Error => Unit,
    result: SuiteResult,
    sharedUserContext: () => js.Any,
    children: js.Array[TreeNode] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    parentSuite: Suite = null
  ): TreeNode = {
    val __obj = js.Dynamic.literal(afterAllFns = afterAllFns.asInstanceOf[js.Any], beforeAllFns = beforeAllFns.asInstanceOf[js.Any], execute = js.Any.fromFunction2(execute), getResult = js.Any.fromFunction0(getResult), id = id.asInstanceOf[js.Any], onException = js.Any.fromFunction1(onException), result = result.asInstanceOf[js.Any], sharedUserContext = js.Any.fromFunction0(sharedUserContext))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (parentSuite != null) __obj.updateDynamic("parentSuite")(parentSuite.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeNode]
  }
}

