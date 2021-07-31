package typings.knockoutMapping

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.TopLevel
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
        * Creates an observable array view model. Objects on the source array are also converted to observables. Primitive types and arrays are not. 
        * If 'target' is supplied, instead, target's observable properties are updated.
        * @param source Array to be mapped.
        * @param options Options on mapping behavior.
        * @param target View model object previosly mapped to be updated.
        */
      def fromJS[T](source: js.Array[T]): KnockoutObservableArrayType[T] = js.native
      /**
        * Updates target's observable properties with those of the sources.
        * @param source Array to be mapped.
        * @param target View model object previosly mapped to be updated.
        */
      def fromJS[T](source: js.Array[T], options: KnockoutMappingOptions[js.Array[T]] | KnockoutObservableArrayType[T]): KnockoutObservableArrayType[T] = js.native
      def fromJS[T](source: js.Array[T], options: Unit, target: KnockoutObservableArrayType[T]): KnockoutObservableArrayType[T] = js.native
      def fromJS[T](
        source: js.Array[T],
        options: KnockoutMappingOptions[js.Array[T]],
        target: KnockoutObservableArrayType[T]
      ): KnockoutObservableArrayType[T] = js.native
      
      /**
        * Creates a view model object with observable properties for each of the properties on the source. 
        * If 'target' is supplied, instead, target's observable properties are updated.
        * @param source JSON of a JavaScript object to be mapped.
        * @param options Options on mapping behavior.
        * @param target View model object previosly mapped to be updated.
        */
      def fromJSON(source: String): js.Any = js.native
      /**
        * Updates target's observable properties with those of the sources.
        * @param source JSON of a JavaScript object to be mapped.
        * @param target View model object previosly mapped to be updated.
        */
      def fromJSON(source: String, options: js.Any | KnockoutMappingOptions[js.Any]): js.Any = js.native
      def fromJSON(source: String, options: Unit, target: js.Any): js.Any = js.native
      def fromJSON(source: String, options: KnockoutMappingOptions[js.Any], target: js.Any): js.Any = js.native
      
      /**
        * Creates an readonly observable array view model. Objects on the source array are also converted to observables. Primitive types and arrays are not. 
        * If 'target' is supplied, instead, target's observable properties are updated.
        * @param source Array to be mapped.
        * @param options Options on mapping behavior.
        * @param target View model object previosly mapped to be updated.
        */
      @JSName("fromJS")
      def fromJS_T_KnockoutReadonlyObservableArrayType[T](source: js.Array[T]): KnockoutReadonlyObservableArrayType[T] = js.native
      /**
        * Updates target's observable properties with those of the sources.
        * @param source Array to be mapped.
        * @param target View model object previosly mapped to be updated.
        */
      @JSName("fromJS")
      def fromJS_T_KnockoutReadonlyObservableArrayType[T](
        source: js.Array[T],
        options: KnockoutMappingOptions[js.Array[T]] | KnockoutReadonlyObservableArrayType[T]
      ): KnockoutReadonlyObservableArrayType[T] = js.native
      @JSName("fromJS")
      def fromJS_T_KnockoutReadonlyObservableArrayType[T](source: js.Array[T], options: Unit, target: KnockoutReadonlyObservableArrayType[T]): KnockoutReadonlyObservableArrayType[T] = js.native
      @JSName("fromJS")
      def fromJS_T_KnockoutReadonlyObservableArrayType[T](
        source: js.Array[T],
        options: KnockoutMappingOptions[js.Array[T]],
        target: KnockoutReadonlyObservableArrayType[T]
      ): KnockoutReadonlyObservableArrayType[T] = js.native
      
      /**
        * Undocumented. Custom implementation of JavaScript's typeof.
        * @param x object to check type
        */
      def getType(x: js.Any): js.Any = js.native
      
      /**
        * Checks if an object was created using KnockoutMapping
        * @param viewModel View model object to be checked.
        */
      def isMapped(viewModel: js.Any): Boolean = js.native
      
      /**
        * Undocumented. Reset Mapping default options.
        */
      def resetDefaultOptions(): Unit = js.native
      
      def toJS(viewModel: js.Any): js.Any = js.native
      def toJS(viewModel: js.Any, options: KnockoutMappingOptions[js.Any]): js.Any = js.native
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
        viewModel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArray<T> */ js.Any
      ): js.Array[T] = js.native
      @JSName("toJS")
      def toJS_T_Array[T](
        viewModel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArray<T> */ js.Any,
        options: KnockoutMappingOptions[T]
      ): js.Array[T] = js.native
      /**
        * Creates an unmapped object containing only the properties of the mapped object that were part of your original JS object. 
        * @param viewModel View model object previosly mapped.
        * @param options Options on mapping behavior.
        */
      @JSName("toJS")
      def toJS_T_T[T](
        viewModel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<T> */ js.Any
      ): T = js.native
      @JSName("toJS")
      def toJS_T_T[T](
        viewModel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<T> */ js.Any,
        options: KnockoutMappingOptions[T]
      ): T = js.native
      
      /**
        * Undocumented.
        */
      def visitModel(rootObject: js.Any, callback: js.Function): js.Any = js.native
      def visitModel(rootObject: js.Any, callback: js.Function, options: Copy): js.Any = js.native
    }
    
    trait KnockoutMappingCreateOptions extends StObject {
      
      var data: js.Any
      
      var parent: js.Any
    }
    object KnockoutMappingCreateOptions {
      
      @scala.inline
      def apply(data: js.Any, parent: js.Any): KnockoutMappingCreateOptions = {
        val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
        __obj.asInstanceOf[KnockoutMappingCreateOptions]
      }
      
      @scala.inline
      implicit class KnockoutMappingCreateOptionsMutableBuilder[Self <: KnockoutMappingCreateOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParent(value: js.Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      }
    }
    
    type KnockoutMappingOptions[T] = KnockoutMappingSpecificOptions[T] | KnockoutMappingStandardOptions
    
    type KnockoutMappingSpecificOptions[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]:? knockout.mapping.knockout.mapping.<global>.KnockoutPropertyMappingCallBack}
      */ typings.knockoutMapping.knockoutMappingStrings.KnockoutMappingSpecificOptions & TopLevel[js.Any]
    
    trait KnockoutMappingStandardOptions extends StObject {
      
      var copy: js.UndefOr[js.Array[String]] = js.undefined
      
      // Undocumented
      var deferEvaluation: js.UndefOr[Boolean] = js.undefined
      
      var ignore: js.UndefOr[js.Array[String]] = js.undefined
      
      var include: js.UndefOr[js.Array[String]] = js.undefined
      
      var mappedProperties: js.UndefOr[js.Array[String]] = js.undefined
      
      var observe: js.UndefOr[js.Array[String]] = js.undefined
    }
    object KnockoutMappingStandardOptions {
      
      @scala.inline
      def apply(): KnockoutMappingStandardOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[KnockoutMappingStandardOptions]
      }
      
      @scala.inline
      implicit class KnockoutMappingStandardOptionsMutableBuilder[Self <: KnockoutMappingStandardOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCopy(value: js.Array[String]): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
        
        @scala.inline
        def setCopyVarargs(value: String*): Self = StObject.set(x, "copy", js.Array(value :_*))
        
        @scala.inline
        def setDeferEvaluation(value: Boolean): Self = StObject.set(x, "deferEvaluation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeferEvaluationUndefined: Self = StObject.set(x, "deferEvaluation", js.undefined)
        
        @scala.inline
        def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
        
        @scala.inline
        def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value :_*))
        
        @scala.inline
        def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
        
        @scala.inline
        def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value :_*))
        
        @scala.inline
        def setMappedProperties(value: js.Array[String]): Self = StObject.set(x, "mappedProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMappedPropertiesUndefined: Self = StObject.set(x, "mappedProperties", js.undefined)
        
        @scala.inline
        def setMappedPropertiesVarargs(value: String*): Self = StObject.set(x, "mappedProperties", js.Array(value :_*))
        
        @scala.inline
        def setObserve(value: js.Array[String]): Self = StObject.set(x, "observe", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObserveUndefined: Self = StObject.set(x, "observe", js.undefined)
        
        @scala.inline
        def setObserveVarargs(value: String*): Self = StObject.set(x, "observe", js.Array(value :_*))
      }
    }
    
    trait KnockoutMappingUpdateOptions extends StObject {
      
      var data: js.Any
      
      var observable: js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any
          ] = js.undefined
      
      var parent: js.Any
      
      var target: js.Any
    }
    object KnockoutMappingUpdateOptions {
      
      @scala.inline
      def apply(data: js.Any, parent: js.Any, target: js.Any): KnockoutMappingUpdateOptions = {
        val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
        __obj.asInstanceOf[KnockoutMappingUpdateOptions]
      }
      
      @scala.inline
      implicit class KnockoutMappingUpdateOptionsMutableBuilder[Self <: KnockoutMappingUpdateOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObservable(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any
        ): Self = StObject.set(x, "observable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObservableUndefined: Self = StObject.set(x, "observable", js.undefined)
        
        @scala.inline
        def setParent(value: js.Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
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
    type KnockoutObservableArrayType[T] = js.Any
    
    type KnockoutObservableType[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]: T[P] extends knockout.mapping.knockout.mapping.Primitives? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<T[P]> * / any : T[P] extends std.Array<any>? knockout.mapping.knockout.mapping.<global>.KnockoutObservableArrayType<T[P][number]> : T[P] extends std.ReadonlyArray<any>? knockout.mapping.knockout.mapping.<global>.KnockoutReadonlyObservableArrayType<T[P][number]> : knockout.mapping.knockout.mapping.<global>.MappedType<T[P]>}
      */ typings.knockoutMapping.knockoutMappingStrings.KnockoutObservableType & TopLevel[js.Any]
    
    trait KnockoutPropertyMappingCallBack extends StObject {
      
      var create: js.UndefOr[js.Function1[/* options */ KnockoutMappingCreateOptions, Unit]] = js.undefined
      
      var key: js.UndefOr[js.Function1[/* data */ js.Any, js.Any]] = js.undefined
      
      var update: js.UndefOr[js.Function1[/* options */ KnockoutMappingUpdateOptions, Unit]] = js.undefined
    }
    object KnockoutPropertyMappingCallBack {
      
      @scala.inline
      def apply(): KnockoutPropertyMappingCallBack = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[KnockoutPropertyMappingCallBack]
      }
      
      @scala.inline
      implicit class KnockoutPropertyMappingCallBackMutableBuilder[Self <: KnockoutPropertyMappingCallBack] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCreate(value: /* options */ KnockoutMappingCreateOptions => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
        
        @scala.inline
        def setKey(value: /* data */ js.Any => js.Any): Self = StObject.set(x, "key", js.Any.fromFunction1(value))
        
        @scala.inline
        def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        @scala.inline
        def setUpdate(value: /* options */ KnockoutMappingUpdateOptions => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
        
        @scala.inline
        def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
      }
    }
    
    type KnockoutReadonlyObservableArrayType[T] = js.Any
    
    trait KnockoutStatic extends StObject {
      
      // this is a declaration merging with knockout's interface
      var mapping: KnockoutMapping
    }
    object KnockoutStatic {
      
      @scala.inline
      def apply(mapping: KnockoutMapping): KnockoutStatic = {
        val __obj = js.Dynamic.literal(mapping = mapping.asInstanceOf[js.Any])
        __obj.asInstanceOf[KnockoutStatic]
      }
      
      @scala.inline
      implicit class KnockoutStaticMutableBuilder[Self <: KnockoutStatic] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMapping(value: KnockoutMapping): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
      }
    }
    
    type MappedType[T] = KnockoutObservableType[T]
  }
}
