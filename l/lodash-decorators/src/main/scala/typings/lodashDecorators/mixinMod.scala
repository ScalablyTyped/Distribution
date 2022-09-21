package typings.lodashDecorators

import typings.std.ClassDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mixinMod {
  
  @JSImport("lodash-decorators/mixin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(srcs: js.Object*): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(srcs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ClassDecorator]
  
  inline def Mixin_(srcs: js.Object*): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Mixin")(srcs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ClassDecorator]
  
  inline def mixin(srcs: js.Object*): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("mixin")(srcs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ClassDecorator]
}
