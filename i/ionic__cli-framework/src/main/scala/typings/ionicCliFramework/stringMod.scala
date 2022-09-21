package typings.ionicCliFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringMod {
  
  @JSImport("@ionic/cli-framework/utils/string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/cli-framework/utils/string", "EMAIL_REGEX")
  @js.native
  val EMAIL_REGEX: js.RegExp = js.native
  
  @JSImport("@ionic/cli-framework/utils/string", "URL_REGEX")
  @js.native
  val URL_REGEX: js.RegExp = js.native
  
  inline def isValidEmail(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidEmail")().asInstanceOf[Boolean]
  inline def isValidEmail(email: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidEmail")(email.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidURL(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidURL")().asInstanceOf[Boolean]
  inline def isValidURL(url: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidURL")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def slugify(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("slugify")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def slugify(input: String, hasSeparator: SlugifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("slugify")(input.asInstanceOf[js.Any], hasSeparator.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def str2num(value: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("str2num")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def str2num(value: Any, defaultValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("str2num")(value.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def strcmp(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("strcmp")().asInstanceOf[Double]
  inline def strcmp(a: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("strcmp")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def strcmp(a: String, b: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("strcmp")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def strcmp(a: Unit, b: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("strcmp")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait SlugifyOptions extends StObject {
    
    var separator: js.UndefOr[String] = js.undefined
  }
  object SlugifyOptions {
    
    inline def apply(): SlugifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SlugifyOptions]
    }
    
    extension [Self <: SlugifyOptions](x: Self) {
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
}
