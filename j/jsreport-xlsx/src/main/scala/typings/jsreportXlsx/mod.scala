package typings.jsreportXlsx

import typings.jsreportCore.mod.ExtensionDefinition
import typings.jsreportXlsx.anon.PartialOptions
import typings.jsreportXlsx.jsreportXlsxStrings.xlsx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsreport-xlsx", JSImport.Namespace)
  @js.native
  def apply(): ExtensionDefinition = js.native
  @JSImport("jsreport-xlsx", JSImport.Namespace)
  @js.native
  def apply(options: PartialOptions): ExtensionDefinition = js.native
  
  @js.native
  trait Options extends StObject {
    
    var addBufferSize: Double = js.native
    
    var escapeAmp: Boolean = js.native
    
    var numberOfParsedAddIterations: Double = js.native
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
  
  @js.native
  trait Xlsx extends StObject {
    
    var shortid: String = js.native
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
    
    @js.native
    trait Template extends StObject {
      
      var recipe: xlsx | String = js.native
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
