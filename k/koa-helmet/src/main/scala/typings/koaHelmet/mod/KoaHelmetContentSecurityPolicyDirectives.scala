package typings.koaHelmet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KoaHelmetContentSecurityPolicyDirectives extends js.Object {
  
  var baseUri: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.native
  
  var childSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.native
  
  var connectSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.native
  
  var defaultSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.native
  
  var fontSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.native
  
  var formAction: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.native
  
  var frameAncestors: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.native
  
  var frameSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.native
  
  var imgSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.native
  
  var mediaSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.native
  
  var objectSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.native
  
  var pluginTypes: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.native
  
  var reportUri: js.UndefOr[String] = js.native
  
  var sandbox: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.native
  
  var scriptSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.native
  
  var styleSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.native
}
object KoaHelmetContentSecurityPolicyDirectives {
  
  @scala.inline
  def apply(): KoaHelmetContentSecurityPolicyDirectives = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KoaHelmetContentSecurityPolicyDirectives]
  }
  
  @scala.inline
  implicit class KoaHelmetContentSecurityPolicyDirectivesOps[Self <: KoaHelmetContentSecurityPolicyDirectives] (val x: Self) extends AnyVal {
    
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
    def setBaseUriVarargs(value: KoaHelmetCspDirectiveValue*): Self = this.set("baseUri", js.Array(value :_*))
    
    @scala.inline
    def setBaseUri(value: js.Array[KoaHelmetCspDirectiveValue]): Self = this.set("baseUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseUri: Self = this.set("baseUri", js.undefined)
    
    @scala.inline
    def setChildSrcVarargs(value: KoaHelmetCspDirectiveValue*): Self = this.set("childSrc", js.Array(value :_*))
    
    @scala.inline
    def setChildSrc(value: js.Array[KoaHelmetCspDirectiveValue]): Self = this.set("childSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildSrc: Self = this.set("childSrc", js.undefined)
    
    @scala.inline
    def setConnectSrcVarargs(value: KoaHelmetCspDirectiveValue*): Self = this.set("connectSrc", js.Array(value :_*))
    
    @scala.inline
    def setConnectSrc(value: js.Array[KoaHelmetCspDirectiveValue]): Self = this.set("connectSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectSrc: Self = this.set("connectSrc", js.undefined)
    
    @scala.inline
    def setDefaultSrcVarargs(value: KoaHelmetCspDirectiveValue*): Self = this.set("defaultSrc", js.Array(value :_*))
    
    @scala.inline
    def setDefaultSrc(value: js.Array[KoaHelmetCspDirectiveValue]): Self = this.set("defaultSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSrc: Self = this.set("defaultSrc", js.undefined)
    
    @scala.inline
    def setFontSrcVarargs(value: KoaHelmetCspDirectiveValue*): Self = this.set("fontSrc", js.Array(value :_*))
    
    @scala.inline
    def setFontSrc(value: js.Array[KoaHelmetCspDirectiveValue]): Self = this.set("fontSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSrc: Self = this.set("fontSrc", js.undefined)
    
    @scala.inline
    def setFormActionVarargs(value: KoaHelmetCspDirectiveValue*): Self = this.set("formAction", js.Array(value :_*))
    
    @scala.inline
    def setFormAction(value: js.Array[KoaHelmetCspDirectiveValue]): Self = this.set("formAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormAction: Self = this.set("formAction", js.undefined)
    
    @scala.inline
    def setFrameAncestorsVarargs(value: KoaHelmetCspDirectiveValue*): Self = this.set("frameAncestors", js.Array(value :_*))
    
    @scala.inline
    def setFrameAncestors(value: js.Array[KoaHelmetCspDirectiveValue]): Self = this.set("frameAncestors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameAncestors: Self = this.set("frameAncestors", js.undefined)
    
    @scala.inline
    def setFrameSrcVarargs(value: KoaHelmetCspDirectiveValue*): Self = this.set("frameSrc", js.Array(value :_*))
    
    @scala.inline
    def setFrameSrc(value: js.Array[KoaHelmetCspDirectiveValue]): Self = this.set("frameSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameSrc: Self = this.set("frameSrc", js.undefined)
    
    @scala.inline
    def setImgSrcVarargs(value: KoaHelmetCspDirectiveValue*): Self = this.set("imgSrc", js.Array(value :_*))
    
    @scala.inline
    def setImgSrc(value: js.Array[KoaHelmetCspDirectiveValue]): Self = this.set("imgSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImgSrc: Self = this.set("imgSrc", js.undefined)
    
    @scala.inline
    def setMediaSrcVarargs(value: KoaHelmetCspDirectiveValue*): Self = this.set("mediaSrc", js.Array(value :_*))
    
    @scala.inline
    def setMediaSrc(value: js.Array[KoaHelmetCspDirectiveValue]): Self = this.set("mediaSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaSrc: Self = this.set("mediaSrc", js.undefined)
    
    @scala.inline
    def setObjectSrcVarargs(value: KoaHelmetCspDirectiveValue*): Self = this.set("objectSrc", js.Array(value :_*))
    
    @scala.inline
    def setObjectSrc(value: js.Array[KoaHelmetCspDirectiveValue]): Self = this.set("objectSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectSrc: Self = this.set("objectSrc", js.undefined)
    
    @scala.inline
    def setPluginTypesVarargs(value: KoaHelmetCspDirectiveValue*): Self = this.set("pluginTypes", js.Array(value :_*))
    
    @scala.inline
    def setPluginTypes(value: js.Array[KoaHelmetCspDirectiveValue]): Self = this.set("pluginTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePluginTypes: Self = this.set("pluginTypes", js.undefined)
    
    @scala.inline
    def setReportUri(value: String): Self = this.set("reportUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportUri: Self = this.set("reportUri", js.undefined)
    
    @scala.inline
    def setSandboxVarargs(value: KoaHelmetCspDirectiveValue*): Self = this.set("sandbox", js.Array(value :_*))
    
    @scala.inline
    def setSandbox(value: js.Array[KoaHelmetCspDirectiveValue]): Self = this.set("sandbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSandbox: Self = this.set("sandbox", js.undefined)
    
    @scala.inline
    def setScriptSrcVarargs(value: KoaHelmetCspDirectiveValue*): Self = this.set("scriptSrc", js.Array(value :_*))
    
    @scala.inline
    def setScriptSrc(value: js.Array[KoaHelmetCspDirectiveValue]): Self = this.set("scriptSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScriptSrc: Self = this.set("scriptSrc", js.undefined)
    
    @scala.inline
    def setStyleSrcVarargs(value: KoaHelmetCspDirectiveValue*): Self = this.set("styleSrc", js.Array(value :_*))
    
    @scala.inline
    def setStyleSrc(value: js.Array[KoaHelmetCspDirectiveValue]): Self = this.set("styleSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleSrc: Self = this.set("styleSrc", js.undefined)
  }
}
