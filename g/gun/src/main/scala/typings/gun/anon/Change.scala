package typings.gun.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Change extends StObject {
  
  var change: Boolean
}
object Change {
  
  @scala.inline
  def apply(change: Boolean): Change = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change]
  }
  
  @scala.inline
  implicit class ChangeMutableBuilder[Self <: Change] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: Boolean): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
  }
}
