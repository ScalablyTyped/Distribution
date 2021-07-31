package typings.ibmCloudSdkCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object querystringMod {
  
  object default {
    
    @JSImport("ibm-cloud-sdk-core/lib/querystring", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def stringify(queryParams: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(queryParams.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
