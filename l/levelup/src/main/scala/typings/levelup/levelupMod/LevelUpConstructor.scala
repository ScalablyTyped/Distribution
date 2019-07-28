package typings.levelup.levelupMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.abstractDashLeveldown.abstractDashLeveldownMod.AbstractIterator
import typings.abstractDashLeveldown.abstractDashLeveldownMod.AbstractLevelDOWN
import typings.abstractDashLeveldown.abstractDashLeveldownMod.ErrorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LevelUpConstructor
  extends Instantiable3[
      /* db */ AbstractLevelDOWN[js.Any, js.Any], 
      /* options */ js.Any, 
      /* cb */ ErrorCallback, 
      LevelUp[AbstractLevelDOWN[js.Any, js.Any], AbstractIterator[js.Any, js.Any]]
    ]
     with Instantiable1[
      /* db */ AbstractLevelDOWN[js.Any, js.Any], 
      LevelUp[AbstractLevelDOWN[js.Any, js.Any], AbstractIterator[js.Any, js.Any]]
    ]
     with Instantiable2[
      /* db */ AbstractLevelDOWN[js.Any, js.Any], 
      (/* options */ js.Any) | (/* cb */ ErrorCallback), 
      LevelUp[AbstractLevelDOWN[js.Any, js.Any], AbstractIterator[js.Any, js.Any]]
    ] {
  var errors: /*typeof levelerrors*/ js.Any = js.native
  def apply[DB /* <: AbstractLevelDOWN[_, _] */](db: DB): LevelUp[DB, AbstractIterator[_, _]] = js.native
  def apply[DB /* <: AbstractLevelDOWN[_, _] */](db: DB, cb: ErrorCallback): LevelUp[DB, AbstractIterator[_, _]] = js.native
  def apply[DB /* <: AbstractLevelDOWN[_, _] */](db: DB, options: js.Any): LevelUp[DB, AbstractIterator[_, _]] = js.native
  def apply[DB /* <: AbstractLevelDOWN[_, _] */](db: DB, options: js.Any, cb: ErrorCallback): LevelUp[DB, AbstractIterator[_, _]] = js.native
}

