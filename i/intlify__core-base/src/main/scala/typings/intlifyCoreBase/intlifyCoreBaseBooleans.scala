package typings.intlifyCoreBase

import typings.intlifyCoreBase.mod.IsEmptyObject
import typings.intlifyCoreBase.mod.IsNever
import typings.intlifyCoreBase.mod.IsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object intlifyCoreBaseBooleans {
  
  @js.native
  sealed trait `false`
    extends StObject
       with IsEmptyObject[Any]
       with IsNever[Any]
       with IsUnion[Any, Any]
  inline def `false`: `false` = false.asInstanceOf[`false`]
  
  @js.native
  sealed trait `true`
    extends StObject
       with IsEmptyObject[Any]
       with IsNever[Any]
       with IsUnion[Any, Any]
  inline def `true`: `true` = true.asInstanceOf[`true`]
}
