package typings.jsreportPhantomPdf

import typings.jsreportCore.mod.Engine
import typings.jsreportCore.mod.ExtensionDefinition
import typings.jsreportCore.mod.Template
import typings.jsreportPhantomPdf.anon.PartialOptions
import typings.jsreportPhantomPdf.anon.PartialPhantom
import typings.jsreportPhantomPdf.jsreportPhantomPdfStrings.`dedicated-process`
import typings.jsreportPhantomPdf.jsreportPhantomPdfStrings.`phantom-pdf`
import typings.jsreportPhantomPdf.jsreportPhantomPdfStrings.`phantom-server`
import typings.jsreportPhantomPdf.jsreportPhantomPdfStrings.landscape
import typings.jsreportPhantomPdf.jsreportPhantomPdfStrings.portrait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ExtensionDefinition = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ExtensionDefinition]
  inline def apply(options: PartialOptions): ExtensionDefinition = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[ExtensionDefinition]
  
  @JSImport("jsreport-phantom-pdf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Margin extends StObject {
    
    var bottom: Double | String
    
    var left: Double | String
    
    var right: Double | String
    
    var top: Double | String
  }
  object Margin {
    
    inline def apply(bottom: Double | String, left: Double | String, right: Double | String, top: Double | String): Margin = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Margin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Margin] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double | String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double | String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double | String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double | String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  // const enum PhantomStrategy {
  //   dedicatedProcess = 'dedicated-process',
  //   phantomServer = 'phantom-server'
  // }
  trait Options extends StObject {
    
    var allowLocalFilesAccess: Boolean
    
    // appDirectory: string;
    var defaultPhantomjsVersion: String
    
    var strategy: `dedicated-process` | `phantom-server`
    
    var timeout: Double
  }
  object Options {
    
    inline def apply(
      allowLocalFilesAccess: Boolean,
      defaultPhantomjsVersion: String,
      strategy: `dedicated-process` | `phantom-server`,
      timeout: Double
    ): Options = {
      val __obj = js.Dynamic.literal(allowLocalFilesAccess = allowLocalFilesAccess.asInstanceOf[js.Any], defaultPhantomjsVersion = defaultPhantomjsVersion.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAllowLocalFilesAccess(value: Boolean): Self = StObject.set(x, "allowLocalFilesAccess", value.asInstanceOf[js.Any])
      
      inline def setDefaultPhantomjsVersion(value: String): Self = StObject.set(x, "defaultPhantomjsVersion", value.asInstanceOf[js.Any])
      
      inline def setStrategy(value: `dedicated-process` | `phantom-server`): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  trait Phantom extends StObject {
    
    var blockJavaScript: Boolean
    
    var customPhantomJS: Boolean
    
    var fitToPage: Boolean
    
    var footer: String
    
    var footerHeight: String
    
    var format: String
    
    var header: String
    
    var headerHeight: String
    
    var height: String
    
    var margin: String | Margin
    
    var orientation: portrait | landscape
    
    var phantomjsVersion: String
    
    var resourceTimeout: Double
    
    var waitForJS: Boolean
    
    var width: String
  }
  object Phantom {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: Phantom] (val x: Self) extends AnyVal {
      
      inline def setBlockJavaScript(value: Boolean): Self = StObject.set(x, "blockJavaScript", value.asInstanceOf[js.Any])
      
      inline def setCustomPhantomJS(value: Boolean): Self = StObject.set(x, "customPhantomJS", value.asInstanceOf[js.Any])
      
      inline def setFitToPage(value: Boolean): Self = StObject.set(x, "fitToPage", value.asInstanceOf[js.Any])
      
      inline def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterHeight(value: String): Self = StObject.set(x, "footerHeight", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderHeight(value: String): Self = StObject.set(x, "headerHeight", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setMargin(value: String | Margin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setOrientation(value: portrait | landscape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setPhantomjsVersion(value: String): Self = StObject.set(x, "phantomjsVersion", value.asInstanceOf[js.Any])
      
      inline def setResourceTimeout(value: Double): Self = StObject.set(x, "resourceTimeout", value.asInstanceOf[js.Any])
      
      inline def setWaitForJS(value: Boolean): Self = StObject.set(x, "waitForJS", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  // without exporting enum, it doesn't include the require('jsreport-core') in the test.js for some reason
  // help welcome
  // export enum Foo { }
  trait PhantomPDFTemplate
    extends StObject
       with Template {
    
    var phantom: js.UndefOr[PartialPhantom] = js.undefined
    
    @JSName("recipe")
    var recipe_PhantomPDFTemplate: `phantom-pdf` | String
  }
  object PhantomPDFTemplate {
    
    inline def apply(content: String, engine: Engine | String, recipe: `phantom-pdf` | String): PhantomPDFTemplate = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], recipe = recipe.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhantomPDFTemplate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PhantomPDFTemplate] (val x: Self) extends AnyVal {
      
      inline def setPhantom(value: PartialPhantom): Self = StObject.set(x, "phantom", value.asInstanceOf[js.Any])
      
      inline def setPhantomUndefined: Self = StObject.set(x, "phantom", js.undefined)
      
      inline def setRecipe(value: `phantom-pdf` | String): Self = StObject.set(x, "recipe", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object jsreportCoreAugmentingMod {
    
    trait TemplateRegistry extends StObject {
      
      var PhantomPDFTemplate: typings.jsreportPhantomPdf.mod.PhantomPDFTemplate
    }
    object TemplateRegistry {
      
      inline def apply(PhantomPDFTemplate: PhantomPDFTemplate): TemplateRegistry = {
        val __obj = js.Dynamic.literal(PhantomPDFTemplate = PhantomPDFTemplate.asInstanceOf[js.Any])
        __obj.asInstanceOf[TemplateRegistry]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: TemplateRegistry] (val x: Self) extends AnyVal {
        
        inline def setPhantomPDFTemplate(value: PhantomPDFTemplate): Self = StObject.set(x, "PhantomPDFTemplate", value.asInstanceOf[js.Any])
      }
    }
  }
}
