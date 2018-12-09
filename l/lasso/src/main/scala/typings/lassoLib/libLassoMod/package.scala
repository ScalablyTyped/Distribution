package typings
package lassoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libLassoMod {
  type Callback = js.Function2[/* err */ nodeLib.Error | scala.Null, /* result */ js.UndefOr[js.Any], js.Any]
  type LassoPage = js.Function2[
    /* options */ PageConfig, 
    /* callback */ js.UndefOr[
      js.Function2[
        /* err */ nodeLib.Error | scala.Null, 
        /* result */ lassoLib.libLassoPageResultMod.LassoPageResult, 
        scala.Unit
      ]
    ], 
    js.Promise[js.Any]
  ]
  type LassoResource = js.Function3[
    /* path */ java.lang.String, 
    /* options */ js.UndefOr[js.Any], 
    /* callback */ js.UndefOr[Callback], 
    scala.Unit
  ]
}
