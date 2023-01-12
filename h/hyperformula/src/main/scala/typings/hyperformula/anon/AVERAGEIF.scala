package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AVERAGEIF extends StObject {
  
  var AVERAGEIF: `2`
  
  var COUNTIF: Method
  
  var COUNTIFS: MethodParametersRepeatLastArgs
  
  var MAXIFS: MethodParametersRepeatLastArgs
  
  var MINIFS: MethodParametersRepeatLastArgs
  
  var SUMIF: `2`
  
  var SUMIFS: MethodParametersRepeatLastArgs
}
object AVERAGEIF {
  
  inline def apply(
    AVERAGEIF: `2`,
    COUNTIF: Method,
    COUNTIFS: MethodParametersRepeatLastArgs,
    MAXIFS: MethodParametersRepeatLastArgs,
    MINIFS: MethodParametersRepeatLastArgs,
    SUMIF: `2`,
    SUMIFS: MethodParametersRepeatLastArgs
  ): AVERAGEIF = {
    val __obj = js.Dynamic.literal(AVERAGEIF = AVERAGEIF.asInstanceOf[js.Any], COUNTIF = COUNTIF.asInstanceOf[js.Any], COUNTIFS = COUNTIFS.asInstanceOf[js.Any], MAXIFS = MAXIFS.asInstanceOf[js.Any], MINIFS = MINIFS.asInstanceOf[js.Any], SUMIF = SUMIF.asInstanceOf[js.Any], SUMIFS = SUMIFS.asInstanceOf[js.Any])
    __obj.asInstanceOf[AVERAGEIF]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AVERAGEIF] (val x: Self) extends AnyVal {
    
    inline def setAVERAGEIF(value: `2`): Self = StObject.set(x, "AVERAGEIF", value.asInstanceOf[js.Any])
    
    inline def setCOUNTIF(value: Method): Self = StObject.set(x, "COUNTIF", value.asInstanceOf[js.Any])
    
    inline def setCOUNTIFS(value: MethodParametersRepeatLastArgs): Self = StObject.set(x, "COUNTIFS", value.asInstanceOf[js.Any])
    
    inline def setMAXIFS(value: MethodParametersRepeatLastArgs): Self = StObject.set(x, "MAXIFS", value.asInstanceOf[js.Any])
    
    inline def setMINIFS(value: MethodParametersRepeatLastArgs): Self = StObject.set(x, "MINIFS", value.asInstanceOf[js.Any])
    
    inline def setSUMIF(value: `2`): Self = StObject.set(x, "SUMIF", value.asInstanceOf[js.Any])
    
    inline def setSUMIFS(value: MethodParametersRepeatLastArgs): Self = StObject.set(x, "SUMIFS", value.asInstanceOf[js.Any])
  }
}
