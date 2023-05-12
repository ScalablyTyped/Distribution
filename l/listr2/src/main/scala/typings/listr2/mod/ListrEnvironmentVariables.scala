package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListrEnvironmentVariables extends StObject
/**
  * Environment variables for Listr.
  */
@JSImport("listr2", "ListrEnvironmentVariables")
@js.native
object ListrEnvironmentVariables extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ListrEnvironmentVariables & String] = js.native
  
  @js.native
  sealed trait DISABLE_COLOR
    extends StObject
       with ListrEnvironmentVariables
  /* "LISTR_DISABLE_COLOR" */ val DISABLE_COLOR: typings.listr2.mod.ListrEnvironmentVariables.DISABLE_COLOR & String = js.native
  
  @js.native
  sealed trait FORCE_COLOR
    extends StObject
       with ListrEnvironmentVariables
  /* "FORCE_COLOR" */ val FORCE_COLOR: typings.listr2.mod.ListrEnvironmentVariables.FORCE_COLOR & String = js.native
  
  @js.native
  sealed trait FORCE_UNICODE
    extends StObject
       with ListrEnvironmentVariables
  /* "LISTR_FORCE_UNICODE" */ val FORCE_UNICODE: typings.listr2.mod.ListrEnvironmentVariables.FORCE_UNICODE & String = js.native
}
