package typings.koaUseragent.useragentMod

import org.scalablytyped.runtime.StringDictionary
import typings.expressUseragent.mod.Details
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserAgent extends Details {
  val _agent: js.Any = js.native
  def SilkAccelerated: Boolean = js.native
  @JSName("browser")
  def browser_MUserAgent: String = js.native
  @JSName("geoIp")
  def geoIp_MUserAgent: StringDictionary[js.Any] = js.native
  def isAlamoFire: Boolean = js.native
  @JSName("isAmaya")
  def isAmaya_MUserAgent: Boolean = js.native
  @JSName("isAndroidTablet")
  def isAndroidTablet_MUserAgent: Boolean = js.native
  @JSName("isAndroid")
  def isAndroid_MUserAgent: Boolean = js.native
  def isAuthoritative: Boolean = js.native
  @JSName("isBada")
  def isBada_MUserAgent: Boolean = js.native
  @JSName("isBlackberry")
  def isBlackberry_MUserAgent: Boolean = js.native
  @JSName("isBot")
  def isBot_MUserAgent: Boolean = js.native
  @JSName("isCaptive")
  def isCaptive_MUserAgent: Boolean = js.native
  @JSName("isChromeOS")
  def isChromeOS_MUserAgent: Boolean = js.native
  @JSName("isChrome")
  def isChrome_MUserAgent: Boolean = js.native
  @JSName("isCurl")
  def isCurl_MUserAgent: Boolean = js.native
  @JSName("isDesktop")
  def isDesktop_MUserAgent: Boolean = js.native
  @JSName("isEdge")
  def isEdge_MUserAgent: Boolean = js.native
  @JSName("isEpiphany")
  def isEpiphany_MUserAgent: Boolean = js.native
  def isFacebook: Boolean = js.native
  @JSName("isFirefox")
  def isFirefox_MUserAgent: Boolean = js.native
  @JSName("isFlock")
  def isFlock_MUserAgent: Boolean = js.native
  @JSName("isIECompatibilityMode")
  def isIECompatibilityMode_MUserAgent: Boolean = js.native
  @JSName("isIE")
  def isIE_MUserAgent: Boolean = js.native
  @JSName("isKindleFire")
  def isKindleFire_MUserAgent: Boolean = js.native
  @JSName("isKonqueror")
  def isKonqueror_MUserAgent: Boolean = js.native
  @JSName("isLinux64")
  def isLinux64_MUserAgent: Boolean = js.native
  @JSName("isLinux")
  def isLinux_MUserAgent: Boolean = js.native
  @JSName("isMac")
  def isMac_MUserAgent: Boolean = js.native
  @JSName("isMobile")
  def isMobile_MUserAgent: Boolean = js.native
  @JSName("isOmniWeb")
  def isOmniWeb_MUserAgent: Boolean = js.native
  @JSName("isOpera")
  def isOpera_MUserAgent: Boolean = js.native
  def isPhantomJS: Boolean = js.native
  @JSName("isRaspberry")
  def isRaspberry_MUserAgent: Boolean = js.native
  @JSName("isSafari")
  def isSafari_MUserAgent: Boolean = js.native
  @JSName("isSamsung")
  def isSamsung_MUserAgent: Boolean = js.native
  @JSName("isSeaMonkey")
  def isSeaMonkey_MUserAgent: Boolean = js.native
  @JSName("isSilk")
  def isSilk_MUserAgent: Boolean = js.native
  @JSName("isSmartTV")
  def isSmartTV_MUserAgent: Boolean = js.native
  @JSName("isTablet")
  def isTablet_MUserAgent: Boolean = js.native
  @JSName("isWebkit")
  def isWebkit_MUserAgent: Boolean = js.native
  @JSName("isWinJs")
  def isWinJs_MUserAgent: Boolean = js.native
  @JSName("isWindowsPhone")
  def isWindowsPhone_MUserAgent: Boolean = js.native
  @JSName("isWindows")
  def isWindows_MUserAgent: Boolean = js.native
  @JSName("isiPad")
  def isiPad_MUserAgent: Boolean = js.native
  @JSName("isiPhone")
  def isiPhone_MUserAgent: Boolean = js.native
  @JSName("isiPod")
  def isiPod_MUserAgent: Boolean = js.native
  @JSName("os")
  def os_MUserAgent: String = js.native
  @JSName("platform")
  def platform_MUserAgent: String = js.native
  @JSName("silkAccelerated")
  def silkAccelerated_MUserAgent: Boolean = js.native
  @JSName("source")
  def source_MUserAgent: String = js.native
  @JSName("version")
  def version_MUserAgent: String = js.native
}

object UserAgent {
  @scala.inline
  def apply(
    SilkAccelerated: () => Boolean,
    _agent: js.Any,
    browser: () => String,
    geoIp: () => StringDictionary[js.Any],
    isAlamoFire: () => Boolean,
    isAmaya: () => Boolean,
    isAndroid: () => Boolean,
    isAndroidTablet: () => Boolean,
    isAuthoritative: () => Boolean,
    isBada: () => Boolean,
    isBlackberry: () => Boolean,
    isBot: () => Boolean,
    isCaptive: () => Boolean,
    isChrome: () => Boolean,
    isChromeOS: () => Boolean,
    isCurl: () => Boolean,
    isDesktop: () => Boolean,
    isEdge: () => Boolean,
    isEpiphany: () => Boolean,
    isFacebook: () => Boolean,
    isFirefox: () => Boolean,
    isFlock: () => Boolean,
    isIE: () => Boolean,
    isIECompatibilityMode: () => Boolean,
    isKindleFire: () => Boolean,
    isKonqueror: () => Boolean,
    isLinux: () => Boolean,
    isLinux64: () => Boolean,
    isMac: () => Boolean,
    isMobile: () => Boolean,
    isOmniWeb: () => Boolean,
    isOpera: () => Boolean,
    isPhantomJS: () => Boolean,
    isRaspberry: () => Boolean,
    isSafari: () => Boolean,
    isSamsung: () => Boolean,
    isSeaMonkey: () => Boolean,
    isSilk: () => Boolean,
    isSmartTV: () => Boolean,
    isTablet: () => Boolean,
    isWebkit: () => Boolean,
    isWinJs: () => Boolean,
    isWindows: () => Boolean,
    isWindowsPhone: () => Boolean,
    isiPad: () => Boolean,
    isiPhone: () => Boolean,
    isiPod: () => Boolean,
    os: () => String,
    platform: () => String,
    silkAccelerated: () => Boolean,
    source: () => String,
    version: () => String
  ): UserAgent = {
    val __obj = js.Dynamic.literal(SilkAccelerated = js.Any.fromFunction0(SilkAccelerated), _agent = _agent.asInstanceOf[js.Any], browser = js.Any.fromFunction0(browser), geoIp = js.Any.fromFunction0(geoIp), isAlamoFire = js.Any.fromFunction0(isAlamoFire), isAmaya = js.Any.fromFunction0(isAmaya), isAndroid = js.Any.fromFunction0(isAndroid), isAndroidTablet = js.Any.fromFunction0(isAndroidTablet), isAuthoritative = js.Any.fromFunction0(isAuthoritative), isBada = js.Any.fromFunction0(isBada), isBlackberry = js.Any.fromFunction0(isBlackberry), isBot = js.Any.fromFunction0(isBot), isCaptive = js.Any.fromFunction0(isCaptive), isChrome = js.Any.fromFunction0(isChrome), isChromeOS = js.Any.fromFunction0(isChromeOS), isCurl = js.Any.fromFunction0(isCurl), isDesktop = js.Any.fromFunction0(isDesktop), isEdge = js.Any.fromFunction0(isEdge), isEpiphany = js.Any.fromFunction0(isEpiphany), isFacebook = js.Any.fromFunction0(isFacebook), isFirefox = js.Any.fromFunction0(isFirefox), isFlock = js.Any.fromFunction0(isFlock), isIE = js.Any.fromFunction0(isIE), isIECompatibilityMode = js.Any.fromFunction0(isIECompatibilityMode), isKindleFire = js.Any.fromFunction0(isKindleFire), isKonqueror = js.Any.fromFunction0(isKonqueror), isLinux = js.Any.fromFunction0(isLinux), isLinux64 = js.Any.fromFunction0(isLinux64), isMac = js.Any.fromFunction0(isMac), isMobile = js.Any.fromFunction0(isMobile), isOmniWeb = js.Any.fromFunction0(isOmniWeb), isOpera = js.Any.fromFunction0(isOpera), isPhantomJS = js.Any.fromFunction0(isPhantomJS), isRaspberry = js.Any.fromFunction0(isRaspberry), isSafari = js.Any.fromFunction0(isSafari), isSamsung = js.Any.fromFunction0(isSamsung), isSeaMonkey = js.Any.fromFunction0(isSeaMonkey), isSilk = js.Any.fromFunction0(isSilk), isSmartTV = js.Any.fromFunction0(isSmartTV), isTablet = js.Any.fromFunction0(isTablet), isWebkit = js.Any.fromFunction0(isWebkit), isWinJs = js.Any.fromFunction0(isWinJs), isWindows = js.Any.fromFunction0(isWindows), isWindowsPhone = js.Any.fromFunction0(isWindowsPhone), isiPad = js.Any.fromFunction0(isiPad), isiPhone = js.Any.fromFunction0(isiPhone), isiPod = js.Any.fromFunction0(isiPod), os = js.Any.fromFunction0(os), platform = js.Any.fromFunction0(platform), silkAccelerated = js.Any.fromFunction0(silkAccelerated), source = js.Any.fromFunction0(source), version = js.Any.fromFunction0(version))
    __obj.asInstanceOf[UserAgent]
  }
  @scala.inline
  implicit class UserAgentOps[Self <: UserAgent] (val x: Self) extends AnyVal {
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
    def setSilkAccelerated(value: () => Boolean): Self = this.set("SilkAccelerated", js.Any.fromFunction0(value))
    @scala.inline
    def set_agent(value: js.Any): Self = this.set("_agent", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrowser(value: () => String): Self = this.set("browser", js.Any.fromFunction0(value))
    @scala.inline
    def setGeoIp(value: () => StringDictionary[js.Any]): Self = this.set("geoIp", js.Any.fromFunction0(value))
    @scala.inline
    def setIsAlamoFire(value: () => Boolean): Self = this.set("isAlamoFire", js.Any.fromFunction0(value))
    @scala.inline
    def setIsAmaya(value: () => Boolean): Self = this.set("isAmaya", js.Any.fromFunction0(value))
    @scala.inline
    def setIsAndroid(value: () => Boolean): Self = this.set("isAndroid", js.Any.fromFunction0(value))
    @scala.inline
    def setIsAndroidTablet(value: () => Boolean): Self = this.set("isAndroidTablet", js.Any.fromFunction0(value))
    @scala.inline
    def setIsAuthoritative(value: () => Boolean): Self = this.set("isAuthoritative", js.Any.fromFunction0(value))
    @scala.inline
    def setIsBada(value: () => Boolean): Self = this.set("isBada", js.Any.fromFunction0(value))
    @scala.inline
    def setIsBlackberry(value: () => Boolean): Self = this.set("isBlackberry", js.Any.fromFunction0(value))
    @scala.inline
    def setIsBot(value: () => Boolean): Self = this.set("isBot", js.Any.fromFunction0(value))
    @scala.inline
    def setIsCaptive(value: () => Boolean): Self = this.set("isCaptive", js.Any.fromFunction0(value))
    @scala.inline
    def setIsChrome(value: () => Boolean): Self = this.set("isChrome", js.Any.fromFunction0(value))
    @scala.inline
    def setIsChromeOS(value: () => Boolean): Self = this.set("isChromeOS", js.Any.fromFunction0(value))
    @scala.inline
    def setIsCurl(value: () => Boolean): Self = this.set("isCurl", js.Any.fromFunction0(value))
    @scala.inline
    def setIsDesktop(value: () => Boolean): Self = this.set("isDesktop", js.Any.fromFunction0(value))
    @scala.inline
    def setIsEdge(value: () => Boolean): Self = this.set("isEdge", js.Any.fromFunction0(value))
    @scala.inline
    def setIsEpiphany(value: () => Boolean): Self = this.set("isEpiphany", js.Any.fromFunction0(value))
    @scala.inline
    def setIsFacebook(value: () => Boolean): Self = this.set("isFacebook", js.Any.fromFunction0(value))
    @scala.inline
    def setIsFirefox(value: () => Boolean): Self = this.set("isFirefox", js.Any.fromFunction0(value))
    @scala.inline
    def setIsFlock(value: () => Boolean): Self = this.set("isFlock", js.Any.fromFunction0(value))
    @scala.inline
    def setIsIE(value: () => Boolean): Self = this.set("isIE", js.Any.fromFunction0(value))
    @scala.inline
    def setIsIECompatibilityMode(value: () => Boolean): Self = this.set("isIECompatibilityMode", js.Any.fromFunction0(value))
    @scala.inline
    def setIsKindleFire(value: () => Boolean): Self = this.set("isKindleFire", js.Any.fromFunction0(value))
    @scala.inline
    def setIsKonqueror(value: () => Boolean): Self = this.set("isKonqueror", js.Any.fromFunction0(value))
    @scala.inline
    def setIsLinux(value: () => Boolean): Self = this.set("isLinux", js.Any.fromFunction0(value))
    @scala.inline
    def setIsLinux64(value: () => Boolean): Self = this.set("isLinux64", js.Any.fromFunction0(value))
    @scala.inline
    def setIsMac(value: () => Boolean): Self = this.set("isMac", js.Any.fromFunction0(value))
    @scala.inline
    def setIsMobile(value: () => Boolean): Self = this.set("isMobile", js.Any.fromFunction0(value))
    @scala.inline
    def setIsOmniWeb(value: () => Boolean): Self = this.set("isOmniWeb", js.Any.fromFunction0(value))
    @scala.inline
    def setIsOpera(value: () => Boolean): Self = this.set("isOpera", js.Any.fromFunction0(value))
    @scala.inline
    def setIsPhantomJS(value: () => Boolean): Self = this.set("isPhantomJS", js.Any.fromFunction0(value))
    @scala.inline
    def setIsRaspberry(value: () => Boolean): Self = this.set("isRaspberry", js.Any.fromFunction0(value))
    @scala.inline
    def setIsSafari(value: () => Boolean): Self = this.set("isSafari", js.Any.fromFunction0(value))
    @scala.inline
    def setIsSamsung(value: () => Boolean): Self = this.set("isSamsung", js.Any.fromFunction0(value))
    @scala.inline
    def setIsSeaMonkey(value: () => Boolean): Self = this.set("isSeaMonkey", js.Any.fromFunction0(value))
    @scala.inline
    def setIsSilk(value: () => Boolean): Self = this.set("isSilk", js.Any.fromFunction0(value))
    @scala.inline
    def setIsSmartTV(value: () => Boolean): Self = this.set("isSmartTV", js.Any.fromFunction0(value))
    @scala.inline
    def setIsTablet(value: () => Boolean): Self = this.set("isTablet", js.Any.fromFunction0(value))
    @scala.inline
    def setIsWebkit(value: () => Boolean): Self = this.set("isWebkit", js.Any.fromFunction0(value))
    @scala.inline
    def setIsWinJs(value: () => Boolean): Self = this.set("isWinJs", js.Any.fromFunction0(value))
    @scala.inline
    def setIsWindows(value: () => Boolean): Self = this.set("isWindows", js.Any.fromFunction0(value))
    @scala.inline
    def setIsWindowsPhone(value: () => Boolean): Self = this.set("isWindowsPhone", js.Any.fromFunction0(value))
    @scala.inline
    def setIsiPad(value: () => Boolean): Self = this.set("isiPad", js.Any.fromFunction0(value))
    @scala.inline
    def setIsiPhone(value: () => Boolean): Self = this.set("isiPhone", js.Any.fromFunction0(value))
    @scala.inline
    def setIsiPod(value: () => Boolean): Self = this.set("isiPod", js.Any.fromFunction0(value))
    @scala.inline
    def setOs(value: () => String): Self = this.set("os", js.Any.fromFunction0(value))
    @scala.inline
    def setPlatform(value: () => String): Self = this.set("platform", js.Any.fromFunction0(value))
    @scala.inline
    def setSource(value: () => String): Self = this.set("source", js.Any.fromFunction0(value))
    @scala.inline
    def setVersion(value: () => String): Self = this.set("version", js.Any.fromFunction0(value))
  }
  
}

