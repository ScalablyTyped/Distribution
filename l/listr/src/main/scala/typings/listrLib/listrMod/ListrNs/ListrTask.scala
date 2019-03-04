package typings
package listrLib.listrMod.ListrNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListrTask extends js.Object {
  var enabled: js.UndefOr[
    js.Function2[
      /* ctx */ js.Any, 
      /* task */ ListrTaskWrapper, 
      scala.Boolean | js.Promise[scala.Boolean]
    ]
  ] = js.undefined
  var output: js.UndefOr[java.lang.String] = js.undefined
  var skip: js.UndefOr[
    js.Function2[
      /* ctx */ js.Any, 
      /* task */ ListrTaskWrapper, 
      scala.Boolean | js.Promise[scala.Boolean] | java.lang.String | scala.Unit
    ]
  ] = js.undefined
  var title: java.lang.String
  def task(ctx: js.Any, task: ListrTaskWrapper): scala.Unit | java.lang.String | js.Promise[_] | nodeLib.streamMod.Readable | listrLib.listrMod.Listr
}

object ListrTask {
  @scala.inline
  def apply(
    task: js.Function2[
      js.Any, 
      ListrTaskWrapper, 
      scala.Unit | java.lang.String | js.Promise[_] | nodeLib.streamMod.Readable | listrLib.listrMod.Listr
    ],
    title: java.lang.String,
    enabled: js.Function2[
      /* ctx */ js.Any, 
      /* task */ ListrTaskWrapper, 
      scala.Boolean | js.Promise[scala.Boolean]
    ] = null,
    output: java.lang.String = null,
    skip: js.Function2[
      /* ctx */ js.Any, 
      /* task */ ListrTaskWrapper, 
      scala.Boolean | js.Promise[scala.Boolean] | java.lang.String | scala.Unit
    ] = null
  ): ListrTask = {
    val __obj = js.Dynamic.literal(task = task, title = title)
    if (enabled != null) __obj.updateDynamic("enabled")(enabled)
    if (output != null) __obj.updateDynamic("output")(output)
    if (skip != null) __obj.updateDynamic("skip")(skip)
    __obj.asInstanceOf[ListrTask]
  }
}

