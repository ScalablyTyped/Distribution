package typings.mangopay2NodejsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityInfoData extends StObject {
  
  var AVSResult: typings.mangopay2NodejsSdk.mod.AVSResult
}
object SecurityInfoData {
  
  inline def apply(AVSResult: AVSResult): SecurityInfoData = {
    val __obj = js.Dynamic.literal(AVSResult = AVSResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityInfoData]
  }
  
  extension [Self <: SecurityInfoData](x: Self) {
    
    inline def setAVSResult(value: AVSResult): Self = StObject.set(x, "AVSResult", value.asInstanceOf[js.Any])
  }
}
