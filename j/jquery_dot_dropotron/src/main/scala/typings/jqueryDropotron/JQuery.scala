package typings.jqueryDropotron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @summary Interface for "JQuery".
  * @author  Cyril Schumacher
  * @version 1.0
  */
trait JQuery extends StObject {
  
  def dropotron(): Unit
  def dropotron(config: DropotronConfiguration): Unit
  @JSName("dropotron")
  var dropotron_Original: Dropotron
}
object JQuery {
  
  @scala.inline
  def apply(dropotron: /* config */ js.UndefOr[DropotronConfiguration] => Unit): JQuery = {
    val __obj = js.Dynamic.literal(dropotron = js.Any.fromFunction1(dropotron))
    __obj.asInstanceOf[JQuery]
  }
  
  @scala.inline
  implicit class JQueryMutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDropotron(value: /* config */ js.UndefOr[DropotronConfiguration] => Unit): Self = StObject.set(x, "dropotron", js.Any.fromFunction1(value))
  }
}
