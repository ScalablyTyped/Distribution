package typings
package atJupyterlabCoreutilsLib.libSettingregistryMod.ISettingRegistryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for manipulating the settings of a specific plugin.
  */
trait ISettings
  extends atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable {
  /**
    * A signal that emits when the plugin's settings have changed.
    */
  val changed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, scala.Unit]
  /**
    * Get the composite of user settings and extension defaults.
    */
  val composite: atPhosphorCoreutilsLib.libJsonMod.JSONObject
  val plugin: java.lang.String
  /**
    * The plugin settings raw text value.
    */
  val raw: java.lang.String
  /**
    * Get the plugin settings schema.
    */
  val schema: ISchema
  /**
    * Get the user settings.
    */
  val user: atPhosphorCoreutilsLib.libJsonMod.JSONObject
  /**
    * Return the defaults in a commented JSON format.
    */
  def annotatedDefaults(): java.lang.String
  /**
    * Calculate the default value of a setting by iterating through the schema.
    *
    * @param key - The name of the setting whose default value is calculated.
    *
    * @returns A calculated default JSON value for a specific setting.
    */
  def default(key: java.lang.String): js.UndefOr[atPhosphorCoreutilsLib.libJsonMod.JSONValue]
  /**
    * Get an individual setting.
    *
    * @param key - The name of the setting being retrieved.
    *
    * @returns The setting value.
    */
  def get(key: java.lang.String): atJupyterlabCoreutilsLib.Anon_Composite
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
  def remove(key: java.lang.String): js.Promise[scala.Unit]
  /**
    * Save all of the plugin's user settings at once.
    */
  def save(raw: java.lang.String): js.Promise[scala.Unit]
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
  def set(key: java.lang.String, value: atPhosphorCoreutilsLib.libJsonMod.JSONValue): js.Promise[scala.Unit]
  /**
    * Validates raw settings with comments.
    *
    * @param raw - The JSON with comments string being validated.
    *
    * @returns A list of errors or `null` if valid.
    */
  def validate(raw: java.lang.String): js.Array[atJupyterlabCoreutilsLib.libSettingregistryMod.ISchemaValidatorNs.IError] | scala.Null
}

object ISettings {
  @scala.inline
  def apply(
    annotatedDefaults: () => java.lang.String,
    changed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[ISettings, scala.Unit],
    composite: atPhosphorCoreutilsLib.libJsonMod.JSONObject,
    default: java.lang.String => js.UndefOr[atPhosphorCoreutilsLib.libJsonMod.JSONValue],
    dispose: () => scala.Unit,
    get: java.lang.String => atJupyterlabCoreutilsLib.Anon_Composite,
    isDisposed: scala.Boolean,
    plugin: java.lang.String,
    raw: java.lang.String,
    remove: java.lang.String => js.Promise[scala.Unit],
    save: java.lang.String => js.Promise[scala.Unit],
    schema: ISchema,
    set: (java.lang.String, atPhosphorCoreutilsLib.libJsonMod.JSONValue) => js.Promise[scala.Unit],
    user: atPhosphorCoreutilsLib.libJsonMod.JSONObject,
    validate: java.lang.String => js.Array[atJupyterlabCoreutilsLib.libSettingregistryMod.ISchemaValidatorNs.IError] | scala.Null
  ): ISettings = {
    val __obj = js.Dynamic.literal(annotatedDefaults = js.Any.fromFunction0(annotatedDefaults), changed = changed, composite = composite, default = js.Any.fromFunction1(default), dispose = js.Any.fromFunction0(dispose), get = js.Any.fromFunction1(get), isDisposed = isDisposed, plugin = plugin, raw = raw, remove = js.Any.fromFunction1(remove), save = js.Any.fromFunction1(save), schema = schema, set = js.Any.fromFunction2(set), user = user, validate = js.Any.fromFunction1(validate))
  
    __obj.asInstanceOf[ISettings]
  }
}

