package typings.listr

import typings.listr.mod.ListrRendererValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listrStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with ListrRendererValue[Any]
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait silent
    extends StObject
       with ListrRendererValue[Any]
  inline def silent: silent = "silent".asInstanceOf[silent]
  
  @js.native
  sealed trait verbose
    extends StObject
       with ListrRendererValue[Any]
  inline def verbose: verbose = "verbose".asInstanceOf[verbose]
}
