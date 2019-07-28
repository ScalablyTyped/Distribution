package typings.jestDashEach.jestDashEachMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JestEachNs {
  type AsyncCallback = js.Function0[Unit]
  type DescribeFn = js.Function2[/* name */ String, /* fn */ SyncCallback, Unit]
  type SyncCallback = js.Function1[/* repeated */ js.Any, Unit]
  type TestCallback = SyncCallback | AsyncCallback
  type TestFn = js.Function2[/* name */ String, /* fn */ TestCallback, Unit]
}
