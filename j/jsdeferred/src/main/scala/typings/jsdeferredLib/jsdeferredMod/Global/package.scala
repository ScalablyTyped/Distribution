package typings
package jsdeferredLib.jsdeferredMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Global {
  type DeferredizedFunction = js.Function1[/* repeated */ js.Any, Deferred]
  type DeferredizedFunctionWithNumber = js.Function1[/* n */ scala.Double, Deferred]
  type ErrorCallback = js.Function2[/* d */ Deferred, /* repeated */ js.Any, js.Any]
  type FunctionWithNumber = js.Function2[/* i */ scala.Double, /* o */ js.UndefOr[js.Any], js.Any]
}
