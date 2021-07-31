package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait fragLoadProgressData extends StObject {
  
  var frag: Fragment
  
  var stats: Stats
}
object fragLoadProgressData {
  
  @scala.inline
  def apply(frag: Fragment, stats: Stats): fragLoadProgressData = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[fragLoadProgressData]
  }
  
  @scala.inline
  implicit class fragLoadProgressDataMutableBuilder[Self <: fragLoadProgressData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
