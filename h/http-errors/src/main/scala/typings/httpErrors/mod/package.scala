package typings.httpErrors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CreateHttpError = js.Function1[
    /* repeated */ typings.httpErrors.mod.UnknownError, 
    typings.httpErrors.mod.HttpError
  ]
  
  type HttpErrorConstructor = org.scalablytyped.runtime.Instantiable1[/* msg */ js.UndefOr[java.lang.String], typings.httpErrors.mod.HttpError]
  
  type IsHttpError = js.Function1[/* error */ js.Any, /* is http-errors.http-errors.HttpError */ scala.Boolean]
  
  type UnknownError = typings.std.Error | java.lang.String | scala.Double | org.scalablytyped.runtime.StringDictionary[js.Any]
}
