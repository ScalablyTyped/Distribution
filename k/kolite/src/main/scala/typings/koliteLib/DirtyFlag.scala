package typings
package koliteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// DirtyFlag /////////////////////////////////////////////
@js.native
trait DirtyFlag
  extends ScalablyTyped.runtime.Instantiable1[/* objectToTrack */ js.Any, js.Any]
     with ScalablyTyped.runtime.Instantiable2[/* objectToTrack */ js.Any, /* isInitiallyDirty */ scala.Boolean, js.Any]
     with ScalablyTyped.runtime.Instantiable3[
      /* objectToTrack */ js.Any, 
      /* isInitiallyDirty */ scala.Boolean, 
      /* hashFunction */ js.Function0[js.Any], 
      js.Any
    ] {
  def apply(): DirtyFlagResult = js.native
}

