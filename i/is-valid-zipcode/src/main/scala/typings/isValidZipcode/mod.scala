package typings.isValidZipcode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(zipcode: String): Boolean = ^.asInstanceOf[js.Dynamic].apply(zipcode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def apply(zipcode: String, country: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(zipcode.asInstanceOf[js.Any], country.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("is-valid-zipcode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
