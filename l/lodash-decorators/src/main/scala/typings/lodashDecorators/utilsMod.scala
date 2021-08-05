package typings.lodashDecorators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("lodash-decorators/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lodash-decorators/utils", "CompositeKeyWeakMap")
  @js.native
  class CompositeKeyWeakMap[T] ()
    extends typings.lodashDecorators.compositeKeyWeakMapMod.CompositeKeyWeakMap[T]
  
  inline def assignAll[T, U](to: T, from: U): T = (^.asInstanceOf[js.Dynamic].applyDynamic("assignAll")(to.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def assignAll[T, U](to: T, from: U, excludes: js.Array[String]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("assignAll")(to.asInstanceOf[js.Any], from.asInstanceOf[js.Any], excludes.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def assignProperty[T, U](to: T, from: U, prop: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assignProperty")(to.asInstanceOf[js.Any], from.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def bind(fn: js.Function, context: js.Any): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  inline def copyMetadata(to: js.Any, from: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copyMetadata")(to.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def isMethodOrPropertyDecoratorArgs(args: js.Any*): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMethodOrPropertyDecoratorArgs")(args.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPrototypeAccess(context: js.Object, target: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPrototypeAccess")(context.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def log(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("log")().asInstanceOf[String]
  inline def log(message: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def resolveFunction(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveFunction")().asInstanceOf[js.Any]
  inline def resolveFunction(method: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveFunction")(method.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def resolveFunction(method: String, context: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFunction")(method.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def resolveFunction(method: String, context: js.Any, target: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFunction")(method.asInstanceOf[js.Any], context.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def resolveFunction(method: String, context: js.Any, target: js.Any, throwNotFound: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFunction")(method.asInstanceOf[js.Any], context.asInstanceOf[js.Any], target.asInstanceOf[js.Any], throwNotFound.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def resolveFunction(method: String, context: js.Any, target: Unit, throwNotFound: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFunction")(method.asInstanceOf[js.Any], context.asInstanceOf[js.Any], target.asInstanceOf[js.Any], throwNotFound.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def resolveFunction(method: String, context: Unit, target: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFunction")(method.asInstanceOf[js.Any], context.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def resolveFunction(method: String, context: Unit, target: js.Any, throwNotFound: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFunction")(method.asInstanceOf[js.Any], context.asInstanceOf[js.Any], target.asInstanceOf[js.Any], throwNotFound.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def resolveFunction(method: String, context: Unit, target: Unit, throwNotFound: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFunction")(method.asInstanceOf[js.Any], context.asInstanceOf[js.Any], target.asInstanceOf[js.Any], throwNotFound.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def resolveFunction(method: js.Function): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveFunction")(method.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def resolveFunction(method: js.Function, context: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFunction")(method.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def resolveFunction(method: js.Function, context: js.Any, target: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFunction")(method.asInstanceOf[js.Any], context.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def resolveFunction(method: js.Function, context: js.Any, target: js.Any, throwNotFound: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFunction")(method.asInstanceOf[js.Any], context.asInstanceOf[js.Any], target.asInstanceOf[js.Any], throwNotFound.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def resolveFunction(method: js.Function, context: js.Any, target: Unit, throwNotFound: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFunction")(method.asInstanceOf[js.Any], context.asInstanceOf[js.Any], target.asInstanceOf[js.Any], throwNotFound.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def resolveFunction(method: js.Function, context: Unit, target: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFunction")(method.asInstanceOf[js.Any], context.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def resolveFunction(method: js.Function, context: Unit, target: js.Any, throwNotFound: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFunction")(method.asInstanceOf[js.Any], context.asInstanceOf[js.Any], target.asInstanceOf[js.Any], throwNotFound.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def resolveFunction(method: js.Function, context: Unit, target: Unit, throwNotFound: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFunction")(method.asInstanceOf[js.Any], context.asInstanceOf[js.Any], target.asInstanceOf[js.Any], throwNotFound.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def resolveFunction(method: Unit, context: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFunction")(method.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def resolveFunction(method: Unit, context: js.Any, target: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFunction")(method.asInstanceOf[js.Any], context.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def resolveFunction(method: Unit, context: js.Any, target: js.Any, throwNotFound: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFunction")(method.asInstanceOf[js.Any], context.asInstanceOf[js.Any], target.asInstanceOf[js.Any], throwNotFound.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def resolveFunction(method: Unit, context: js.Any, target: Unit, throwNotFound: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFunction")(method.asInstanceOf[js.Any], context.asInstanceOf[js.Any], target.asInstanceOf[js.Any], throwNotFound.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def resolveFunction(method: Unit, context: Unit, target: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFunction")(method.asInstanceOf[js.Any], context.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def resolveFunction(method: Unit, context: Unit, target: js.Any, throwNotFound: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFunction")(method.asInstanceOf[js.Any], context.asInstanceOf[js.Any], target.asInstanceOf[js.Any], throwNotFound.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def resolveFunction(method: Unit, context: Unit, target: Unit, throwNotFound: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFunction")(method.asInstanceOf[js.Any], context.asInstanceOf[js.Any], target.asInstanceOf[js.Any], throwNotFound.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def returnAtIndex(fn: js.Function, index: Double): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("returnAtIndex")(fn.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  inline def wrapConstructor(Ctor: js.Function, wrapper: js.Function2[/* Ctor */ js.Function, /* repeated */ js.Any, js.Any]): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapConstructor")(Ctor.asInstanceOf[js.Any], wrapper.asInstanceOf[js.Any])).asInstanceOf[js.Function]
}
