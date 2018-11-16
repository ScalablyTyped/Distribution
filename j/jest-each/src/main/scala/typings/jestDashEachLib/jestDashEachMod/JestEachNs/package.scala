package typings
package jestDashEachLib.jestDashEachMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JestEachNs {
  type AsyncCallback = js.Function0[scala.Unit]
  type DescribeFn = js.Function2[/* name */ java.lang.String, /* fn */ SyncCallback, scala.Unit]
  type SyncCallback = js.Function1[/* repeated */js.Any, scala.Unit]
  type TestCallback = SyncCallback | AsyncCallback
  type TestFn = js.Function2[/* name */ java.lang.String, /* fn */ TestCallback, scala.Unit]
}
