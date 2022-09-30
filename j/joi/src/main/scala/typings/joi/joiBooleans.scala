package typings.joi

import typings.joi.mod.IsNonPrimitiveSubsetUnion
import typings.joi.mod.IsPrimitiveSubset
import typings.joi.mod.IsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object joiBooleans {
  
  @js.native
  sealed trait `false`
    extends StObject
       with IsNonPrimitiveSubsetUnion[Any]
       with IsPrimitiveSubset[Any]
       with IsUnion[Any, Any]
  inline def `false`: `false` = false.asInstanceOf[`false`]
  
  @js.native
  sealed trait `true`
    extends StObject
       with IsNonPrimitiveSubsetUnion[Any]
       with IsPrimitiveSubset[Any]
       with IsUnion[Any, Any]
  inline def `true`: `true` = true.asInstanceOf[`true`]
}
