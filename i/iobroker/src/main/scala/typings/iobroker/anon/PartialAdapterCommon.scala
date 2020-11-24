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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<iobroker.iobroker/objects.<global>.ioBroker.AdapterCommon> */
@js.native
trait PartialAdapterCommon extends js.Object {
  
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
  implicit class PartialAdapterCommonOps[Self <: PartialAdapterCommon] (val x: Self) extends AnyVal {
    
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
    def setDontDelete(value: `true`): Self = this.set("dontDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDontDelete: Self = this.set("dontDelete", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setEraseOnUpload(value: Boolean): Self = this.set("eraseOnUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEraseOnUpload: Self = this.set("eraseOnUpload", js.undefined)
    
    @scala.inline
    def setExpert(value: `true`): Self = this.set("expert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpert: Self = this.set("expert", js.undefined)
    
    @scala.inline
    def setExtIcon(value: String): Self = this.set("extIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtIcon: Self = this.set("extIcon", js.undefined)
    
    @scala.inline
    def setGetHistory(value: Boolean): Self = this.set("getHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetHistory: Self = this.set("getHistory", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setInstalledVersion(value: String): Self = this.set("installedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstalledVersion: Self = this.set("installedVersion", js.undefined)
    
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
    def setMaterialize(value: Boolean): Self = this.set("materialize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaterialize: Self = this.set("materialize", js.undefined)
    
    @scala.inline
    def setMaterializeTab(value: Boolean): Self = this.set("materializeTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaterializeTab: Self = this.set("materializeTab", js.undefined)
    
    @scala.inline
    def setMessagebox(value: `true`): Self = this.set("messagebox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessagebox: Self = this.set("messagebox", js.undefined)
    
    @scala.inline
    def setMode(value: InstanceMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
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
    def setPlatform(value: JavascriptSlashNodeDotjs): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    
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
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
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
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
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
