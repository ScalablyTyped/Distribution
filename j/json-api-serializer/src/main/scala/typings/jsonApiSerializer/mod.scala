package typings.jsonApiSerializer

import org.scalablytyped.runtime.StringDictionary
import typings.jsonApiSerializer.anon.LinksObjectaboutLinkObjec
import typings.jsonApiSerializer.jsonApiSerializerStrings.id
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json-api-serializer", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with JSONAPISerializer {
    def this(opts: Options) = this()
  }
  
  type AfterDeseralizeCallback = js.Function1[/* data */ Any, Any]
  
  type BeforeSerializeCallback = js.Function1[/* data */ Any, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsonApiSerializer.jsonApiSerializerStrings.`kebab-case`
    - typings.jsonApiSerializer.jsonApiSerializerStrings.snake_case
    - typings.jsonApiSerializer.jsonApiSerializerStrings.camelCase
  */
  trait Case extends StObject
  object Case {
    
    inline def camelCase: typings.jsonApiSerializer.jsonApiSerializerStrings.camelCase = "camelCase".asInstanceOf[typings.jsonApiSerializer.jsonApiSerializerStrings.camelCase]
    
    inline def `kebab-case`: typings.jsonApiSerializer.jsonApiSerializerStrings.`kebab-case` = "kebab-case".asInstanceOf[typings.jsonApiSerializer.jsonApiSerializerStrings.`kebab-case`]
    
    inline def snake_case: typings.jsonApiSerializer.jsonApiSerializerStrings.snake_case = "snake_case".asInstanceOf[typings.jsonApiSerializer.jsonApiSerializerStrings.snake_case]
  }
  
  trait DynamicTypeOptions extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
    
    var jsonapiObject: js.UndefOr[Boolean] = js.undefined
    
    var topLevelLinks: js.UndefOr[LinksObject | LinksCallback] = js.undefined
    
    var topLevelMeta: js.UndefOr[Any | MetaCallback] = js.undefined
  }
  object DynamicTypeOptions {
    
    inline def apply(): DynamicTypeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DynamicTypeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DynamicTypeOptions] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setJsonapiObject(value: Boolean): Self = StObject.set(x, "jsonapiObject", value.asInstanceOf[js.Any])
      
      inline def setJsonapiObjectUndefined: Self = StObject.set(x, "jsonapiObject", js.undefined)
      
      inline def setTopLevelLinks(value: LinksObject | LinksCallback): Self = StObject.set(x, "topLevelLinks", value.asInstanceOf[js.Any])
      
      inline def setTopLevelLinksFunction2(value: (/* data */ Any, /* extraData */ js.UndefOr[Any]) => String | LinksObject): Self = StObject.set(x, "topLevelLinks", js.Any.fromFunction2(value))
      
      inline def setTopLevelLinksUndefined: Self = StObject.set(x, "topLevelLinks", js.undefined)
      
      inline def setTopLevelMeta(value: Any | MetaCallback): Self = StObject.set(x, "topLevelMeta", value.asInstanceOf[js.Any])
      
      inline def setTopLevelMetaFunction2(value: (/* data */ Any, /* extraData */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "topLevelMeta", js.Any.fromFunction2(value))
      
      inline def setTopLevelMetaUndefined: Self = StObject.set(x, "topLevelMeta", js.undefined)
    }
  }
  
  trait ErrorObject extends StObject {
    
    var code: js.UndefOr[String] = js.undefined
    
    var detail: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var links: js.UndefOr[LinksObjectaboutLinkObjec] = js.undefined
    
    var meta: js.UndefOr[Meta] = js.undefined
    
    var source: js.UndefOr[Any] = js.undefined
    
    var status: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object ErrorObject {
    
    inline def apply(): ErrorObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorObject] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLinks(value: LinksObjectaboutLinkObjec): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
      
      inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait JSONAPIDocument extends StObject {
    
    var data: js.UndefOr[ResourceObject[Any] | js.Array[ResourceObject[Any]]] = js.undefined
    
    var errors: js.UndefOr[js.Array[ErrorObject]] = js.undefined
    
    var included: js.UndefOr[js.Array[ResourceObject[Any]]] = js.undefined
    
    var jsonapi: js.UndefOr[JsonApiObject] = js.undefined
    
    var links: js.UndefOr[LinksObject] = js.undefined
    
    var meta: js.UndefOr[Meta] = js.undefined
  }
  object JSONAPIDocument {
    
    inline def apply(): JSONAPIDocument = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONAPIDocument]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JSONAPIDocument] (val x: Self) extends AnyVal {
      
      inline def setData(value: ResourceObject[Any] | js.Array[ResourceObject[Any]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: ResourceObject[Any]*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setErrors(value: js.Array[ErrorObject]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setErrorsVarargs(value: ErrorObject*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setIncluded(value: js.Array[ResourceObject[Any]]): Self = StObject.set(x, "included", value.asInstanceOf[js.Any])
      
      inline def setIncludedUndefined: Self = StObject.set(x, "included", js.undefined)
      
      inline def setIncludedVarargs(value: ResourceObject[Any]*): Self = StObject.set(x, "included", js.Array(value*))
      
      inline def setJsonapi(value: JsonApiObject): Self = StObject.set(x, "jsonapi", value.asInstanceOf[js.Any])
      
      inline def setJsonapiUndefined: Self = StObject.set(x, "jsonapi", js.undefined)
      
      inline def setLinks(value: LinksObject): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
      
      inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    }
  }
  
  @js.native
  trait JSONAPISerializer extends StObject {
    
    def deserialize(`type`: String, data: JSONAPIDocument): Any = js.native
    def deserialize(`type`: String, data: JSONAPIDocument, schema: String): Any = js.native
    def deserialize(`type`: DynamicTypeOptions, data: JSONAPIDocument): Any = js.native
    def deserialize(`type`: DynamicTypeOptions, data: JSONAPIDocument, schema: String): Any = js.native
    
    def deserializeAsync(`type`: String, data: JSONAPIDocument): js.Promise[Any] = js.native
    def deserializeAsync(`type`: String, data: JSONAPIDocument, schema: String): js.Promise[Any] = js.native
    def deserializeAsync(`type`: DynamicTypeOptions, data: JSONAPIDocument): js.Promise[Any] = js.native
    def deserializeAsync(`type`: DynamicTypeOptions, data: JSONAPIDocument, schema: String): js.Promise[Any] = js.native
    
    def register(`type`: String): Unit = js.native
    def register(`type`: String, schema: String): Unit = js.native
    def register(`type`: String, schema: String, opts: Options): Unit = js.native
    def register(`type`: String, schema: Unit, opts: Options): Unit = js.native
    def register(`type`: String, schema: Options): Unit = js.native
    def register(`type`: String, schema: Options, opts: Options): Unit = js.native
    
    def serialize(`type`: String, data: Any): JSONAPIDocument = js.native
    def serialize(`type`: String, data: Any, schema: String): JSONAPIDocument = js.native
    def serialize(`type`: String, data: Any, schema: String, topLevelMeta: Any): JSONAPIDocument = js.native
    def serialize(`type`: String, data: Any, schema: String, topLevelMeta: Any, excludeTopLevelMeta: Boolean): JSONAPIDocument = js.native
    def serialize(
      `type`: String,
      data: Any,
      schema: String,
      topLevelMeta: Any,
      excludeTopLevelMeta: Boolean,
      overrideSchemaOptions: StringDictionary[Options]
    ): JSONAPIDocument = js.native
    def serialize(
      `type`: String,
      data: Any,
      schema: String,
      topLevelMeta: Any,
      excludeTopLevelMeta: Unit,
      overrideSchemaOptions: StringDictionary[Options]
    ): JSONAPIDocument = js.native
    def serialize(`type`: String, data: Any, schema: String, topLevelMeta: Unit, excludeTopLevelMeta: Boolean): JSONAPIDocument = js.native
    def serialize(
      `type`: String,
      data: Any,
      schema: String,
      topLevelMeta: Unit,
      excludeTopLevelMeta: Boolean,
      overrideSchemaOptions: StringDictionary[Options]
    ): JSONAPIDocument = js.native
    def serialize(
      `type`: String,
      data: Any,
      schema: String,
      topLevelMeta: Unit,
      excludeTopLevelMeta: Unit,
      overrideSchemaOptions: StringDictionary[Options]
    ): JSONAPIDocument = js.native
    def serialize(`type`: String, data: Any, schema: Unit, topLevelMeta: Any): JSONAPIDocument = js.native
    def serialize(`type`: String, data: Any, schema: Unit, topLevelMeta: Any, excludeTopLevelMeta: Boolean): JSONAPIDocument = js.native
    def serialize(
      `type`: String,
      data: Any,
      schema: Unit,
      topLevelMeta: Any,
      excludeTopLevelMeta: Boolean,
      overrideSchemaOptions: StringDictionary[Options]
    ): JSONAPIDocument = js.native
    def serialize(
      `type`: String,
      data: Any,
      schema: Unit,
      topLevelMeta: Any,
      excludeTopLevelMeta: Unit,
      overrideSchemaOptions: StringDictionary[Options]
    ): JSONAPIDocument = js.native
    def serialize(`type`: String, data: Any, schema: Unit, topLevelMeta: Unit, excludeTopLevelMeta: Boolean): JSONAPIDocument = js.native
    def serialize(
      `type`: String,
      data: Any,
      schema: Unit,
      topLevelMeta: Unit,
      excludeTopLevelMeta: Boolean,
      overrideSchemaOptions: StringDictionary[Options]
    ): JSONAPIDocument = js.native
    def serialize(
      `type`: String,
      data: Any,
      schema: Unit,
      topLevelMeta: Unit,
      excludeTopLevelMeta: Unit,
      overrideSchemaOptions: StringDictionary[Options]
    ): JSONAPIDocument = js.native
    def serialize(`type`: String, data: Any, schema: Options): JSONAPIDocument = js.native
    def serialize(`type`: String, data: Any, schema: Options, topLevelMeta: Any): JSONAPIDocument = js.native
    def serialize(`type`: String, data: Any, schema: Options, topLevelMeta: Any, excludeTopLevelMeta: Boolean): JSONAPIDocument = js.native
    def serialize(
      `type`: String,
      data: Any,
      schema: Options,
      topLevelMeta: Any,
      excludeTopLevelMeta: Boolean,
      overrideSchemaOptions: StringDictionary[Options]
    ): JSONAPIDocument = js.native
    def serialize(
      `type`: String,
      data: Any,
      schema: Options,
      topLevelMeta: Any,
      excludeTopLevelMeta: Unit,
      overrideSchemaOptions: StringDictionary[Options]
    ): JSONAPIDocument = js.native
    def serialize(`type`: String, data: Any, schema: Options, topLevelMeta: Unit, excludeTopLevelMeta: Boolean): JSONAPIDocument = js.native
    def serialize(
      `type`: String,
      data: Any,
      schema: Options,
      topLevelMeta: Unit,
      excludeTopLevelMeta: Boolean,
      overrideSchemaOptions: StringDictionary[Options]
    ): JSONAPIDocument = js.native
    def serialize(
      `type`: String,
      data: Any,
      schema: Options,
      topLevelMeta: Unit,
      excludeTopLevelMeta: Unit,
      overrideSchemaOptions: StringDictionary[Options]
    ): JSONAPIDocument = js.native
    def serialize(`type`: String, data: Any, topLevelMeta: Any): JSONAPIDocument = js.native
    
    def serializeAsync(
      `type`: String | DynamicTypeOptions,
      data: Any | js.Array[Any],
      schema: js.UndefOr[String],
      topLevelMeta: js.UndefOr[Any],
      excludeTopLevelMeta: js.UndefOr[Boolean],
      overrideSchemaOptions: js.UndefOr[StringDictionary[Options]]
    ): js.Promise[JSONAPIDocument] = js.native
    
    def serializeError(error: js.Array[js.Error | ErrorObject]): ErrorObject = js.native
    def serializeError(error: js.Error): ErrorObject = js.native
    def serializeError(error: ErrorObject): ErrorObject = js.native
  }
  
  trait JsonApiObject extends StObject {
    
    var version: String
  }
  object JsonApiObject {
    
    inline def apply(version: String): JsonApiObject = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonApiObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JsonApiObject] (val x: Self) extends AnyVal {
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait LinkObject extends StObject {
    
    var href: String
    
    var meta: js.UndefOr[Meta] = js.undefined
  }
  object LinkObject {
    
    inline def apply(href: String): LinkObject = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkObject] (val x: Self) extends AnyVal {
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    }
  }
  
  trait Linkage extends StObject {
    
    var id: String
    
    var meta: js.UndefOr[Meta] = js.undefined
    
    var `type`: String
  }
  object Linkage {
    
    inline def apply(id: String, `type`: String): Linkage = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Linkage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Linkage] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type LinksCallback = js.Function2[/* data */ Any, /* extraData */ js.UndefOr[Any], String | LinksObject]
  
  trait LinksObject extends StObject {
    
    var related: js.UndefOr[LinkObject | LinksCallback | String | Null] = js.undefined
    
    var self: js.UndefOr[LinkObject | LinksCallback | String | Null] = js.undefined
  }
  object LinksObject {
    
    inline def apply(): LinksObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinksObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinksObject] (val x: Self) extends AnyVal {
      
      inline def setRelated(value: LinkObject | LinksCallback | String): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
      
      inline def setRelatedFunction2(value: (/* data */ Any, /* extraData */ js.UndefOr[Any]) => String | LinksObject): Self = StObject.set(x, "related", js.Any.fromFunction2(value))
      
      inline def setRelatedNull: Self = StObject.set(x, "related", null)
      
      inline def setRelatedUndefined: Self = StObject.set(x, "related", js.undefined)
      
      inline def setSelf(value: LinkObject | LinksCallback | String): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
      
      inline def setSelfFunction2(value: (/* data */ Any, /* extraData */ js.UndefOr[Any]) => String | LinksObject): Self = StObject.set(x, "self", js.Any.fromFunction2(value))
      
      inline def setSelfNull: Self = StObject.set(x, "self", null)
      
      inline def setSelfUndefined: Self = StObject.set(x, "self", js.undefined)
    }
  }
  
  type Meta = StringDictionary[Any]
  
  type MetaCallback = js.Function2[/* data */ Any, /* extraData */ js.UndefOr[Any], Any]
  
  trait Options extends StObject {
    
    var afterDeserialize: js.UndefOr[AfterDeseralizeCallback] = js.undefined
    
    var beforeSerialize: js.UndefOr[BeforeSerializeCallback] = js.undefined
    
    var blacklist: js.UndefOr[js.Array[String]] = js.undefined
    
    var blacklistOnDeserialize: js.UndefOr[js.Array[String]] = js.undefined
    
    var convertCase: js.UndefOr[Case] = js.undefined
    
    var convertCaseCacheSize: js.UndefOr[Double] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var jsonapiObject: js.UndefOr[Boolean] = js.undefined
    
    var links: js.UndefOr[LinksObject | LinksCallback] = js.undefined
    
    var meta: js.UndefOr[MetaCallback | Meta] = js.undefined
    
    var relationships: js.UndefOr[StringDictionary[RelationshipOptions]] = js.undefined
    
    var topLevelLinks: js.UndefOr[LinksCallback | LinksObject] = js.undefined
    
    var topLevelMeta: js.UndefOr[MetaCallback | Any] = js.undefined
    
    var unconvertCase: js.UndefOr[Case] = js.undefined
    
    var whitelist: js.UndefOr[js.Array[String]] = js.undefined
    
    var whitelistOnDeserialize: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAfterDeserialize(value: /* data */ Any => Any): Self = StObject.set(x, "afterDeserialize", js.Any.fromFunction1(value))
      
      inline def setAfterDeserializeUndefined: Self = StObject.set(x, "afterDeserialize", js.undefined)
      
      inline def setBeforeSerialize(value: /* data */ Any => Any): Self = StObject.set(x, "beforeSerialize", js.Any.fromFunction1(value))
      
      inline def setBeforeSerializeUndefined: Self = StObject.set(x, "beforeSerialize", js.undefined)
      
      inline def setBlacklist(value: js.Array[String]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      inline def setBlacklistOnDeserialize(value: js.Array[String]): Self = StObject.set(x, "blacklistOnDeserialize", value.asInstanceOf[js.Any])
      
      inline def setBlacklistOnDeserializeUndefined: Self = StObject.set(x, "blacklistOnDeserialize", js.undefined)
      
      inline def setBlacklistOnDeserializeVarargs(value: String*): Self = StObject.set(x, "blacklistOnDeserialize", js.Array(value*))
      
      inline def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
      
      inline def setBlacklistVarargs(value: String*): Self = StObject.set(x, "blacklist", js.Array(value*))
      
      inline def setConvertCase(value: Case): Self = StObject.set(x, "convertCase", value.asInstanceOf[js.Any])
      
      inline def setConvertCaseCacheSize(value: Double): Self = StObject.set(x, "convertCaseCacheSize", value.asInstanceOf[js.Any])
      
      inline def setConvertCaseCacheSizeUndefined: Self = StObject.set(x, "convertCaseCacheSize", js.undefined)
      
      inline def setConvertCaseUndefined: Self = StObject.set(x, "convertCase", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setJsonapiObject(value: Boolean): Self = StObject.set(x, "jsonapiObject", value.asInstanceOf[js.Any])
      
      inline def setJsonapiObjectUndefined: Self = StObject.set(x, "jsonapiObject", js.undefined)
      
      inline def setLinks(value: LinksObject | LinksCallback): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksFunction2(value: (/* data */ Any, /* extraData */ js.UndefOr[Any]) => String | LinksObject): Self = StObject.set(x, "links", js.Any.fromFunction2(value))
      
      inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
      
      inline def setMeta(value: MetaCallback | Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaFunction2(value: (/* data */ Any, /* extraData */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "meta", js.Any.fromFunction2(value))
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setRelationships(value: StringDictionary[RelationshipOptions]): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
      
      inline def setRelationshipsUndefined: Self = StObject.set(x, "relationships", js.undefined)
      
      inline def setTopLevelLinks(value: LinksCallback | LinksObject): Self = StObject.set(x, "topLevelLinks", value.asInstanceOf[js.Any])
      
      inline def setTopLevelLinksFunction2(value: (/* data */ Any, /* extraData */ js.UndefOr[Any]) => String | LinksObject): Self = StObject.set(x, "topLevelLinks", js.Any.fromFunction2(value))
      
      inline def setTopLevelLinksUndefined: Self = StObject.set(x, "topLevelLinks", js.undefined)
      
      inline def setTopLevelMeta(value: MetaCallback | Any): Self = StObject.set(x, "topLevelMeta", value.asInstanceOf[js.Any])
      
      inline def setTopLevelMetaFunction2(value: (/* data */ Any, /* extraData */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "topLevelMeta", js.Any.fromFunction2(value))
      
      inline def setTopLevelMetaUndefined: Self = StObject.set(x, "topLevelMeta", js.undefined)
      
      inline def setUnconvertCase(value: Case): Self = StObject.set(x, "unconvertCase", value.asInstanceOf[js.Any])
      
      inline def setUnconvertCaseUndefined: Self = StObject.set(x, "unconvertCase", js.undefined)
      
      inline def setWhitelist(value: js.Array[String]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      inline def setWhitelistOnDeserialize(value: js.Array[String]): Self = StObject.set(x, "whitelistOnDeserialize", value.asInstanceOf[js.Any])
      
      inline def setWhitelistOnDeserializeUndefined: Self = StObject.set(x, "whitelistOnDeserialize", js.undefined)
      
      inline def setWhitelistOnDeserializeVarargs(value: String*): Self = StObject.set(x, "whitelistOnDeserialize", js.Array(value*))
      
      inline def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
      
      inline def setWhitelistVarargs(value: String*): Self = StObject.set(x, "whitelist", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsonApiSerializer.anon.Data
    - typings.jsonApiSerializer.anon.Links
    - typings.jsonApiSerializer.anon.Meta
  */
  trait Relationship extends StObject
  object Relationship {
    
    inline def Data(data: Linkage | js.Array[Linkage]): typings.jsonApiSerializer.anon.Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonApiSerializer.anon.Data]
    }
    
    inline def Links(meta: Meta): typings.jsonApiSerializer.anon.Links = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonApiSerializer.anon.Links]
    }
    
    inline def Meta(): typings.jsonApiSerializer.anon.Meta = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.jsonApiSerializer.anon.Meta]
    }
  }
  
  trait RelationshipOptions extends StObject {
    
    var alternativeKey: js.UndefOr[String] = js.undefined
    
    var beforeSerialize: js.UndefOr[BeforeSerializeCallback] = js.undefined
    
    var links: js.UndefOr[LinksObject | LinksCallback] = js.undefined
    
    var meta: js.UndefOr[MetaCallback | Meta] = js.undefined
    
    var schema: js.UndefOr[String] = js.undefined
    
    var `type`: String | TypeCallback
  }
  object RelationshipOptions {
    
    inline def apply(`type`: String | TypeCallback): RelationshipOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelationshipOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RelationshipOptions] (val x: Self) extends AnyVal {
      
      inline def setAlternativeKey(value: String): Self = StObject.set(x, "alternativeKey", value.asInstanceOf[js.Any])
      
      inline def setAlternativeKeyUndefined: Self = StObject.set(x, "alternativeKey", js.undefined)
      
      inline def setBeforeSerialize(value: /* data */ Any => Any): Self = StObject.set(x, "beforeSerialize", js.Any.fromFunction1(value))
      
      inline def setBeforeSerializeUndefined: Self = StObject.set(x, "beforeSerialize", js.undefined)
      
      inline def setLinks(value: LinksObject | LinksCallback): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksFunction2(value: (/* data */ Any, /* extraData */ js.UndefOr[Any]) => String | LinksObject): Self = StObject.set(x, "links", js.Any.fromFunction2(value))
      
      inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
      
      inline def setMeta(value: MetaCallback | Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaFunction2(value: (/* data */ Any, /* extraData */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "meta", js.Any.fromFunction2(value))
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      inline def setType(value: String | TypeCallback): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeFunction2(value: (/* relationshipData */ StringDictionary[RelationshipOptions], /* data */ Any) => Any): Self = StObject.set(x, "type", js.Any.fromFunction2(value))
    }
  }
  
  trait ResourceObject[T] extends StObject {
    
    var attributes: js.UndefOr[Omit[T, id]] = js.undefined
    
    var id: String
    
    var links: js.UndefOr[LinksObject | LinksCallback] = js.undefined
    
    var relationships: js.UndefOr[StringDictionary[Relationship]] = js.undefined
    
    var `type`: String
  }
  object ResourceObject {
    
    inline def apply[T](id: String, `type`: String): ResourceObject[T] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceObject[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResourceObject[?], T] (val x: Self & ResourceObject[T]) extends AnyVal {
      
      inline def setAttributes(value: Omit[T, id]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: LinksObject | LinksCallback): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksFunction2(value: (/* data */ Any, /* extraData */ js.UndefOr[Any]) => String | LinksObject): Self = StObject.set(x, "links", js.Any.fromFunction2(value))
      
      inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
      
      inline def setRelationships(value: StringDictionary[Relationship]): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
      
      inline def setRelationshipsUndefined: Self = StObject.set(x, "relationships", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type TypeCallback = js.Function2[/* relationshipData */ StringDictionary[RelationshipOptions], /* data */ Any, Any]
}
