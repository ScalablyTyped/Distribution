package typings.manaSyringe

import typings.inversify.anon.Constructor
import typings.inversify.decoratorUtilsMod.DecoratorTarget
import typings.manaSyringe.anon.PartialTokenOption
import typings.manaSyringe.contributionProtocolMod.Option
import typings.manaSyringe.coreMod.Decorator
import typings.manaSyringe.coreMod.Syringe.DecoratorOption
import typings.manaSyringe.coreMod.Syringe.InjectOption
import typings.manaSyringe.coreMod.Syringe.MaybeArray
import typings.manaSyringe.coreMod.Syringe.Module
import typings.manaSyringe.coreMod.Syringe.Named
import typings.manaSyringe.coreMod.Syringe.Register
import typings.manaSyringe.coreMod.Syringe.Registry
import typings.manaSyringe.coreMod.Syringe.Token
import typings.manaSyringe.coreMod.Syringe.UnionToken
import typings.manaSyringe.mod.Syringe.DefinedToken
import typings.std.Map
import typings.std.MethodDecorator
import typings.std.ParameterDecorator
import typings.std.Record
import typings.std.TypedPropertyDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mana-syringe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mana-syringe", "Container")
  @js.native
  open class Container ()
    extends typings.manaSyringe.containerMod.Container {
    def this(inversifyContainer: typings.inversify.interfacesMod.interfaces.Container) = this()
  }
  /* static members */
  object Container {
    
    @JSImport("mana-syringe", "Container")
    @js.native
    val ^ : js.Any = js.native
    
    inline def config(option: InjectOption[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getContainer(key: typings.inversify.interfacesMod.interfaces.Container): typings.manaSyringe.coreMod.Syringe.Container = ^.asInstanceOf[js.Dynamic].applyDynamic("getContainer")(key.asInstanceOf[js.Any]).asInstanceOf[typings.manaSyringe.coreMod.Syringe.Container]
    
    inline def setContainer(
      key: typings.inversify.interfacesMod.interfaces.Container,
      value: typings.manaSyringe.coreMod.Syringe.Container
    ): Map[Double, typings.manaSyringe.coreMod.Syringe.Container] = (^.asInstanceOf[js.Dynamic].applyDynamic("setContainer")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Map[Double, typings.manaSyringe.coreMod.Syringe.Container]]
  }
  
  object Contribution {
    
    @JSImport("mana-syringe", "Contribution")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mana-syringe", "Contribution.Provider")
    @js.native
    val Provider: DefinedToken = js.native
    
    /* was `typeof contributionRegister` */
    inline def register(registerMethod: Register, identifier: typings.manaSyringe.coreMod.Syringe.DefinedToken): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(registerMethod.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def register(
      registerMethod: Register,
      identifier: typings.manaSyringe.coreMod.Syringe.DefinedToken,
      option: Option
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(registerMethod.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("mana-syringe", "DefaultContributionProvider")
  @js.native
  open class DefaultContributionProvider[T /* <: Record[String, Any] */] protected ()
    extends typings.manaSyringe.contributionMod.DefaultContributionProvider[T] {
    def this(serviceIdentifier: Token[T], container: typings.manaSyringe.coreMod.Syringe.Container) = this()
    def this(
      serviceIdentifier: Token[T],
      container: typings.manaSyringe.coreMod.Syringe.Container,
      option: Option
    ) = this()
  }
  
  @JSImport("mana-syringe", "GlobalContainer")
  @js.native
  val GlobalContainer: typings.manaSyringe.containerMod.Container = js.native
  
  inline def Module(): typings.manaSyringe.syringeModuleMod.SyringeModule = ^.asInstanceOf[js.Dynamic].applyDynamic("Module")().asInstanceOf[typings.manaSyringe.syringeModuleMod.SyringeModule]
  inline def Module(register: Registry): typings.manaSyringe.syringeModuleMod.SyringeModule = ^.asInstanceOf[js.Dynamic].applyDynamic("Module")(register.asInstanceOf[js.Any]).asInstanceOf[typings.manaSyringe.syringeModuleMod.SyringeModule]
  
  @JSImport("mana-syringe", "OptionSymbol")
  @js.native
  val OptionSymbol: js.Symbol = js.native
  
  @JSImport("mana-syringe", "Provider")
  @js.native
  val Provider: typings.manaSyringe.coreMod.Syringe.DefinedToken = js.native
  
  object Syringe {
    
    @JSImport("mana-syringe", "Syringe")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mana-syringe", "Syringe.ClassOptionSymbol")
    @js.native
    val ClassOptionSymbol: js.Symbol = js.native
    
    @JSImport("mana-syringe", "Syringe.DefaultOption")
    @js.native
    val DefaultOption: InjectOption[Any] = js.native
    
    @JSImport("mana-syringe", "Syringe.DefinedToken")
    @js.native
    open class DefinedToken protected ()
      extends typings.manaSyringe.coreMod.Syringe.DefinedToken {
      def this(name: String) = this()
      def this(name: String, option: PartialTokenOption) = this()
    }
    
    @JSImport("mana-syringe", "Syringe.Lifecycle")
    @js.native
    object Lifecycle extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.manaSyringe.coreMod.Syringe.Lifecycle & String] = js.native
      
      /* "singleton" */ val singleton: typings.manaSyringe.coreMod.Syringe.Lifecycle.singleton & String = js.native
      
      /* "transient" */ val transient: typings.manaSyringe.coreMod.Syringe.Lifecycle.transient & String = js.native
    }
    
    /**
      * 定义注入标识，默认允许多重注入
      */
    inline def defineToken(name: String): typings.manaSyringe.coreMod.Syringe.DefinedToken = ^.asInstanceOf[js.Dynamic].applyDynamic("defineToken")(name.asInstanceOf[js.Any]).asInstanceOf[typings.manaSyringe.coreMod.Syringe.DefinedToken]
    inline def defineToken(name: String, option: PartialTokenOption): typings.manaSyringe.coreMod.Syringe.DefinedToken = (^.asInstanceOf[js.Dynamic].applyDynamic("defineToken")(name.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[typings.manaSyringe.coreMod.Syringe.DefinedToken]
    
    inline def isModule(): /* is mana-syringe.mana-syringe/lib/core.Syringe.Module */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModule")().asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.Module */ Boolean]
    inline def isModule(data: Record[Any, Any]): /* is mana-syringe.mana-syringe/lib/core.Syringe.Module */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModule")(data.asInstanceOf[js.Any]).asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.Module */ Boolean]
  }
  
  @JSImport("mana-syringe", "SyringeModule")
  @js.native
  open class SyringeModule ()
    extends typings.manaSyringe.moduleMod.SyringeModule {
    def this(registry: Registry) = this()
  }
  
  object Utils {
    
    @JSImport("mana-syringe", "Utils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isClass(): /* is mana-syringe.mana-syringe/lib/core.Syringe.Class<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClass")().asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.Class<any> */ Boolean]
    inline def isClass(data: String): /* is mana-syringe.mana-syringe/lib/core.Syringe.Class<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClass")(data.asInstanceOf[js.Any]).asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.Class<any> */ Boolean]
    inline def isClass(data: js.Symbol): /* is mana-syringe.mana-syringe/lib/core.Syringe.Class<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClass")(data.asInstanceOf[js.Any]).asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.Class<any> */ Boolean]
    inline def isClass(data: Record[String, Any]): /* is mana-syringe.mana-syringe/lib/core.Syringe.Class<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClass")(data.asInstanceOf[js.Any]).asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.Class<any> */ Boolean]
    
    inline def isDefinedToken(): /* is mana-syringe.mana-syringe/lib/core.Syringe.DefinedToken */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefinedToken")().asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.DefinedToken */ Boolean]
    inline def isDefinedToken(data: String): /* is mana-syringe.mana-syringe/lib/core.Syringe.DefinedToken */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefinedToken")(data.asInstanceOf[js.Any]).asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.DefinedToken */ Boolean]
    inline def isDefinedToken(data: js.Symbol): /* is mana-syringe.mana-syringe/lib/core.Syringe.DefinedToken */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefinedToken")(data.asInstanceOf[js.Any]).asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.DefinedToken */ Boolean]
    inline def isDefinedToken(data: Double): /* is mana-syringe.mana-syringe/lib/core.Syringe.DefinedToken */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefinedToken")(data.asInstanceOf[js.Any]).asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.DefinedToken */ Boolean]
    inline def isDefinedToken(data: Record[String, Any]): /* is mana-syringe.mana-syringe/lib/core.Syringe.DefinedToken */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefinedToken")(data.asInstanceOf[js.Any]).asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.DefinedToken */ Boolean]
    
    inline def isInjectOption[T](): /* is mana-syringe.mana-syringe/lib/core.Syringe.InjectOption<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInjectOption")().asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.InjectOption<T> */ Boolean]
    inline def isInjectOption[T](data: InjectOption[T]): /* is mana-syringe.mana-syringe/lib/core.Syringe.InjectOption<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInjectOption")(data.asInstanceOf[js.Any]).asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.InjectOption<T> */ Boolean]
    inline def isInjectOption[T](data: Token[T]): /* is mana-syringe.mana-syringe/lib/core.Syringe.InjectOption<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInjectOption")(data.asInstanceOf[js.Any]).asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.InjectOption<T> */ Boolean]
    
    inline def isMultipleEnabled[T](token: Token[T]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMultipleEnabled")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isNamedToken[T](): /* is mana-syringe.mana-syringe/lib/core.Syringe.NamedToken<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamedToken")().asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.NamedToken<T> */ Boolean]
    inline def isNamedToken[T](data: UnionToken[T]): /* is mana-syringe.mana-syringe/lib/core.Syringe.NamedToken<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamedToken")(data.asInstanceOf[js.Any]).asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.NamedToken<T> */ Boolean]
    
    inline def toArray[T](): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")().asInstanceOf[js.Array[T]]
    inline def toArray[T](maybeArray: MaybeArray[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(maybeArray.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  }
  
  inline def contrib(token: Named): js.Function3[/* target */ Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("contrib")(token.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit]]
  
  inline def decorate(decorator: MethodDecorator | ParameterDecorator, target: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decorate(decorator: MethodDecorator | ParameterDecorator, target: Any, parameterIndexOrProperty: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any], parameterIndexOrProperty.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decorate(decorator: MethodDecorator | ParameterDecorator, target: Any, parameterIndexOrProperty: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any], parameterIndexOrProperty.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decorate(decorator: DecoratorTarget[Any], target: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decorate(decorator: DecoratorTarget[Any], target: Any, parameterIndexOrProperty: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any], parameterIndexOrProperty.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decorate(decorator: DecoratorTarget[Any], target: Any, parameterIndexOrProperty: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any], parameterIndexOrProperty.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def inject(token: Token[Any]): js.Function3[/* target */ Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit]]
  
  inline def injectable[T](): Decorator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("injectable")().asInstanceOf[Decorator[T]]
  inline def injectable[T](option: DecoratorOption[T]): Decorator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("injectable")(option.asInstanceOf[js.Any]).asInstanceOf[Decorator[T]]
  
  inline def isSyringeModule(data: Module): /* is mana-syringe.mana-syringe/lib/module/syringe-module.SyringeModule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSyringeModule")(data.asInstanceOf[js.Any]).asInstanceOf[/* is mana-syringe.mana-syringe/lib/module/syringe-module.SyringeModule */ Boolean]
  
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
  
  @JSImport("mana-syringe", "register")
  @js.native
  val register: Register = js.native
  
  inline def registerSideOption[T /* <: Record[Any, Any] */, R](option: InjectOption[R], target: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSideOption")(option.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def singleton[T](): Decorator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("singleton")().asInstanceOf[Decorator[T]]
  inline def singleton[T](option: DecoratorOption[T]): Decorator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("singleton")(option.asInstanceOf[js.Any]).asInstanceOf[Decorator[T]]
  
  inline def transient[T](): Decorator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("transient")().asInstanceOf[Decorator[T]]
  inline def transient[T](option: DecoratorOption[T]): Decorator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("transient")(option.asInstanceOf[js.Any]).asInstanceOf[Decorator[T]]
  
  inline def unmanaged(): js.Function3[/* target */ DecoratorTarget[Any], /* targetKey */ String, /* index */ Double, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unmanaged")().asInstanceOf[js.Function3[/* target */ DecoratorTarget[Any], /* targetKey */ String, /* index */ Double, Unit]]
}
