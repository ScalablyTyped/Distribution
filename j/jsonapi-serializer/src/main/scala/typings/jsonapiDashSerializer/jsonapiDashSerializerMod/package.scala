package typings.jsonapiDashSerializer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonapiDashSerializerMod {
  type Callback = js.Function2[/* error */ typings.std.Error, /* response */ js.Any, js.Any]
  type KeyForAttribute = js.Function1[/* attribute */ String, String]
  type RefFunction = js.Function2[/* current */ js.Any, /* item */ js.Any, String]
  type Transform = js.Function1[/* record */ js.Any, js.Any]
  type TypeForAttribute = js.Function2[/* attribute */ String, /* object */ js.UndefOr[js.Any], js.Any]
}
