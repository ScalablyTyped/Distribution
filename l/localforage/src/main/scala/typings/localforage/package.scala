package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object localforage {
  
  type LocalForageDriverSupportFunc = js.Function0[js.Promise[scala.Boolean]]
  
  type LocalForageDropInstanceFn = js.Function2[
    /* dbInstanceOptions */ js.UndefOr[typings.localforage.LocalForageDbInstanceOptions], 
    /* callback */ js.UndefOr[js.Function1[/* err */ js.Any, scala.Unit]], 
    js.Promise[scala.Unit]
  ]
}
