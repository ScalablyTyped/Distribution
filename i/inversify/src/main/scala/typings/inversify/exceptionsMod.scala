package typings.inversify

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exceptionsMod {
  
  @JSImport("inversify/dts/utils/exceptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isStackOverflowExeption(error: Error): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStackOverflowExeption")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
