package typings.jsreportXlsx

import typings.jsreportCore.mod.ExtensionDefinition
import typings.jsreportXlsx.anon.PartialOptions
import typings.jsreportXlsx.jsreportXlsxStrings.xlsx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): ExtensionDefinition = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ExtensionDefinition]
  @scala.inline
  def apply(options: PartialOptions): ExtensionDefinition = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[ExtensionDefinition]
  
  @JSImport("jsreport-xlsx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var addBufferSize: Double
    
    var escapeAmp: Boolean
    
    var numberOfParsedAddIterations: Double
  }
  object Options {
    
    @scala.inline
    def apply(addBufferSize: Double, escapeAmp: Boolean, numberOfParsedAddIterations: Double): Options = {
      val __obj = js.Dynamic.literal(addBufferSize = addBufferSize.asInstanceOf[js.Any], escapeAmp = escapeAmp.asInstanceOf[js.Any], numberOfParsedAddIterations = numberOfParsedAddIterations.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddBufferSize(value: Double): Self = StObject.set(x, "addBufferSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeAmp(value: Boolean): Self = StObject.set(x, "escapeAmp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfParsedAddIterations(value: Double): Self = StObject.set(x, "numberOfParsedAddIterations", value.asInstanceOf[js.Any])
    }
  }
  
  trait Xlsx extends StObject {
    
    var shortid: String
  }
  object Xlsx {
    
    @scala.inline
    def apply(shortid: String): Xlsx = {
      val __obj = js.Dynamic.literal(shortid = shortid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Xlsx]
    }
    
    @scala.inline
    implicit class XlsxMutableBuilder[Self <: Xlsx] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShortid(value: String): Self = StObject.set(x, "shortid", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object jsreportCoreAugmentingMod {
    
    trait Template extends StObject {
      
      var recipe: xlsx | String
    }
    object Template {
      
      @scala.inline
      def apply(recipe: xlsx | String): Template = {
        val __obj = js.Dynamic.literal(recipe = recipe.asInstanceOf[js.Any])
        __obj.asInstanceOf[Template]
      }
      
      @scala.inline
      implicit class TemplateMutableBuilder[Self <: Template] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRecipe(value: xlsx | String): Self = StObject.set(x, "recipe", value.asInstanceOf[js.Any])
      }
    }
  }
}
