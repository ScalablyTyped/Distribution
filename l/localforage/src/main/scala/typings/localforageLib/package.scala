package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object localforageLib {
  type LocalForageDriverSupportFunc = js.Function0[stdLib.Promise[scala.Boolean]]
  type LocalForageDropInstanceFn = js.Function2[
    /* dbInstanceOptions */ js.UndefOr[LocalForageDbInstanceOptions], 
    /* callback */ js.UndefOr[js.Function1[/* err */ js.Any, scala.Unit]], 
    stdLib.Promise[scala.Unit]
  ]
}
