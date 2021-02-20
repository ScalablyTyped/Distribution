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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<iobroker.iobroker/objects.<global>.ioBroker.AdapterCommon> */
@js.native
trait PartialAdapterCommon extends StObject {
  
  var adminColumns: js.UndefOr[js.Array[_]] = js.native
  
  var adminTab: js.UndefOr[Faicon] = js.native
  
  var allowInit: js.UndefOr[Boolean] = js.native
  
  var availableModes: js.UndefOr[js.Array[InstanceMode]] = js.native
  
  var blockly: js.UndefOr[Boolean] = js.native
  
  var compact: js.UndefOr[Boolean] = js.native
  
  var connectionType: js.UndefOr[local | cloud] = js.native
  
  var custom: js.UndefOr[scala.Nothing] = js.native
  
  var dataFolder: js.UndefOr[String] = js.native
  
  var dataSource: js.UndefOr[poll | push | assumption] = js.native
  
  var dependencies: js.UndefOr[js.Array[Record[String, String]]] = js.native
  
  var docs: js.UndefOr[PartialRecordLanguagesstr] = js.native
  
  var dontDelete: js.UndefOr[`true`] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var eraseOnUpload: js.UndefOr[Boolean] = js.native
  
  var expert: js.UndefOr[`true`] = js.native
  
  var extIcon: js.UndefOr[String] = js.native
  
  var getHistory: js.UndefOr[Boolean] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var installedVersion: js.UndefOr[String] = js.native
  
  var keywords: js.UndefOr[js.Array[String]] = js.native
  
  var localLink: js.UndefOr[String] = js.native
  
  var localLinks: js.UndefOr[Record[String, String]] = js.native
  
  var logLevel: js.UndefOr[LogLevel] = js.native
  
  var logTransporter: js.UndefOr[Boolean] = js.native
  
  var main: js.UndefOr[String] = js.native
  
  var materialize: js.UndefOr[Boolean] = js.native
  
  var materializeTab: js.UndefOr[Boolean] = js.native
  
  var messagebox: js.UndefOr[`true`] = js.native
  
  var mode: js.UndefOr[InstanceMode] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var noConfig: js.UndefOr[`true`] = js.native
  
  var noIntro: js.UndefOr[`true`] = js.native
  
  var noRepository: js.UndefOr[`true`] = js.native
  
  var nogit: js.UndefOr[`true`] = js.native
  
  var nondeletable: js.UndefOr[`true`] = js.native
  
  var onlyWWW: js.UndefOr[Boolean] = js.native
  
  var os: js.UndefOr[linux | darwin | win32 | (js.Array[linux | darwin | win32])] = js.native
  
  var osDependencies: js.UndefOr[Darwin] = js.native
  
  var platform: js.UndefOr[JavascriptSlashNodeDotjs] = js.native
  
  var preserveSettings: js.UndefOr[String | js.Array[String]] = js.native
  
  var restartAdapters: js.UndefOr[js.Array[String]] = js.native
  
  var role: js.UndefOr[String] = js.native
  
  var schedule: js.UndefOr[String] = js.native
  
  var serviceStates: js.UndefOr[Boolean | String] = js.native
  
  var singleton: js.UndefOr[Boolean] = js.native
  
  var singletonHost: js.UndefOr[Boolean] = js.native
  
  var stopBeforeUpdate: js.UndefOr[Boolean] = js.native
  
  var stopTimeout: js.UndefOr[Double] = js.native
  
  var subscribable: js.UndefOr[Boolean] = js.native
  
  var subscribe: js.UndefOr[js.Any] = js.native
  
  var supportCustoms: js.UndefOr[Boolean] = js.native
  
  var supportStopInstance: js.UndefOr[Boolean] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var titleLang: js.UndefOr[RecordLanguagesstring] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var unsafePerm: js.UndefOr[`true`] = js.native
  
  var version: js.UndefOr[String] = js.native
  
  var wakeup: js.UndefOr[Boolean] = js.native
  
  var webByVersion: js.UndefOr[Boolean] = js.native
  
  var webExtendable: js.UndefOr[Boolean] = js.native
  
  var webExtension: js.UndefOr[String] = js.native
  
  var webPreSettings: js.UndefOr[js.Any] = js.native
  
  var webservers: js.UndefOr[js.Any] = js.native
  
  var welcomeScreen: js.UndefOr[js.Array[WelcomeScreenEntry]] = js.native
  
  var welcomeScreenPro: js.UndefOr[js.Array[WelcomeScreenEntry]] = js.native
  
  var wwwDontUpload: js.UndefOr[Boolean] = js.native
}
object PartialAdapterCommon {
  
  @scala.inline
  def apply(): PartialAdapterCommon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAdapterCommon]
  }
  
  @scala.inline
  implicit class PartialAdapterCommonMutableBuilder[Self <: PartialAdapterCommon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdminColumns(value: js.Array[_]): Self = StObject.set(x, "adminColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminColumnsUndefined: Self = StObject.set(x, "adminColumns", js.undefined)
    
    @scala.inline
    def setAdminColumnsVarargs(value: js.Any*): Self = StObject.set(x, "adminColumns", js.Array(value :_*))
    
    @scala.inline
    def setAdminTab(value: Faicon): Self = StObject.set(x, "adminTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminTabUndefined: Self = StObject.set(x, "adminTab", js.undefined)
    
    @scala.inline
    def setAllowInit(value: Boolean): Self = StObject.set(x, "allowInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowInitUndefined: Self = StObject.set(x, "allowInit", js.undefined)
    
    @scala.inline
    def setAvailableModes(value: js.Array[InstanceMode]): Self = StObject.set(x, "availableModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableModesUndefined: Self = StObject.set(x, "availableModes", js.undefined)
    
    @scala.inline
    def setAvailableModesVarargs(value: InstanceMode*): Self = StObject.set(x, "availableModes", js.Array(value :_*))
    
    @scala.inline
    def setBlockly(value: Boolean): Self = StObject.set(x, "blockly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlocklyUndefined: Self = StObject.set(x, "blockly", js.undefined)
    
    @scala.inline
    def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
    
    @scala.inline
    def setConnectionType(value: local | cloud): Self = StObject.set(x, "connectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionTypeUndefined: Self = StObject.set(x, "connectionType", js.undefined)
    
    @scala.inline
    def setDataFolder(value: String): Self = StObject.set(x, "dataFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFolderUndefined: Self = StObject.set(x, "dataFolder", js.undefined)
    
    @scala.inline
    def setDataSource(value: poll | push | assumption): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDependencies(value: js.Array[Record[String, String]]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    @scala.inline
    def setDependenciesVarargs(value: (Record[String, String])*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
    
    @scala.inline
    def setDocs(value: PartialRecordLanguagesstr): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocsUndefined: Self = StObject.set(x, "docs", js.undefined)
    
    @scala.inline
    def setDontDelete(value: `true`): Self = StObject.set(x, "dontDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDontDeleteUndefined: Self = StObject.set(x, "dontDelete", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setEraseOnUpload(value: Boolean): Self = StObject.set(x, "eraseOnUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEraseOnUploadUndefined: Self = StObject.set(x, "eraseOnUpload", js.undefined)
    
    @scala.inline
    def setExpert(value: `true`): Self = StObject.set(x, "expert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpertUndefined: Self = StObject.set(x, "expert", js.undefined)
    
    @scala.inline
    def setExtIcon(value: String): Self = StObject.set(x, "extIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtIconUndefined: Self = StObject.set(x, "extIcon", js.undefined)
    
    @scala.inline
    def setGetHistory(value: Boolean): Self = StObject.set(x, "getHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetHistoryUndefined: Self = StObject.set(x, "getHistory", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setInstalledVersion(value: String): Self = StObject.set(x, "installedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstalledVersionUndefined: Self = StObject.set(x, "installedVersion", js.undefined)
    
    @scala.inline
    def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    @scala.inline
    def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value :_*))
    
    @scala.inline
    def setLocalLink(value: String): Self = StObject.set(x, "localLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalLinkUndefined: Self = StObject.set(x, "localLink", js.undefined)
    
    @scala.inline
    def setLocalLinks(value: Record[String, String]): Self = StObject.set(x, "localLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalLinksUndefined: Self = StObject.set(x, "localLinks", js.undefined)
    
    @scala.inline
    def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    @scala.inline
    def setLogTransporter(value: Boolean): Self = StObject.set(x, "logTransporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogTransporterUndefined: Self = StObject.set(x, "logTransporter", js.undefined)
    
    @scala.inline
    def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
    
    @scala.inline
    def setMaterialize(value: Boolean): Self = StObject.set(x, "materialize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterializeTab(value: Boolean): Self = StObject.set(x, "materializeTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterializeTabUndefined: Self = StObject.set(x, "materializeTab", js.undefined)
    
    @scala.inline
    def setMaterializeUndefined: Self = StObject.set(x, "materialize", js.undefined)
    
    @scala.inline
    def setMessagebox(value: `true`): Self = StObject.set(x, "messagebox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageboxUndefined: Self = StObject.set(x, "messagebox", js.undefined)
    
    @scala.inline
    def setMode(value: InstanceMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNoConfig(value: `true`): Self = StObject.set(x, "noConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoConfigUndefined: Self = StObject.set(x, "noConfig", js.undefined)
    
    @scala.inline
    def setNoIntro(value: `true`): Self = StObject.set(x, "noIntro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoIntroUndefined: Self = StObject.set(x, "noIntro", js.undefined)
    
    @scala.inline
    def setNoRepository(value: `true`): Self = StObject.set(x, "noRepository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoRepositoryUndefined: Self = StObject.set(x, "noRepository", js.undefined)
    
    @scala.inline
    def setNogit(value: `true`): Self = StObject.set(x, "nogit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNogitUndefined: Self = StObject.set(x, "nogit", js.undefined)
    
    @scala.inline
    def setNondeletable(value: `true`): Self = StObject.set(x, "nondeletable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNondeletableUndefined: Self = StObject.set(x, "nondeletable", js.undefined)
    
    @scala.inline
    def setOnlyWWW(value: Boolean): Self = StObject.set(x, "onlyWWW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyWWWUndefined: Self = StObject.set(x, "onlyWWW", js.undefined)
    
    @scala.inline
    def setOs(value: linux | darwin | win32 | (js.Array[linux | darwin | win32])): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsDependencies(value: Darwin): Self = StObject.set(x, "osDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsDependenciesUndefined: Self = StObject.set(x, "osDependencies", js.undefined)
    
    @scala.inline
    def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
    
    @scala.inline
    def setOsVarargs(value: (linux | darwin | win32)*): Self = StObject.set(x, "os", js.Array(value :_*))
    
    @scala.inline
    def setPlatform(value: JavascriptSlashNodeDotjs): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setPreserveSettings(value: String | js.Array[String]): Self = StObject.set(x, "preserveSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveSettingsUndefined: Self = StObject.set(x, "preserveSettings", js.undefined)
    
    @scala.inline
    def setPreserveSettingsVarargs(value: String*): Self = StObject.set(x, "preserveSettings", js.Array(value :_*))
    
    @scala.inline
    def setRestartAdapters(value: js.Array[String]): Self = StObject.set(x, "restartAdapters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestartAdaptersUndefined: Self = StObject.set(x, "restartAdapters", js.undefined)
    
    @scala.inline
    def setRestartAdaptersVarargs(value: String*): Self = StObject.set(x, "restartAdapters", js.Array(value :_*))
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setSchedule(value: String): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    @scala.inline
    def setServiceStates(value: Boolean | String): Self = StObject.set(x, "serviceStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceStatesUndefined: Self = StObject.set(x, "serviceStates", js.undefined)
    
    @scala.inline
    def setSingleton(value: Boolean): Self = StObject.set(x, "singleton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletonHost(value: Boolean): Self = StObject.set(x, "singletonHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletonHostUndefined: Self = StObject.set(x, "singletonHost", js.undefined)
    
    @scala.inline
    def setSingletonUndefined: Self = StObject.set(x, "singleton", js.undefined)
    
    @scala.inline
    def setStopBeforeUpdate(value: Boolean): Self = StObject.set(x, "stopBeforeUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopBeforeUpdateUndefined: Self = StObject.set(x, "stopBeforeUpdate", js.undefined)
    
    @scala.inline
    def setStopTimeout(value: Double): Self = StObject.set(x, "stopTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopTimeoutUndefined: Self = StObject.set(x, "stopTimeout", js.undefined)
    
    @scala.inline
    def setSubscribable(value: Boolean): Self = StObject.set(x, "subscribable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribableUndefined: Self = StObject.set(x, "subscribable", js.undefined)
    
    @scala.inline
    def setSubscribe(value: js.Any): Self = StObject.set(x, "subscribe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribeUndefined: Self = StObject.set(x, "subscribe", js.undefined)
    
    @scala.inline
    def setSupportCustoms(value: Boolean): Self = StObject.set(x, "supportCustoms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportCustomsUndefined: Self = StObject.set(x, "supportCustoms", js.undefined)
    
    @scala.inline
    def setSupportStopInstance(value: Boolean): Self = StObject.set(x, "supportStopInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportStopInstanceUndefined: Self = StObject.set(x, "supportStopInstance", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleLang(value: RecordLanguagesstring): Self = StObject.set(x, "titleLang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleLangUndefined: Self = StObject.set(x, "titleLang", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUnsafePerm(value: `true`): Self = StObject.set(x, "unsafePerm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsafePermUndefined: Self = StObject.set(x, "unsafePerm", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setWakeup(value: Boolean): Self = StObject.set(x, "wakeup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWakeupUndefined: Self = StObject.set(x, "wakeup", js.undefined)
    
    @scala.inline
    def setWebByVersion(value: Boolean): Self = StObject.set(x, "webByVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebByVersionUndefined: Self = StObject.set(x, "webByVersion", js.undefined)
    
    @scala.inline
    def setWebExtendable(value: Boolean): Self = StObject.set(x, "webExtendable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebExtendableUndefined: Self = StObject.set(x, "webExtendable", js.undefined)
    
    @scala.inline
    def setWebExtension(value: String): Self = StObject.set(x, "webExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebExtensionUndefined: Self = StObject.set(x, "webExtension", js.undefined)
    
    @scala.inline
    def setWebPreSettings(value: js.Any): Self = StObject.set(x, "webPreSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPreSettingsUndefined: Self = StObject.set(x, "webPreSettings", js.undefined)
    
    @scala.inline
    def setWebservers(value: js.Any): Self = StObject.set(x, "webservers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebserversUndefined: Self = StObject.set(x, "webservers", js.undefined)
    
    @scala.inline
    def setWelcomeScreen(value: js.Array[WelcomeScreenEntry]): Self = StObject.set(x, "welcomeScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWelcomeScreenPro(value: js.Array[WelcomeScreenEntry]): Self = StObject.set(x, "welcomeScreenPro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWelcomeScreenProUndefined: Self = StObject.set(x, "welcomeScreenPro", js.undefined)
    
    @scala.inline
    def setWelcomeScreenProVarargs(value: WelcomeScreenEntry*): Self = StObject.set(x, "welcomeScreenPro", js.Array(value :_*))
    
    @scala.inline
    def setWelcomeScreenUndefined: Self = StObject.set(x, "welcomeScreen", js.undefined)
    
    @scala.inline
    def setWelcomeScreenVarargs(value: WelcomeScreenEntry*): Self = StObject.set(x, "welcomeScreen", js.Array(value :_*))
    
    @scala.inline
    def setWwwDontUpload(value: Boolean): Self = StObject.set(x, "wwwDontUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWwwDontUploadUndefined: Self = StObject.set(x, "wwwDontUpload", js.undefined)
  }
}
