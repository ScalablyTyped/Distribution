package typings.jupyterlabServices.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Targetname extends StObject {
  
  /**
    * The comm target name to filter returned comms
    */
  var target_name: js.UndefOr[String] = js.native
}
object Targetname {
  
  @scala.inline
  def apply(): Targetname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Targetname]
  }
  
  @scala.inline
  implicit class TargetnameMutableBuilder[Self <: Targetname] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget_name(value: String): Self = StObject.set(x, "target_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget_nameUndefined: Self = StObject.set(x, "target_name", js.undefined)
  }
}
