package typings.jpm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object l10nMod {
  
  @JSImport("sdk/l10n", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def get(identifier: String, count: Double, placeholder: String*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(identifier.asInstanceOf[js.Any], count.asInstanceOf[js.Any], placeholder.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def get(identifier: String, count: Unit, placeholder: String*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(identifier.asInstanceOf[js.Any], count.asInstanceOf[js.Any], placeholder.asInstanceOf[js.Any])).asInstanceOf[String]
}
