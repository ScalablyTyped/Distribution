package typings.jqueryMatchHeight

import typings.jqueryMatchHeight.JQueryMatchHeight.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  /**
    * Set all selected elements to the height of the tallest.
    * If the items are on multiple rows, the items of each row will be set to the tallest of that row.
    */
  def matchHeight(): JQuery
  def matchHeight(options: Options): JQuery
  @JSName("matchHeight")
  var matchHeight_Original: JQueryMatchHeight
}
object JQuery {
  
  @scala.inline
  def apply(matchHeight: JQueryMatchHeight): JQuery = {
    val __obj = js.Dynamic.literal(matchHeight = matchHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  @scala.inline
  implicit class JQueryMutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatchHeight(value: JQueryMatchHeight): Self = StObject.set(x, "matchHeight", value.asInstanceOf[js.Any])
  }
}
