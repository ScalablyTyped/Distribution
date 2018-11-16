package typings
package levelupLib.levelupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LevelUpConstructor
  extends ScalablyTyped.runtime.Instantiable3[
      /* db */ abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractLevelDOWN[js.Any, js.Any], 
      /* options */ js.Any, 
      /* cb */ abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorCallback, 
      LevelUp[
        abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractLevelDOWN[js.Any, js.Any]
      ]
    ]
     with ScalablyTyped.runtime.Instantiable1[
      /* db */ abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractLevelDOWN[js.Any, js.Any], 
      LevelUp[
        abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractLevelDOWN[js.Any, js.Any]
      ]
    ]
     with ScalablyTyped.runtime.Instantiable2[
      /* db */ abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractLevelDOWN[js.Any, js.Any], 
      (/* options */ js.Any) | (/* cb */ abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorCallback), 
      LevelUp[
        abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractLevelDOWN[js.Any, js.Any]
      ]
    ] {
  var errors: js.Any = js.native
  def apply[DB /* <: abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractLevelDOWN[_, _] */](db: DB): LevelUp[DB] = js.native
  def apply[DB /* <: abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractLevelDOWN[_, _] */](db: DB, cb: abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorCallback): LevelUp[DB] = js.native
  def apply[DB /* <: abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractLevelDOWN[_, _] */](db: DB, options: js.Any): LevelUp[DB] = js.native
  def apply[DB /* <: abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractLevelDOWN[_, _] */](db: DB, options: js.Any, cb: abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorCallback): LevelUp[DB] = js.native
}

