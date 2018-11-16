package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jexlLib {
  type BinaryOpFunction = js.Function2[/* left */ js.Any, /* right */ js.Any, js.Any]
  type EvalCallbackFunction = js.Function2[/* err */ stdLib.Error | scala.Null, /* result */ js.Any, scala.Unit]
  type TransformFunction = js.Function2[/* value */ js.Any, /* repeated */js.Any, js.Any]
  type UnaryOpFunction = js.Function1[/* right */ js.Any, js.Any]
}
