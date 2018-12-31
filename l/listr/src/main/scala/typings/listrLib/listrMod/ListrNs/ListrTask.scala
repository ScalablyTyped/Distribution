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

