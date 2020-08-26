package typings.kolite

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// DirtyFlag /////////////////////////////////////////////
@js.native
trait DirtyFlag
  extends Instantiable1[/* objectToTrack */ js.Any, js.Any]
     with Instantiable2[/* objectToTrack */ js.Any, /* isInitiallyDirty */ Boolean, js.Any]
     with Instantiable3[
      /* objectToTrack */ js.Any, 
      js.UndefOr[/* isInitiallyDirty */ Boolean], 
      /* hashFunction */ js.Function0[js.Any], 
      js.Any
    ] {
  def apply(): DirtyFlagResult = js.native
}

