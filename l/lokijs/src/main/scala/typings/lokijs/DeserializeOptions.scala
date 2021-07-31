package typings.lokijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.lokijs.anon.Delimited
  - typings.lokijs.anon.Delimiter
*/
trait DeserializeOptions extends StObject
object DeserializeOptions {
  
  @scala.inline
  def Delimited(): typings.lokijs.anon.Delimited = {
    val __obj = js.Dynamic.literal(delimited = false)
    __obj.asInstanceOf[typings.lokijs.anon.Delimited]
  }
  
  @scala.inline
  def Delimiter(delimiter: String): typings.lokijs.anon.Delimiter = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.lokijs.anon.Delimiter]
  }
}
