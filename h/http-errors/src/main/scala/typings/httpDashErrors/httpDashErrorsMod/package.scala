package typings.httpDashErrors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object httpDashErrorsMod {
  import org.scalablytyped.runtime.Instantiable1
  import org.scalablytyped.runtime.StringDictionary
  import typings.httpDashErrors.Anon_Code
  import typings.std.Error
  import typings.std.Record

  type CreateHttpError = js.Function1[/* repeated */ Error | String | Double | StringDictionary[js.Any], HttpError]
  type HttpErrorConstructor = Instantiable1[js.UndefOr[/* msg */ String], HttpError]
  type NamedConstructors = Anon_Code with (Record[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 82 */ js.Any, 
    HttpErrorConstructor
  ])
}
