package typings.jestJasmine2.treeProcessorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var queueRunnerFactory: js.Any
  var runnableIds: js.Array[String]
  var tree: TreeNode
  def nodeComplete(suite: TreeNode): Unit
  def nodeStart(suite: TreeNode): Unit
}

object Options {
  @scala.inline
  def apply(
    nodeComplete: TreeNode => Unit,
    nodeStart: TreeNode => Unit,
    queueRunnerFactory: js.Any,
    runnableIds: js.Array[String],
    tree: TreeNode
  ): Options = {
    val __obj = js.Dynamic.literal(nodeComplete = js.Any.fromFunction1(nodeComplete), nodeStart = js.Any.fromFunction1(nodeStart), queueRunnerFactory = queueRunnerFactory.asInstanceOf[js.Any], runnableIds = runnableIds.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

