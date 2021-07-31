package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Canceled extends StObject {
  
  var canceled: Boolean
}
object Canceled {
  
  @scala.inline
  def apply(canceled: Boolean): Canceled = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Canceled]
  }
  
  @scala.inline
  implicit class CanceledMutableBuilder[Self <: Canceled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanceled(value: Boolean): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
  }
}
