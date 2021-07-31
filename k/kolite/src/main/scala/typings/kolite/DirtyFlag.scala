package typings.kolite

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// DirtyFlag /////////////////////////////////////////////
@js.native
trait DirtyFlag
  extends StObject
     with Instantiable1[/* objectToTrack */ js.Any, js.Any]
     with Instantiable2[/* objectToTrack */ js.Any, /* isInitiallyDirty */ Boolean, js.Any]
     with Instantiable3[
      /* objectToTrack */ js.Any, 
      (/* isInitiallyDirty */ Boolean) | (/* isInitiallyDirty */ Unit), 
      /* hashFunction */ js.Function0[js.Any], 
      js.Any
    ] {
  
  def apply(): DirtyFlagResult = js.native
}
