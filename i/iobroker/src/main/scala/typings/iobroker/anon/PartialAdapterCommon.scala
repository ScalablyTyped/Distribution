package typings.iobroker.anon

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
import typings.iobroker.objectsMod.global.ioBroker.InstanceMode
import typings.iobroker.objectsMod.global.ioBroker.WelcomeScreenEntry
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<iobroker.iobroker/objects.<global>.ioBroker.AdapterCommon> */
trait PartialAdapterCommon extends StObject {
  
  var adminColumns: js.UndefOr[js.Array[Any]] = js.undefined
  
  var adminTab: js.UndefOr[Faicon] = js.undefined
  
  var allowInit: js.UndefOr[Boolean] = js.undefined
  
  var availableModes: js.UndefOr[js.Array[InstanceMode]] = js.undefined
  
  var blockly: js.UndefOr[Boolean] = js.undefined
  
  var compact: js.UndefOr[Boolean] = js.undefined
  
  var connectionType: js.UndefOr[local | cloud] = js.undefined
  
  var custom: Unit
  
  var dataFolder: js.UndefOr[String] = js.undefined
  
  var dataSource: js.UndefOr[poll | push | assumption] = js.undefined
  
  var dependencies: js.UndefOr[js.Array[Record[String, String]]] = js.undefined
  
  var docs: js.UndefOr[PartialRecordLanguagesstr] = js.undefined
  
  var dontDelete: js.UndefOr[`true`] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var eraseOnUpload: js.UndefOr[Boolean] = js.undefined
  
  var expert: js.UndefOr[`true`] = js.undefined
  
  var extIcon: js.UndefOr[String] = js.undefined
  
  var getHistory: js.UndefOr[Boolean] = js.undefined
  
  var icon: js.UndefOr[String] = js.undefined
  
  var installedVersion: js.UndefOr[String] = js.undefined
  
  var keywords: js.UndefOr[js.Array[String]] = js.undefined
  
  var localLink: js.UndefOr[String] = js.undefined
  
  var localLinks: js.UndefOr[Record[String, String]] = js.undefined
  
  var logLevel: js.UndefOr[LogLevel] = js.undefined
  
  var logTransporter: js.UndefOr[Boolean] = js.undefined
  
  var main: js.UndefOr[String] = js.undefined
  
  var materialize: js.UndefOr[Boolean] = js.undefined
  
  var materializeTab: js.UndefOr[Boolean] = js.undefined
  
  var messagebox: js.UndefOr[`true`] = js.undefined
  
  var mode: js.UndefOr[InstanceMode] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var noConfig: js.UndefOr[`true`] = js.undefined
  
  var noIntro: js.UndefOr[`true`] = js.undefined
  
  var noRepository: js.UndefOr[`true`] = js.undefined
  
  var nogit: js.UndefOr[`true`] = js.undefined
  
  var nondeletable: js.UndefOr[`true`] = js.undefined
  
  var onlyWWW: js.UndefOr[Boolean] = js.undefined
  
  var os: js.UndefOr[linux | darwin | win32 | (js.Array[linux | darwin | win32])] = js.undefined
  
  var osDependencies: js.UndefOr[Darwin] = js.undefined
  
  var platform: js.UndefOr[JavascriptSlashNodeDotjs] = js.undefined
  
  var preserveSettings: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var restartAdapters: js.UndefOr[js.Array[String]] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
  
  var schedule: js.UndefOr[String] = js.undefined
  
  var serviceStates: js.UndefOr[Boolean | String] = js.undefined
  
  var singleton: js.UndefOr[Boolean] = js.undefined
  
  var singletonHost: js.UndefOr[Boolean] = js.undefined
  
  var stopBeforeUpdate: js.UndefOr[Boolean] = js.undefined
  
  var stopTimeout: js.UndefOr[Double] = js.undefined
  
  var subscribable: js.UndefOr[Boolean] = js.undefined
  
  var subscribe: js.UndefOr[Any] = js.undefined
  
  var supportCustoms: js.UndefOr[Boolean] = js.undefined
  
  var supportStopInstance: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var titleLang: js.UndefOr[RecordLanguagesstring] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var unsafePerm: js.UndefOr[`true`] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
  
  var wakeup: js.UndefOr[Boolean] = js.undefined
  
  var webByVersion: js.UndefOr[Boolean] = js.undefined
  
  var webExtendable: js.UndefOr[Boolean] = js.undefined
  
  var webExtension: js.UndefOr[String] = js.undefined
  
  var webPreSettings: js.UndefOr[Any] = js.undefined
  
  var webservers: js.UndefOr[Any] = js.undefined
  
  var welcomeScreen: js.UndefOr[js.Array[WelcomeScreenEntry]] = js.undefined
  
  var welcomeScreenPro: js.UndefOr[js.Array[WelcomeScreenEntry]] = js.undefined
  
  var wwwDontUpload: js.UndefOr[Boolean] = js.undefined
}
object PartialAdapterCommon {
  
  inline def apply(custom: Unit): PartialAdapterCommon = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialAdapterCommon]
  }
  
  extension [Self <: PartialAdapterCommon](x: Self) {
    
    inline def setAdminColumns(value: js.Array[Any]): Self = StObject.set(x, "adminColumns", value.asInstanceOf[js.Any])
    
    inline def setAdminColumnsUndefined: Self = StObject.set(x, "adminColumns", js.undefined)
    
    inline def setAdminColumnsVarargs(value: Any*): Self = StObject.set(x, "adminColumns", js.Array(value*))
    
    inline def setAdminTab(value: Faicon): Self = StObject.set(x, "adminTab", value.asInstanceOf[js.Any])
    
    inline def setAdminTabUndefined: Self = StObject.set(x, "adminTab", js.undefined)
    
    inline def setAllowInit(value: Boolean): Self = StObject.set(x, "allowInit", value.asInstanceOf[js.Any])
    
    inline def setAllowInitUndefined: Self = StObject.set(x, "allowInit", js.undefined)
    
    inline def setAvailableModes(value: js.Array[InstanceMode]): Self = StObject.set(x, "availableModes", value.asInstanceOf[js.Any])
    
    inline def setAvailableModesUndefined: Self = StObject.set(x, "availableModes", js.undefined)
    
    inline def setAvailableModesVarargs(value: InstanceMode*): Self = StObject.set(x, "availableModes", js.Array(value*))
    
    inline def setBlockly(value: Boolean): Self = StObject.set(x, "blockly", value.asInstanceOf[js.Any])
    
    inline def setBlocklyUndefined: Self = StObject.set(x, "blockly", js.undefined)
    
    inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
    
    inline def setConnectionType(value: local | cloud): Self = StObject.set(x, "connectionType", value.asInstanceOf[js.Any])
    
    inline def setConnectionTypeUndefined: Self = StObject.set(x, "connectionType", js.undefined)
    
    inline def setCustom(value: Unit): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setDataFolder(value: String): Self = StObject.set(x, "dataFolder", value.asInstanceOf[js.Any])
    
    inline def setDataFolderUndefined: Self = StObject.set(x, "dataFolder", js.undefined)
    
    inline def setDataSource(value: poll | push | assumption): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDependencies(value: js.Array[Record[String, String]]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: (Record[String, String])*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setDocs(value: PartialRecordLanguagesstr): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setDocsUndefined: Self = StObject.set(x, "docs", js.undefined)
    
    inline def setDontDelete(value: `true`): Self = StObject.set(x, "dontDelete", value.asInstanceOf[js.Any])
    
    inline def setDontDeleteUndefined: Self = StObject.set(x, "dontDelete", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setEraseOnUpload(value: Boolean): Self = StObject.set(x, "eraseOnUpload", value.asInstanceOf[js.Any])
    
    inline def setEraseOnUploadUndefined: Self = StObject.set(x, "eraseOnUpload", js.undefined)
    
    inline def setExpert(value: `true`): Self = StObject.set(x, "expert", value.asInstanceOf[js.Any])
    
    inline def setExpertUndefined: Self = StObject.set(x, "expert", js.undefined)
    
    inline def setExtIcon(value: String): Self = StObject.set(x, "extIcon", value.asInstanceOf[js.Any])
    
    inline def setExtIconUndefined: Self = StObject.set(x, "extIcon", js.undefined)
    
    inline def setGetHistory(value: Boolean): Self = StObject.set(x, "getHistory", value.asInstanceOf[js.Any])
    
    inline def setGetHistoryUndefined: Self = StObject.set(x, "getHistory", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setInstalledVersion(value: String): Self = StObject.set(x, "installedVersion", value.asInstanceOf[js.Any])
    
    inline def setInstalledVersionUndefined: Self = StObject.set(x, "installedVersion", js.undefined)
    
    inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value*))
    
    inline def setLocalLink(value: String): Self = StObject.set(x, "localLink", value.asInstanceOf[js.Any])
    
    inline def setLocalLinkUndefined: Self = StObject.set(x, "localLink", js.undefined)
    
    inline def setLocalLinks(value: Record[String, String]): Self = StObject.set(x, "localLinks", value.asInstanceOf[js.Any])
    
    inline def setLocalLinksUndefined: Self = StObject.set(x, "localLinks", js.undefined)
    
    inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setLogTransporter(value: Boolean): Self = StObject.set(x, "logTransporter", value.asInstanceOf[js.Any])
    
    inline def setLogTransporterUndefined: Self = StObject.set(x, "logTransporter", js.undefined)
    
    inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    
    inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
    
    inline def setMaterialize(value: Boolean): Self = StObject.set(x, "materialize", value.asInstanceOf[js.Any])
    
    inline def setMaterializeTab(value: Boolean): Self = StObject.set(x, "materializeTab", value.asInstanceOf[js.Any])
    
    inline def setMaterializeTabUndefined: Self = StObject.set(x, "materializeTab", js.undefined)
    
    inline def setMaterializeUndefined: Self = StObject.set(x, "materialize", js.undefined)
    
    inline def setMessagebox(value: `true`): Self = StObject.set(x, "messagebox", value.asInstanceOf[js.Any])
    
    inline def setMessageboxUndefined: Self = StObject.set(x, "messagebox", js.undefined)
    
    inline def setMode(value: InstanceMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNoConfig(value: `true`): Self = StObject.set(x, "noConfig", value.asInstanceOf[js.Any])
    
    inline def setNoConfigUndefined: Self = StObject.set(x, "noConfig", js.undefined)
    
    inline def setNoIntro(value: `true`): Self = StObject.set(x, "noIntro", value.asInstanceOf[js.Any])
    
    inline def setNoIntroUndefined: Self = StObject.set(x, "noIntro", js.undefined)
    
    inline def setNoRepository(value: `true`): Self = StObject.set(x, "noRepository", value.asInstanceOf[js.Any])
    
    inline def setNoRepositoryUndefined: Self = StObject.set(x, "noRepository", js.undefined)
    
    inline def setNogit(value: `true`): Self = StObject.set(x, "nogit", value.asInstanceOf[js.Any])
    
    inline def setNogitUndefined: Self = StObject.set(x, "nogit", js.undefined)
    
    inline def setNondeletable(value: `true`): Self = StObject.set(x, "nondeletable", value.asInstanceOf[js.Any])
    
    inline def setNondeletableUndefined: Self = StObject.set(x, "nondeletable", js.undefined)
    
    inline def setOnlyWWW(value: Boolean): Self = StObject.set(x, "onlyWWW", value.asInstanceOf[js.Any])
    
    inline def setOnlyWWWUndefined: Self = StObject.set(x, "onlyWWW", js.undefined)
    
    inline def setOs(value: linux | darwin | win32 | (js.Array[linux | darwin | win32])): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setOsDependencies(value: Darwin): Self = StObject.set(x, "osDependencies", value.asInstanceOf[js.Any])
    
    inline def setOsDependenciesUndefined: Self = StObject.set(x, "osDependencies", js.undefined)
    
    inline def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
    
    inline def setOsVarargs(value: (linux | darwin | win32)*): Self = StObject.set(x, "os", js.Array(value*))
    
    inline def setPlatform(value: JavascriptSlashNodeDotjs): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setPreserveSettings(value: String | js.Array[String]): Self = StObject.set(x, "preserveSettings", value.asInstanceOf[js.Any])
    
    inline def setPreserveSettingsUndefined: Self = StObject.set(x, "preserveSettings", js.undefined)
    
    inline def setPreserveSettingsVarargs(value: String*): Self = StObject.set(x, "preserveSettings", js.Array(value*))
    
    inline def setRestartAdapters(value: js.Array[String]): Self = StObject.set(x, "restartAdapters", value.asInstanceOf[js.Any])
    
    inline def setRestartAdaptersUndefined: Self = StObject.set(x, "restartAdapters", js.undefined)
    
    inline def setRestartAdaptersVarargs(value: String*): Self = StObject.set(x, "restartAdapters", js.Array(value*))
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSchedule(value: String): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    inline def setServiceStates(value: Boolean | String): Self = StObject.set(x, "serviceStates", value.asInstanceOf[js.Any])
    
    inline def setServiceStatesUndefined: Self = StObject.set(x, "serviceStates", js.undefined)
    
    inline def setSingleton(value: Boolean): Self = StObject.set(x, "singleton", value.asInstanceOf[js.Any])
    
    inline def setSingletonHost(value: Boolean): Self = StObject.set(x, "singletonHost", value.asInstanceOf[js.Any])
    
    inline def setSingletonHostUndefined: Self = StObject.set(x, "singletonHost", js.undefined)
    
    inline def setSingletonUndefined: Self = StObject.set(x, "singleton", js.undefined)
    
    inline def setStopBeforeUpdate(value: Boolean): Self = StObject.set(x, "stopBeforeUpdate", value.asInstanceOf[js.Any])
    
    inline def setStopBeforeUpdateUndefined: Self = StObject.set(x, "stopBeforeUpdate", js.undefined)
    
    inline def setStopTimeout(value: Double): Self = StObject.set(x, "stopTimeout", value.asInstanceOf[js.Any])
    
    inline def setStopTimeoutUndefined: Self = StObject.set(x, "stopTimeout", js.undefined)
    
    inline def setSubscribable(value: Boolean): Self = StObject.set(x, "subscribable", value.asInstanceOf[js.Any])
    
    inline def setSubscribableUndefined: Self = StObject.set(x, "subscribable", js.undefined)
    
    inline def setSubscribe(value: Any): Self = StObject.set(x, "subscribe", value.asInstanceOf[js.Any])
    
    inline def setSubscribeUndefined: Self = StObject.set(x, "subscribe", js.undefined)
    
    inline def setSupportCustoms(value: Boolean): Self = StObject.set(x, "supportCustoms", value.asInstanceOf[js.Any])
    
    inline def setSupportCustomsUndefined: Self = StObject.set(x, "supportCustoms", js.undefined)
    
    inline def setSupportStopInstance(value: Boolean): Self = StObject.set(x, "supportStopInstance", value.asInstanceOf[js.Any])
    
    inline def setSupportStopInstanceUndefined: Self = StObject.set(x, "supportStopInstance", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleLang(value: RecordLanguagesstring): Self = StObject.set(x, "titleLang", value.asInstanceOf[js.Any])
    
    inline def setTitleLangUndefined: Self = StObject.set(x, "titleLang", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnsafePerm(value: `true`): Self = StObject.set(x, "unsafePerm", value.asInstanceOf[js.Any])
    
    inline def setUnsafePermUndefined: Self = StObject.set(x, "unsafePerm", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setWakeup(value: Boolean): Self = StObject.set(x, "wakeup", value.asInstanceOf[js.Any])
    
    inline def setWakeupUndefined: Self = StObject.set(x, "wakeup", js.undefined)
    
    inline def setWebByVersion(value: Boolean): Self = StObject.set(x, "webByVersion", value.asInstanceOf[js.Any])
    
    inline def setWebByVersionUndefined: Self = StObject.set(x, "webByVersion", js.undefined)
    
    inline def setWebExtendable(value: Boolean): Self = StObject.set(x, "webExtendable", value.asInstanceOf[js.Any])
    
    inline def setWebExtendableUndefined: Self = StObject.set(x, "webExtendable", js.undefined)
    
    inline def setWebExtension(value: String): Self = StObject.set(x, "webExtension", value.asInstanceOf[js.Any])
    
    inline def setWebExtensionUndefined: Self = StObject.set(x, "webExtension", js.undefined)
    
    inline def setWebPreSettings(value: Any): Self = StObject.set(x, "webPreSettings", value.asInstanceOf[js.Any])
    
    inline def setWebPreSettingsUndefined: Self = StObject.set(x, "webPreSettings", js.undefined)
    
    inline def setWebservers(value: Any): Self = StObject.set(x, "webservers", value.asInstanceOf[js.Any])
    
    inline def setWebserversUndefined: Self = StObject.set(x, "webservers", js.undefined)
    
    inline def setWelcomeScreen(value: js.Array[WelcomeScreenEntry]): Self = StObject.set(x, "welcomeScreen", value.asInstanceOf[js.Any])
    
    inline def setWelcomeScreenPro(value: js.Array[WelcomeScreenEntry]): Self = StObject.set(x, "welcomeScreenPro", value.asInstanceOf[js.Any])
    
    inline def setWelcomeScreenProUndefined: Self = StObject.set(x, "welcomeScreenPro", js.undefined)
    
    inline def setWelcomeScreenProVarargs(value: WelcomeScreenEntry*): Self = StObject.set(x, "welcomeScreenPro", js.Array(value*))
    
    inline def setWelcomeScreenUndefined: Self = StObject.set(x, "welcomeScreen", js.undefined)
    
    inline def setWelcomeScreenVarargs(value: WelcomeScreenEntry*): Self = StObject.set(x, "welcomeScreen", js.Array(value*))
    
    inline def setWwwDontUpload(value: Boolean): Self = StObject.set(x, "wwwDontUpload", value.asInstanceOf[js.Any])
    
    inline def setWwwDontUploadUndefined: Self = StObject.set(x, "wwwDontUpload", js.undefined)
  }
}
