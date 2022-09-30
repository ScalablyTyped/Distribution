package typings.highland

import org.scalablytyped.runtime.Instantiable1
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Describes a constructor for a particular promise library
@js.native
trait PConstructor[T, P /* <: PromiseLike[T] */]
  extends StObject
     with Instantiable1[
      /* executor */ js.Function2[
        /* resolve */ js.Function1[/* value */ T | PromiseLike[T], Unit], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
        Unit
      ], 
      P
    ]
