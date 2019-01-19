package typings
package jsonapiDashSerializerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonapiDashSerializerMod {
  type Callback = js.Function2[/* error */ stdLib.Error, /* response */ js.Any, js.Any]
  type KeyForAttribute = js.Function1[/* attribute */ java.lang.String, java.lang.String]
  type RefFunction = js.Function2[/* current */ js.Any, /* item */ js.Any, java.lang.String]
  type Transform = js.Function1[/* record */ js.Any, js.Any]
  type TypeForAttribute = js.Function2[/* attribute */ java.lang.String, /* object */ js.UndefOr[js.Any], js.Any]
}
