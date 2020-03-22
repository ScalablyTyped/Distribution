package typings.ionicCliFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/colors", JSImport.Namespace)
@js.native
object colorsMod extends js.Object {
  @js.native
  trait Colors extends js.Object {
    /**
      * Used to mark text as ancillary or supportive.
      */
    @JSName("ancillary")
    var ancillary_Original: ColorFunction = js.native
    /**
      * Used to mark text as failed.
      */
    @JSName("failure")
    var failure_Original: ColorFunction = js.native
    var help: HelpColors = js.native
    /**
      * Used to mark text as input such as commands, inputs, options, etc.
      */
    @JSName("input")
    var input_Original: ColorFunction = js.native
    var log: LoggerColors = js.native
    /**
      * Used to mark text as important. Comparable to HTML's <strong>.
      */
    @JSName("strong")
    var strong_Original: ColorFunction = js.native
    /**
      * Used to mark text as successful.
      */
    @JSName("success")
    var success_Original: ColorFunction = js.native
    /**
      * Used to mark text as less important.
      */
    @JSName("weak")
    var weak_Original: ColorFunction = js.native
    /**
      * Used to mark text as ancillary or supportive.
      */
    def ancillary(text: String*): String = js.native
    /**
      * Used to mark text as failed.
      */
    def failure(text: String*): String = js.native
    /**
      * Used to mark text as input such as commands, inputs, options, etc.
      */
    def input(text: String*): String = js.native
    /**
      * Used to mark text as important. Comparable to HTML's <strong>.
      */
    def strong(text: String*): String = js.native
    /**
      * Used to mark text as successful.
      */
    def success(text: String*): String = js.native
    /**
      * Used to mark text as less important.
      */
    def weak(text: String*): String = js.native
  }
  
  @js.native
  trait HelpColors extends js.Object {
    var group: HelpGroupColors = js.native
    /**
      * Used to color the section titles in help output.
      */
    @JSName("title")
    var title_Original: ColorFunction = js.native
    /**
      * Used to color the section titles in help output.
      */
    def title(text: String*): String = js.native
  }
  
  /* Inlined {[ G in std.Exclude<@ionic/cli-framework.@ionic/cli-framework/definitions.MetadataGroup, @ionic/cli-framework.@ionic/cli-framework/definitions.MetadataGroup.HIDDEN | @ionic/cli-framework.@ionic/cli-framework/definitions.MetadataGroup.ADVANCED> ]: @ionic/cli-framework.@ionic/cli-framework/lib/colors.ColorFunction} */
  @js.native
  trait HelpGroupColors extends js.Object {
    @JSName("beta")
    var beta_Original: ColorFunction = js.native
    @JSName("deprecated")
    var deprecated_Original: ColorFunction = js.native
    @JSName("experimental")
    var experimental_Original: ColorFunction = js.native
    @JSName("paid")
    var paid_Original: ColorFunction = js.native
    def beta(text: String*): String = js.native
    def deprecated(text: String*): String = js.native
    def experimental(text: String*): String = js.native
    def paid(text: String*): String = js.native
  }
  
  /* Inlined {[ L in @ionic/cli-framework.@ionic/cli-framework/lib/logger.LoggerLevel ]: @ionic/cli-framework.@ionic/cli-framework/lib/colors.ColorFunction} */
  @js.native
  trait LoggerColors extends js.Object {
    @JSName("DEBUG")
    var DEBUG_Original: ColorFunction = js.native
    @JSName("ERROR")
    var ERROR_Original: ColorFunction = js.native
    @JSName("INFO")
    var INFO_Original: ColorFunction = js.native
    @JSName("WARN")
    var WARN_Original: ColorFunction = js.native
    def DEBUG(text: String*): String = js.native
    def ERROR(text: String*): String = js.native
    def INFO(text: String*): String = js.native
    def WARN(text: String*): String = js.native
  }
  
  val DEFAULT_COLORS: Colors = js.native
  val NO_COLORS: Colors = js.native
  type ColorFunction = js.Function1[/* repeated */ String, String]
}

