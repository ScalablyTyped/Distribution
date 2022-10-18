package typings.manaSyringe

import typings.inversify.anon.Constructor
import typings.inversify.libAnnotationDecoratorUtilsMod.DecoratorTarget
import typings.manaSyringe.libCoreMod.Decorator
import typings.manaSyringe.libCoreMod.Syringe.DecoratorOption
import typings.manaSyringe.libCoreMod.Syringe.Named
import typings.manaSyringe.libCoreMod.Syringe.Token
import typings.std.MethodDecorator
import typings.std.ParameterDecorator
import typings.std.TypedPropertyDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDecoratorMod {
  
  @JSImport("mana-syringe/lib/decorator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decorate(decorator: MethodDecorator | ParameterDecorator, target: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decorate(decorator: MethodDecorator | ParameterDecorator, target: Any, parameterIndexOrProperty: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any], parameterIndexOrProperty.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decorate(decorator: MethodDecorator | ParameterDecorator, target: Any, parameterIndexOrProperty: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any], parameterIndexOrProperty.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decorate(decorator: DecoratorTarget[Any], target: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decorate(decorator: DecoratorTarget[Any], target: Any, parameterIndexOrProperty: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any], parameterIndexOrProperty.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decorate(decorator: DecoratorTarget[Any], target: Any, parameterIndexOrProperty: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any], parameterIndexOrProperty.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def inject(token: Token[Any]): js.Function3[/* target */ Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit]]
  
  inline def injectable[T](): Decorator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("injectable")().asInstanceOf[Decorator[T]]
  inline def injectable[T](option: DecoratorOption[T]): Decorator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("injectable")(option.asInstanceOf[js.Any]).asInstanceOf[Decorator[T]]
  
  inline def named(name: Named): js.Function3[/* target */ Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("named")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit]]
  
  inline def optional(): js.Function3[
    /* target */ DecoratorTarget[Any], 
    /* targetKey */ js.UndefOr[String | js.Symbol], 
    /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("optional")().asInstanceOf[js.Function3[
    /* target */ DecoratorTarget[Any], 
    /* targetKey */ js.UndefOr[String | js.Symbol], 
    /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
    Unit
  ]]
  
  inline def postConstruct(): js.Function2[/* target */ Constructor, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("postConstruct")().asInstanceOf[js.Function2[/* target */ Constructor, /* propertyKey */ String, Unit]]
  
  inline def singleton[T](): Decorator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("singleton")().asInstanceOf[Decorator[T]]
  inline def singleton[T](option: DecoratorOption[T]): Decorator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("singleton")(option.asInstanceOf[js.Any]).asInstanceOf[Decorator[T]]
  
  inline def transient[T](): Decorator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("transient")().asInstanceOf[Decorator[T]]
  inline def transient[T](option: DecoratorOption[T]): Decorator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("transient")(option.asInstanceOf[js.Any]).asInstanceOf[Decorator[T]]
  
  inline def unmanaged(): js.Function3[/* target */ DecoratorTarget[Any], /* targetKey */ String, /* index */ Double, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unmanaged")().asInstanceOf[js.Function3[/* target */ DecoratorTarget[Any], /* targetKey */ String, /* index */ Double, Unit]]
}
