package typings.kosCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type GetKosState[T] = js.Function0[T]
  
  type KosDispatch = js.Function1[/* action */ typings.kosCore.mod.Action[js.Any], scala.Unit]
  
  type ReactComponent[P, S] = typings.react.mod.ComponentClass[P, S]
}
