package typings.httpErrors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CreateHttpError = js.Function1[
    /* repeated */ typings.httpErrors.mod.UnknownError, 
    typings.httpErrors.mod.HttpError
  ]
  type HttpErrorConstructor = org.scalablytyped.runtime.Instantiable1[js.UndefOr[/* msg */ java.lang.String], typings.httpErrors.mod.HttpError]
  type UnknownError = typings.std.Error | java.lang.String | scala.Double | org.scalablytyped.runtime.StringDictionary[js.Any]
}
