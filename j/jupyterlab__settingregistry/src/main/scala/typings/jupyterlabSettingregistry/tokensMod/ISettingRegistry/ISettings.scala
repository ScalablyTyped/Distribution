package typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry

import typings.jupyterlabSettingregistry.anon.User
import typings.jupyterlabSettingregistry.settingregistryMod.ISchemaValidator.IError
import typings.luminoCoreutils.jsonMod.PartialJSONValue
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for manipulating the settings of a specific plugin.
  */
@js.native
trait ISettings extends IDisposable {
  /**
    * A signal that emits when the plugin's settings have changed.
    */
  val changed: ISignal[this.type, Unit] = js.native
  /**
    * The composite of user settings and extension defaults.
    */
  val composite: ReadonlyPartialJSONObject = js.native
  /**
    * The plugin's ID.
    */
  val id: String = js.native
  val plugin: IPlugin = js.native
  /**
    * The plugin settings raw text value.
    */
  val raw: String = js.native
  /**
    * The plugin's schema.
    */
  val schema: ISchema = js.native
  /**
    * The user settings.
    */
  val user: ReadonlyPartialJSONObject = js.native
  /**
    * The published version of the NPM package containing these settings.
    */
  val version: String = js.native
  /**
    * Return the defaults in a commented JSON format.
    */
  def annotatedDefaults(): String = js.native
  /**
    * Calculate the default value of a setting by iterating through the schema.
    *
    * @param key - The name of the setting whose default value is calculated.
    *
    * @returns A calculated default JSON value for a specific setting.
    */
  def default(key: String): js.UndefOr[PartialJSONValue] = js.native
  /**
    * Get an individual setting.
    *
    * @param key - The name of the setting being retrieved.
    *
    * @returns The setting value.
    */
  def get(key: String): User = js.native
  /**
    * Remove a single setting.
    *
    * @param key - The name of the setting being removed.
    *
    * @returns A promise that resolves when the setting is removed.
    *
    * #### Notes
    * This function is asynchronous because it writes to the setting registry.
    */
  def remove(key: String): js.Promise[Unit] = js.native
  /**
    * Save all of the plugin's user settings at once.
    */
  def save(raw: String): js.Promise[Unit] = js.native
  /**
    * Set a single setting.
    *
    * @param key - The name of the setting being set.
    *
    * @param value - The value of the setting.
    *
    * @returns A promise that resolves when the setting has been saved.
    *
    * #### Notes
    * This function is asynchronous because it writes to the setting registry.
    */
  def set(key: String, value: PartialJSONValue): js.Promise[Unit] = js.native
  /**
    * Validates raw settings with comments.
    *
    * @param raw - The JSON with comments string being validated.
    *
    * @returns A list of errors or `null` if valid.
    */
  def validate(raw: String): js.Array[IError] | Null = js.native
}

object ISettings {
  @scala.inline
  def apply(
    annotatedDefaults: () => String,
    changed: ISignal[ISettings, Unit],
    composite: ReadonlyPartialJSONObject,
    default: String => js.UndefOr[PartialJSONValue],
    dispose: () => Unit,
    get: String => User,
    id: String,
    isDisposed: Boolean,
    plugin: IPlugin,
    raw: String,
    remove: String => js.Promise[Unit],
    save: String => js.Promise[Unit],
    schema: ISchema,
    set: (String, PartialJSONValue) => js.Promise[Unit],
    user: ReadonlyPartialJSONObject,
    validate: String => js.Array[IError] | Null,
    version: String
  ): ISettings = {
    val __obj = js.Dynamic.literal(annotatedDefaults = js.Any.fromFunction0(annotatedDefaults), changed = changed.asInstanceOf[js.Any], composite = composite.asInstanceOf[js.Any], default = js.Any.fromFunction1(default), dispose = js.Any.fromFunction0(dispose), get = js.Any.fromFunction1(get), id = id.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), save = js.Any.fromFunction1(save), schema = schema.asInstanceOf[js.Any], set = js.Any.fromFunction2(set), user = user.asInstanceOf[js.Any], validate = js.Any.fromFunction1(validate), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISettings]
  }
  @scala.inline
  implicit class ISettingsOps[Self <: ISettings] (val x: Self) extends AnyVal {
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
    def setAnnotatedDefaults(value: () => String): Self = this.set("annotatedDefaults", js.Any.fromFunction0(value))
    @scala.inline
    def setChanged(value: ISignal[ISettings, Unit]): Self = this.set("changed", value.asInstanceOf[js.Any])
    @scala.inline
    def setComposite(value: ReadonlyPartialJSONObject): Self = this.set("composite", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefault(value: String => js.UndefOr[PartialJSONValue]): Self = this.set("default", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: String => User): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlugin(value: IPlugin): Self = this.set("plugin", value.asInstanceOf[js.Any])
    @scala.inline
    def setRaw(value: String): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemove(value: String => js.Promise[Unit]): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def setSave(value: String => js.Promise[Unit]): Self = this.set("save", js.Any.fromFunction1(value))
    @scala.inline
    def setSchema(value: ISchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setSet(value: (String, PartialJSONValue) => js.Promise[Unit]): Self = this.set("set", js.Any.fromFunction2(value))
    @scala.inline
    def setUser(value: ReadonlyPartialJSONObject): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidate(value: String => js.Array[IError] | Null): Self = this.set("validate", js.Any.fromFunction1(value))
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

