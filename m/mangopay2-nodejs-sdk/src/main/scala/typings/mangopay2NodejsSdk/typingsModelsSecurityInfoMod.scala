package typings.mangopay2NodejsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsModelsSecurityInfoMod {
  
  object securityInfo {
    
    /* Rewritten from type alias, can be one of: 
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NO_CHECK
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NO_MATCH
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ADDRESS_MATCH_ONLY
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.POSTAL_CODE_MATCH_ONLY
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FULL_MATCH
    */
    trait AVSResult extends StObject
    object AVSResult {
      
      inline def ADDRESS_MATCH_ONLY: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ADDRESS_MATCH_ONLY = "ADDRESS_MATCH_ONLY".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ADDRESS_MATCH_ONLY]
      
      inline def FULL_MATCH: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FULL_MATCH = "FULL_MATCH".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FULL_MATCH]
      
      inline def NO_CHECK: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NO_CHECK = "NO_CHECK".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NO_CHECK]
      
      inline def NO_MATCH: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NO_MATCH = "NO_MATCH".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NO_MATCH]
      
      inline def POSTAL_CODE_MATCH_ONLY: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.POSTAL_CODE_MATCH_ONLY = "POSTAL_CODE_MATCH_ONLY".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.POSTAL_CODE_MATCH_ONLY]
    }
    
    trait SecurityInfoData extends StObject {
      
      var AVSResult: typings.mangopay2NodejsSdk.typingsModelsSecurityInfoMod.securityInfo.AVSResult
    }
    object SecurityInfoData {
      
      inline def apply(AVSResult: AVSResult): SecurityInfoData = {
        val __obj = js.Dynamic.literal(AVSResult = AVSResult.asInstanceOf[js.Any])
        __obj.asInstanceOf[SecurityInfoData]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SecurityInfoData] (val x: Self) extends AnyVal {
        
        inline def setAVSResult(value: AVSResult): Self = StObject.set(x, "AVSResult", value.asInstanceOf[js.Any])
      }
    }
  }
}
