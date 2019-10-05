package typings.hexo.hexoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Router {
  type Callback = (js.Function2[/* err */ js.Any, /* result */ String, Unit]) | js.Function0[js.Promise[String]]
}
