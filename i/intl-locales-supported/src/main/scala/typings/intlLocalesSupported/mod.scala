package typings.intlLocalesSupported

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("intl-locales-supported", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(locales: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(locales.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def default(locales: String, constructorsToCheck: js.Array[IntlConstructor]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(locales.asInstanceOf[js.Any], constructorsToCheck.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def default(locales: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(locales.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def default(locales: js.Array[String], constructorsToCheck: js.Array[IntlConstructor]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(locales.asInstanceOf[js.Any], constructorsToCheck.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @js.native
  trait IntlConstructor extends StObject {
    
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: String, options: js.Any): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String], options: js.Any): js.Array[String] = js.native
  }
}
