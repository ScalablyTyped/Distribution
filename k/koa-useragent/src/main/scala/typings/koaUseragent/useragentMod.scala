package typings.koaUseragent

import org.scalablytyped.runtime.StringDictionary
import typings.expressUseragent.mod.Details
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useragentMod {
  
  @JSImport("koa-useragent/dist/lib/useragent", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with UserAgent {
    def this(source: String) = this()
    
    /* CompleteClass */
    var browser: String = js.native
    
    /* CompleteClass */
    var geoIp: StringDictionary[Any] = js.native
    
    /* CompleteClass */
    var isAmaya: Boolean = js.native
    
    /* CompleteClass */
    var isAndroid: Boolean = js.native
    
    /* CompleteClass */
    var isAndroidTablet: Boolean = js.native
    
    /* CompleteClass */
    var isBada: Boolean = js.native
    
    /* CompleteClass */
    var isBlackberry: Boolean = js.native
    
    /* CompleteClass */
    var isBot: Boolean = js.native
    
    /* CompleteClass */
    var isCaptive: Boolean = js.native
    
    /* CompleteClass */
    var isChrome: Boolean = js.native
    
    /* CompleteClass */
    var isChromeOS: Boolean = js.native
    
    /* CompleteClass */
    var isCurl: Boolean = js.native
    
    /* CompleteClass */
    var isDesktop: Boolean = js.native
    
    /* CompleteClass */
    var isEdge: Boolean = js.native
    
    /* CompleteClass */
    var isEpiphany: Boolean = js.native
    
    /* CompleteClass */
    var isFirefox: Boolean = js.native
    
    /* CompleteClass */
    var isFlock: Boolean = js.native
    
    /* CompleteClass */
    var isIE: Boolean = js.native
    
    /* CompleteClass */
    var isIECompatibilityMode: Boolean = js.native
    
    /* CompleteClass */
    var isKindleFire: Boolean = js.native
    
    /* CompleteClass */
    var isKonqueror: Boolean = js.native
    
    /* CompleteClass */
    var isLinux: Boolean = js.native
    
    /* CompleteClass */
    var isLinux64: Boolean = js.native
    
    /* CompleteClass */
    var isMac: Boolean = js.native
    
    /* CompleteClass */
    var isMobile: Boolean = js.native
    
    /* CompleteClass */
    var isMobileNative: Boolean = js.native
    
    /* CompleteClass */
    var isOmniWeb: Boolean = js.native
    
    /* CompleteClass */
    var isOpera: Boolean = js.native
    
    /* CompleteClass */
    var isRaspberry: Boolean = js.native
    
    /* CompleteClass */
    var isSafari: Boolean = js.native
    
    /* CompleteClass */
    var isSamsung: Boolean = js.native
    
    /* CompleteClass */
    var isSeaMonkey: Boolean = js.native
    
    /* CompleteClass */
    var isSilk: Boolean = js.native
    
    /* CompleteClass */
    var isSmartTV: Boolean = js.native
    
    /* CompleteClass */
    var isTablet: Boolean = js.native
    
    /* CompleteClass */
    var isWebkit: Boolean = js.native
    
    /* CompleteClass */
    var isWinJs: Boolean = js.native
    
    /* CompleteClass */
    var isWindows: Boolean = js.native
    
    /* CompleteClass */
    var isWindowsPhone: Boolean = js.native
    
    /* CompleteClass */
    var isiPad: Boolean = js.native
    
    /* CompleteClass */
    var isiPhone: Boolean = js.native
    
    /* CompleteClass */
    var isiPod: Boolean = js.native
    
    /* CompleteClass */
    var os: String = js.native
    
    /* CompleteClass */
    var platform: String = js.native
    
    /* CompleteClass */
    var silkAccelerated: Boolean = js.native
    
    /* CompleteClass */
    var source: String = js.native
    
    /* CompleteClass */
    var version: String = js.native
  }
  
  @js.native
  trait UserAgent
    extends StObject
       with Details {
    
    def SilkAccelerated: Boolean = js.native
    
    /* private */ val _agent: Any = js.native
    
    @JSName("browser")
    def browser_MUserAgent: String = js.native
    
    @JSName("geoIp")
    def geoIp_MUserAgent: StringDictionary[Any] = js.native
    
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
    
    @JSName("isMobileNative")
    def isMobileNative_MUserAgent: Boolean = js.native
    
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
}
