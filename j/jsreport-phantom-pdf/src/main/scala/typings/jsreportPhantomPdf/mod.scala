package typings.jsreportPhantomPdf

import typings.jsreportCore.mod.ExtensionDefinition
import typings.jsreportPhantomPdf.anon.PartialOptions
import typings.jsreportPhantomPdf.anon.PartialPhantom
import typings.jsreportPhantomPdf.jsreportPhantomPdfStrings.`dedicated-process`
import typings.jsreportPhantomPdf.jsreportPhantomPdfStrings.`phantom-pdf`
import typings.jsreportPhantomPdf.jsreportPhantomPdfStrings.`phantom-server`
import typings.jsreportPhantomPdf.jsreportPhantomPdfStrings.landscape
import typings.jsreportPhantomPdf.jsreportPhantomPdfStrings.portrait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsreport-phantom-pdf", JSImport.Namespace)
  @js.native
  def apply(): ExtensionDefinition = js.native
  @JSImport("jsreport-phantom-pdf", JSImport.Namespace)
  @js.native
  def apply(options: PartialOptions): ExtensionDefinition = js.native
  
  @js.native
  trait Margin extends StObject {
    
    var bottom: Double | String = js.native
    
    var left: Double | String = js.native
    
    var right: Double | String = js.native
    
    var top: Double | String = js.native
  }
  object Margin {
    
    @scala.inline
    def apply(bottom: Double | String, left: Double | String, right: Double | String, top: Double | String): Margin = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Margin]
    }
    
    @scala.inline
    implicit class MarginMutableBuilder[Self <: Margin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double | String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double | String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double | String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double | String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  // const enum PhantomStrategy {
  //   dedicatedProcess = 'dedicated-process',
  //   phantomServer = 'phantom-server'
  // }
  @js.native
  trait Options extends StObject {
    
    var allowLocalFilesAccess: Boolean = js.native
    
    // appDirectory: string;
    var defaultPhantomjsVersion: String = js.native
    
    var strategy: `dedicated-process` | `phantom-server` = js.native
    
    var timeout: Double = js.native
  }
  object Options {
    
    @scala.inline
    def apply(
      allowLocalFilesAccess: Boolean,
      defaultPhantomjsVersion: String,
      strategy: `dedicated-process` | `phantom-server`,
      timeout: Double
    ): Options = {
      val __obj = js.Dynamic.literal(allowLocalFilesAccess = allowLocalFilesAccess.asInstanceOf[js.Any], defaultPhantomjsVersion = defaultPhantomjsVersion.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowLocalFilesAccess(value: Boolean): Self = StObject.set(x, "allowLocalFilesAccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPhantomjsVersion(value: String): Self = StObject.set(x, "defaultPhantomjsVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrategy(value: `dedicated-process` | `phantom-server`): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Phantom extends StObject {
    
    var blockJavaScript: Boolean = js.native
    
    var customPhantomJS: Boolean = js.native
    
    var fitToPage: Boolean = js.native
    
    var footer: String = js.native
    
    var footerHeight: String = js.native
    
    var format: String = js.native
    
    var header: String = js.native
    
    var headerHeight: String = js.native
    
    var height: String = js.native
    
    var margin: String | Margin = js.native
    
    var orientation: portrait | landscape = js.native
    
    var phantomjsVersion: String = js.native
    
    var resourceTimeout: Double = js.native
    
    var waitForJS: Boolean = js.native
    
    var width: String = js.native
  }
  object Phantom {
    
    @scala.inline
    def apply(
      blockJavaScript: Boolean,
      customPhantomJS: Boolean,
      fitToPage: Boolean,
      footer: String,
      footerHeight: String,
      format: String,
      header: String,
      headerHeight: String,
      height: String,
      margin: String | Margin,
      orientation: portrait | landscape,
      phantomjsVersion: String,
      resourceTimeout: Double,
      waitForJS: Boolean,
      width: String
    ): Phantom = {
      val __obj = js.Dynamic.literal(blockJavaScript = blockJavaScript.asInstanceOf[js.Any], customPhantomJS = customPhantomJS.asInstanceOf[js.Any], fitToPage = fitToPage.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], footerHeight = footerHeight.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], headerHeight = headerHeight.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], phantomjsVersion = phantomjsVersion.asInstanceOf[js.Any], resourceTimeout = resourceTimeout.asInstanceOf[js.Any], waitForJS = waitForJS.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Phantom]
    }
    
    @scala.inline
    implicit class PhantomMutableBuilder[Self <: Phantom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlockJavaScript(value: Boolean): Self = StObject.set(x, "blockJavaScript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomPhantomJS(value: Boolean): Self = StObject.set(x, "customPhantomJS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFitToPage(value: Boolean): Self = StObject.set(x, "fitToPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterHeight(value: String): Self = StObject.set(x, "footerHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderHeight(value: String): Self = StObject.set(x, "headerHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMargin(value: String | Margin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientation(value: portrait | landscape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhantomjsVersion(value: String): Self = StObject.set(x, "phantomjsVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceTimeout(value: Double): Self = StObject.set(x, "resourceTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForJS(value: Boolean): Self = StObject.set(x, "waitForJS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object jsreportCoreAugmentingMod {
    
    @js.native
    trait Template extends StObject {
      
      var phantom: js.UndefOr[PartialPhantom] = js.native
      
      var recipe: `phantom-pdf` | String = js.native
    }
    object Template {
      
      @scala.inline
      def apply(recipe: `phantom-pdf` | String): Template = {
        val __obj = js.Dynamic.literal(recipe = recipe.asInstanceOf[js.Any])
        __obj.asInstanceOf[Template]
      }
      
      @scala.inline
      implicit class TemplateMutableBuilder[Self <: Template] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPhantom(value: PartialPhantom): Self = StObject.set(x, "phantom", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPhantomUndefined: Self = StObject.set(x, "phantom", js.undefined)
        
        @scala.inline
        def setRecipe(value: `phantom-pdf` | String): Self = StObject.set(x, "recipe", value.asInstanceOf[js.Any])
      }
    }
  }
}
