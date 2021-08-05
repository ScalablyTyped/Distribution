package typings.jsonapiSerializer

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.jsonapiSerializer.anon.About
import typings.jsonapiSerializer.anon.Parameter
import typings.jsonapiSerializer.jsonapiSerializerStrings.CamelCase
import typings.jsonapiSerializer.jsonapiSerializerStrings.`dash-case`
import typings.jsonapiSerializer.jsonapiSerializerStrings.`kebab-case`
import typings.jsonapiSerializer.jsonapiSerializerStrings.`lisp-case`
import typings.jsonapiSerializer.jsonapiSerializerStrings.`spinal-case`
import typings.jsonapiSerializer.jsonapiSerializerStrings.camelCase_
import typings.jsonapiSerializer.jsonapiSerializerStrings.snake_case
import typings.jsonapiSerializer.jsonapiSerializerStrings.underscore_case
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsonapi-serializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Deserializer extends StObject {
    
    def deserialize(data: js.Any): js.Promise[js.Any] = js.native
    def deserialize(data: js.Any, callback: Callback): Unit = js.native
  }
  @JSImport("jsonapi-serializer", "Deserializer")
  @js.native
  def Deserializer: DeserializerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("jsonapi-serializer", "Deserializer")
  @js.native
  class DeserializerCls protected ()
    extends StObject
       with Deserializer {
    def this(opts: DeserializerOptions) = this()
  }
  
  inline def Deserializer_=(x: DeserializerConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Deserializer")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("jsonapi-serializer", "Error")
  @js.native
  class Error protected ()
    extends StObject
       with JSONAPIError {
    def this(opts: js.Array[JSONAPIErrorOptions]) = this()
    def this(opts: JSONAPIErrorOptions) = this()
    
    /* CompleteClass */
    var errors: js.Array[js.Any] = js.native
  }
  @JSImport("jsonapi-serializer", "Error")
  @js.native
  def Error: ErrorConstructor = js.native
  inline def Error_=(x: ErrorConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Error")(x.asInstanceOf[js.Any])
  
  trait Serializer extends StObject {
    
    def serialize(data: js.Any): js.Any
  }
  object Serializer {
    
    @JSImport("jsonapi-serializer", "Serializer")
    @js.native
    val ^ : SerializerConstructor = js.native
    
    extension [Self <: Serializer](x: Self) {
      
      inline def setSerialize(value: js.Any => js.Any): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("jsonapi-serializer", "Serializer")
  @js.native
  class SerializerCls protected ()
    extends StObject
       with Serializer {
    def this(collectionName: String, opts: SerializerOptions) = this()
    
    /* CompleteClass */
    override def serialize(data: js.Any): js.Any = js.native
  }
  
  type Callback = js.Function2[/* error */ typings.std.Error, /* response */ js.Any, js.Any]
  
  @js.native
  trait DeserializerConstructor
    extends StObject
       with Instantiable1[/* opts */ DeserializerOptions, Deserializer]
  
  trait DeserializerOptions extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
    
    var keyForAttribute: js.UndefOr[
        `dash-case` | `lisp-case` | `spinal-case` | `kebab-case` | underscore_case | snake_case | camelCase_ | CamelCase | KeyForAttribute
      ] = js.undefined
    
    var pluralizeType: js.UndefOr[Boolean] = js.undefined
    
    var transform: js.UndefOr[Transform] = js.undefined
    
    var typeAsAttribute: js.UndefOr[Boolean] = js.undefined
  }
  object DeserializerOptions {
    
    inline def apply(): DeserializerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeserializerOptions]
    }
    
    extension [Self <: DeserializerOptions](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setKeyForAttribute(
        value: `dash-case` | `lisp-case` | `spinal-case` | `kebab-case` | underscore_case | snake_case | camelCase_ | CamelCase | KeyForAttribute
      ): Self = StObject.set(x, "keyForAttribute", value.asInstanceOf[js.Any])
      
      inline def setKeyForAttributeFunction1(value: /* attribute */ String => String): Self = StObject.set(x, "keyForAttribute", js.Any.fromFunction1(value))
      
      inline def setKeyForAttributeUndefined: Self = StObject.set(x, "keyForAttribute", js.undefined)
      
      inline def setPluralizeType(value: Boolean): Self = StObject.set(x, "pluralizeType", value.asInstanceOf[js.Any])
      
      inline def setPluralizeTypeUndefined: Self = StObject.set(x, "pluralizeType", js.undefined)
      
      inline def setTransform(value: /* record */ js.Any => js.Any): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setTypeAsAttribute(value: Boolean): Self = StObject.set(x, "typeAsAttribute", value.asInstanceOf[js.Any])
      
      inline def setTypeAsAttributeUndefined: Self = StObject.set(x, "typeAsAttribute", js.undefined)
    }
  }
  
  @js.native
  trait ErrorConstructor
    extends StObject
       with Instantiable1[
          (/* opts */ js.Array[JSONAPIErrorOptions]) | (/* opts */ JSONAPIErrorOptions), 
          JSONAPIError
        ]
  
  trait JSONAPIError extends StObject {
    
    var errors: js.Array[js.Any]
  }
  object JSONAPIError {
    
    inline def apply(errors: js.Array[js.Any]): JSONAPIError = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSONAPIError]
    }
    
    extension [Self <: JSONAPIError](x: Self) {
      
      inline def setErrors(value: js.Array[js.Any]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: js.Any*): Self = StObject.set(x, "errors", js.Array(value :_*))
    }
  }
  
  trait JSONAPIErrorOptions extends StObject {
    
    var code: js.UndefOr[String] = js.undefined
    
    var detail: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var links: js.UndefOr[About] = js.undefined
    
    var meta: js.UndefOr[js.Any] = js.undefined
    
    var source: js.UndefOr[Parameter] = js.undefined
    
    var status: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object JSONAPIErrorOptions {
    
    inline def apply(): JSONAPIErrorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONAPIErrorOptions]
    }
    
    extension [Self <: JSONAPIErrorOptions](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLinks(value: About): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
      
      inline def setMeta(value: js.Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setSource(value: Parameter): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type KeyForAttribute = js.Function1[/* attribute */ String, String]
  
  @js.native
  trait LinkFunction extends StObject {
    
    def apply(records: js.Any*): js.Any = js.native
  }
  
  type RefFunction = js.Function2[/* current */ js.Any, /* item */ js.Any, String]
  
  trait Relation extends StObject {
    
    var attributes: js.UndefOr[js.Array[String]] = js.undefined
    
    var included: js.UndefOr[Boolean] = js.undefined
    
    var ref: String | RefFunction
  }
  object Relation {
    
    inline def apply(ref: String | RefFunction): Relation = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[Relation]
    }
    
    extension [Self <: Relation](x: Self) {
      
      inline def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value :_*))
      
      inline def setIncluded(value: Boolean): Self = StObject.set(x, "included", value.asInstanceOf[js.Any])
      
      inline def setIncludedUndefined: Self = StObject.set(x, "included", js.undefined)
      
      inline def setRef(value: String | RefFunction): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction2(value: (/* current */ js.Any, /* item */ js.Any) => String): Self = StObject.set(x, "ref", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait SerializerConstructor
    extends StObject
       with Instantiable2[/* collectionName */ String, /* opts */ SerializerOptions, Serializer]
  
  trait SerializerOptions extends StObject {
    
    var attributes: js.UndefOr[js.Array[String]] = js.undefined
    
    var dataLinks: js.UndefOr[StringDictionary[String | LinkFunction]] = js.undefined
    
    var dataMeta: js.UndefOr[js.Function0[Unit] | js.Object] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var ignoreRelationshipData: js.UndefOr[Boolean] = js.undefined
    
    var included: js.UndefOr[Boolean] = js.undefined
    
    var keyForAttribute: js.UndefOr[String | KeyForAttribute] = js.undefined
    
    var meta: js.UndefOr[js.Object] = js.undefined
    
    var nullIfMissing: js.UndefOr[Boolean] = js.undefined
    
    var pluralizeType: js.UndefOr[Boolean] = js.undefined
    
    var ref: js.UndefOr[js.Function0[Unit] | Boolean | String] = js.undefined
    
    var relationshipLinks: js.UndefOr[StringDictionary[String | LinkFunction]] = js.undefined
    
    var relationshipMeta: js.UndefOr[js.Object] = js.undefined
    
    var topLevelLinks: js.UndefOr[StringDictionary[String | LinkFunction]] = js.undefined
    
    var transform: js.UndefOr[Transform] = js.undefined
    
    var typeForAttribute: js.UndefOr[TypeForAttribute] = js.undefined
  }
  object SerializerOptions {
    
    inline def apply(): SerializerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SerializerOptions]
    }
    
    extension [Self <: SerializerOptions](x: Self) {
      
      inline def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value :_*))
      
      inline def setDataLinks(value: StringDictionary[String | LinkFunction]): Self = StObject.set(x, "dataLinks", value.asInstanceOf[js.Any])
      
      inline def setDataLinksUndefined: Self = StObject.set(x, "dataLinks", js.undefined)
      
      inline def setDataMeta(value: js.Function0[Unit] | js.Object): Self = StObject.set(x, "dataMeta", value.asInstanceOf[js.Any])
      
      inline def setDataMetaFunction0(value: () => Unit): Self = StObject.set(x, "dataMeta", js.Any.fromFunction0(value))
      
      inline def setDataMetaUndefined: Self = StObject.set(x, "dataMeta", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIgnoreRelationshipData(value: Boolean): Self = StObject.set(x, "ignoreRelationshipData", value.asInstanceOf[js.Any])
      
      inline def setIgnoreRelationshipDataUndefined: Self = StObject.set(x, "ignoreRelationshipData", js.undefined)
      
      inline def setIncluded(value: Boolean): Self = StObject.set(x, "included", value.asInstanceOf[js.Any])
      
      inline def setIncludedUndefined: Self = StObject.set(x, "included", js.undefined)
      
      inline def setKeyForAttribute(value: String | KeyForAttribute): Self = StObject.set(x, "keyForAttribute", value.asInstanceOf[js.Any])
      
      inline def setKeyForAttributeFunction1(value: /* attribute */ String => String): Self = StObject.set(x, "keyForAttribute", js.Any.fromFunction1(value))
      
      inline def setKeyForAttributeUndefined: Self = StObject.set(x, "keyForAttribute", js.undefined)
      
      inline def setMeta(value: js.Object): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setNullIfMissing(value: Boolean): Self = StObject.set(x, "nullIfMissing", value.asInstanceOf[js.Any])
      
      inline def setNullIfMissingUndefined: Self = StObject.set(x, "nullIfMissing", js.undefined)
      
      inline def setPluralizeType(value: Boolean): Self = StObject.set(x, "pluralizeType", value.asInstanceOf[js.Any])
      
      inline def setPluralizeTypeUndefined: Self = StObject.set(x, "pluralizeType", js.undefined)
      
      inline def setRef(value: js.Function0[Unit] | Boolean | String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction0(value: () => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction0(value))
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setRelationshipLinks(value: StringDictionary[String | LinkFunction]): Self = StObject.set(x, "relationshipLinks", value.asInstanceOf[js.Any])
      
      inline def setRelationshipLinksUndefined: Self = StObject.set(x, "relationshipLinks", js.undefined)
      
      inline def setRelationshipMeta(value: js.Object): Self = StObject.set(x, "relationshipMeta", value.asInstanceOf[js.Any])
      
      inline def setRelationshipMetaUndefined: Self = StObject.set(x, "relationshipMeta", js.undefined)
      
      inline def setTopLevelLinks(value: StringDictionary[String | LinkFunction]): Self = StObject.set(x, "topLevelLinks", value.asInstanceOf[js.Any])
      
      inline def setTopLevelLinksUndefined: Self = StObject.set(x, "topLevelLinks", js.undefined)
      
      inline def setTransform(value: /* record */ js.Any => js.Any): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setTypeForAttribute(value: (/* attribute */ String, /* object */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "typeForAttribute", js.Any.fromFunction2(value))
      
      inline def setTypeForAttributeUndefined: Self = StObject.set(x, "typeForAttribute", js.undefined)
    }
  }
  
  type Transform = js.Function1[/* record */ js.Any, js.Any]
  
  type TypeForAttribute = js.Function2[/* attribute */ String, /* object */ js.UndefOr[js.Any], js.Any]
}
