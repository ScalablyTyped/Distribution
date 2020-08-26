package typings.helmet.mod

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHelmetContentSecurityPolicyDirectives extends js.Object {
  var `base-uri`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var baseUri: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var `block-all-mixed-content`: js.UndefOr[Boolean] = js.native
  var blockAllMixedContent: js.UndefOr[Boolean] = js.native
  var `child-src`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var childSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var `connect-src`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var connectSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var `default-src`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var defaultSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var `font-src`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var fontSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var `form-action`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var formAction: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var `frame-ancestors`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var `frame-src`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var frameAncestors: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var frameSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var `img-src`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var imgSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var `manifest-src`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var manifestSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var `media-src`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var mediaSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var `object-src`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var objectSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var `plugin-types`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var pluginTypes: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var `prefetch-src`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var prefetchSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var `report-to`: js.UndefOr[HelmetCspDirectiveValue] = js.native
  var `report-uri`: js.UndefOr[HelmetCspDirectiveValue] = js.native
  var reportTo: js.UndefOr[HelmetCspDirectiveValue] = js.native
  var reportUri: js.UndefOr[HelmetCspDirectiveValue] = js.native
  var `require-sri-for`: js.UndefOr[js.Array[HelmetCspRequireSriForValue]] = js.native
  var requireSriFor: js.UndefOr[js.Array[HelmetCspRequireSriForValue]] = js.native
  var sandbox: js.UndefOr[js.Array[HelmetCspSandboxDirective]] = js.native
  var `script-src`: js.UndefOr[HelmetCspDirectiveValue] = js.native
  var scriptSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var `style-src`: js.UndefOr[HelmetCspDirectiveValue] = js.native
  var styleSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
  var `upgrade-insecure-requests`: js.UndefOr[Boolean] = js.native
  var upgradeInsecureRequests: js.UndefOr[Boolean] = js.native
  var `worker-src`: js.UndefOr[HelmetCspDirectiveValue] = js.native
  var workerSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.native
}

object IHelmetContentSecurityPolicyDirectives {
  @scala.inline
  def apply(): IHelmetContentSecurityPolicyDirectives = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHelmetContentSecurityPolicyDirectives]
  }
  @scala.inline
  implicit class IHelmetContentSecurityPolicyDirectivesOps[Self <: IHelmetContentSecurityPolicyDirectives] (val x: Self) extends AnyVal {
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
    def `setBase-uriVarargs`(value: HelmetCspDirectiveValue*): Self = this.set("base-uri", js.Array(value :_*))
    @scala.inline
    def `setBase-uri`(value: js.Array[HelmetCspDirectiveValue]): Self = this.set("base-uri", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBase-uri`: Self = this.set("base-uri", js.undefined)
    @scala.inline
    def setBaseUriVarargs(value: HelmetCspDirectiveValue*): Self = this.set("baseUri", js.Array(value :_*))
    @scala.inline
    def setBaseUri(value: js.Array[HelmetCspDirectiveValue]): Self = this.set("baseUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseUri: Self = this.set("baseUri", js.undefined)
    @scala.inline
    def `setBlock-all-mixed-content`(value: Boolean): Self = this.set("block-all-mixed-content", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBlock-all-mixed-content`: Self = this.set("block-all-mixed-content", js.undefined)
    @scala.inline
    def setBlockAllMixedContent(value: Boolean): Self = this.set("blockAllMixedContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockAllMixedContent: Self = this.set("blockAllMixedContent", js.undefined)
    @scala.inline
    def `setChild-srcVarargs`(value: HelmetCspDirectiveValue*): Self = this.set("child-src", js.Array(value :_*))
    @scala.inline
    def `setChild-src`(value: js.Array[HelmetCspDirectiveValue]): Self = this.set("child-src", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteChild-src`: Self = this.set("child-src", js.undefined)
    @scala.inline
    def setChildSrcVarargs(value: HelmetCspDirectiveValue*): Self = this.set("childSrc", js.Array(value :_*))
    @scala.inline
    def setChildSrc(value: js.Array[HelmetCspDirectiveValue]): Self = this.set("childSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildSrc: Self = this.set("childSrc", js.undefined)
    @scala.inline
    def `setConnect-srcVarargs`(value: HelmetCspDirectiveValue*): Self = this.set("connect-src", js.Array(value :_*))
    @scala.inline
    def `setConnect-src`(value: js.Array[HelmetCspDirectiveValue]): Self = this.set("connect-src", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteConnect-src`: Self = this.set("connect-src", js.undefined)
    @scala.inline
    def setConnectSrcVarargs(value: HelmetCspDirectiveValue*): Self = this.set("connectSrc", js.Array(value :_*))
    @scala.inline
    def setConnectSrc(value: js.Array[HelmetCspDirectiveValue]): Self = this.set("connectSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectSrc: Self = this.set("connectSrc", js.undefined)
    @scala.inline
    def `setDefault-srcVarargs`(value: HelmetCspDirectiveValue*): Self = this.set("default-src", js.Array(value :_*))
    @scala.inline
    def `setDefault-src`(value: js.Array[HelmetCspDirectiveValue]): Self = this.set("default-src", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDefault-src`: Self = this.set("default-src", js.undefined)
    @scala.inline
    def setDefaultSrcVarargs(value: HelmetCspDirectiveValue*): Self = this.set("defaultSrc", js.Array(value :_*))
    @scala.inline
    def setDefaultSrc(value: js.Array[HelmetCspDirectiveValue]): Self = this.set("defaultSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSrc: Self = this.set("defaultSrc", js.undefined)
    @scala.inline
    def `setFont-srcVarargs`(value: HelmetCspDirectiveValue*): Self = this.set("font-src", js.Array(value :_*))
    @scala.inline
    def `setFont-src`(value: js.Array[HelmetCspDirectiveValue]): Self = this.set("font-src", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-src`: Self = this.set("font-src", js.undefined)
    @scala.inline
    def setFontSrcVarargs(value: HelmetCspDirectiveValue*): Self = this.set("fontSrc", js.Array(value :_*))
    @scala.inline
    def setFontSrc(value: js.Array[HelmetCspDirectiveValue]): Self = this.set("fontSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSrc: Self = this.set("fontSrc", js.undefined)
    @scala.inline
    def `setForm-actionVarargs`(value: HelmetCspDirectiveValue*): Self = this.set("form-action", js.Array(value :_*))
    @scala.inline
    def `setForm-action`(value: js.Array[HelmetCspDirectiveValue]): Self = this.set("form-action", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteForm-action`: Self = this.set("form-action", js.undefined)
    @scala.inline
    def setFormActionVarargs(value: HelmetCspDirectiveValue*): Self = this.set("formAction", js.Array(value :_*))
    @scala.inline
    def setFormAction(value: js.Array[HelmetCspDirectiveValue]): Self = this.set("formAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormAction: Self = this.set("formAction", js.undefined)
    @scala.inline
    def `setFrame-ancestorsVarargs`(value: HelmetCspDirectiveValue*): Self = this.set("frame-ancestors", js.Array(value :_*))
    @scala.inline
    def `setFrame-ancestors`(value: js.Array[HelmetCspDirectiveValue]): Self = this.set("frame-ancestors", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFrame-ancestors`: Self = this.set("frame-ancestors", js.undefined)
    @scala.inline
    def `setFrame-srcVarargs`(value: HelmetCspDirectiveValue*): Self = this.set("frame-src", js.Array(value :_*))
    @scala.inline
    def `setFrame-src`(value: js.Array[HelmetCspDirectiveValue]): Self = this.set("frame-src", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFrame-src`: Self = this.set("frame-src", js.undefined)
    @scala.inline
    def setFrameAncestorsVarargs(value: HelmetCspDirectiveValue*): Self = this.set("frameAncestors", js.Array(value :_*))
    @scala.inline
    def setFrameAncestors(value: js.Array[HelmetCspDirectiveValue]): Self = this.set("frameAncestors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameAncestors: Self = this.set("frameAncestors", js.undefined)
    @scala.inline
    def setFrameSrcVarargs(value: HelmetCspDirectiveValue*): Self = this.set("frameSrc", js.Array(value :_*))
    @scala.inline
    def setFrameSrc(value: js.Array[HelmetCspDirectiveValue]): Self = this.set("frameSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameSrc: Self = this.set("frameSrc", js.undefined)
    @scala.inline
    def `setImg-srcVarargs`(value: HelmetCspDirectiveValue*): Self = this.set("img-src", js.Array(value :_*))
    @scala.inline
    def `setImg-src`(value: js.Array[HelmetCspDirectiveValue]): Self = this.set("img-src", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteImg-src`: Self = this.set("img-src", js.undefined)
    @scala.inline
    def setImgSrcVarargs(value: HelmetCspDirectiveValue*): Self = this.set("imgSrc", js.Array(value :_*))
    @scala.inline
    def setImgSrc(value: js.Array[HelmetCspDirectiveValue]): Self = this.set("imgSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImgSrc: Self = this.set("imgSrc", js.undefined)
    @scala.inline
    def `setManifest-srcVarargs`(value: HelmetCspDirectiveValue*): Self = this.set("manifest-src", js.Array(value :_*))
    @scala.inline
    def `setManifest-src`(value: js.Array[HelmetCspDirectiveValue]): Self = this.set("manifest-src", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteManifest-src`: Self = this.set("manifest-src", js.undefined)
    @scala.inline
    def setManifestSrcVarargs(value: HelmetCspDirectiveValue*): Self = this.set("manifestSrc", js.Array(value :_*))
    @scala.inline
    def setManifestSrc(value: js.Array[HelmetCspDirectiveValue]): Self = this.set("manifestSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManifestSrc: Self = this.set("manifestSrc", js.undefined)
    @scala.inline
    def `setMedia-srcVarargs`(value: HelmetCspDirectiveValue*): Self = this.set("media-src", js.Array(value :_*))
    @scala.inline
    def `setMedia-src`(value: js.Array[HelmetCspDirectiveValue]): Self = this.set("media-src", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMedia-src`: Self = this.set("media-src", js.undefined)
    @scala.inline
    def setMediaSrcVarargs(value: HelmetCspDirectiveValue*): Self = this.set("mediaSrc", js.Array(value :_*))
    @scala.inline
    def setMediaSrc(value: js.Array[HelmetCspDirectiveValue]): Self = this.set("mediaSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaSrc: Self = this.set("mediaSrc", js.undefined)
    @scala.inline
    def `setObject-srcVarargs`(value: HelmetCspDirectiveValue*): Self = this.set("object-src", js.Array(value :_*))
    @scala.inline
    def `setObject-src`(value: js.Array[HelmetCspDirectiveValue]): Self = this.set("object-src", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteObject-src`: Self = this.set("object-src", js.undefined)
    @scala.inline
    def setObjectSrcVarargs(value: HelmetCspDirectiveValue*): Self = this.set("objectSrc", js.Array(value :_*))
    @scala.inline
    def setObjectSrc(value: js.Array[HelmetCspDirectiveValue]): Self = this.set("objectSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectSrc: Self = this.set("objectSrc", js.undefined)
    @scala.inline
    def `setPlugin-typesVarargs`(value: HelmetCspDirectiveValue*): Self = this.set("plugin-types", js.Array(value :_*))
    @scala.inline
    def `setPlugin-types`(value: js.Array[HelmetCspDirectiveValue]): Self = this.set("plugin-types", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePlugin-types`: Self = this.set("plugin-types", js.undefined)
    @scala.inline
    def setPluginTypesVarargs(value: HelmetCspDirectiveValue*): Self = this.set("pluginTypes", js.Array(value :_*))
    @scala.inline
    def setPluginTypes(value: js.Array[HelmetCspDirectiveValue]): Self = this.set("pluginTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePluginTypes: Self = this.set("pluginTypes", js.undefined)
    @scala.inline
    def `setPrefetch-srcVarargs`(value: HelmetCspDirectiveValue*): Self = this.set("prefetch-src", js.Array(value :_*))
    @scala.inline
    def `setPrefetch-src`(value: js.Array[HelmetCspDirectiveValue]): Self = this.set("prefetch-src", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrefetch-src`: Self = this.set("prefetch-src", js.undefined)
    @scala.inline
    def setPrefetchSrcVarargs(value: HelmetCspDirectiveValue*): Self = this.set("prefetchSrc", js.Array(value :_*))
    @scala.inline
    def setPrefetchSrc(value: js.Array[HelmetCspDirectiveValue]): Self = this.set("prefetchSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefetchSrc: Self = this.set("prefetchSrc", js.undefined)
    @scala.inline
    def `setReport-toFunction2`(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => String
    ): Self = this.set("report-to", js.Any.fromFunction2(value))
    @scala.inline
    def `setReport-to`(value: HelmetCspDirectiveValue): Self = this.set("report-to", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteReport-to`: Self = this.set("report-to", js.undefined)
    @scala.inline
    def `setReport-uriFunction2`(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => String
    ): Self = this.set("report-uri", js.Any.fromFunction2(value))
    @scala.inline
    def `setReport-uri`(value: HelmetCspDirectiveValue): Self = this.set("report-uri", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteReport-uri`: Self = this.set("report-uri", js.undefined)
    @scala.inline
    def setReportToFunction2(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => String
    ): Self = this.set("reportTo", js.Any.fromFunction2(value))
    @scala.inline
    def setReportTo(value: HelmetCspDirectiveValue): Self = this.set("reportTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportTo: Self = this.set("reportTo", js.undefined)
    @scala.inline
    def setReportUriFunction2(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => String
    ): Self = this.set("reportUri", js.Any.fromFunction2(value))
    @scala.inline
    def setReportUri(value: HelmetCspDirectiveValue): Self = this.set("reportUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportUri: Self = this.set("reportUri", js.undefined)
    @scala.inline
    def `setRequire-sri-forVarargs`(value: HelmetCspRequireSriForValue*): Self = this.set("require-sri-for", js.Array(value :_*))
    @scala.inline
    def `setRequire-sri-for`(value: js.Array[HelmetCspRequireSriForValue]): Self = this.set("require-sri-for", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRequire-sri-for`: Self = this.set("require-sri-for", js.undefined)
    @scala.inline
    def setRequireSriForVarargs(value: HelmetCspRequireSriForValue*): Self = this.set("requireSriFor", js.Array(value :_*))
    @scala.inline
    def setRequireSriFor(value: js.Array[HelmetCspRequireSriForValue]): Self = this.set("requireSriFor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireSriFor: Self = this.set("requireSriFor", js.undefined)
    @scala.inline
    def setSandboxVarargs(value: HelmetCspSandboxDirective*): Self = this.set("sandbox", js.Array(value :_*))
    @scala.inline
    def setSandbox(value: js.Array[HelmetCspSandboxDirective]): Self = this.set("sandbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSandbox: Self = this.set("sandbox", js.undefined)
    @scala.inline
    def `setScript-srcFunction2`(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => String
    ): Self = this.set("script-src", js.Any.fromFunction2(value))
    @scala.inline
    def `setScript-src`(value: HelmetCspDirectiveValue): Self = this.set("script-src", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScript-src`: Self = this.set("script-src", js.undefined)
    @scala.inline
    def setScriptSrcVarargs(value: HelmetCspDirectiveValue*): Self = this.set("scriptSrc", js.Array(value :_*))
    @scala.inline
    def setScriptSrc(value: js.Array[HelmetCspDirectiveValue]): Self = this.set("scriptSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScriptSrc: Self = this.set("scriptSrc", js.undefined)
    @scala.inline
    def `setStyle-srcFunction2`(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => String
    ): Self = this.set("style-src", js.Any.fromFunction2(value))
    @scala.inline
    def `setStyle-src`(value: HelmetCspDirectiveValue): Self = this.set("style-src", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStyle-src`: Self = this.set("style-src", js.undefined)
    @scala.inline
    def setStyleSrcVarargs(value: HelmetCspDirectiveValue*): Self = this.set("styleSrc", js.Array(value :_*))
    @scala.inline
    def setStyleSrc(value: js.Array[HelmetCspDirectiveValue]): Self = this.set("styleSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyleSrc: Self = this.set("styleSrc", js.undefined)
    @scala.inline
    def `setUpgrade-insecure-requests`(value: Boolean): Self = this.set("upgrade-insecure-requests", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUpgrade-insecure-requests`: Self = this.set("upgrade-insecure-requests", js.undefined)
    @scala.inline
    def setUpgradeInsecureRequests(value: Boolean): Self = this.set("upgradeInsecureRequests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpgradeInsecureRequests: Self = this.set("upgradeInsecureRequests", js.undefined)
    @scala.inline
    def `setWorker-srcFunction2`(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => String
    ): Self = this.set("worker-src", js.Any.fromFunction2(value))
    @scala.inline
    def `setWorker-src`(value: HelmetCspDirectiveValue): Self = this.set("worker-src", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteWorker-src`: Self = this.set("worker-src", js.undefined)
    @scala.inline
    def setWorkerSrcVarargs(value: HelmetCspDirectiveValue*): Self = this.set("workerSrc", js.Array(value :_*))
    @scala.inline
    def setWorkerSrc(value: js.Array[HelmetCspDirectiveValue]): Self = this.set("workerSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerSrc: Self = this.set("workerSrc", js.undefined)
  }
  
}

