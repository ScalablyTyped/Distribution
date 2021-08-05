package typings.lodashDecorators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isDecoratorArgsMod {
  
  @JSImport("lodash-decorators/utils/isDecoratorArgs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isMethodOrPropertyDecoratorArgs(args: js.Any*): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMethodOrPropertyDecoratorArgs")(args.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
