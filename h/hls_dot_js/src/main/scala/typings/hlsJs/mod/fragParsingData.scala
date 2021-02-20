package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait fragParsingData extends StObject {
  
  var endDTS: Double = js.native
  
  var endPTS: Double = js.native
  
  var frag: Fragment = js.native
  
  var id: String = js.native
  
  var mdat: js.Any = js.native
  
  var moof: js.Any = js.native
  
  var nb: Double = js.native
  
  var startDTS: Double = js.native
  
  var startPTS: Double = js.native
  
  var `type`: String = js.native
}
object fragParsingData {
  
  @scala.inline
  def apply(
    endDTS: Double,
    endPTS: Double,
    frag: Fragment,
    id: String,
    mdat: js.Any,
    moof: js.Any,
    nb: Double,
    startDTS: Double,
    startPTS: Double,
    `type`: String
  ): fragParsingData = {
    val __obj = js.Dynamic.literal(endDTS = endDTS.asInstanceOf[js.Any], endPTS = endPTS.asInstanceOf[js.Any], frag = frag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mdat = mdat.asInstanceOf[js.Any], moof = moof.asInstanceOf[js.Any], nb = nb.asInstanceOf[js.Any], startDTS = startDTS.asInstanceOf[js.Any], startPTS = startPTS.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[fragParsingData]
  }
  
  @scala.inline
  implicit class fragParsingDataMutableBuilder[Self <: fragParsingData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndDTS(value: Double): Self = StObject.set(x, "endDTS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndPTS(value: Double): Self = StObject.set(x, "endPTS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMdat(value: js.Any): Self = StObject.set(x, "mdat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoof(value: js.Any): Self = StObject.set(x, "moof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNb(value: Double): Self = StObject.set(x, "nb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDTS(value: Double): Self = StObject.set(x, "startDTS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartPTS(value: Double): Self = StObject.set(x, "startPTS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
