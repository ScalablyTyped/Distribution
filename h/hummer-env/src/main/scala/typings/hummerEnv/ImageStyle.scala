package typings.hummerEnv

import typings.hummerEnv.hummerEnvStrings.contain
import typings.hummerEnv.hummerEnvStrings.cover
import typings.hummerEnv.hummerEnvStrings.origin
import typings.hummerEnv.hummerEnvStrings.stretch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageStyle
  extends StObject
     with HummerCommonStyle {
  
  var resize: js.UndefOr[origin | contain | cover | stretch] = js.undefined
}
object ImageStyle {
  
  inline def apply(): ImageStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageStyle]
  }
  
  extension [Self <: ImageStyle](x: Self) {
    
    inline def setResize(value: origin | contain | cover | stretch): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
  }
}
