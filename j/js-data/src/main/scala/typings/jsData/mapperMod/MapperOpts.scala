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
  var _adapters: js.UndefOr[js.Object] = js.undefined
  /**
    * Whether {@link Mapper#beforeCreate} and {@link Mapper#beforeCreateMany}
    * should automatically receive default values according to the Mapper's schema.
    *
    * @default true
    * @since 3.0.0
    */
  var applyDefaults: js.UndefOr[Boolean] = js.undefined
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
  var applySchema: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the registered adapter that this Mapper should used by default.
    *
    * @default "http"
    * @since 3.0.0
    * @tutorial ["http://www.js-data.io/v3.0/docs/connecting-to-a-data-source","Connecting to a data source"]
    */
  var defaultAdapter: js.UndefOr[String] = js.undefined
  var endpoint: js.UndefOr[String] = js.undefined
  /**
    * The field used as the unique identifier on records handled by this Mapper.
    *
    * @default id
    * @since 3.0.0
    */
  var idAttribute: js.UndefOr[String] = js.undefined
  /**
    * Whether records created from this mapper keep changeHistory on property changes.
    *
    * @default true
    * @since 3.0.0
    */
  var keepChangeHistory: js.UndefOr[Boolean] = js.undefined
  var mapperClass: js.UndefOr[Instantiable1[js.UndefOr[/* opts */ MapperOpts], Mapper]] = js.undefined
  var methods: js.UndefOr[StringDictionary[js.Function]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  /**
    * Whether to skip validation when the Record instances are created.
    *
    * @default false
    * @since 3.0.0
    */
  var noValidate: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether this Mapper should emit operational events.
    *
    * @default true
    * @since 3.0.0
    */
  @JSName("notify")
  var notify_FMapperOpts: js.UndefOr[Boolean] = js.undefined
  var onConflict: js.UndefOr[skip] = js.undefined
  var properties: js.UndefOr[StringDictionary[PropertyDefinition]] = js.undefined
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
  var raw: js.UndefOr[Boolean] = js.undefined
  var recordClass: js.UndefOr[TypeofRecord | Boolean] = js.undefined
  var relations: js.UndefOr[js.Any] = js.undefined
  var schema: js.UndefOr[SchemaDefinition | typings.jsData.schemaMod.default] = js.undefined
  var scopes: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Whether records created from this mapper automatically validate their properties
    * when their properties are modified.
    *
    * @default true
    * @since 3.0.0
    */
  var validateOnSet: js.UndefOr[Boolean] = js.undefined
  var wrap: js.UndefOr[Boolean] = js.undefined
}

object MapperOpts {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    _adapters: js.Object = null,
    applyDefaults: js.UndefOr[Boolean] = js.undefined,
    applySchema: js.UndefOr[Boolean] = js.undefined,
    defaultAdapter: String = null,
    endpoint: String = null,
    idAttribute: String = null,
    keepChangeHistory: js.UndefOr[Boolean] = js.undefined,
    mapperClass: Instantiable1[js.UndefOr[/* opts */ MapperOpts], Mapper] = null,
    methods: StringDictionary[js.Function] = null,
    name: String = null,
    noValidate: js.UndefOr[Boolean] = js.undefined,
    notify: js.UndefOr[Boolean] = js.undefined,
    onConflict: skip = null,
    properties: StringDictionary[PropertyDefinition] = null,
    raw: js.UndefOr[Boolean] = js.undefined,
    recordClass: TypeofRecord | Boolean = null,
    relations: js.Any = null,
    schema: SchemaDefinition | typings.jsData.schemaMod.default = null,
    scopes: js.Any = null,
    `type`: String = null,
    validateOnSet: js.UndefOr[Boolean] = js.undefined,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): MapperOpts = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_adapters != null) __obj.updateDynamic("_adapters")(_adapters.asInstanceOf[js.Any])
    if (!js.isUndefined(applyDefaults)) __obj.updateDynamic("applyDefaults")(applyDefaults.get.asInstanceOf[js.Any])
    if (!js.isUndefined(applySchema)) __obj.updateDynamic("applySchema")(applySchema.get.asInstanceOf[js.Any])
    if (defaultAdapter != null) __obj.updateDynamic("defaultAdapter")(defaultAdapter.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (idAttribute != null) __obj.updateDynamic("idAttribute")(idAttribute.asInstanceOf[js.Any])
    if (!js.isUndefined(keepChangeHistory)) __obj.updateDynamic("keepChangeHistory")(keepChangeHistory.get.asInstanceOf[js.Any])
    if (mapperClass != null) __obj.updateDynamic("mapperClass")(mapperClass.asInstanceOf[js.Any])
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(noValidate)) __obj.updateDynamic("noValidate")(noValidate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(notify)) __obj.updateDynamic("notify")(notify.get.asInstanceOf[js.Any])
    if (onConflict != null) __obj.updateDynamic("onConflict")(onConflict.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.get.asInstanceOf[js.Any])
    if (recordClass != null) __obj.updateDynamic("recordClass")(recordClass.asInstanceOf[js.Any])
    if (relations != null) __obj.updateDynamic("relations")(relations.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(validateOnSet)) __obj.updateDynamic("validateOnSet")(validateOnSet.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapperOpts]
  }
}

