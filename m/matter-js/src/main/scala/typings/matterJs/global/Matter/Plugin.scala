package typings.matterJs.global.Matter

import org.scalablytyped.runtime.StringDictionary
import typings.matterJs.anon.Dict
import typings.matterJs.anon.IsRange
import typings.matterJs.anon.Name
import typings.matterJs.anon.Uses
import typings.matterJs.mod.Dependency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Matter.Plugin")
@js.native
open class Plugin ()
  extends typings.matterJs.mod.Plugin
/* static members */
object Plugin {
  
  @JSGlobal("Matter.Plugin")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Recursively finds all of a module's dependencies and returns a flat dependency graph.
    * @method dependencies
    * @param {Dependency} module The module.
    * @returns {any} A dependency graph.
    */
  inline def dependencies(module: Dependency): js.UndefOr[StringDictionary[js.Array[String]] | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("dependencies")(module.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[StringDictionary[js.Array[String]] | String]]
  inline def dependencies(module: Dependency, tracked: StringDictionary[js.Array[String]]): js.UndefOr[StringDictionary[js.Array[String]] | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("dependencies")(module.asInstanceOf[js.Any], tracked.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[StringDictionary[js.Array[String]] | String]]
  
  /**
    * Parses a dependency string into its components.
    * The `dependency` is a string of the format `'module-name'` or `'module-name@version'`.
    * See documentation for `Plugin.versionParse` for a description of the format.
    * This function can also handle dependencies that are already resolved (e.g. a module object).
    * @method dependencyParse
    * @param {Dependency} dependency The dependency of the format `'module-name'` or `'module-name@version'`.
    * @returns {any} The dependency parsed into its components.
    */
  inline def dependencyParse(dependency: Dependency): Name = ^.asInstanceOf[js.Dynamic].applyDynamic("dependencyParse")(dependency.asInstanceOf[js.Any]).asInstanceOf[Name]
  
  /**
    * Returns `true` if `plugin.for` is applicable to `module` by comparing against `module.name` and `module.version`.
    * If `plugin.for` is not specified then it is assumed to be applicable.
    * The value of `plugin.for` is a string of the format `'module-name'` or `'module-name@version'`.
    * @method isFor
    * @param {} plugin The plugin.
    * @param {} module The module.
    * @returns {boolean} `true` if `plugin.for` is applicable to `module`, otherwise `false`.
    */
  inline def isFor(plugin: typings.matterJs.mod.Plugin, module: Dict): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFor")(plugin.asInstanceOf[js.Any], module.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Returns `true` if the object meets the minimum standard to be considered a plugin.
    * This means it must define the following properties:
    * - `name`
    * - `version`
    * - `install`
    * @method isPlugin
    * @param {any} obj The obj to test.
    * @returns {boolean} `true` if the object can be considered a plugin otherwise `false`.
    */
  inline def isPlugin(obj: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlugin")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Registers a plugin object so it can be resolved later by name.
    * @method register
    * @param {} plugin The plugin to register.
    * @returns {any} The plugin.
    */
  inline def register(plugin: typings.matterJs.mod.Plugin): typings.matterJs.mod.Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(plugin.asInstanceOf[js.Any]).asInstanceOf[typings.matterJs.mod.Plugin]
  
  /**
    * Resolves a dependency to a plugin object from the registry if it exists.
    * The `dependency` may contain a version, but only the name matters when resolving.
    * @method resolve
    * @param {string} dependency The dependency.
    * @returns {any} The plugin if resolved, otherwise `undefined`.
    */
  inline def resolve(dependency: String): js.UndefOr[typings.matterJs.mod.Plugin] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(dependency.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.matterJs.mod.Plugin]]
  
  /**
    * Returns a pretty printed plugin name and version.
    * @method toString
    * @param {} plugin The plugin.
    * @returns {string} Pretty printed plugin name and version.
    */
  inline def toString(plugin: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(plugin.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toString(plugin: typings.matterJs.mod.Plugin): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(plugin.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Installs the plugins by calling `plugin.install` on each plugin specified in `plugins` if passed, otherwise `module.uses`.
    * For installing plugins on `Matter` see the convenience function `Matter.use`.
    * Plugins may be specified either by their name or a reference to the plugin object.
    * Plugins themselves may specify further dependencies, but each plugin is installed only once.
    * Order is important, a topological sort is performed to find the best resulting order of installation.
    * This sorting attempts to satisfy every dependency's requested ordering, but may not be exact in all cases.
    * This function logs the resulting status of each dependency in the console, along with any warnings.
    * - A green tick ✅ indicates a dependency was resolved and installed.
    * - An orange diamond 🔶 indicates a dependency was resolved but a warning was thrown for it or one if its dependencies.
    * - A red cross ❌ indicates a dependency could not be resolved.
    * Avoid calling this function multiple times on the same module unless you intend to manually control installation order.
    * @method use
    * @param  {} The module install plugins on.
    * @param [plugins=module.uses] {} The plugins to install on module (optional, defaults to `module.uses`).
    */
  inline def use(module: Uses, plugins: js.Array[typings.matterJs.mod.Plugin | String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("use")(module.asInstanceOf[js.Any], plugins.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Parses a version string into its components.
    * Versions are strictly of the format `x.y.z` (as in [semver](http://semver.org/)).
    * Versions may optionally have a prerelease tag in the format `x.y.z-alpha`.
    * Ranges are a strict subset of [npm ranges](https://docs.npmjs.com/misc/semver#advanced-range-syntax).
    * Only the following range types are supported:
    * - Tilde ranges e.g. `~1.2.3`
    * - Caret ranges e.g. `^1.2.3`
    * - Exact version e.g. `1.2.3`
    * - Any version `*`
    * @method versionParse
    * @param range {string} The version string.
    * @returns {any} The version range parsed into its components.
    */
  inline def versionParse(range: String): IsRange = ^.asInstanceOf[js.Dynamic].applyDynamic("versionParse")(range.asInstanceOf[js.Any]).asInstanceOf[IsRange]
  
  /**
    * Returns `true` if `version` satisfies the given `range`.
    * See documentation for `Plugin.versionParse` for a description of the format.
    * If a version or range is not specified, then any version (`*`) is assumed to satisfy.
    * @method versionSatisfies
    * @param {string} version The version string.
    * @param {string} range The range string.
    * @returns {boolean} `true` if `version` satisfies `range`, otherwise `false`.
    */
  inline def versionSatisfies(version: String, range: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("versionSatisfies")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
