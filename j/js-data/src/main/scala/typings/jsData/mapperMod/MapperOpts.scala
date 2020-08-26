package typings.jsData.mapperMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.jsData.anon.TypeofRecord
import typings.jsData.jsDataStrings.skip
import typings.jsData.schemaMod.PropertyDefinition
import typings.jsData.schemaMod.SchemaDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapperOpts
  extends /* customAttr */ StringDictionary[js.Any] {
  /**
    * Hash of registered adapters. Don't modify directly. Use
    * {@link Mapper#registerAdapter} instead.
    *
    * @default {}
    * @since 3.0.0
    * @tutorial ["http://www.js-data.io/v3.0/docs/connecting-to-a-data-source","Connecting to a data source"]
    */
  var _adapters: js.UndefOr[js.Object] = js.native
  /**
    * Whether {@link Mapper#beforeCreate} and {@link Mapper#beforeCreateMany}
    * should automatically receive default values according to the Mapper's schema.
    *
    * @default true
    * @since 3.0.0
    */
  var applyDefaults: js.UndefOr[Boolean] = js.native
  /**
    * Whether to augment {@link Mapper#recordClass} with ES5 getters and setters
    * according to the properties defined in {@link Mapper#schema}. This makes
    * possible validation and change tracking on individual properties
    * when using the dot (e.g. `user.name = "Bob"`) operator to modify a
    * property, and is `true` by default.
    *
    * @default true
    * @since 3.0.0
    */
  var applySchema: js.UndefOr[Boolean] = js.native
  /**
    * The name of the registered adapter that this Mapper should used by default.
    *
    * @default "http"
    * @since 3.0.0
    * @tutorial ["http://www.js-data.io/v3.0/docs/connecting-to-a-data-source","Connecting to a data source"]
    */
  var defaultAdapter: js.UndefOr[String] = js.native
  var endpoint: js.UndefOr[String] = js.native
  /**
    * The field used as the unique identifier on records handled by this Mapper.
    *
    * @default id
    * @since 3.0.0
    */
  var idAttribute: js.UndefOr[String] = js.native
  /**
    * Whether records created from this mapper keep changeHistory on property changes.
    *
    * @default true
    * @since 3.0.0
    */
  var keepChangeHistory: js.UndefOr[Boolean] = js.native
  var mapperClass: js.UndefOr[Instantiable1[/* opts */ js.UndefOr[MapperOpts], Mapper]] = js.native
  var methods: js.UndefOr[StringDictionary[js.Function]] = js.native
  var name: js.UndefOr[String] = js.native
  /**
    * Whether to skip validation when the Record instances are created.
    *
    * @default false
    * @since 3.0.0
    */
  var noValidate: js.UndefOr[Boolean] = js.native
  /**
    * Whether this Mapper should emit operational events.
    *
    * @default true
    * @since 3.0.0
    */
  @JSName("notify")
  var notify_FMapperOpts: js.UndefOr[Boolean] = js.native
  var onConflict: js.UndefOr[skip] = js.native
  var properties: js.UndefOr[StringDictionary[PropertyDefinition]] = js.native
  /**
    * Whether {@link Mapper#create}, {@link Mapper#createMany},
    * {@link Mapper#update}, {@link Mapper#updateAll}, {@link Mapper#updateMany},
    * {@link Mapper#find}, {@link Mapper#findAll}, {@link Mapper#destroy},
    * {@link Mapper#destroyAll}, {@link Mapper#count}, and {@link Mapper#sum}
    * should return a raw result object that contains both the instance data
    * returned by the adapter _and_ metadata about the operation.
    *
    * The default is to NOT return the result object, and instead return just the
    * instance data.
    *
    * @default false
    * @since 3.0.0
    */
  var raw: js.UndefOr[Boolean] = js.native
  var recordClass: js.UndefOr[TypeofRecord | Boolean] = js.native
  var relations: js.UndefOr[js.Any] = js.native
  var schema: js.UndefOr[SchemaDefinition | typings.jsData.schemaMod.default] = js.native
  var scopes: js.UndefOr[js.Any] = js.native
  var `type`: js.UndefOr[String] = js.native
  /**
    * Whether records created from this mapper automatically validate their properties
    * when their properties are modified.
    *
    * @default true
    * @since 3.0.0
    */
  var validateOnSet: js.UndefOr[Boolean] = js.native
  var wrap: js.UndefOr[Boolean] = js.native
}

object MapperOpts {
  @scala.inline
  def apply(): MapperOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapperOpts]
  }
  @scala.inline
  implicit class MapperOptsOps[Self <: MapperOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_adapters(value: js.Object): Self = this.set("_adapters", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_adapters: Self = this.set("_adapters", js.undefined)
    @scala.inline
    def setApplyDefaults(value: Boolean): Self = this.set("applyDefaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplyDefaults: Self = this.set("applyDefaults", js.undefined)
    @scala.inline
    def setApplySchema(value: Boolean): Self = this.set("applySchema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplySchema: Self = this.set("applySchema", js.undefined)
    @scala.inline
    def setDefaultAdapter(value: String): Self = this.set("defaultAdapter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultAdapter: Self = this.set("defaultAdapter", js.undefined)
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    @scala.inline
    def setIdAttribute(value: String): Self = this.set("idAttribute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdAttribute: Self = this.set("idAttribute", js.undefined)
    @scala.inline
    def setKeepChangeHistory(value: Boolean): Self = this.set("keepChangeHistory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepChangeHistory: Self = this.set("keepChangeHistory", js.undefined)
    @scala.inline
    def setMapperClass(value: Instantiable1[/* opts */ js.UndefOr[MapperOpts], Mapper]): Self = this.set("mapperClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapperClass: Self = this.set("mapperClass", js.undefined)
    @scala.inline
    def setMethods(value: StringDictionary[js.Function]): Self = this.set("methods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethods: Self = this.set("methods", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNoValidate(value: Boolean): Self = this.set("noValidate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoValidate: Self = this.set("noValidate", js.undefined)
    @scala.inline
    def setNotify(value: Boolean): Self = this.set("notify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotify: Self = this.set("notify", js.undefined)
    @scala.inline
    def setOnConflict(value: skip): Self = this.set("onConflict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnConflict: Self = this.set("onConflict", js.undefined)
    @scala.inline
    def setProperties(value: StringDictionary[PropertyDefinition]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    @scala.inline
    def setRecordClass(value: TypeofRecord | Boolean): Self = this.set("recordClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordClass: Self = this.set("recordClass", js.undefined)
    @scala.inline
    def setRelations(value: js.Any): Self = this.set("relations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelations: Self = this.set("relations", js.undefined)
    @scala.inline
    def setSchema(value: SchemaDefinition | typings.jsData.schemaMod.default): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    @scala.inline
    def setScopes(value: js.Any): Self = this.set("scopes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScopes: Self = this.set("scopes", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValidateOnSet(value: Boolean): Self = this.set("validateOnSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidateOnSet: Self = this.set("validateOnSet", js.undefined)
    @scala.inline
    def setWrap(value: Boolean): Self = this.set("wrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
  }
  
}

