package typings.lodashDecorators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsIsDecoratorArgsMod {
  
  @JSImport("lodash-decorators/utils/isDecoratorArgs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isMethodOrPropertyDecoratorArgs(args: Any*): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMethodOrPropertyDecoratorArgs")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Boolean]
}
