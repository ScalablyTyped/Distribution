package typings.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cookie extends StObject {
  
  /*Looks up the data for the cookie named name and merges the data into the given obj object, or returns a new
    * object containing the data.
    */
  def Get(name: String): Any = js.native
  def Get(name: String, obj: Any): Any = js.native
  
  /*Creates a MathJax cookie using the MathJax.HTML.Cookie.prefix and the name as the cookie name, and the
    * key:value pairs in the data object as the data for the cookie.
    */
  def Set(name: String, data: Any): Unit = js.native
  
  var expires: js.UndefOr[Double] = js.native
  
  var prefix: js.UndefOr[String] = js.native
}
