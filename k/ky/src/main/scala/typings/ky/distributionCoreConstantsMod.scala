package typings.ky

import typings.ky.kyStrings.AsteriskSlashAsterisk
import typings.ky.kyStrings.`multipartSlashform-data`
import typings.ky.kyStrings.applicationSlashjson
import typings.ky.kyStrings.delete
import typings.ky.kyStrings.get
import typings.ky.kyStrings.head
import typings.ky.kyStrings.patch
import typings.ky.kyStrings.post
import typings.ky.kyStrings.put
import typings.ky.kyStrings.textSlashAsterisk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributionCoreConstantsMod {
  
  @JSImport("ky/distribution/core/constants", "maxSafeTimeout")
  @js.native
  val maxSafeTimeout: /* 2147483647 */ Double = js.native
  
  @JSImport("ky/distribution/core/constants", "requestMethods")
  @js.native
  val requestMethods: js.Tuple6[get, post, put, patch, head, delete] = js.native
  
  object responseTypes {
    
    @JSImport("ky/distribution/core/constants", "responseTypes.arrayBuffer")
    @js.native
    val arrayBuffer: AsteriskSlashAsterisk = js.native
    
    @JSImport("ky/distribution/core/constants", "responseTypes.blob")
    @js.native
    val blob: AsteriskSlashAsterisk = js.native
    
    @JSImport("ky/distribution/core/constants", "responseTypes.formData")
    @js.native
    val formData: `multipartSlashform-data` = js.native
    
    @JSImport("ky/distribution/core/constants", "responseTypes.json")
    @js.native
    val json: applicationSlashjson = js.native
    
    @JSImport("ky/distribution/core/constants", "responseTypes.text")
    @js.native
    val text: textSlashAsterisk = js.native
  }
  
  @JSImport("ky/distribution/core/constants", "stop")
  @js.native
  val stop: js.Symbol = js.native
  
  @JSImport("ky/distribution/core/constants", "supportsAbortController")
  @js.native
  val supportsAbortController: Boolean = js.native
  
  @JSImport("ky/distribution/core/constants", "supportsFormData")
  @js.native
  val supportsFormData: Boolean = js.native
  
  @JSImport("ky/distribution/core/constants", "supportsStreams")
  @js.native
  val supportsStreams: Boolean = js.native
}
