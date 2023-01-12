package typings.manaSyringe

import org.scalablytyped.runtime.Instantiable1
import typings.manaSyringe.anon.PartialTokenOption
import typings.manaSyringe.libCoreMod.Syringe.InjectOption
import typings.manaSyringe.libCoreMod.Syringe.MaybeArray
import typings.manaSyringe.libCoreMod.Syringe.Token
import typings.manaSyringe.libCoreMod.Syringe.UnionToken
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreMod {
  
  object Syringe {
    
    @JSImport("mana-syringe/lib/core", "Syringe")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mana-syringe/lib/core", "Syringe.ClassOptionSymbol")
    @js.native
    val ClassOptionSymbol: js.Symbol = js.native
    
    @JSImport("mana-syringe/lib/core", "Syringe.DefaultOption")
    @js.native
    val DefaultOption: InjectOption[Any] = js.native
    
    @JSImport("mana-syringe/lib/core", "Syringe.DefinedToken")
    @js.native
    open class DefinedToken protected () extends StObject {
      def this(name: String) = this()
      def this(name: String, option: PartialTokenOption) = this()
      
      val multiple: Boolean = js.native
      
      /* protected */ var name: String = js.native
      
      val symbol: js.Symbol = js.native
    }
    
    @js.native
    sealed trait Lifecycle extends StObject
    @JSImport("mana-syringe/lib/core", "Syringe.Lifecycle")
    @js.native
    object Lifecycle extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[Lifecycle & String] = js.native
      
      @js.native
      sealed trait singleton
        extends StObject
           with Lifecycle
      /* "singleton" */ val singleton: typings.manaSyringe.libCoreMod.Syringe.Lifecycle.singleton & String = js.native
      
      @js.native
      sealed trait transient
        extends StObject
           with Lifecycle
      /* "transient" */ val transient: typings.manaSyringe.libCoreMod.Syringe.Lifecycle.transient & String = js.native
    }
    
    /**
      * 定义注入标识，默认允许多重注入
      */
    inline def defineToken(name: String): DefinedToken = ^.asInstanceOf[js.Dynamic].applyDynamic("defineToken")(name.asInstanceOf[js.Any]).asInstanceOf[DefinedToken]
    inline def defineToken(name: String, option: PartialTokenOption): DefinedToken = (^.asInstanceOf[js.Dynamic].applyDynamic("defineToken")(name.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[DefinedToken]
    
    inline def isModule(): /* is mana-syringe.mana-syringe/lib/core.Syringe.Module */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModule")().asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.Module */ Boolean]
    inline def isModule(data: Record[Any, Any]): /* is mana-syringe.mana-syringe/lib/core.Syringe.Module */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModule")(data.asInstanceOf[js.Any]).asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.Module */ Boolean]
    
    type Class[T] = Newable[T]
    
    @js.native
    trait Container extends StObject {
      
      def createChild(): Container = js.native
      
      def get[T](token: Token[T]): T = js.native
      
      def getAll[T](token: Token[T]): js.Array[T] = js.native
      
      def getAllNamed[T](token: Token[T], named: Named): js.Array[T] = js.native
      
      def getNamed[T](token: Token[T], named: Named): T = js.native
      
      def isBound[T](token: Token[T]): Boolean = js.native
      
      def isBoundNamed[T](token: Token[T], named: Named): Boolean = js.native
      
      def load(module: Module): Disposable = js.native
      def load(module: Module, force: Boolean): Disposable = js.native
      
      var parent: js.UndefOr[Container] = js.native
      
      def register[T](token: InjectOption[T]): Unit = js.native
      def register[T](token: InjectOption[T], options: InjectOption[T]): Unit = js.native
      def register[T](token: Token[T]): Unit = js.native
      def register[T](token: Token[T], options: InjectOption[T]): Unit = js.native
      
      def remove[T](token: Token[T]): Unit = js.native
      
      def unload(module: Module): Unit = js.native
    }
    
    trait Context extends StObject {
      
      var container: Container
    }
    object Context {
      
      inline def apply(container: Container): Context = {
        val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
        __obj.asInstanceOf[Context]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
        
        inline def setContainer(value: Container): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      }
    }
    
    trait DecoratorOption[T] extends StObject {
      
      var contrib: js.UndefOr[MaybeArray[Token[T]]] = js.undefined
      
      var lifecycle: js.UndefOr[Lifecycle] = js.undefined
      
      var token: js.UndefOr[MaybeArray[UnionToken[T]]] = js.undefined
    }
    object DecoratorOption {
      
      inline def apply[T](): DecoratorOption[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DecoratorOption[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: DecoratorOption[?], T] (val x: Self & DecoratorOption[T]) extends AnyVal {
        
        inline def setContrib(value: MaybeArray[Token[T]]): Self = StObject.set(x, "contrib", value.asInstanceOf[js.Any])
        
        inline def setContribUndefined: Self = StObject.set(x, "contrib", js.undefined)
        
        inline def setContribVarargs(value: Token[T]*): Self = StObject.set(x, "contrib", js.Array(value*))
        
        inline def setLifecycle(value: Lifecycle): Self = StObject.set(x, "lifecycle", value.asInstanceOf[js.Any])
        
        inline def setLifecycleUndefined: Self = StObject.set(x, "lifecycle", js.undefined)
        
        inline def setToken(value: MaybeArray[UnionToken[T]]): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
        
        inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
        
        inline def setTokenVarargs(value: UnionToken[T]*): Self = StObject.set(x, "token", js.Array(value*))
      }
    }
    
    type Dynamic[T] = js.Function1[/* ctx */ Context, T]
    
    type Factory[T] = js.Function1[/* ctx */ Context, js.Function1[/* args */ Any, T]]
    
    trait FormattedInjectOption[T]
      extends StObject
         with InjectOption[T] {
      
      @JSName("contrib")
      var contrib_FormattedInjectOption: js.Array[Token[T]]
      
      @JSName("lifecycle")
      var lifecycle_FormattedInjectOption: Lifecycle
      
      @JSName("token")
      var token_FormattedInjectOption: js.Array[UnionToken[T]]
      
      @JSName("useClass")
      var useClass_FormattedInjectOption: js.Array[Class[T]]
      
      @JSName("useDynamic")
      var useDynamic_FormattedInjectOption: js.Array[Dynamic[T]]
      
      @JSName("useFactory")
      var useFactory_FormattedInjectOption: js.Array[Factory[T]]
    }
    object FormattedInjectOption {
      
      inline def apply[T](
        contrib: js.Array[Token[T]],
        lifecycle: Lifecycle,
        token: js.Array[UnionToken[T]],
        useClass: js.Array[Class[T]],
        useDynamic: js.Array[Dynamic[T]],
        useFactory: js.Array[Factory[T]]
      ): FormattedInjectOption[T] = {
        val __obj = js.Dynamic.literal(contrib = contrib.asInstanceOf[js.Any], lifecycle = lifecycle.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], useClass = useClass.asInstanceOf[js.Any], useDynamic = useDynamic.asInstanceOf[js.Any], useFactory = useFactory.asInstanceOf[js.Any])
        __obj.asInstanceOf[FormattedInjectOption[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: FormattedInjectOption[?], T] (val x: Self & FormattedInjectOption[T]) extends AnyVal {
        
        inline def setContrib(value: js.Array[Token[T]]): Self = StObject.set(x, "contrib", value.asInstanceOf[js.Any])
        
        inline def setContribVarargs(value: Token[T]*): Self = StObject.set(x, "contrib", js.Array(value*))
        
        inline def setLifecycle(value: Lifecycle): Self = StObject.set(x, "lifecycle", value.asInstanceOf[js.Any])
        
        inline def setToken(value: js.Array[UnionToken[T]]): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
        
        inline def setTokenVarargs(value: UnionToken[T]*): Self = StObject.set(x, "token", js.Array(value*))
        
        inline def setUseClass(value: js.Array[Class[T]]): Self = StObject.set(x, "useClass", value.asInstanceOf[js.Any])
        
        inline def setUseClassVarargs(value: Class[T]*): Self = StObject.set(x, "useClass", js.Array(value*))
        
        inline def setUseDynamic(value: js.Array[Dynamic[T]]): Self = StObject.set(x, "useDynamic", value.asInstanceOf[js.Any])
        
        inline def setUseDynamicVarargs(value: Dynamic[T]*): Self = StObject.set(x, "useDynamic", js.Array(value*))
        
        inline def setUseFactory(value: js.Array[Factory[T]]): Self = StObject.set(x, "useFactory", value.asInstanceOf[js.Any])
        
        inline def setUseFactoryVarargs(value: Factory[T]*): Self = StObject.set(x, "useFactory", js.Array(value*))
      }
    }
    
    trait InjectOption[T]
      extends StObject
         with DecoratorOption[T]
         with ValueOption[T]
    object InjectOption {
      
      inline def apply[T](): InjectOption[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InjectOption[T]]
      }
    }
    
    type MaybeArray[T] = T | js.Array[T]
    
    trait Module extends StObject {
      
      var id: Double
    }
    object Module {
      
      inline def apply(id: Double): Module = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[Module]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Module] (val x: Self) extends AnyVal {
        
        inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      }
    }
    
    type Named = String | js.Symbol | DefinedToken
    
    trait NamedToken[T] extends StObject {
      
      var named: Named
      
      var token: Token[T]
    }
    object NamedToken {
      
      inline def apply[T](named: Named, token: Token[T]): NamedToken[T] = {
        val __obj = js.Dynamic.literal(named = named.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
        __obj.asInstanceOf[NamedToken[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: NamedToken[?], T] (val x: Self & NamedToken[T]) extends AnyVal {
        
        inline def setNamed(value: Named): Self = StObject.set(x, "named", value.asInstanceOf[js.Any])
        
        inline def setToken(value: Token[T]): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      }
    }
    
    trait OverrideToken[T] extends StObject {
      
      var `override`: Boolean
      
      var token: Token[T]
    }
    object OverrideToken {
      
      inline def apply[T](`override`: Boolean, token: Token[T]): OverrideToken[T] = {
        val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
        __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
        __obj.asInstanceOf[OverrideToken[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: OverrideToken[?], T] (val x: Self & OverrideToken[T]) extends AnyVal {
        
        inline def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
        
        inline def setToken(value: Token[T]): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      }
    }
    
    type Register = js.Function2[
        /* token */ Token[Any] | InjectOption[Any], 
        /* options */ js.UndefOr[InjectOption[Any]], 
        Unit
      ]
    
    type Registry = js.Function1[/* register */ Register, Unit]
    
    trait TargetOption[T]
      extends StObject
         with ValueOption[T] {
      
      var contrib: js.UndefOr[MaybeArray[Token[T]]] = js.undefined
    }
    object TargetOption {
      
      inline def apply[T](): TargetOption[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TargetOption[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: TargetOption[?], T] (val x: Self & TargetOption[T]) extends AnyVal {
        
        inline def setContrib(value: MaybeArray[Token[T]]): Self = StObject.set(x, "contrib", value.asInstanceOf[js.Any])
        
        inline def setContribUndefined: Self = StObject.set(x, "contrib", js.undefined)
        
        inline def setContribVarargs(value: Token[T]*): Self = StObject.set(x, "contrib", js.Array(value*))
      }
    }
    
    type Token[T] = String | js.Symbol | Newable[T] | Abstract[T] | DefinedToken
    
    type UnionToken[T] = Token[T] | NamedToken[T]
    
    trait ValueOption[T] extends StObject {
      
      var useClass: js.UndefOr[MaybeArray[Class[T]]] = js.undefined
      
      var useDynamic: js.UndefOr[MaybeArray[Dynamic[T]]] = js.undefined
      
      var useFactory: js.UndefOr[MaybeArray[Factory[T]]] = js.undefined
      
      var useValue: js.UndefOr[T] = js.undefined
    }
    object ValueOption {
      
      inline def apply[T](): ValueOption[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ValueOption[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ValueOption[?], T] (val x: Self & ValueOption[T]) extends AnyVal {
        
        inline def setUseClass(value: MaybeArray[Class[T]]): Self = StObject.set(x, "useClass", value.asInstanceOf[js.Any])
        
        inline def setUseClassUndefined: Self = StObject.set(x, "useClass", js.undefined)
        
        inline def setUseClassVarargs(value: Class[T]*): Self = StObject.set(x, "useClass", js.Array(value*))
        
        inline def setUseDynamic(value: MaybeArray[Dynamic[T]]): Self = StObject.set(x, "useDynamic", value.asInstanceOf[js.Any])
        
        inline def setUseDynamicFunction1(value: /* ctx */ Context => T): Self = StObject.set(x, "useDynamic", js.Any.fromFunction1(value))
        
        inline def setUseDynamicUndefined: Self = StObject.set(x, "useDynamic", js.undefined)
        
        inline def setUseDynamicVarargs(value: Dynamic[T]*): Self = StObject.set(x, "useDynamic", js.Array(value*))
        
        inline def setUseFactory(value: MaybeArray[Factory[T]]): Self = StObject.set(x, "useFactory", value.asInstanceOf[js.Any])
        
        inline def setUseFactoryFunction1(value: /* ctx */ Context => js.Function1[/* args */ Any, T]): Self = StObject.set(x, "useFactory", js.Any.fromFunction1(value))
        
        inline def setUseFactoryUndefined: Self = StObject.set(x, "useFactory", js.undefined)
        
        inline def setUseFactoryVarargs(value: Factory[T]*): Self = StObject.set(x, "useFactory", js.Array(value*))
        
        inline def setUseValue(value: T): Self = StObject.set(x, "useValue", value.asInstanceOf[js.Any])
        
        inline def setUseValueUndefined: Self = StObject.set(x, "useValue", js.undefined)
      }
    }
  }
  
  object Utils {
    
    @JSImport("mana-syringe/lib/core", "Utils")
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
  
  type Abstract[T] = js.Object
  
  type Decorator[T] = js.Function1[/* target */ Newable[T] | Abstract[T], Any]
  
  trait Disposable extends StObject {
    
    /**
      * Dispose this object.
      */
    def dispose(): Unit
  }
  object Disposable {
    
    inline def apply(dispose: () => Unit): Disposable = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
      __obj.asInstanceOf[Disposable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Disposable] (val x: Self) extends AnyVal {
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    }
  }
  
  type Newable[T] = Instantiable1[/* args (repeated) */ Any, T]
  
  trait TokenOption extends StObject {
    
    var multiple: js.UndefOr[Boolean] = js.undefined
  }
  object TokenOption {
    
    inline def apply(): TokenOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokenOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenOption] (val x: Self) extends AnyVal {
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    }
  }
}
