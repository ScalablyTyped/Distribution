package typings
package atMalijsComposeLib.atMalijsComposeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object composeNs {
  type ComposedMiddleware[T] = js.Function2[
    /* context */ T, 
    /* next */ js.UndefOr[js.Function0[js.Promise[js.Any]]], 
    js.Promise[scala.Unit]
  ]
  type Middleware[T] = js.Function2[/* context */ T, /* next */ js.Function0[js.Promise[js.Any]], js.Any]
}
