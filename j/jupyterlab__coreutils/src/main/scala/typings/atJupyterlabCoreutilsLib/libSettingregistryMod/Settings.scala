package typings
package atJupyterlabCoreutilsLib.libSettingregistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils/lib/settingregistry", "Settings")
@js.native
class Settings protected ()
  extends atJupyterlabCoreutilsLib.libSettingregistryMod.ISettingRegistryNs.ISettings {
  /**
    * Instantiate a new plugin settings manager.
    */
  def this(options: atJupyterlabCoreutilsLib.libSettingregistryMod.SettingsNs.IOptions) = this()
  var _changed: js.Any = js.native
  var _composite: js.Any = js.native
  var _isDisposed: js.Any = js.native
  /**
    * Handle plugin changes in the setting registry.
    */
  var _onPluginChanged: js.Any = js.native
  var _raw: js.Any = js.native
  var _schema: js.Any = js.native
  var _user: js.Any = js.native
  /**
    * A signal that emits when the plugin's settings have changed.
    */
  /* CompleteClass */
  override val changed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, scala.Unit] = js.native
  /**
    * Get the composite of user settings and extension defaults.
    */
  /* CompleteClass */
  override val composite: atPhosphorCoreutilsLib.libJsonMod.JSONObject = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: scala.Boolean = js.native
  /* CompleteClass */
  override val plugin: java.lang.String = js.native
  /**
    * The plugin settings raw text value.
    */
  /* CompleteClass */
  override val raw: java.lang.String = js.native
  /**
    * The system registry instance used by the settings manager.
    */
  val registry: SettingRegistry = js.native
  /**
    * Get the plugin settings schema.
    */
  /* CompleteClass */
  override val schema: atJupyterlabCoreutilsLib.libSettingregistryMod.ISettingRegistryNs.ISchema = js.native
  /**
    * Get the user settings.
    */
  /* CompleteClass */
  override val user: atPhosphorCoreutilsLib.libJsonMod.JSONObject = js.native
  /**
    * Return the defaults in a commented JSON format.
    */
  /* CompleteClass */
  override def annotatedDefaults(): java.lang.String = js.native
  /**
    * Calculate the default value of a setting by iterating through the schema.
    *
    * @param key - The name of the setting whose default value is calculated.
    *
    * @returns A calculated default JSON value for a specific setting.
    */
  /* CompleteClass */
  override def default(key: java.lang.String): js.UndefOr[atPhosphorCoreutilsLib.libJsonMod.JSONValue] = js.native
  /**
    * Dispose of the resources held by the object.
    *
    * #### Notes
    * If the object's `dispose` method is called more than once, all
    * calls made after the first will be a no-op.
    *
    * #### Undefined Behavior
    * It is undefined behavior to use any functionality of the object
    * after it has been disposed unless otherwise explicitly noted.
    */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  /**
    * Get an individual setting.
    *
    * @param key - The name of the setting being retrieved.
    *
    * @returns The setting value.
    */
  /* CompleteClass */
  override def get(key: java.lang.String): atJupyterlabCoreutilsLib.Anon_Composite = js.native
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
  /* CompleteClass */
  override def remove(key: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Save all of the plugin's user settings at once.
    */
  /* CompleteClass */
  override def save(raw: java.lang.String): js.Promise[scala.Unit] = js.native
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
  /* CompleteClass */
  override def set(key: java.lang.String, value: atPhosphorCoreutilsLib.libJsonMod.JSONValue): js.Promise[scala.Unit] = js.native
  /**
    * Validates raw settings with comments.
    *
    * @param raw - The JSON with comments string being validated.
    *
    * @returns A list of errors or `null` if valid.
    */
  /* CompleteClass */
  override def validate(raw: java.lang.String): js.Array[atJupyterlabCoreutilsLib.libSettingregistryMod.ISchemaValidatorNs.IError] | scala.Null = js.native
}

