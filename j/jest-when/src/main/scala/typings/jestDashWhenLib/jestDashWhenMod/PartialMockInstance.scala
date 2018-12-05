package typings
package jestDashWhenLib.jestDashWhenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PartialMockInstance[T] extends js.Object {
  var mockRejectedValue: js.Function1[/* value */ js.Any, jestLib.jestNs.Mock[T]]
  var mockRejectedValueOnce: js.Function1[/* value */ js.Any, jestLib.jestNs.Mock[T]]
  var mockResolvedValue: js.Function1[/* value */ js.Any, jestLib.jestNs.Mock[T]]
  var mockResolvedValueOnce: js.Function1[/* value */ js.Any, jestLib.jestNs.Mock[T]]
  var mockReturnValue: js.Function1[/* value */ js.Any, jestLib.jestNs.Mock[T]]
  var mockReturnValueOnce: js.Function1[/* value */ js.Any, jestLib.jestNs.Mock[T]]
}

