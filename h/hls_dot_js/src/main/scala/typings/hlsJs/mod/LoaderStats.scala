package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoaderStats extends StObject {
  
  /**
    * download bandwitdh in bit/s
    */
  var bw: Double = js.native
  
  /**
    * number of loaded bytes
    */
  var loaded: Double = js.native
  
  /**
    * performance.now() of first received byte
    */
  var tfirst: Double = js.native
  
  /**
    * performance.now() on load complete
    */
  var tload: Double = js.native
  
  /**
    * total nb of bytes
    */
  var total: Double = js.native
  
  /**
    * performance.now() just after load() has been called
    */
  var trequest: Double = js.native
}
object LoaderStats {
  
  @scala.inline
  def apply(bw: Double, loaded: Double, tfirst: Double, tload: Double, total: Double, trequest: Double): LoaderStats = {
    val __obj = js.Dynamic.literal(bw = bw.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], tfirst = tfirst.asInstanceOf[js.Any], tload = tload.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], trequest = trequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderStats]
  }
  
  @scala.inline
  implicit class LoaderStatsMutableBuilder[Self <: LoaderStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBw(value: Double): Self = StObject.set(x, "bw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTfirst(value: Double): Self = StObject.set(x, "tfirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTload(value: Double): Self = StObject.set(x, "tload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrequest(value: Double): Self = StObject.set(x, "trequest", value.asInstanceOf[js.Any])
  }
}
