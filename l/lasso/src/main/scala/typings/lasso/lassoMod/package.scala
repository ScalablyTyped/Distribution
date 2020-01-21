package typings.lasso

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lassoMod {
  type Callback = js.Function2[/* err */ typings.std.Error | scala.Null, /* result */ js.UndefOr[js.Any], js.Any]
  type LassoPage = js.Function2[
    /* options */ typings.lasso.lassoMod.PageConfig, 
    /* callback */ js.UndefOr[
      js.Function2[
        /* err */ typings.std.Error | scala.Null, 
        /* result */ typings.lasso.lassoPageResultMod.LassoPageResult, 
        scala.Unit
      ]
    ], 
    js.Promise[js.Any]
  ]
  type LassoResource = js.Function3[
    /* path */ java.lang.String, 
    /* options */ js.UndefOr[js.Any], 
    /* callback */ js.UndefOr[typings.lasso.lassoMod.Callback], 
    scala.Unit
  ]
}
