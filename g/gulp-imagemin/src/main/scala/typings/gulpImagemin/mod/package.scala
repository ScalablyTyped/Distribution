package typings.gulpImagemin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type PluginFactory[T] = js.Function1[/* options */ js.UndefOr[T], typings.imagemin.mod.Plugin]
}
