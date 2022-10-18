package typings.jupyterlabApputils

import typings.jupyterlabApputils.libIframeMod.IFrame.IOptions
import typings.jupyterlabApputils.libIframeMod.IFrame.ReferrerPolicy
import typings.jupyterlabApputils.libIframeMod.IFrame.SandboxExceptions
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIframeMod {
  
  @JSImport("@jupyterlab/apputils/lib/iframe", "IFrame")
  @js.native
  /**
    * Create a new IFrame widget.
    */
  open class IFrame () extends Widget {
    def this(options: IOptions) = this()
    
    /* private */ var _referrerPolicy: Any = js.native
    
    /* private */ var _sandbox: Any = js.native
    
    /**
      * Referrer policy for the iframe.
      *
      * #### Notes
      * By default, `no-referrer` is chosen.
      *
      * For more information, see
      * https://developer.mozilla.org/en-US/docs/Web/API/HTMLIFrameElement/referrerPolicy
      */
    def referrerPolicy: ReferrerPolicy = js.native
    def referrerPolicy_=(value: ReferrerPolicy): Unit = js.native
    
    /**
      * Exceptions to the sandboxing.
      *
      * #### Notes
      * By default, all sandboxing security policies are enabled.
      * This setting allows the user to selectively disable these
      * policies. This should be done with care, as it can
      * introduce security risks, and possibly allow malicious
      * sites to execute code in a JupyterLab session.
      *
      * For more information, see
      * https://developer.mozilla.org/en-US/docs/Web/HTML/Element/iframe
      */
    def sandbox: js.Array[SandboxExceptions] = js.native
    def sandbox_=(values: js.Array[SandboxExceptions]): Unit = js.native
    
    /**
      * The url of the IFrame.
      */
    def url: String = js.native
    def url_=(url: String): Unit = js.native
  }
  object IFrame {
    
    /**
      * Options for creating a new IFrame widget.
      */
    trait IOptions extends StObject {
      
      /**
        * Referrer policy for the iframe.
        */
      var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.undefined
      
      /**
        * Exceptions for the iframe sandbox.
        */
      var sandbox: js.UndefOr[js.Array[SandboxExceptions]] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setReferrerPolicy(value: ReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
        
        inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
        
        inline def setSandbox(value: js.Array[SandboxExceptions]): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
        
        inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
        
        inline def setSandboxVarargs(value: SandboxExceptions*): Self = StObject.set(x, "sandbox", js.Array(value*))
      }
    }
    
    /**
      * Referrer policy for the iframe.
      *
      * User documentation for the policies can be found here:
      * https://developer.mozilla.org/en-US/docs/Web/API/HTMLIFrameElement/referrerPolicy
      */
    /* Rewritten from type alias, can be one of: 
      - typings.jupyterlabApputils.jupyterlabApputilsStrings.`no-referrer`
      - typings.jupyterlabApputils.jupyterlabApputilsStrings.`no-referrer-when-downgrade`
      - typings.jupyterlabApputils.jupyterlabApputilsStrings.origin
      - typings.jupyterlabApputils.jupyterlabApputilsStrings.`origin-when-cross-origin`
      - typings.jupyterlabApputils.jupyterlabApputilsStrings.`same-origin`
      - typings.jupyterlabApputils.jupyterlabApputilsStrings.`strict-origin`
      - typings.jupyterlabApputils.jupyterlabApputilsStrings.`strict-origin-when-cross-origin`
      - typings.jupyterlabApputils.jupyterlabApputilsStrings.`unsafe-url`
    */
    trait ReferrerPolicy extends StObject
    object ReferrerPolicy {
      
      inline def `no-referrer`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`no-referrer` = "no-referrer".asInstanceOf[typings.jupyterlabApputils.jupyterlabApputilsStrings.`no-referrer`]
      
      inline def `no-referrer-when-downgrade`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`no-referrer-when-downgrade` = "no-referrer-when-downgrade".asInstanceOf[typings.jupyterlabApputils.jupyterlabApputilsStrings.`no-referrer-when-downgrade`]
      
      inline def origin: typings.jupyterlabApputils.jupyterlabApputilsStrings.origin = "origin".asInstanceOf[typings.jupyterlabApputils.jupyterlabApputilsStrings.origin]
      
      inline def `origin-when-cross-origin`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`origin-when-cross-origin` = "origin-when-cross-origin".asInstanceOf[typings.jupyterlabApputils.jupyterlabApputilsStrings.`origin-when-cross-origin`]
      
      inline def `same-origin`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`same-origin` = "same-origin".asInstanceOf[typings.jupyterlabApputils.jupyterlabApputilsStrings.`same-origin`]
      
      inline def `strict-origin`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`strict-origin` = "strict-origin".asInstanceOf[typings.jupyterlabApputils.jupyterlabApputilsStrings.`strict-origin`]
      
      inline def `strict-origin-when-cross-origin`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`strict-origin-when-cross-origin` = "strict-origin-when-cross-origin".asInstanceOf[typings.jupyterlabApputils.jupyterlabApputilsStrings.`strict-origin-when-cross-origin`]
      
      inline def `unsafe-url`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`unsafe-url` = "unsafe-url".asInstanceOf[typings.jupyterlabApputils.jupyterlabApputilsStrings.`unsafe-url`]
    }
    
    /**
      * Exceptions to the iframe sandboxing policies.
      * These are specified here:
      * https://www.w3.org/TR/2011/WD-html5-20110525/the-iframe-element.html#attr-iframe-sandbox
      *
      * More user-friendly documentation can be found here:
      * https://developer.mozilla.org/en-US/docs/Web/HTML/Element/iframe#sandbox
      */
    /* Rewritten from type alias, can be one of: 
      - typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-downloads`
      - typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-forms`
      - typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-modals`
      - typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-orientation-lock`
      - typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-pointer-lock`
      - typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-popups`
      - typings.jupyterlabApputils.jupyterlabApputilsStrings.`popups-to-escape-sandbox`
      - typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-presentation`
      - typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-same-origin`
      - typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-scripts`
      - typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-storage-access-by-user-activation`
      - typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-top-navigation`
      - typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-top-navigation-by-user-activation`
    */
    trait SandboxExceptions extends StObject
    object SandboxExceptions {
      
      inline def `allow-downloads`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-downloads` = "allow-downloads".asInstanceOf[typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-downloads`]
      
      inline def `allow-forms`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-forms` = "allow-forms".asInstanceOf[typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-forms`]
      
      inline def `allow-modals`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-modals` = "allow-modals".asInstanceOf[typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-modals`]
      
      inline def `allow-orientation-lock`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-orientation-lock` = "allow-orientation-lock".asInstanceOf[typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-orientation-lock`]
      
      inline def `allow-pointer-lock`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-pointer-lock` = "allow-pointer-lock".asInstanceOf[typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-pointer-lock`]
      
      inline def `allow-popups`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-popups` = "allow-popups".asInstanceOf[typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-popups`]
      
      inline def `allow-presentation`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-presentation` = "allow-presentation".asInstanceOf[typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-presentation`]
      
      inline def `allow-same-origin`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-same-origin` = "allow-same-origin".asInstanceOf[typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-same-origin`]
      
      inline def `allow-scripts`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-scripts` = "allow-scripts".asInstanceOf[typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-scripts`]
      
      inline def `allow-storage-access-by-user-activation`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-storage-access-by-user-activation` = "allow-storage-access-by-user-activation".asInstanceOf[typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-storage-access-by-user-activation`]
      
      inline def `allow-top-navigation`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-top-navigation` = "allow-top-navigation".asInstanceOf[typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-top-navigation`]
      
      inline def `allow-top-navigation-by-user-activation`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-top-navigation-by-user-activation` = "allow-top-navigation-by-user-activation".asInstanceOf[typings.jupyterlabApputils.jupyterlabApputilsStrings.`allow-top-navigation-by-user-activation`]
      
      inline def `popups-to-escape-sandbox`: typings.jupyterlabApputils.jupyterlabApputilsStrings.`popups-to-escape-sandbox` = "popups-to-escape-sandbox".asInstanceOf[typings.jupyterlabApputils.jupyterlabApputilsStrings.`popups-to-escape-sandbox`]
    }
  }
}
