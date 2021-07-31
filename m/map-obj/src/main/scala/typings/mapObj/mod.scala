package typings.mapObj

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.mapObj.mapObjBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[SourceObjectType /* <: StringDictionary[js.Any] */, MappedObjectKeyType /* <: String */, MappedObjectValueType](
    source: SourceObjectType,
    mapper: Mapper[SourceObjectType, MappedObjectKeyType, MappedObjectValueType]
  ): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in MappedObjectKeyType ]: MappedObjectValueType}
    */ typings.mapObj.mapObjStrings.^ & TopLevel[js.Any] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in MappedObjectKeyType ]: MappedObjectValueType}
    */ typings.mapObj.mapObjStrings.^ & TopLevel[js.Any]]
  @scala.inline
  def apply[SourceObjectType /* <: js.Object */, MappedObjectKeyType /* <: String */, MappedObjectValueType](
    source: SourceObjectType,
    mapper: Mapper[SourceObjectType, MappedObjectKeyType, MappedObjectValueType],
    options: DeepOptions
  ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def apply[SourceObjectType /* <: StringDictionary[js.Any] */, MappedObjectKeyType /* <: String */, MappedObjectValueType](
    source: SourceObjectType,
    mapper: Mapper[SourceObjectType, MappedObjectKeyType, MappedObjectValueType],
    options: Options
  ): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in MappedObjectKeyType ]: MappedObjectValueType}
    */ typings.mapObj.mapObjStrings.^ & TopLevel[js.Any] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in MappedObjectKeyType ]: MappedObjectValueType}
    */ typings.mapObj.mapObjStrings.^ & TopLevel[js.Any]]
  @scala.inline
  def apply[SourceObjectType /* <: StringDictionary[js.Any] */, TargetObjectType /* <: StringDictionary[js.Any] */, MappedObjectKeyType /* <: String */, MappedObjectValueType](
    source: SourceObjectType,
    mapper: Mapper[SourceObjectType, MappedObjectKeyType, MappedObjectValueType],
    options: TargetOptions[TargetObjectType]
  ): TargetObjectType & typings.mapObj.mapObjStrings.^ & TopLevel[js.Any] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TargetObjectType & typings.mapObj.mapObjStrings.^ & TopLevel[js.Any]]
  
  @JSImport("map-obj", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait DeepOptions
    extends StObject
       with Options {
    
    @JSName("deep")
    var deep_DeepOptions: `true`
  }
  object DeepOptions {
    
    @scala.inline
    def apply(): DeepOptions = {
      val __obj = js.Dynamic.literal(deep = true)
      __obj.asInstanceOf[DeepOptions]
    }
    
    @scala.inline
    implicit class DeepOptionsMutableBuilder[Self <: DeepOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeep(value: `true`): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
    }
  }
  
  type Mapper[SourceObjectType /* <: StringDictionary[js.Any] */, MappedObjectKeyType /* <: String */, MappedObjectValueType] = js.Function3[
    /* keyof SourceObjectType */ /* sourceKey */ String, 
    /* import warning: importer.ImportType#apply Failed type conversion: SourceObjectType[keyof SourceObjectType] */ /* sourceValue */ js.Any, 
    /* source */ SourceObjectType, 
    js.Tuple2[MappedObjectKeyType, MappedObjectValueType]
  ]
  
  trait Options extends StObject {
    
    /**
    		Recurse nested objects and objects in arrays.
    		@default false
    		*/
    var deep: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Target object to map properties on to.
    		@default {}
    		*/
    var target: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
      
      @scala.inline
      def setTarget(value: StringDictionary[js.Any]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait TargetOptions[TargetObjectType /* <: StringDictionary[js.Any] */]
    extends StObject
       with Options {
    
    @JSName("target")
    var target_TargetOptions: TargetObjectType
  }
  object TargetOptions {
    
    @scala.inline
    def apply[TargetObjectType /* <: StringDictionary[js.Any] */](target: TargetObjectType): TargetOptions[TargetObjectType] = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[TargetOptions[TargetObjectType]]
    }
    
    @scala.inline
    implicit class TargetOptionsMutableBuilder[Self <: TargetOptions[?], TargetObjectType /* <: StringDictionary[js.Any] */] (val x: Self & TargetOptions[TargetObjectType]) extends AnyVal {
      
      @scala.inline
      def setTarget(value: TargetObjectType): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
