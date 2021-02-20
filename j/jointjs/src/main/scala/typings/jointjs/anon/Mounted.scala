package typings.jointjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mounted extends StObject {
  
  var mounted: Double = js.native
  
  var unmounted: Double = js.native
}
object Mounted {
  
  @scala.inline
  def apply(mounted: Double, unmounted: Double): Mounted = {
    val __obj = js.Dynamic.literal(mounted = mounted.asInstanceOf[js.Any], unmounted = unmounted.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mounted]
  }
  
  @scala.inline
  implicit class MountedMutableBuilder[Self <: Mounted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMounted(value: Double): Self = StObject.set(x, "mounted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnmounted(value: Double): Self = StObject.set(x, "unmounted", value.asInstanceOf[js.Any])
  }
}
