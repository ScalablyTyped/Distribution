package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait levelLoadingData extends StObject {
  
  var level: Double = js.native
  
  var url: String = js.native
}
object levelLoadingData {
  
  @scala.inline
  def apply(level: Double, url: String): levelLoadingData = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[levelLoadingData]
  }
  
  @scala.inline
  implicit class levelLoadingDataMutableBuilder[Self <: levelLoadingData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
