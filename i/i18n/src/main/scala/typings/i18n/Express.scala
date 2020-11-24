package typings.i18n

import typings.i18n.anon.Partiali18nAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Express")
@js.native
object Express extends js.Object {
  
  @js.native
  trait Request extends i18nAPI {
    
    var language: String = js.native
    
    var languages: js.Array[String] = js.native
    
    var region: String = js.native
    
    var regions: js.Array[String] = js.native
  }
  
  @js.native
  trait Response extends i18nAPI {
    
    var locals: Partiali18nAPI = js.native
  }
}
