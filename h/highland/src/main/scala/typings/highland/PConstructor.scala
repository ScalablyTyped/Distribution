package typings.highland

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Describes a constructor for a particular promise library
@js.native
trait PConstructor[T, P /* <: js.Thenable[T] */]
  extends StObject
     with Instantiable1[
      /* executor */ js.Function2[
        /* resolve */ js.Function1[/* value */ js.UndefOr[T | js.Thenable[T]], Unit], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
        Unit
      ], 
      P
    ]
