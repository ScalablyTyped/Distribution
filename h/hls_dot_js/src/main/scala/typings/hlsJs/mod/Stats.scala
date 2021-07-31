package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stats extends StObject {
  
  var length: js.UndefOr[Double] = js.undefined
  
  var mtime: Double
  
  var tbuffered: js.UndefOr[Double] = js.undefined
  
  /**
    * performance.now() of first received byte
    */
  var tfirst: Double
  
  /**
    * performance.now() on load complete
    */
  var tload: Double
  
  /**
    * performance.now() just after load() has been called
    */
  var trequest: Double
}
object Stats {
  
  @scala.inline
  def apply(mtime: Double, tfirst: Double, tload: Double, trequest: Double): Stats = {
    val __obj = js.Dynamic.literal(mtime = mtime.asInstanceOf[js.Any], tfirst = tfirst.asInstanceOf[js.Any], tload = tload.asInstanceOf[js.Any], trequest = trequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
  
  @scala.inline
  implicit class StatsMutableBuilder[Self <: Stats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setMtime(value: Double): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTbuffered(value: Double): Self = StObject.set(x, "tbuffered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTbufferedUndefined: Self = StObject.set(x, "tbuffered", js.undefined)
    
    @scala.inline
    def setTfirst(value: Double): Self = StObject.set(x, "tfirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTload(value: Double): Self = StObject.set(x, "tload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrequest(value: Double): Self = StObject.set(x, "trequest", value.asInstanceOf[js.Any])
  }
}
