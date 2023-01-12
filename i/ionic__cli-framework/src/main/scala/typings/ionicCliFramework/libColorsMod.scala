package typings.ionicCliFramework

import typings.ionicCliFrameworkOutput.distColorsMod.ColorFunction
import typings.ionicCliFrameworkOutput.distColorsMod.LoggerColors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libColorsMod {
  
  @JSImport("@ionic/cli-framework/lib/colors", "DEFAULT_COLORS")
  @js.native
  val DEFAULT_COLORS: Colors = js.native
  
  @JSImport("@ionic/cli-framework/lib/colors", "NO_COLORS")
  @js.native
  val NO_COLORS: Colors = js.native
  
  trait Colors
    extends StObject
       with typings.ionicCliFrameworkOutput.distColorsMod.Colors {
    
    var help: HelpColors
  }
  object Colors {
    
    inline def apply(
      ancillary: ColorFunction,
      failure: ColorFunction,
      help: HelpColors,
      input: ColorFunction,
      log: LoggerColors,
      strong: ColorFunction,
      success: ColorFunction,
      weak: ColorFunction
    ): Colors = {
      val __obj = js.Dynamic.literal(ancillary = ancillary.asInstanceOf[js.Any], failure = failure.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], strong = strong.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], weak = weak.asInstanceOf[js.Any])
      __obj.asInstanceOf[Colors]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Colors] (val x: Self) extends AnyVal {
      
      inline def setHelp(value: HelpColors): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    }
  }
  
  trait HelpColors extends StObject {
    
    var group: HelpGroupColors
    
    /**
      * Used to color the section titles in help output.
      */
    def title(text: String*): String
    /**
      * Used to color the section titles in help output.
      */
    @JSName("title")
    var title_Original: ColorFunction
  }
  object HelpColors {
    
    inline def apply(group: HelpGroupColors, title: ColorFunction): HelpColors = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[HelpColors]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HelpColors] (val x: Self) extends AnyVal {
      
      inline def setGroup(value: HelpGroupColors): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: ColorFunction): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ G in std.Exclude<@ionic/cli-framework.@ionic/cli-framework/definitions.MetadataGroup, @ionic/cli-framework.@ionic/cli-framework/definitions.MetadataGroup.HIDDEN | @ionic/cli-framework.@ionic/cli-framework/definitions.MetadataGroup.ADVANCED> ]: @ionic/cli-framework-output.@ionic/cli-framework-output.ColorFunction} */
  trait HelpGroupColors extends StObject {
    
    def beta(text: String*): String
    @JSName("beta")
    var beta_Original: ColorFunction
    
    def deprecated(text: String*): String
    @JSName("deprecated")
    var deprecated_Original: ColorFunction
    
    def experimental(text: String*): String
    @JSName("experimental")
    var experimental_Original: ColorFunction
    
    def paid(text: String*): String
    @JSName("paid")
    var paid_Original: ColorFunction
  }
  object HelpGroupColors {
    
    inline def apply(beta: ColorFunction, deprecated: ColorFunction, experimental: ColorFunction, paid: ColorFunction): HelpGroupColors = {
      val __obj = js.Dynamic.literal(beta = beta.asInstanceOf[js.Any], deprecated = deprecated.asInstanceOf[js.Any], experimental = experimental.asInstanceOf[js.Any], paid = paid.asInstanceOf[js.Any])
      __obj.asInstanceOf[HelpGroupColors]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HelpGroupColors] (val x: Self) extends AnyVal {
      
      inline def setBeta(value: ColorFunction): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
      
      inline def setDeprecated(value: ColorFunction): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      inline def setExperimental(value: ColorFunction): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
      
      inline def setPaid(value: ColorFunction): Self = StObject.set(x, "paid", value.asInstanceOf[js.Any])
    }
  }
}
