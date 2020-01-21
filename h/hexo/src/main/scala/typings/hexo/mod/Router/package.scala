package typings.hexo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Router {
  type Callback = (js.Function2[/* err */ js.Any, /* result */ java.lang.String, scala.Unit]) | js.Function0[js.Promise[java.lang.String]]
}
