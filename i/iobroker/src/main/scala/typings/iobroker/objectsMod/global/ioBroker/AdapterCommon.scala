package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.anon.Darwin
import typings.iobroker.anon.Faicon
import typings.iobroker.anon.PartialRecordLanguagesstr
import typings.iobroker.anon.RecordLanguagesstring
import typings.iobroker.iobrokerBooleans.`true`
import typings.iobroker.iobrokerStrings.JavascriptSlashNodeDotjs
import typings.iobroker.iobrokerStrings.assumption
import typings.iobroker.iobrokerStrings.cloud
import typings.iobroker.iobrokerStrings.darwin
import typings.iobroker.iobrokerStrings.linux
import typings.iobroker.iobrokerStrings.local
import typings.iobroker.iobrokerStrings.poll
import typings.iobroker.iobrokerStrings.push
import typings.iobroker.iobrokerStrings.win32
import typings.iobroker.mod.global.ioBroker.LogLevel
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdapterCommon extends ObjectCommon {
  
  /** Custom attributes to be shown in admin in the object browser */
  var adminColumns: js.UndefOr[js.Array[_]] = js.native
  
  /** Settings for custom Admin Tabs */
  var adminTab: js.UndefOr[Faicon] = js.native
  
  var allowInit: js.UndefOr[Boolean] = js.native
  
  /** Possible values for the instance mode (if more than one is possible) */
  var availableModes: js.UndefOr[js.Array[InstanceMode]] = js.native
  
  /** Whether this adapter includes custom blocks for Blockly. If true, `admin/blockly.js` must exist. */
  var blockly: js.UndefOr[Boolean] = js.native
  
  /** If true, this adapter can be started in compact mode (in the same process as other adpaters) */
  var compact: js.UndefOr[Boolean] = js.native
  
  /** Where the adapter will get its data from. Set this together with @see dataSource */
  var connectionType: js.UndefOr[local | cloud] = js.native
  
  // Make it possible to narrow the object type using the custom property
  var custom: js.UndefOr[scala.Nothing] = js.native
  
  /** The directory relative to iobroker-data where the adapter stores the data. Supports the placeholder `%INSTANCE%`. This folder will be backed up and restored automatically. */
  var dataFolder: js.UndefOr[String] = js.native
  
  /** How the adapter will mainly receive its data. Set this together with @see connectionType */
  var dataSource: js.UndefOr[poll | push | assumption] = js.native
  
  /** A record of ioBroker adapters (including "js-controller") and version ranges which are required for this adapter. */
  var dependencies: js.UndefOr[js.Array[Record[String, String]]] = js.native
  
  /** Which files outside of the README.md have documentation for the adapter */
  var docs: js.UndefOr[PartialRecordLanguagesstr] = js.native
  
  /** Whether new instances should be enabled by default. *Should* be `false`! */
  var enabled: Boolean = js.native
  
  /** If true, all previous data in the target directory (web) should be deleted before uploading */
  var eraseOnUpload: js.UndefOr[Boolean] = js.native
  
  /** URL of an external icon that is shown for adapters that are not installed */
  var extIcon: js.UndefOr[String] = js.native
  
  /** Whether this adapter responds to `getHistory` messages */
  var getHistory: js.UndefOr[Boolean] = js.native
  
  /** Which version of this adapter is installed */
  var installedVersion: String = js.native
  
  var keywords: js.UndefOr[js.Array[String]] = js.native
  
  /** @deprecated Use @see localLinks */
  var localLink: js.UndefOr[String] = js.native
  
  /** A dictionary of links to web services this adapter provides */
  var localLinks: js.UndefOr[Record[String, String]] = js.native
  
  var logLevel: js.UndefOr[LogLevel] = js.native
  
  /** Whether this adapter receives logs from other hosts and adapters (e.g. to strore them somewhere) */
  var logTransporter: js.UndefOr[Boolean] = js.native
  
  /** Path to the start file of the adapter. Should be the same as in `package.json` */
  var main: js.UndefOr[String] = js.native
  
  /** Whether the admin configuration dialog is written in materialize style. Required for Admin 3+ */
  var materialize: Boolean = js.native
  
  /** Whether the admin tab is written in materialize style. Required for Admin 3+ */
  var materializeTab: Boolean = js.native
  
  /** If `true`, the object `system.adapter.<adaptername>.<adapterinstance>.messagebox will be created to send messages to the adapter (used for email, pushover, etc...) */
  var messagebox: js.UndefOr[`true`] = js.native
  
  var mode: InstanceMode = js.native
  
  /** Name of the adapter (without leading `ioBroker.`) */
  @JSName("name")
  var name_AdapterCommon: String = js.native
  
  /** If `true`, no configuration dialog will be shown */
  var noConfig: js.UndefOr[`true`] = js.native
  
  /** If `true`, this adapter's instances will not be shown in the admin overview screen. Useful for icon sets and widgets... */
  var noIntro: js.UndefOr[`true`] = js.native
  
  /** Set to `true` if the adapter is not available in the official ioBroker repositories. */
  var noRepository: js.UndefOr[`true`] = js.native
  
  /** If `true`, manual installation from GitHub is not possible */
  var nogit: js.UndefOr[`true`] = js.native
  
  /** If `true`, this adapter cannot be deleted or updated manually. */
  var nondeletable: js.UndefOr[`true`] = js.native
  
  /** If `true`, this "adapter" only contains HTML files and no main executable */
  var onlyWWW: js.UndefOr[Boolean] = js.native
  
  /** Which OSes this adapter supports */
  var os: js.UndefOr[linux | darwin | win32 | (js.Array[linux | darwin | win32])] = js.native
  
  /** Used to configure native (OS) dependencies of this adapter that need to be installed with system package manager before installing the adapter */
  var osDependencies: js.UndefOr[Darwin] = js.native
  
  var platform: JavascriptSlashNodeDotjs = js.native
  
  /** The keys of common attributes (e.g. `history`) which are not deleted in a `setObject` call even if they are not present. Deletion must be done explicitly by setting them to `null`. */
  var preserveSettings: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Which adapters must be restarted after installing or updating this adapter. */
  var restartAdapters: js.UndefOr[js.Array[String]] = js.native
  
  /** If the adapter runs in `schedule` mode, this contains the CRON */
  var schedule: js.UndefOr[String] = js.native
  
  var serviceStates: js.UndefOr[Boolean | String] = js.native
  
  /** Whether this adapter may only be installed once in the whole system */
  var singleton: js.UndefOr[Boolean] = js.native
  
  /** Whether this adapter may only be installed once per host */
  var singletonHost: js.UndefOr[Boolean] = js.native
  
  /** Whether the adapter must be stopped before an update */
  var stopBeforeUpdate: js.UndefOr[Boolean] = js.native
  
  /** Overrides the default timeout that ioBroker will wait before force-stopping the adapter */
  var stopTimeout: js.UndefOr[Double] = js.native
  
  var subscribable: js.UndefOr[Boolean] = js.native
  
  var subscribe: js.UndefOr[js.Any] = js.native
  
   // ?
  /** If `true`, this adapter provides custom per-state settings. Requires a `custom_m.html` file in the `admin` directory. */
  var supportCustoms: js.UndefOr[Boolean] = js.native
  
  /** Whether the adapter supports the signal stopInstance via messagebox */
  var supportStopInstance: js.UndefOr[Boolean] = js.native
  
  /** @deprecated The name of this adapter to be shown in the admin UI. Use @see titleLang instead. */
  var title: js.UndefOr[String] = js.native
  
  /** The translated names of this adapter to be shown in the admin UI */
  var titleLang: js.UndefOr[RecordLanguagesstring] = js.native
  
  /** The type of this adapter */
  var `type`: js.UndefOr[String] = js.native
  
  /** If `true`, the `npm` package must be installed with the `--unsafe-perm` flag */
  var unsafePerm: js.UndefOr[`true`] = js.native
  
  /** The available version in the ioBroker repo. */
  var version: String = js.native
  
  /** If `true`, the adapter will be started if any value is written into `system.adapter.<name>.<instance>.wakeup. Normally the adapter should stop after processing the event. */
  var wakeup: js.UndefOr[Boolean] = js.native
  
  /** Include the adapter version in the URL of the web adapter, e.g. `http://ip:port/1.2.3/material` instead of `http://ip:port/material` */
  var webByVersion: js.UndefOr[Boolean] = js.native
  
  /** Whether the web server in this adapter can be extended with plugin/extensions */
  var webExtendable: js.UndefOr[Boolean] = js.native
  
  /** Relative path to a module that contains an extension for the web adapter. Use together with @see native.webInstance to configure which instances this affects */
  var webExtension: js.UndefOr[String] = js.native
  
  var webPreSettings: js.UndefOr[js.Any] = js.native
  
   // ?
  var webservers: js.UndefOr[js.Any] = js.native
  
   // ?
  /** A list of pages that should be shown on the "web" index page */
  var welcomeScreen: js.UndefOr[js.Array[WelcomeScreenEntry]] = js.native
  
  /** A list of pages that should be shown on the ioBroker cloud index page */
  var welcomeScreenPro: js.UndefOr[js.Array[WelcomeScreenEntry]] = js.native
  
  var wwwDontUpload: js.UndefOr[Boolean] = js.native
}
object AdapterCommon {
  
  @scala.inline
  def apply(
    enabled: Boolean,
    installedVersion: String,
    materialize: Boolean,
    materializeTab: Boolean,
    mode: InstanceMode,
    name: String,
    platform: JavascriptSlashNodeDotjs,
    version: String
  ): AdapterCommon = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], installedVersion = installedVersion.asInstanceOf[js.Any], materialize = materialize.asInstanceOf[js.Any], materializeTab = materializeTab.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdapterCommon]
  }
  
  @scala.inline
  implicit class AdapterCommonOps[Self <: AdapterCommon] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstalledVersion(value: String): Self = this.set("installedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialize(value: Boolean): Self = this.set("materialize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterializeTab(value: Boolean): Self = this.set("materializeTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: InstanceMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: JavascriptSlashNodeDotjs): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminColumnsVarargs(value: js.Any*): Self = this.set("adminColumns", js.Array(value :_*))
    
    @scala.inline
    def setAdminColumns(value: js.Array[_]): Self = this.set("adminColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdminColumns: Self = this.set("adminColumns", js.undefined)
    
    @scala.inline
    def setAdminTab(value: Faicon): Self = this.set("adminTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdminTab: Self = this.set("adminTab", js.undefined)
    
    @scala.inline
    def setAllowInit(value: Boolean): Self = this.set("allowInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowInit: Self = this.set("allowInit", js.undefined)
    
    @scala.inline
    def setAvailableModesVarargs(value: InstanceMode*): Self = this.set("availableModes", js.Array(value :_*))
    
    @scala.inline
    def setAvailableModes(value: js.Array[InstanceMode]): Self = this.set("availableModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailableModes: Self = this.set("availableModes", js.undefined)
    
    @scala.inline
    def setBlockly(value: Boolean): Self = this.set("blockly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockly: Self = this.set("blockly", js.undefined)
    
    @scala.inline
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    
    @scala.inline
    def setConnectionType(value: local | cloud): Self = this.set("connectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionType: Self = this.set("connectionType", js.undefined)
    
    @scala.inline
    def setDataFolder(value: String): Self = this.set("dataFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataFolder: Self = this.set("dataFolder", js.undefined)
    
    @scala.inline
    def setDataSource(value: poll | push | assumption): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDependenciesVarargs(value: (Record[String, String])*): Self = this.set("dependencies", js.Array(value :_*))
    
    @scala.inline
    def setDependencies(value: js.Array[Record[String, String]]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    
    @scala.inline
    def setDocs(value: PartialRecordLanguagesstr): Self = this.set("docs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocs: Self = this.set("docs", js.undefined)
    
    @scala.inline
    def setEraseOnUpload(value: Boolean): Self = this.set("eraseOnUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEraseOnUpload: Self = this.set("eraseOnUpload", js.undefined)
    
    @scala.inline
    def setExtIcon(value: String): Self = this.set("extIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtIcon: Self = this.set("extIcon", js.undefined)
    
    @scala.inline
    def setGetHistory(value: Boolean): Self = this.set("getHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetHistory: Self = this.set("getHistory", js.undefined)
    
    @scala.inline
    def setKeywordsVarargs(value: String*): Self = this.set("keywords", js.Array(value :_*))
    
    @scala.inline
    def setKeywords(value: js.Array[String]): Self = this.set("keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
    
    @scala.inline
    def setLocalLink(value: String): Self = this.set("localLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalLink: Self = this.set("localLink", js.undefined)
    
    @scala.inline
    def setLocalLinks(value: Record[String, String]): Self = this.set("localLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalLinks: Self = this.set("localLinks", js.undefined)
    
    @scala.inline
    def setLogLevel(value: LogLevel): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setLogTransporter(value: Boolean): Self = this.set("logTransporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogTransporter: Self = this.set("logTransporter", js.undefined)
    
    @scala.inline
    def setMain(value: String): Self = this.set("main", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMain: Self = this.set("main", js.undefined)
    
    @scala.inline
    def setMessagebox(value: `true`): Self = this.set("messagebox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessagebox: Self = this.set("messagebox", js.undefined)
    
    @scala.inline
    def setNoConfig(value: `true`): Self = this.set("noConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoConfig: Self = this.set("noConfig", js.undefined)
    
    @scala.inline
    def setNoIntro(value: `true`): Self = this.set("noIntro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoIntro: Self = this.set("noIntro", js.undefined)
    
    @scala.inline
    def setNoRepository(value: `true`): Self = this.set("noRepository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoRepository: Self = this.set("noRepository", js.undefined)
    
    @scala.inline
    def setNogit(value: `true`): Self = this.set("nogit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNogit: Self = this.set("nogit", js.undefined)
    
    @scala.inline
    def setNondeletable(value: `true`): Self = this.set("nondeletable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNondeletable: Self = this.set("nondeletable", js.undefined)
    
    @scala.inline
    def setOnlyWWW(value: Boolean): Self = this.set("onlyWWW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyWWW: Self = this.set("onlyWWW", js.undefined)
    
    @scala.inline
    def setOsVarargs(value: (linux | darwin | win32)*): Self = this.set("os", js.Array(value :_*))
    
    @scala.inline
    def setOs(value: linux | darwin | win32 | (js.Array[linux | darwin | win32])): Self = this.set("os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOs: Self = this.set("os", js.undefined)
    
    @scala.inline
    def setOsDependencies(value: Darwin): Self = this.set("osDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOsDependencies: Self = this.set("osDependencies", js.undefined)
    
    @scala.inline
    def setPreserveSettingsVarargs(value: String*): Self = this.set("preserveSettings", js.Array(value :_*))
    
    @scala.inline
    def setPreserveSettings(value: String | js.Array[String]): Self = this.set("preserveSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveSettings: Self = this.set("preserveSettings", js.undefined)
    
    @scala.inline
    def setRestartAdaptersVarargs(value: String*): Self = this.set("restartAdapters", js.Array(value :_*))
    
    @scala.inline
    def setRestartAdapters(value: js.Array[String]): Self = this.set("restartAdapters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestartAdapters: Self = this.set("restartAdapters", js.undefined)
    
    @scala.inline
    def setSchedule(value: String): Self = this.set("schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedule: Self = this.set("schedule", js.undefined)
    
    @scala.inline
    def setServiceStates(value: Boolean | String): Self = this.set("serviceStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceStates: Self = this.set("serviceStates", js.undefined)
    
    @scala.inline
    def setSingleton(value: Boolean): Self = this.set("singleton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleton: Self = this.set("singleton", js.undefined)
    
    @scala.inline
    def setSingletonHost(value: Boolean): Self = this.set("singletonHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingletonHost: Self = this.set("singletonHost", js.undefined)
    
    @scala.inline
    def setStopBeforeUpdate(value: Boolean): Self = this.set("stopBeforeUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopBeforeUpdate: Self = this.set("stopBeforeUpdate", js.undefined)
    
    @scala.inline
    def setStopTimeout(value: Double): Self = this.set("stopTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopTimeout: Self = this.set("stopTimeout", js.undefined)
    
    @scala.inline
    def setSubscribable(value: Boolean): Self = this.set("subscribable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscribable: Self = this.set("subscribable", js.undefined)
    
    @scala.inline
    def setSubscribe(value: js.Any): Self = this.set("subscribe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscribe: Self = this.set("subscribe", js.undefined)
    
    @scala.inline
    def setSupportCustoms(value: Boolean): Self = this.set("supportCustoms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportCustoms: Self = this.set("supportCustoms", js.undefined)
    
    @scala.inline
    def setSupportStopInstance(value: Boolean): Self = this.set("supportStopInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportStopInstance: Self = this.set("supportStopInstance", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleLang(value: RecordLanguagesstring): Self = this.set("titleLang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleLang: Self = this.set("titleLang", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUnsafePerm(value: `true`): Self = this.set("unsafePerm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsafePerm: Self = this.set("unsafePerm", js.undefined)
    
    @scala.inline
    def setWakeup(value: Boolean): Self = this.set("wakeup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWakeup: Self = this.set("wakeup", js.undefined)
    
    @scala.inline
    def setWebByVersion(value: Boolean): Self = this.set("webByVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebByVersion: Self = this.set("webByVersion", js.undefined)
    
    @scala.inline
    def setWebExtendable(value: Boolean): Self = this.set("webExtendable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebExtendable: Self = this.set("webExtendable", js.undefined)
    
    @scala.inline
    def setWebExtension(value: String): Self = this.set("webExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebExtension: Self = this.set("webExtension", js.undefined)
    
    @scala.inline
    def setWebPreSettings(value: js.Any): Self = this.set("webPreSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebPreSettings: Self = this.set("webPreSettings", js.undefined)
    
    @scala.inline
    def setWebservers(value: js.Any): Self = this.set("webservers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebservers: Self = this.set("webservers", js.undefined)
    
    @scala.inline
    def setWelcomeScreenVarargs(value: WelcomeScreenEntry*): Self = this.set("welcomeScreen", js.Array(value :_*))
    
    @scala.inline
    def setWelcomeScreen(value: js.Array[WelcomeScreenEntry]): Self = this.set("welcomeScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWelcomeScreen: Self = this.set("welcomeScreen", js.undefined)
    
    @scala.inline
    def setWelcomeScreenProVarargs(value: WelcomeScreenEntry*): Self = this.set("welcomeScreenPro", js.Array(value :_*))
    
    @scala.inline
    def setWelcomeScreenPro(value: js.Array[WelcomeScreenEntry]): Self = this.set("welcomeScreenPro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWelcomeScreenPro: Self = this.set("welcomeScreenPro", js.undefined)
    
    @scala.inline
    def setWwwDontUpload(value: Boolean): Self = this.set("wwwDontUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWwwDontUpload: Self = this.set("wwwDontUpload", js.undefined)
  }
}
