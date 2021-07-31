package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait manifestParsedData extends StObject {
  
  var firstLevel: Double
  
  var levels: js.Array[Level]
}
object manifestParsedData {
  
  @scala.inline
  def apply(firstLevel: Double, levels: js.Array[Level]): manifestParsedData = {
    val __obj = js.Dynamic.literal(firstLevel = firstLevel.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
    __obj.asInstanceOf[manifestParsedData]
  }
  
  @scala.inline
  implicit class manifestParsedDataMutableBuilder[Self <: manifestParsedData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirstLevel(value: Double): Self = StObject.set(x, "firstLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevels(value: js.Array[Level]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelsVarargs(value: Level*): Self = StObject.set(x, "levels", js.Array(value :_*))
  }
}
