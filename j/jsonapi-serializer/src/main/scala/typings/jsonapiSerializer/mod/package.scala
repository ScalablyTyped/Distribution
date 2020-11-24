package typings.jsonapiSerializer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function2[/* error */ typings.std.Error, /* response */ js.Any, js.Any]
  
  type KeyForAttribute = js.Function1[/* attribute */ java.lang.String, java.lang.String]
  
  type LinkFunction = js.Function1[/* repeated */ js.Any, js.Any]
  
  type RefFunction = js.Function2[/* current */ js.Any, /* item */ js.Any, java.lang.String]
  
  type Transform = js.Function1[/* record */ js.Any, js.Any]
  
  type TypeForAttribute = js.Function2[/* attribute */ java.lang.String, /* object */ js.UndefOr[js.Any], js.Any]
}
