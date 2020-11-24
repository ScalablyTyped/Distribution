package typings.konva

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object shapeMod {
  
  type ShapeConfigHandler[TTarget] = js.Function2[/* ctx */ typings.konva.contextMod.Context, /* shape */ TTarget, scala.Unit]
}
