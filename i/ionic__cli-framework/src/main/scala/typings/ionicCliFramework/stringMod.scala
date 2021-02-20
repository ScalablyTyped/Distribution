package typings.ionicCliFramework

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringMod {
  
  @JSImport("@ionic/cli-framework/utils/string", "EMAIL_REGEX")
  @js.native
  val EMAIL_REGEX: RegExp = js.native
  
  @JSImport("@ionic/cli-framework/utils/string", "URL_REGEX")
  @js.native
  val URL_REGEX: RegExp = js.native
  
  @JSImport("@ionic/cli-framework/utils/string", "enforceLF")
  @js.native
  def enforceLF(str: String): String = js.native
  
  @JSImport("@ionic/cli-framework/utils/string", "isValidEmail")
  @js.native
  def isValidEmail(): Boolean = js.native
  @JSImport("@ionic/cli-framework/utils/string", "isValidEmail")
  @js.native
  def isValidEmail(email: js.Any): Boolean = js.native
  
  @JSImport("@ionic/cli-framework/utils/string", "isValidURL")
  @js.native
  def isValidURL(): Boolean = js.native
  @JSImport("@ionic/cli-framework/utils/string", "isValidURL")
  @js.native
  def isValidURL(url: js.Any): Boolean = js.native
  
  @JSImport("@ionic/cli-framework/utils/string", "slugify")
  @js.native
  def slugify(input: String): String = js.native
  @JSImport("@ionic/cli-framework/utils/string", "slugify")
  @js.native
  def slugify(input: String, hasSeparator: SlugifyOptions): String = js.native
  
  @JSImport("@ionic/cli-framework/utils/string", "str2num")
  @js.native
  def str2num(value: js.Any): Double = js.native
  @JSImport("@ionic/cli-framework/utils/string", "str2num")
  @js.native
  def str2num(value: js.Any, defaultValue: Double): Double = js.native
  
  @JSImport("@ionic/cli-framework/utils/string", "strcmp")
  @js.native
  def strcmp(): Double = js.native
  @JSImport("@ionic/cli-framework/utils/string", "strcmp")
  @js.native
  def strcmp(a: js.UndefOr[scala.Nothing], b: String): Double = js.native
  @JSImport("@ionic/cli-framework/utils/string", "strcmp")
  @js.native
  def strcmp(a: String): Double = js.native
  @JSImport("@ionic/cli-framework/utils/string", "strcmp")
  @js.native
  def strcmp(a: String, b: String): Double = js.native
  
  @js.native
  trait SlugifyOptions extends StObject {
    
    var separator: js.UndefOr[String] = js.native
  }
  object SlugifyOptions {
    
    @scala.inline
    def apply(): SlugifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SlugifyOptions]
    }
    
    @scala.inline
    implicit class SlugifyOptionsMutableBuilder[Self <: SlugifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
}
