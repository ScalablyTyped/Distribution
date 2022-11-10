package typings.knockoutMapping

import org.scalablytyped.runtime.Shortcut
import typings.knockoutMapping.anon.Copy
import typings.knockoutMapping.mod.global.KnockoutMapping
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("knockout.mapping", JSImport.Namespace)
  @js.native
  val ^ : KnockoutMapping = js.native
  
  type Primitives = String | Double | Boolean | js.Symbol
  
  type _To = KnockoutMapping
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: KnockoutMapping = ^
  
  object global {
    
    @js.native
    trait KnockoutMapping extends StObject {
      
      /**
        * Get the default mapping options
        */
      def defaultOptions(): KnockoutMappingStandardOptions = js.native
      
      /**
        * Creates a view model object with observable properties for each of the properties on the source. 
        * If 'target' is supplied, instead, target's observable properties are updated.
        * @param source Plain JavaScript object to be mapped.
        * @param options Options on mapping behavior.
        * @param target View model object previosly mapped to be updated.
        */
      def fromJS[T](source: T): MappedType[T] = js.native
      def fromJS[T](source: T, options: Unit, target: MappedType[T]): MappedType[T] = js.native
      def fromJS[T](source: T, options: KnockoutMappingOptions[T]): MappedType[T] = js.native
      def fromJS[T](source: T, options: KnockoutMappingOptions[T], target: MappedType[T]): MappedType[T] = js.native
      /**
        * Updates target's observable properties with those of the sources.
        * @param source Plain JavaScript object to be mapped.
        * @param target View model object previosly mapped to be updated.
        */
      def fromJS[T](source: T, target: MappedType[T]): MappedType[T] = js.native
      /**
        * Creates an readonly observable array view model. Objects on the source array are also converted to observables. Primitive types and arrays are not. 
        * If 'target' is supplied, instead, target's observable properties are updated.
        * @param source Array to be mapped.
        * @param options Options on mapping behavior.
        * @param target View model object previosly mapped to be updated.
        */
      def fromJS[T](source: js.Array[T]): KnockoutReadonlyObservableArrayType[T] = js.native
      def fromJS[T](source: js.Array[T], options: Unit, target: KnockoutObservableArrayType[T]): KnockoutObservableArrayType[T] = js.native
      def fromJS[T](source: js.Array[T], options: Unit, target: KnockoutReadonlyObservableArrayType[T]): KnockoutReadonlyObservableArrayType[T] = js.native
      def fromJS[T](source: js.Array[T], options: KnockoutMappingOptions[js.Array[T]]): KnockoutReadonlyObservableArrayType[T] = js.native
      def fromJS[T](
        source: js.Array[T],
        options: KnockoutMappingOptions[js.Array[T]],
        target: KnockoutObservableArrayType[T]
      ): KnockoutObservableArrayType[T] = js.native
      def fromJS[T](
        source: js.Array[T],
        options: KnockoutMappingOptions[js.Array[T]],
        target: KnockoutReadonlyObservableArrayType[T]
      ): KnockoutReadonlyObservableArrayType[T] = js.native
      /**
        * Updates target's observable properties with those of the sources.
        * @param source Array to be mapped.
        * @param target View model object previosly mapped to be updated.
        */
      def fromJS[T](source: js.Array[T], target: KnockoutObservableArrayType[T]): KnockoutObservableArrayType[T] = js.native
      /**
        * Updates target's observable properties with those of the sources.
        * @param source Array to be mapped.
        * @param target View model object previosly mapped to be updated.
        */
      def fromJS[T](source: js.Array[T], target: KnockoutReadonlyObservableArrayType[T]): KnockoutReadonlyObservableArrayType[T] = js.native
      
      /**
        * Creates a view model object with observable properties for each of the properties on the source. 
        * If 'target' is supplied, instead, target's observable properties are updated.
        * @param source JSON of a JavaScript object to be mapped.
        * @param options Options on mapping behavior.
        * @param target View model object previosly mapped to be updated.
        */
      def fromJSON(source: String): Any = js.native
      def fromJSON(source: String, options: Unit, target: Any): Any = js.native
      def fromJSON(source: String, options: KnockoutMappingOptions[Any]): Any = js.native
      def fromJSON(source: String, options: KnockoutMappingOptions[Any], target: Any): Any = js.native
      /**
        * Updates target's observable properties with those of the sources.
        * @param source JSON of a JavaScript object to be mapped.
        * @param target View model object previosly mapped to be updated.
        */
      def fromJSON(source: String, target: Any): Any = js.native
      
      /**
        * Creates an observable array view model. Objects on the source array are also converted to observables. Primitive types and arrays are not. 
        * If 'target' is supplied, instead, target's observable properties are updated.
        * @param source Array to be mapped.
        * @param options Options on mapping behavior.
        * @param target View model object previosly mapped to be updated.
        */
      @JSName("fromJS")
      def fromJS_T_KnockoutObservableArrayType[T](source: js.Array[T]): KnockoutObservableArrayType[T] = js.native
      @JSName("fromJS")
      def fromJS_T_KnockoutObservableArrayType[T](source: js.Array[T], options: KnockoutMappingOptions[js.Array[T]]): KnockoutObservableArrayType[T] = js.native
      
      /**
        * Undocumented. Custom implementation of JavaScript's typeof.
        * @param x object to check type
        */
      def getType(x: Any): Any = js.native
      
      /**
        * Checks if an object was created using KnockoutMapping
        * @param viewModel View model object to be checked.
        */
      def isMapped(viewModel: Any): Boolean = js.native
      
      /**
        * Undocumented. Reset Mapping default options.
        */
      def resetDefaultOptions(): Unit = js.native
      
      def toJS(viewModel: Any): Any = js.native
      def toJS(viewModel: Any, options: KnockoutMappingOptions[Any]): Any = js.native
      def toJS[T](viewModel: KnockoutObservableType[T]): T = js.native
      def toJS[T](viewModel: KnockoutObservableType[T], options: KnockoutMappingOptions[T]): T = js.native
      
      /**
        * Creates an unmapped object containing only the properties of the mapped object that were part of your original JS object. Stringify the result.
        * @param viewModel Object with observables to be converted.
        * @param options Options on mapping behavior.
        */
      def toJSON[T](viewModel: T): String = js.native
      def toJSON[T](viewModel: T, options: KnockoutMappingOptions[T]): String = js.native
      
      @JSName("toJS")
      def toJS_T_Array[T](
        viewModel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArray<T> */ Any
      ): js.Array[T] = js.native
      @JSName("toJS")
      def toJS_T_Array[T](
        viewModel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArray<T> */ Any,
        options: KnockoutMappingOptions[T]
      ): js.Array[T] = js.native
      /**
        * Creates an unmapped object containing only the properties of the mapped object that were part of your original JS object. 
        * @param viewModel View model object previosly mapped.
        * @param options Options on mapping behavior.
        */
      @JSName("toJS")
      def toJS_T_T[T](
        viewModel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<T> */ Any
      ): T = js.native
      @JSName("toJS")
      def toJS_T_T[T](
        viewModel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<T> */ Any,
        options: KnockoutMappingOptions[T]
      ): T = js.native
      
      /**
        * Undocumented.
        */
      def visitModel(rootObject: Any, callback: js.Function): Any = js.native
      def visitModel(rootObject: Any, callback: js.Function, options: Copy): Any = js.native
    }
    
    trait KnockoutMappingCreateOptions extends StObject {
      
      var data: Any
      
      var parent: Any
    }
    object KnockoutMappingCreateOptions {
      
      inline def apply(data: Any, parent: Any): KnockoutMappingCreateOptions = {
        val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
        __obj.asInstanceOf[KnockoutMappingCreateOptions]
      }
      
      extension [Self <: KnockoutMappingCreateOptions](x: Self) {
        
        inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setParent(value: Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.knockoutMapping.mod.global.KnockoutMappingSpecificOptions[T]
      - typings.knockoutMapping.mod.global.KnockoutMappingStandardOptions
    */
    trait KnockoutMappingOptions[T] extends StObject
    
    /** NOTE: Mapped type definitions are impossible to translate to Scala.
      * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
      * You'll have to cast your way around this structure, unfortunately. 
      * TS definition: {{{
      {[ P in keyof T ]:? knockout.mapping.knockout.mapping.<global>.KnockoutPropertyMappingCallBack}
      }}}
      */
    @js.native
    trait KnockoutMappingSpecificOptions[T]
      extends StObject
         with KnockoutMappingOptions[T]
    
    trait KnockoutMappingStandardOptions
      extends StObject
         with KnockoutMappingOptions[Any] {
      
      var copy: js.UndefOr[js.Array[String]] = js.undefined
      
      // Undocumented
      var deferEvaluation: js.UndefOr[Boolean] = js.undefined
      
      var ignore: js.UndefOr[js.Array[String]] = js.undefined
      
      var include: js.UndefOr[js.Array[String]] = js.undefined
      
      var mappedProperties: js.UndefOr[js.Array[String]] = js.undefined
      
      var observe: js.UndefOr[js.Array[String]] = js.undefined
    }
    object KnockoutMappingStandardOptions {
      
      inline def apply(): KnockoutMappingStandardOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[KnockoutMappingStandardOptions]
      }
      
      extension [Self <: KnockoutMappingStandardOptions](x: Self) {
        
        inline def setCopy(value: js.Array[String]): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
        
        inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
        
        inline def setCopyVarargs(value: String*): Self = StObject.set(x, "copy", js.Array(value*))
        
        inline def setDeferEvaluation(value: Boolean): Self = StObject.set(x, "deferEvaluation", value.asInstanceOf[js.Any])
        
        inline def setDeferEvaluationUndefined: Self = StObject.set(x, "deferEvaluation", js.undefined)
        
        inline def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
        
        inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
        
        inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
        
        inline def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
        
        inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
        
        inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
        
        inline def setMappedProperties(value: js.Array[String]): Self = StObject.set(x, "mappedProperties", value.asInstanceOf[js.Any])
        
        inline def setMappedPropertiesUndefined: Self = StObject.set(x, "mappedProperties", js.undefined)
        
        inline def setMappedPropertiesVarargs(value: String*): Self = StObject.set(x, "mappedProperties", js.Array(value*))
        
        inline def setObserve(value: js.Array[String]): Self = StObject.set(x, "observe", value.asInstanceOf[js.Any])
        
        inline def setObserveUndefined: Self = StObject.set(x, "observe", js.undefined)
        
        inline def setObserveVarargs(value: String*): Self = StObject.set(x, "observe", js.Array(value*))
      }
    }
    
    trait KnockoutMappingUpdateOptions extends StObject {
      
      var data: Any
      
      var observable: js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any
          ] = js.undefined
      
      var parent: Any
      
      var target: Any
    }
    object KnockoutMappingUpdateOptions {
      
      inline def apply(data: Any, parent: Any, target: Any): KnockoutMappingUpdateOptions = {
        val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
        __obj.asInstanceOf[KnockoutMappingUpdateOptions]
      }
      
      extension [Self <: KnockoutMappingUpdateOptions](x: Self) {
        
        inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setObservable(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any
        ): Self = StObject.set(x, "observable", value.asInstanceOf[js.Any])
        
        inline def setObservableUndefined: Self = StObject.set(x, "observable", js.undefined)
        
        inline def setParent(value: Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
        
        inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait KnockoutObservableArrayFunctions[T] extends StObject {
      
      def mappedCreate(item: T): T = js.native
      
      def mappedDestroy(destroyFunction: js.Function1[/* item */ T, Boolean]): Unit = js.native
      def mappedDestroy(item: T): Unit = js.native
      
      def mappedDestroyAll(): Unit = js.native
      def mappedDestroyAll(items: js.Array[T]): Unit = js.native
      
      def mappedRemove(item: T): js.Array[T] = js.native
      def mappedRemove(removeFunction: js.Function1[/* item */ T, Boolean]): js.Array[T] = js.native
      
      def mappedRemoveAll(): js.Array[T] = js.native
      def mappedRemoveAll(items: js.Array[T]): js.Array[T] = js.native
    }
    
    // Could not get this to return any when T is any. It returns a Union type of the possible values.
    /** NOTE: Conditional type definitions are impossible to translate to Scala.
      * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
      * You'll have to cast your way around this structure, unfortunately.
      * TS definition: {{{
      T extends knockout.mapping.knockout.mapping.Primitives ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArray<T> * / any : / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArray<KnockoutObservableType<T>> * / any
      }}}
      */
    @js.native
    trait KnockoutObservableArrayType[T] extends StObject
    
    /** NOTE: Mapped type definitions are impossible to translate to Scala.
      * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
      * You'll have to cast your way around this structure, unfortunately. 
      * TS definition: {{{
      {[ P in keyof T ]: T[P] extends knockout.mapping.knockout.mapping.Primitives? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<T[P]> * / any : T[P] extends std.Array<any>? knockout.mapping.knockout.mapping.<global>.KnockoutObservableArrayType<T[P][number]> : T[P] extends std.ReadonlyArray<any>? knockout.mapping.knockout.mapping.<global>.KnockoutReadonlyObservableArrayType<T[P][number]> : knockout.mapping.knockout.mapping.<global>.MappedType<T[P]>}
      }}}
      */
    @js.native
    trait KnockoutObservableType[T] extends StObject
    
    trait KnockoutPropertyMappingCallBack extends StObject {
      
      var create: js.UndefOr[js.Function1[/* options */ KnockoutMappingCreateOptions, Unit]] = js.undefined
      
      var key: js.UndefOr[js.Function1[/* data */ Any, Any]] = js.undefined
      
      var update: js.UndefOr[js.Function1[/* options */ KnockoutMappingUpdateOptions, Unit]] = js.undefined
    }
    object KnockoutPropertyMappingCallBack {
      
      inline def apply(): KnockoutPropertyMappingCallBack = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[KnockoutPropertyMappingCallBack]
      }
      
      extension [Self <: KnockoutPropertyMappingCallBack](x: Self) {
        
        inline def setCreate(value: /* options */ KnockoutMappingCreateOptions => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
        
        inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
        
        inline def setKey(value: /* data */ Any => Any): Self = StObject.set(x, "key", js.Any.fromFunction1(value))
        
        inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        inline def setUpdate(value: /* options */ KnockoutMappingUpdateOptions => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
        
        inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
      }
    }
    
    /** NOTE: Conditional type definitions are impossible to translate to Scala.
      * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
      * You'll have to cast your way around this structure, unfortunately.
      * TS definition: {{{
      T extends knockout.mapping.knockout.mapping.Primitives ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutReadonlyObservableArray<T> * / any : / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutReadonlyObservableArray<KnockoutObservableType<T>> * / any
      }}}
      */
    @js.native
    trait KnockoutReadonlyObservableArrayType[T] extends StObject
    
    trait KnockoutStatic extends StObject {
      
      // this is a declaration merging with knockout's interface
      var mapping: KnockoutMapping
    }
    object KnockoutStatic {
      
      inline def apply(mapping: KnockoutMapping): KnockoutStatic = {
        val __obj = js.Dynamic.literal(mapping = mapping.asInstanceOf[js.Any])
        __obj.asInstanceOf[KnockoutStatic]
      }
      
      extension [Self <: KnockoutStatic](x: Self) {
        
        inline def setMapping(value: KnockoutMapping): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
      }
    }
    
    /** NOTE: Conditional type definitions are impossible to translate to Scala.
      * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
      * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
      * TS definition: {{{
      [T] extends [knockout.mapping.knockout.mapping.Primitives] ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<T> * / any : [T] extends [object] ? knockout.mapping.knockout.mapping.<global>.KnockoutObservableType<T> : any
      }}}
      */
    type MappedType[T] = KnockoutObservableType[T]
  }
}
